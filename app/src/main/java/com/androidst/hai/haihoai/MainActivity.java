package com.androidst.hai.haihoai;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private EditText et1;
    public static final String HOTEN = "HOTEN";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,StudentActivity.class);

                startActivity(intent);
                String hoten = et1.getText().toString();
                byExtras(hoten);

            }
        });

        Log.d("hihi", "onCreate");
    }
    private void byExtras(String hoten) {
        Intent intent = new Intent(MainActivity.this, StudentActivity.class);
        intent.putExtra(HOTEN, hoten);
        startActivity(intent);
    }

    public void initialize() {

        btn1 = (Button) findViewById(R.id.btn1);
        et1 = (EditText) findViewById(R.id.et1);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("hihi", "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("hihi", "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("hihi", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("hihi", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("hihi", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("hihi", "onDestroy");
    }
}
