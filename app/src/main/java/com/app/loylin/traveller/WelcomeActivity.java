package com.app.loylin.traveller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

    //初始化控件
    private Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        //初始化控件
        initView();
        initListener();
    }

    public void initView(){
        btnStart = (Button) findViewById(R.id.wel_start);
    }

    public void initListener() {
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(WelcomeActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
