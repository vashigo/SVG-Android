package com.github.megatronking.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.github.megatronking.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_ring_volume extends SVGRenderer {

    public ic_ring_volume(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(23.71f, 16.67f);
        mPath.cubicTo(20.66f, 13.78f, 16.54f, 12.0f, 12.0f, 12.0f);
        mPath.cubicTo(7.46f, 12.0f, 3.34f, 13.78f, 0.29f, 16.67f);
        mPath.rCubicTo(-0.18f, 0.18f, -0.29f, 0.43f, -0.29f, 0.71f);
        mPath.rCubicTo(0.0f, 0.28f, 0.11f, 0.53f, 0.29f, 0.71f);
        mPath.rLineTo(2.48f, 2.48f);
        mPath.rCubicTo(0.18f, 0.18f, 0.43f, 0.29f, 0.71f, 0.29f);
        mPath.rCubicTo(0.27f, 0.0f, 0.52f, -0.11f, 0.7f, -0.28f);
        mPath.rCubicTo(0.79f, -0.74f, 1.69f, -1.36f, 2.66f, -1.85f);
        mPath.rCubicTo(0.33f, -0.16f, 0.56f, -0.5f, 0.56f, -0.9f);
        mPath.rLineTo(0f, -3.1f);
        mPath.rCubicTo(1.45f, -0.48f, 3.0f, -0.73f, 4.6f, -0.73f);
        mPath.rCubicTo(1.6000004f, 0.0f, 3.15f, 0.25f, 4.6f, 0.72f);
        mPath.rLineTo(0f, 3.1f);
        mPath.rCubicTo(0.0f, 0.39f, 0.23f, 0.74f, 0.56f, 0.9f);
        mPath.rCubicTo(0.98f, 0.49f, 1.87f, 1.12f, 2.66f, 1.85f);
        mPath.rCubicTo(0.18f, 0.18f, 0.43f, 0.28f, 0.7f, 0.28f);
        mPath.rCubicTo(0.28f, 0.0f, 0.53f, -0.11f, 0.71f, -0.29f);
        mPath.rLineTo(2.48f, -2.48f);
        mPath.rCubicTo(0.18f, -0.18f, 0.29f, -0.43f, 0.29f, -0.71f);
        mPath.rCubicTo(0.0f, -0.27f, -0.11f, -0.52f, -0.29f, -0.7f);
        mPath.close();
        mPath.moveTo(23.71f, 16.67f);
        mPath.moveTo(21.16f, 6.26f);
        mPath.rLineTo(-1.41f, -1.41f);
        mPath.rLineTo(-3.56f, 3.55f);
        mPath.rLineTo(1.41f, 1.41f);
        mPath.rCubicTo(0.0f, 0.0f, 3.45f, -3.52f, 3.56f, -3.55f);
        mPath.close();
        mPath.moveTo(21.16f, 6.26f);
        mPath.moveTo(13.0f, 2.0f);
        mPath.rLineTo(-2.0f, 0f);
        mPath.rLineTo(0f, 5.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.lineTo(13.0f, 2.0f);
        mPath.close();
        mPath.moveTo(13.0f, 2.0f);
        mPath.moveTo(6.4f, 9.81f);
        mPath.lineTo(7.81f, 8.4f);
        mPath.lineTo(4.26f, 4.84f);
        mPath.lineTo(2.84f, 6.26f);
        mPath.rCubicTo(0.11f, 0.03f, 3.56f, 3.55f, 3.56f, 3.55f);
        mPath.close();
        mPath.moveTo(6.4f, 9.81f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}