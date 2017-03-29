package com.example.zsy.denglujiemian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText) findViewById(R.id.password_id);
        editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        Button button_1=(Button) findViewById(R.id.button_1);
        Button button_2=(Button) findViewById(R.id.button_2);
        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button_1:
                Toast.makeText(MainActivity.this,"Welcome",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_2:
                finish();
                break;
            default: break;
        }
    }
}
