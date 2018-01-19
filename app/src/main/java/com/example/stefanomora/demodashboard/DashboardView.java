package com.example.stefanomora.demodashboard;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

/**
 * Created by stefano.mora on 19/01/2018.
 */

class DashboardView extends View {

    private static final int BTN_RX = 10;
    private static final int BTN_RY = 10;
    private static final int MARGIN_X = 15;
    private static final int MARGIN_Y = 15;

    Rect mRectBack;
    Paint mPaintBack;
    Paint mPaintBtn;
    private RectF mRectBtn1;
    private RectF mRectBtn2;
    private RectF mRectBtn3;
    private RectF mRectBtn4;
    private Paint mPaintText;


    public DashboardView(Context context) {
        super(context);

        mPaintBack = new Paint();
        mPaintBack.setColor(Color.YELLOW);
        mPaintBack.setAlpha(80);

        mPaintBtn = new Paint();
        mPaintBtn.setColor(Color.argb( 100, 100, 50, 50));
        mPaintBtn.setStyle(Paint.Style.FILL);

        mPaintText = new Paint();
        mPaintText.setColor(Color.BLUE);
    }


    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        int nBarHeight = 250;
        //
        mRectBack = new Rect( 0, h-nBarHeight, w, h);
        //
        int nBtnDx = 80;
        mRectBtn1 = new RectF( MARGIN_X, h-nBarHeight+MARGIN_Y, MARGIN_X+nBtnDx, h-MARGIN_Y);
        mRectBtn2 = new RectF( MARGIN_X*2+nBtnDx, h-nBarHeight+MARGIN_Y, (MARGIN_X+nBtnDx)*2, h-MARGIN_Y);
        mRectBtn3 = new RectF( w-MARGIN_X, h-nBarHeight+MARGIN_Y, 2*(MARGIN_X+nBtnDx), h-MARGIN_Y);
        mRectBtn4 = new RectF( w-MARGIN_X-nBtnDx, h-nBarHeight+MARGIN_Y, w-MARGIN_X, h-MARGIN_Y);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        // Back
        canvas.drawRect( mRectBack, mPaintBack );
        //
        // 2 bottoni
        canvas.drawRoundRect( mRectBtn1, BTN_RX, BTN_RY, mPaintBtn);
        canvas.drawRoundRect( mRectBtn2, BTN_RX, BTN_RY, mPaintBtn);
        // Spazio centrale
        float fx = mRectBtn2.right + MARGIN_X;
        canvas.drawText( "1", 0, 0, mPaintText);
        canvas.drawText( "1", 0, 0, mPaintText);
        canvas.drawText( "1", 0, 0, mPaintText);
        canvas.drawText( "1", 0, 0, mPaintText);
        // 2 bottoni
        canvas.drawRoundRect( mRectBtn3, BTN_RX, BTN_RY, mPaintBtn);
        canvas.drawRoundRect( mRectBtn4, BTN_RX, BTN_RY, mPaintBtn);
    }
}
