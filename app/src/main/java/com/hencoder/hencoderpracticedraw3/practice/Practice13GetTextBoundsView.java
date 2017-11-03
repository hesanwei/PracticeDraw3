package com.hencoder.hencoderpracticedraw3.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class Practice13GetTextBoundsView extends View {
    Paint paint1 = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paint2 = new Paint(Paint.ANTI_ALIAS_FLAG);
    String text1 = "A";
    String text2 = "a";
    String text3 = "J";
    String text4 = "j";
    String text5 = "Â";
    String text6 = "â";
    int top = 200;
    int bottom = 400;

    float y1;
    float y2;
    float y3;
    float y4;
    float y5;
    float y6;

    public Practice13GetTextBoundsView(Context context) {
        super(context);
    }

    public Practice13GetTextBoundsView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice13GetTextBoundsView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        paint1.setStyle(Paint.Style.STROKE);
        paint1.setStrokeWidth(20);
        paint1.setColor(Color.parseColor("#E91E63"));
        paint2.setTextSize(160);

        Rect rect = new Rect();
        paint2.getTextBounds(text1,0,text1.length(),rect);
        y1 = -rect.bottom / 2 - rect.top / 2;
        paint2.getTextBounds(text2,0,text2.length(),rect);
        y2 = -rect.bottom / 2 - rect.top / 2;
        paint2.getTextBounds(text3,0,text3.length(),rect);
        y3 = -rect.bottom / 2 - rect.top / 2;
        paint2.getTextBounds(text4,0,text4.length(),rect);
        y4 = -rect.bottom / 2 - rect.top / 2;
        paint2.getTextBounds(text5,0,text5.length(),rect);
        y5 = -rect.bottom / 2 - rect.top / 2;
        paint2.getTextBounds(text6,0,text6.length(),rect);
        y6 = -rect.bottom / 2 - rect.top / 2;

        Log.e("xxxxxx","y1==" + y1 + "===y2==" + y2 + "---y3= " + y3 + "---y4= " + y4 + "---y5= " + y5 + "---y6= " + y6);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawRect(50, top, getWidth() - 50, bottom, paint1);

        // 使用 Paint.getTextBounds() 计算出文字的显示区域
        // 然后计算出文字的绘制位置，从而让文字上下居中
        // 这种居中算法的优点是，可以让文字精准地居中，分毫不差

        int middle = (top + bottom) / 2;
        canvas.drawText(text1, 100, middle + y1, paint2);
        canvas.drawText(text2, 200, middle + y2, paint2);
        canvas.drawText(text3, 300, middle + y3, paint2);
        canvas.drawText(text4, 400, middle + y4, paint2);
        canvas.drawText(text5, 500, middle + y5, paint2);
        canvas.drawText(text6, 600, middle + y6, paint2);
    }
}