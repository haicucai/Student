package com.androidst.hai.haihoai;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StudentInforActivity extends AppCompatActivity {
    public TextView tvhoten,tvngaysinh,tvquequan,tvlop,tvgioitinh,tvkhoa;
    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.studentinfor_activity);

        initialize();
        setInfoStudent();

    }

public void setInfoStudent(){

    Intent info = getIntent();
    Bundle callbundle = info.getBundleExtra("goihang");
    String tvhoten1 = callbundle.getString("hoten");
    String tvquequan1 = callbundle.getString("quequan");
    String tvngaysinh1 = callbundle.getString("ngaysinh");
    String tvgioitinh1 = callbundle.getString("gioitinh");
    String tvlop1 = callbundle.getString("lop");
    String tvkhoa1 = callbundle.getString("khoa");
    tvhoten.setText(tvhoten1);
    tvngaysinh.setText(tvngaysinh1);
    tvquequan.setText(tvquequan1);
    tvgioitinh.setText(tvgioitinh1);
    tvlop.setText(tvlop1);
    tvkhoa.setText(tvkhoa1);
}
    private void initialize() {
        btn1=(Button)findViewById(R.id.btn1);
        tvhoten = (TextView) findViewById(R.id.tvhoten);
        tvquequan = (TextView) findViewById(R.id.tvquequan);
        tvgioitinh = (TextView) findViewById(R.id.tvgioitinh);
        tvngaysinh = (TextView) findViewById(R.id.tvngaysinh);
        tvlop = (TextView) findViewById(R.id.tvlop);
        tvkhoa = (TextView) findViewById(R.id.tvkhoahoc);
    }

}
