package com.wx.goodview.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wx.goodview.demo.view.SloopView;

public class FirstActivity extends AppCompatActivity {
    private SloopView mSloopView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mSloopView = new SloopView(this);
        setContentView(mSloopView);
    }
}
