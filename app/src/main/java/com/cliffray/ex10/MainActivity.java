package com.cliffray.ex10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button)findViewById(R.id.Button1);
        b1.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View v){
                EditText et = (EditText)findViewById(R.id.height);
                double height = Double.parseDouble(et.getText().toString());
                String sex="";
                RadioButton rb1 = (RadioButton)findViewById(R.id.sex1);
                if(rb1.isChecked()){
                    sex = "M";
                }
                else{
                    sex = "F";
                }
                Intent intent = new Intent();
                intent.setClass(MainActivity.this ,MainActivity1.class);

                Bundle bndl = new Bundle();
                bndl.putDouble("height" ,height);
                bndl.putString("sex" ,sex);

                intent.putExtras(bndl);

                startActivity(intent);
            }
        });
    }
}
