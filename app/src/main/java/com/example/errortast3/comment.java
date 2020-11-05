package com.example.errortast3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;

public class comment extends AppCompatActivity {

    RecyclerView rv ;
    ImageView send_comment ;
    EditText comment_content ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);

        rv = findViewById(R.id.comment_recycler);
        send_comment = findViewById(R.id.add_comment_btn);
        comment_content = findViewById(R.id.write_comment_et);


        final ArrayList <comments_obj> user_comments = new ArrayList<>();
        final comment_adapter adapter = new comment_adapter(user_comments);


        send_comment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String comment = comment_content.getText().toString();
                user_comments.add(new comments_obj(comment));
                adapter.notifyDataSetChanged();
                comment_content.setText(" ");

            }
        });



        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);
        rv.setAdapter(adapter);

    }
}