package com.example.errortast3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class comment_adapter extends RecyclerView.Adapter<comment_adapter.view_holder2> {

   ArrayList<comments_obj> comments_obj_arr;



    public comment_adapter(ArrayList<comments_obj> comments_obj) {
        this.comments_obj_arr = comments_obj;
    }


    @NonNull
    @Override
    public view_holder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.comment_row , parent , false);

        view_holder2 holder = new view_holder2(v);

        return holder;
    }


    @Override
    public void onBindViewHolder(@NonNull view_holder2 holder, int position) {

        comments_obj comment = comments_obj_arr.get(position);

        holder.comment.setText(comment.getUser_comment());

    }



    @Override
    public int getItemCount() {

        return comments_obj_arr.size();
    }



    class view_holder2 extends RecyclerView.ViewHolder{

        TextView comment ;

        public view_holder2(@NonNull final View itemView) {
            super(itemView);

            comment = itemView.findViewById(R.id.comment_content_et);
        }
    }
}
