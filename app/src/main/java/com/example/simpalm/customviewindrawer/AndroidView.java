package com.example.simpalm.customviewindrawer;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;


/**
 * Created by Simpalm on 12/11/15.
 */
public class AndroidView extends View {

    // circle and text colors
    private int squareCol, labelCol;
    // label text

    private String squareText;
    // paint for drawing custom view

    private Paint squarePaint;

    public AndroidView(Context context, AttributeSet attrs, int squareCol, int labelCol, String squareText, Paint squarePaint) {
        super(context, attrs);
        this.squareCol = squareCol;
        this.labelCol = labelCol;
        this.squareText = squareText;
        this.squarePaint = squarePaint;
    }
}
