package com.androidst.hai.haihoai;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Parcelable;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

/**
 * Created by Hai on 9/25/2017.
 */

public class StudentActivity extends Activity {
    private Button btn1, btn2;
    private TextView tvhoten;
    private EditText etngaysinh, etquequan, etlop, etkhoa, etgioitinh;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_activity);
        initialize();
        setDatabyExtras();
//        Intent intent = getIntent();
//        Bundle gethoten=callhoten.getBundleExtra("hoten");
//        String hoten1 = gethoten.getString("hoten");


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {


                StudentActivity student = new StudentActivity();
                Intent intent = new Intent(StudentActivity.this, StudentInforActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("hoten",tvhoten.getText().toString());
                bundle.putString("ngaysinh", etngaysinh.getText().toString());
                bundle.putString("quequan", etquequan.getText().toString());
                bundle.putString("gioitinh", etgioitinh.getText().toString());
                bundle.putString("lop", etlop.getText().toString());
                bundle.putString("khoa", etkhoa.getText().toString());
                intent.putExtra("goihang", bundle);
                startActivity(intent);

            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                finish();
            }
        });
    }

    public void initialize() {

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        tvhoten = (TextView) findViewById(R.id.tvhoten);
        etngaysinh = (EditText) findViewById(R.id.etngaysinh);
        etquequan = (EditText) findViewById(R.id.etquequan);
        etgioitinh = (EditText) findViewById(R.id.etgioitinh);
        etlop = (EditText) findViewById(R.id.etlop);
        etkhoa = (EditText) findViewById(R.id.etkhoahoc);
    }

    public void setDatabyExtras() {
        Intent intent = getIntent();
        String hoten1 = intent.getStringExtra(MainActivity.HOTEN);
        tvhoten.setText(hoten1);
    }
}

