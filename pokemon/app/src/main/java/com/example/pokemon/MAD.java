package com.example.pokemon;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MAD extends RecyclerView.Adapter {
    ArrayList<pokemon> myArray;
Context c ;

    public MAD(ArrayList<pokemon> myArray, Context c) {
        this.myArray = myArray;
        this.c = c;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.mypokes,parent,false);
        ViewHolder vh = new ViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder)holder).pimg.setImageResource(myArray.get(position).getImage());
        ((ViewHolder)holder).pokename.setText(myArray.get(position).getName());
        ((ViewHolder)holder).poketotal.setText(myArray.get(position).getTotal()+"");

        ((ViewHolder)holder).delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myArray.remove(position);
                notifyDataSetChanged();
            }
        });

        ((ViewHolder)holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(c,detilspoke.class);
                i.putExtra("pokemon",myArray.get(position));
                c.startActivity(i);
            }
        });
        ////
    }

    @Override
    public int getItemCount() {
        return myArray.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
      public ImageView pimg;
      public TextView pokename;
      public TextView poketotal;
      public View view;
public Button delete;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
             view = itemView;
            poketotal = itemView.findViewById(R.id.textView3);
             pokename = itemView.findViewById(R.id.textView1);
             pimg = itemView.findViewById(R.id.imageView2);
             delete = itemView.findViewById(R.id.button);

        }
    }


    /////
}
