package com.example.edumng;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //필드 확인
        TextView txUserid = findViewById(R.id.txtUserid);
        TextView txtUserpw = findViewById(R.id.txtUserpw);
        TextView txtUsername = findViewById(R.id.txtUsername);
        Button btnManage = findViewById(R.id.btnManage);

        //수신받은 데이터 확인
        Intent intent = getIntent();
        String userid = intent.getExtras().getString("userid");
        //수신데이터를 view에 출력
        txUserid.setText((userid));
        //관리자가 아니면 회원관리 버튼이 안보이게 처리
        if(! userid.equals("admin")){
            btnManage.setVisibility(View.GONE);
        }

//
//        String name = intent.getExtras().getString("name");
//        int age = intent.getExtras().getInt("age"); /*int형*/
//        String array[] = intent.getExtras().getStringArray("array"); /*배열*/
//        Option option = (Option)intent.getSerializableExtra("class"); /*클래스*/
//


    }
}
