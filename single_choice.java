package com.example.singlechoice;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class single_choice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_choice);

        AlertDialog.Builder singleDialog = new AlertDialog.Builder(this);
        singleDialog.setTitle("请选择性别").setIcon(R.mipmap.ic_launcher).setSingleChoiceItems(new String[]{"男", "女"}, 0,  new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"弹出来吧",Toast.LENGTH_SHORT);
            }
        });
        //singleDialog.setPositiveButton(0,);
        singleDialog.create();
        singleDialog.show();


    }
}
