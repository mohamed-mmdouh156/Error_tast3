package com.example.errortast3;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recycler_adapter extends RecyclerView.Adapter<recycler_adapter.view_holder> {

        ArrayList <user_data> data ;

    public recycler_adapter(ArrayList<user_data> data) {
        this.data = data;
    }


    @NonNull
    @Override
    public view_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

    View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item , parent , false);

    view_holder holder = new view_holder(v);

        return holder;
    }


    @Override
    public void onBindViewHolder(@NonNull view_holder holder, int position) {

        user_data item  = data.get(position);

        holder.profile_img.setImageResource(item.getUser_image());
        holder.user_name.setText(item.getUsername());
        holder.user_photo.setImageResource(item.getUser_photo());

    }


    @Override
    public int getItemCount() {
        return data.size();
    }



    class view_holder extends RecyclerView.ViewHolder{

    ImageView profile_img ,delete , user_photo , like , comment , favorite , share ;
    TextView user_name ;
    public Boolean liked = false  , stared = false;

        public view_holder(@NonNull final View itemView) {
            super(itemView);

            profile_img = itemView.findViewById(R.id.profile_image);
            user_name = itemView.findViewById(R.id.user_name_tv);
            user_photo = itemView.findViewById(R.id.row_user_photo);
            like = itemView.findViewById(R.id.row_like_icon);
            favorite = itemView.findViewById(R.id.row_star_icon);
            comment = itemView.findViewById(R.id.row_comment_icon);

        like.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {

                if (liked == false)
                {
                   like.setImageResource(R.drawable.like);
                    liked = true ;
                }
                else {
                    like.setImageResource(R.drawable.heart);
                    liked = false ;
                }

            }
        });

        favorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (stared == false)
                {
                    favorite.setImageResource(R.drawable.star);
                    stared = true ;
                }
                else {
                    favorite.setImageResource(R.drawable.stared);
                    stared = false ;
                }

            }
        });

        comment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent to_comment = new Intent(itemView.getContext() , com.example.errortast3.comment.class);
                        itemView.getContext().startActivity(to_comment);
                    }
                });
            }
        });


        }
    }
}
