package com.esrc.biosignal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;
import android.widget.Button;

public class Own_JapaneseFood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_own__japanese_food);
        // 전체 화면으로 설정
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // 화면 꺼지지 않도록 설정
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON,
                WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        Button sake=(Button)findViewById(R.id.sake);
        sake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent=new Intent(
                        getApplicationContext(),
                        Pay.class);
                startActivity(intent);
            }
        });

        Button curry=(Button)findViewById(R.id.curry);
        curry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent=new Intent(
                        getApplicationContext(),
                        Pay.class);
                startActivity(intent);
            }
        });

        Button katz=(Button)findViewById(R.id.katz);
        katz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent=new Intent(
                        getApplicationContext(),
                        Pay.class);
                startActivity(intent);
            }
        });

        Button sushi=(Button)findViewById(R.id.sushi);
        sushi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent=new Intent(
                        getApplicationContext(),
                        Pay.class);
                startActivity(intent);
            }
        });

        Button menta=(Button)findViewById(R.id.menta);
        menta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent=new Intent(
                        getApplicationContext(),
                        Pay.class);
                startActivity(intent);
            }
        });

        Button ramen=(Button)findViewById(R.id.ramen);
        ramen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent=new Intent(
                        getApplicationContext(),
                        Pay.class);
                startActivity(intent);
            }
        });
    }

    //화면 전환효과 없애기
    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
        overridePendingTransition(0,0);
    }

    //화면 종료효과 없애기
    @Override
    public void onPause(){
        super.onPause();
        overridePendingTransition(0,0);
    }

    //어플리케이션 BACK버튼
    public void back_jp(View v) {
        Intent back = new Intent(Own_JapaneseFood.this, Own_Menu.class);
        startActivity(back);
        finish();   //화면이 쌓이지 않고 액티비티 종료
    }

    //휴대폰 자체 BACK버튼
    @Override
    public void onBackPressed() {
        Intent home = new Intent(Own_JapaneseFood.this, Own_Menu.class);
        startActivity(home);
    }

}