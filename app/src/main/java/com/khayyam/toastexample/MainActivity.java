package com.khayyam.toastexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.khayyam.toasterlibrary.ToasterMessage;

import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToasterMessage.s(MainActivity.this,"Ya Allah");

    }
}
