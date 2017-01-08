package com.example.huangjing.test20170108useintentfiltertostartactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by huangjing on 2017/1/8.
 */

public class ActivityOne extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("ActivityOneStarted");
        Intent intent = new Intent();
        intent.setAction("testAction");
        System.out.println("startActivityTwo");
        startActivity(intent);
    }
}
