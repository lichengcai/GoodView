package com.cc.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import com.wx.goodview.demo.R;

/**
 * Created by lichengcai on 2017/12/25.
 */

public class HenCoderPaintView extends View {
    private  String TAG = HenCoderPaintView.class.getName();

    private Paint mPaint = new Paint();

    Shader shader = new LinearGradient(100,300,500,300, Color.parseColor("#E91E63"),
            Color.parseColor("#2196F3"),Shader.TileMode.CLAMP);

    Shader shader2 = new LinearGradient(500,100,900,500, Color.parseColor("#E91E63"),
            Color.parseColor("#2196F3"),Shader.TileMode.REPEAT);

    Shader shader3 = new LinearGradient(100,500,500,900, Color.parseColor("#E91E63"),
            Color.parseColor("#2196F3"),Shader.TileMode.MIRROR);

    Shader shader4 = new RadialGradient(700,700,200,Color.parseColor("#E91E63"),
            Color.parseColor("#2196F3"),Shader.TileMode.REPEAT);

    Shader shader5 = new SweepGradient(300,1100,Color.parseColor("#E91E63"),
            Color.parseColor("#2196F3"));

    Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ljj);

    Shader shader6 = new BitmapShader(bitmap,Shader.TileMode.MIRROR,Shader.TileMode.CLAMP);

    Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(), R.drawable.christmas_cap);
    Shader shader7 = new BitmapShader(bitmap2,Shader.TileMode.MIRROR,Shader.TileMode.MIRROR);
    Shader shader8 = new ComposeShader(shader6,shader7, PorterDuff.Mode.SRC_OVER);

    Path mPath = new Path();

    PathEffect pathEffect = new DashPathEffect(new float[]{20,10,5,10},10);

    public HenCoderPaintView(Context context) {
        super(context);
        initPaint();
    }

    public HenCoderPaintView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public HenCoderPaintView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        mPaint.setColor(Color.RED);
    }
    private void initPaint(){
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(2);
        mPaint.setAntiAlias(true);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        mPaint.setShader(shader);
//        canvas.drawCircle(300,300,200,mPaint);
//
//        mPaint.setShader(shader2);
//        canvas.drawCircle(700, 300, 200, mPaint);
//
//        mPaint.setShader(shader3);
//        canvas.drawCircle(300,700,200,mPaint);
//
//        mPaint.setShader(shader4);
//        canvas.drawCircle(700,700,200,mPaint);
//
//        mPaint.setShader(shader5);
//        canvas.drawCircle(300,1100,200,mPaint);
//
//        mPaint.setShader(shader6);
//        canvas.drawCircle(700,1100,200,mPaint);
//
//        mPaint.setShader(shader8);
//        canvas.drawCircle(300,1500,200,mPaint);


//        float[] lines = new float[]{100,100,200,300,400,150,600,200,800,50,1000,300};

        mPath.lineTo(100,100);
        mPath.lineTo(200,300);
        mPath.lineTo(400,150);
        mPath.lineTo(600,200);
        mPath.lineTo(800,50);
        mPath.lineTo(1000,300);
        canvas.drawPath(mPath,mPaint);

        mPath.moveTo(0,500);
        mPath.lineTo(100,600);
        mPath.lineTo(200,800);
        mPath.lineTo(400,650);
        mPath.lineTo(600,700);
        mPath.lineTo(800,550);
        mPath.lineTo(1000,800);
        mPaint.setPathEffect(pathEffect);
        canvas.drawPath(mPath,mPaint);

    }
}
