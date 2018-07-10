package com.example.administrator.filtiration.ViewModel;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.EditText;
import android.widget.TextView;

import com.example.administrator.filtiration.Model.User;
import com.example.administrator.filtiration.R;



import java.util.List;
import java.util.Objects;

public class myAdapter  extends RecyclerView.Adapter<myAdapter.Holder>{


    List<User> userlist;



    public myAdapter(List<User> userlist) {

        this.userlist=userlist;

    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);

        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
         holder.itemText.setText(userlist.get(position).getName());
      
    }

    @Override
    public int getItemCount() {
        return userlist.size();

    }


    class Holder extends RecyclerView.ViewHolder{
        TextView itemText;


    public Holder(View itemView) {
        super(itemView);
        itemText = (TextView) itemView.findViewById(R.id.itemText);

    }
}

}
