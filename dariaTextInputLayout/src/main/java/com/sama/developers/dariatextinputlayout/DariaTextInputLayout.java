package com.sama.developers.dariatextinputlayout;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class DariaTextInputLayout extends TextInputLayout {

    private TextInputEditText editText;

    public DariaTextInputLayout(Context context) {
        super(context);
    }

    public DariaTextInputLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs, com.google.android.material.R.style.ThemeOverlay_MaterialComponents_TextInputEditText);
    }

    public DariaTextInputLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr);
    }

    private void init(Context context, AttributeSet attrs, int defStyleAttr) {
        setWillNotDraw(false);
        editText = new TextInputEditText(getContext());
        createEditBox(editText);
    }

    private void createEditBox(TextInputEditText editText) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        editText.setPadding(30,50,30,50);
        editText.setLayoutParams(layoutParams);
        addView(editText);
    }

    public void setColors( int textColor, int strokeColor,int backgroundColor){
        getEditText().setTextColor(textColor);

        getEditText().setBackgroundTintList(ColorStateList.valueOf(backgroundColor));
        setBoxStrokeColor(strokeColor);
    }

//override for not receiving from parent
    @Override
    public void setBoxBackgroundColor(int boxBackgroundColor) {
        super.setBoxBackgroundColor(boxBackgroundColor);
    }
}