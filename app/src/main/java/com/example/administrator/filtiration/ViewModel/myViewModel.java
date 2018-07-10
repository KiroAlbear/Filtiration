package com.example.administrator.filtiration.ViewModel;

import android.arch.lifecycle.ViewModel;
import android.content.Context;

import android.databinding.BaseObservable;
import android.databinding.ObservableField;
import android.nfc.Tag;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Toast;

import com.example.administrator.filtiration.Model.User;
import com.example.administrator.filtiration.Model.UsersList;
import com.example.administrator.filtiration.ViewModel.myAdapter;


import java.util.ArrayList;
import java.util.List;

public class myViewModel extends ViewModel {
    private ArrayList<User> UsersList = new ArrayList<User>();

    public ObservableField<String> word = new ObservableField<String>("");
    private myAdapter listadapter;
    private Context context;
    private RecyclerView recyclerView;
    private myAdapter adapter;

    public myViewModel(Context context, RecyclerView recyclerView,myAdapter adapter) {

        this.context = context;
        this.recyclerView = recyclerView;
        this.adapter=adapter;

        com.example.administrator.filtiration.Model.UsersList list = new UsersList();
        UsersList=list.AdingUsersList();

    }





    public TextWatcher textWatcher = new TextWatcher() {
     @Override
     public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
return;
     }

     @Override
     public void onTextChanged(CharSequence s, int ir, int i1, int i2) {

     }

     @Override
     public void afterTextChanged(Editable editable) {

     }
 };


    public void SearchList(String s){
      //  String word = s;
        Log.w("tag", "onTextChanged " + s);


        {


            ArrayList<User> Chosen = new ArrayList<User>();

            for (int i = 0; i < UsersList.size(); i++) {

                if (UsersList.get(i).getName().contains(s))
                    Chosen.add(UsersList.get(i));
            }

            UpdateList(Chosen);

        }
    }


    public TextWatcher myTextWatcher() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // Do nothing.
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

Toast.makeText(context,s,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void afterTextChanged(Editable s) {
                // Do nothing.
            }
        };
    }

    private void UpdateList(ArrayList<User> users) {

        adapter.userlist = users;
        adapter.notifyDataSetChanged();

    }



}
