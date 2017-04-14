package com.example.zsy.denglujiemian;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText accountEdit;
    private EditText passwordEdit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        accountEdit=(EditText)findViewById(R.id.join_id);
        passwordEdit=(EditText) findViewById(R.id.password_id);
        passwordEdit.setTransformationMethod(PasswordTransformationMethod.getInstance());
        Button button_1=(Button) findViewById(R.id.button_1);
        Button button_2=(Button) findViewById(R.id.button_2);
        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);

    }


    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button_1:
                Log.d("MainActivity",accountEdit.getText().toString());
                Log.d("MainActivity",passwordEdit.getText().toString());
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
                break;
            case R.id.button_2:
                finish();
                break;
            default: break;
        }
    }


}
