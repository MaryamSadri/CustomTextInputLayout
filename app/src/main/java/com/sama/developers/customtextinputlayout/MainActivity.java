package com.sama.developers.customtextinputlayout;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.sama.developers.dariatextinputlayout.DariaTextInputLayout;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init(){
        DariaTextInputLayout myText;
        int textColor;
        int strokeColor;
        int backgroundColor;
        textColor = getResources().getColor(R.color.purple_700);
        strokeColor = getResources().getColor(R.color.teal_200);
        backgroundColor = getResources().getColor(R.color.teal_200);
        myText = findViewById(R.id.dariaTextInputLayout);
        myText.setColors(textColor, strokeColor, backgroundColor);
    }
}