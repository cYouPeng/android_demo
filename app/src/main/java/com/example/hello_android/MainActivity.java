package com.example.hello_android;

import android.content.Intent;
import android.os.Bundle;

import com.example.hello_android.gridview.GridviewActivity;
import com.example.hello_android.listview.ListViewActivity;
//import com.example.hello_android.ScrollViewActivity;
//import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.hello_android.databinding.ActivityMainBinding;
import com.example.hello_android.recyclerview.RecyclerViewActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
//    private ActivityMainBinding binding;

    private Button mBtnButton;
    private Button mBtnGridview;
    private Button mBtnScrollView;
    private Button mBtnRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_main);
        mBtnButton = this.findViewById(R.id.btn_1);
        mBtnButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // 跳转Button演示界面
                Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
                startActivity(intent);
            }

        });
        mBtnGridview = findViewById(R.id.btn_gridview);
        mBtnGridview.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GridviewActivity.class);
                startActivity(intent);
            }
        });

        mBtnScrollView = findViewById(R.id.btn_sc);
        mBtnScrollView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
;               Intent intent = new Intent(MainActivity.this, ScrollViewActivity.class);
                startActivity(intent);
            }
        });
        mBtnRecyclerView = findViewById(R.id.btn_rv);
        mBtnRecyclerView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RecyclerViewActivity.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}