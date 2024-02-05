package com.example.cardview_inside_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    MyAdapter myAdapter;
    int[] images = {R.drawable.afghanistan_icon,R.drawable.armenia_icon,R.drawable.azerbaijan_icon,R.drawable.bahrain_icon,
            R.drawable.bangladesh_icon,R.drawable.bhutan_icon,R.drawable.china_icon,R.drawable.indonesia_icon,R.drawable.india_icon,
            R.drawable.iran_icon,R.drawable.iraq_icon,R.drawable.japan_icon,R.drawable.kazakhstan_icon,R.drawable.nepal_icon,
            R.drawable.pakistan_icon,R.drawable.sri_lanka_icon,R.drawable.turkey_icon

    };

    private String[] title,desc;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView_Id);

        title = getResources().getStringArray(R.array.county_names);
        desc = getResources().getStringArray(R.array.county_desc);

        myAdapter = new MyAdapter(getApplicationContext(),title,desc,images);

        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}













