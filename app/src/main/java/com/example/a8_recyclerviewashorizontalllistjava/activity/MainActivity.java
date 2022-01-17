package com.example.a8_recyclerviewashorizontalllistjava.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.a8_recyclerviewashorizontalllistjava.R;
import com.example.a8_recyclerviewashorizontalllistjava.adapter.CustomAdapter;
import com.example.a8_recyclerviewashorizontalllistjava.model.Member;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Context context;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        List<Member> members = prepareMember();
        refreshAdapter(members);
    }

    private void refreshAdapter(List<Member> members) {
        CustomAdapter adapter = new CustomAdapter(context, members);
        recyclerView.setAdapter(adapter);
    }

    private List<Member> prepareMember() {
        List<Member> members = new ArrayList<>();
        int[] array = {R.drawable.img, R.drawable.img_1, R.drawable.img_2, R.drawable.img_3};

        for (int i = 0; i < 30; i++){
            Random random = new Random();
            int count = random.nextInt() % 4;
            members.add(new Member("Odilbek " + i,  array[Math.abs(count)]));
        }
        return members;
    }

    void initViews(){
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
    }

}