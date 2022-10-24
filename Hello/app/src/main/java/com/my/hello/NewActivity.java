package com.my.hello;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new); // res/layout 안에 있는 화면xml 파일을 가리킨다.
    }

    public void onButton1Clicked(View v) {
        // 메세지 노출
        Toast.makeText(this, "돌아가기 버튼이 눌렸어요.", Toast.LENGTH_LONG).show();
        finish();
    }

    public void onButton2Clicked(View v) {
        // 웹 브라우저를 열고 네이버 사이트로 이동
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(intent);
    }

    public void onButton3Clicked(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1000-1000"));
        startActivity(intent);
    }
}