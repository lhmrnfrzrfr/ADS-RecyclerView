package com.ilham.recyclerdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MainAdapter adapter;

    private String titleList[] = {
            "Judul 1","Judul 2","Judul 3","Judul 4","Judul 5",
            "Judul 6","Judul 7","Judul 8","Judul 9","Judul 10"};
    private String descList[] = {
            "Ini deskripsi 1","Ini deskripsi 2","Ini deskripsi 3",
            "Ini deskripsi 4","Ini deskripsi 5","Ini deskripsi 6",
            "Ini deskripsi 7","Ini deskripsi 8","Ini deskripsi 9",
            "Ini deskripsi 10"};
    private Integer photoList[] = {
            R.drawable.photo1,R.drawable.photo2,R.drawable.photo3,R.drawable.photo4,
            R.drawable.photo5,R.drawable.photo6,R.drawable.photo7,R.drawable.photo8,
            R.drawable.photo9,R.drawable.photo10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rvList);
        // vertical layout
//        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        // horizontal layout
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        // grid layout
//        recyclerView.setLayoutManager(new GridLayoutManager(this, 5));
        // staggered layout
//        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        adapter = new MainAdapter(titleList, descList,  photoList,  this);
        recyclerView.setAdapter(adapter);
    }

}
