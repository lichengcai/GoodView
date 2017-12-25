package com.cc;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.cc.view.HenCoderPaintView;

/**
 * Created by lichengcai on 2017/12/25.
 */

public class HenCoderPaintActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        HenCoderPaintView henCoderPaintView = new HenCoderPaintView(this);
        setContentView(henCoderPaintView);

    }
}
