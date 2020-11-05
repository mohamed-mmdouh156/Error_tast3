package com.example.errortast3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    RecyclerView rv ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        rv = findViewById(R.id.Recyclerview);

       final ArrayList <user_data> data = new ArrayList<>();
        data.add(new user_data(R.drawable.myphoto , "Mohamed Mmdouh" , R.drawable.image1));
        data.add(new user_data(R.drawable.myphoto , "Mohamed Mmdouh" , R.drawable.image2));
        data.add(new user_data(R.drawable.myphoto , "Mohamed Mmdouh" , R.drawable.image3));
        data.add(new user_data(R.drawable.myphoto , "Mohamed Mmdouh" , R.drawable.image4));
        data.add(new user_data(R.drawable.myphoto , "Mohamed Mmdouh" , R.drawable.image5));
        data.add(new user_data(R.drawable.myphoto , "Mohamed Mmdouh" , R.drawable.image6));
        data.add(new user_data(R.drawable.myphoto , "Mohamed Mmdouh" , R.drawable.image7));

      recycler_adapter adapter = new recycler_adapter(data);

        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);
        rv.setAdapter(adapter);

    }
}