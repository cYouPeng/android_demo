package com.example.hello_android.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hello_android.R;

public class RecyclerViewActivity extends AppCompatActivity {
    private Button mBtnLinear;
    private Button mBtnHor;
    private Button mBtnGrid;
    private Button mBtnPu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        mBtnLinear = findViewById(R.id.id_btn1);
        mBtnLinear.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(RecyclerViewActivity.this, LinearRecyclerViewActivity.class);
                startActivity(intent);
            }
        });
        mBtnHor = findViewById(R.id.id_btn2);
        mBtnHor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecyclerViewActivity.this, HorRecyclerViewActivity.class);
                startActivity(intent);
            }
        });

        mBtnGrid = findViewById(R.id.id_btn3);
        mBtnGrid.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(RecyclerViewActivity.this, GridRecyclerViewActivity.class);
                startActivity(intent);
            }
        });

        mBtnPu = findViewById(R.id.id_btn4);
        mBtnPu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(RecyclerViewActivity.this, PuRecyclerViewActivity.class);
                startActivity(intent);
            }
        });

    }
}