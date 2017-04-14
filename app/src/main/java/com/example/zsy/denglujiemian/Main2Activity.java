package com.example.zsy.denglujiemian;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ActionBar actionBar=getSupportActionBar();
        if (actionBar!=null){
            actionBar.hide();
        }
        Button titleBack = (Button) findViewById(R.id.title_back);
        Button titleEdit = (Button) findViewById(R.id.title_edit);
        titleBack.setOnClickListener(this);
        titleEdit.setOnClickListener(this);
    }


    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.title_back:
                Intent intent = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent);
                break;
            case R.id.title_edit:
                Intent intent1 =new Intent();
                intent1.setAction("android.media.action.IMAGE_CAPTURE");
                intent1.addCategory("android.intent.category.DEFAULT");
                startActivity(intent1);
                break;
            default:
                break;
        }
    }
}
