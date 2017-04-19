package com.wx.goodview.demo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by lichengcai on 2017/4/19.
 */

public class SloopView extends View {
    //创建一个画笔
    private Paint mPaint = new Paint();

    public SloopView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaint();
    }

    public SloopView(Context context, AttributeSet attrs) {
        super(context, attrs);
        invalidate();
    }

    public SloopView(Context context) {
        super(context);
        initPaint();
    }

    private void initPaint() {

        //设置画笔颜色
        mPaint.setColor(Color.BLACK);
        //设置画笔模式为填充
        mPaint.setStyle(Paint.Style.FILL);
        //设置画笔宽度为10px
        mPaint.setStrokeWidth(10f);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //绘制点
        canvas.drawPoint(100,100,mPaint);
        //绘制矩形
        canvas.drawRect(100,150,200,300,mPaint);
        //绘制圆角矩形
        RectF rectF = new RectF(100,400,300,500);
        canvas.drawRoundRect(rectF,250,200,mPaint);
        //绘制圆
        canvas.drawCircle(150,600,50,mPaint);
        //绘制圆弧
        RectF rectF1 = new RectF(100,700,400,1000);
        mPaint.setColor(Color.GRAY);
        canvas.drawRect(rectF1,mPaint);//矩形背景
        mPaint.setColor(Color.BLUE);
        canvas.drawArc(rectF1,0,250,true,mPaint);

    }
}
