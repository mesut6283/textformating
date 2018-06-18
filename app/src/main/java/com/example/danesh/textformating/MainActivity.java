package com.example.danesh.textformating;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.BackgroundColorSpan;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.TextView;

import me.biubiubiu.justifytext.library.JustifyTextView;

import static android.text.Layout.JUSTIFICATION_MODE_INTER_WORD;

public class MainActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tv = findViewById(R.id.textview1);
        tv.setText(Html.fromHtml(getString(R.string.mytext1)));








        /*TextView tv = (TextView) findViewById(R.id.textview1);;
        Spanned sp = Html.fromHtml(getString(R.string.mytext1));
        tv.setText(sp);*/
    }
}
