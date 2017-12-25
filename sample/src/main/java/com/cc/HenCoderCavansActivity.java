package com.cc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cc.view.SloopView;

public class HenCoderCavansActivity extends AppCompatActivity {
    private SloopView mSloopView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mSloopView = new SloopView(this);
        setContentView(mSloopView);
    }
}
