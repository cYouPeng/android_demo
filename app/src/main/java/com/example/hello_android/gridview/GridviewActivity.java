package com.example.hello_android.gridview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.hello_android.R;

public class GridviewActivity extends AppCompatActivity {
    private GridView mGv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview);
        mGv = findViewById(R.id.gv);
        mGv.setAdapter(new MyGridViewAdapter(GridviewActivity.this));

        mGv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(GridviewActivity.this, "点击 pos："+position, Toast.LENGTH_SHORT).show();
            }
        });
        mGv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {

            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(GridviewActivity.this, "长按 pos："+position, Toast.LENGTH_SHORT).show();
                return true;
            }
        });

    }
}
