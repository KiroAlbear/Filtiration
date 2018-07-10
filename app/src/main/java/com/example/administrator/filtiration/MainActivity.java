package com.example.administrator.filtiration;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.filtiration.Model.UsersList;
import com.example.administrator.filtiration.ViewModel.myAdapter;
import com.example.administrator.filtiration.ViewModel.myViewModel;
import com.example.administrator.filtiration.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

       ActivityMainBinding activityMainBinding;
    myAdapter  adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        UsersList usersList = new UsersList();

        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

           RecyclerView recyclerView = findViewById(R.id.myRecycleView);
           EditText editText = (EditText)findViewById(R.id.editText);

             adapter = new myAdapter(usersList.AdingUsersList());

              final myViewModel viewModel = new myViewModel( this,recyclerView,adapter);



              recyclerView.setLayoutManager(new LinearLayoutManager(this));
              recyclerView.setAdapter(adapter);

//              editText.addTextChangedListener(new TextWatcher() {
//                  @Override
//                  public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//                  }
//
//                  @Override
//                  public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//viewModel.SearchList(charSequence.toString());
////Toast.makeText(getApplicationContext(),charSequence.toString(),Toast.LENGTH_SHORT).show();
//                  }
//
//                  @Override
//                  public void afterTextChanged(Editable editable) {
//
//                  }
//              });



    }
}



