// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.example.aaashichebiao;

import net.youmi.android.banner.AdSize;
import net.youmi.android.banner.AdView;

import com.android.adlib.ADbaseActivity;
import com.myapps.aaashichebiao.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class xunzhang extends ADbaseActivity
{

    public xunzhang()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030006);
        
        LinearLayout adLayout = (LinearLayout) findViewById(R.id.adLayout);
        AdView adView = new AdView(this, AdSize.FIT_SCREEN);
        adLayout.addView(adView);
        
        
        textView4 = (TextView)findViewById(0x7f080018);
        textView5 = (TextView)findViewById(0x7f08001a);
        imageView5 = (ImageView)findViewById(0x7f080019);
        button7 = (Button)findViewById(0x7f08001c);
        sharedata1 = getSharedPreferences("data1", 0).edit();
        if(sharedata1 == null)
        {
            sharedata1.putInt("name1", 0);
            sharedata1.commit();
        }
        int i = getSharedPreferences("data", 0).getInt("name", 0);
        if(i > getSharedPreferences("data1", 0).getInt("name1", 0))
        {
            sharedata1.putInt("name1", i);
            sharedata1.commit();
        }
        int j = getSharedPreferences("data1", 0).getInt("name1", 0);
        textView4.setText((new StringBuilder("\u60A8\u7684\u6700\u9AD8\u95EF\u5173\u8BB0\u5F55\u4E3A\uFF1A")).append(j).append("\u5173").toString());
        if(j < 10)
        {
            textView5.setText("\u7B49\u7EA71\uFF1A\u5FAE\u578B\u8F66");
            imageView5.setImageResource(0x7f02007e);
        } else
        if(j < 20)
        {
            textView5.setText("\u7B49\u7EA72\uFF1A\u9762\u5305\u8F66");
            imageView5.setImageResource(0x7f020080);
        } else
        if(j < 30)
        {
            textView5.setText("\u7B49\u7EA73\uFF1A\u5C0F\u578B\u8F66");
            imageView5.setImageResource(0x7f020081);
        } else
        if(j < 50)
        {
            textView5.setText("\u7B49\u7EA74\uFF1A\u7D27\u51D1\u578B\u8F66");
            imageView5.setImageResource(0x7f020082);
        } else
        if(j < 70)
        {
            textView5.setText("\u7B49\u7EA75\uFF1A\u4E2D\u578B\u8F66");
            imageView5.setImageResource(0x7f020083);
        } else
        if(j < 100)
        {
            textView5.setText("\u7B49\u7EA76\uFF1A\u5C0F\u94A2\u70AE");
            imageView5.setImageResource(0x7f020084);
        } else
        if(j < 200)
        {
            textView5.setText("\u7B49\u7EA77\uFF1AMPV");
            imageView5.setImageResource(0x7f020085);
        } else
        if(j < 500)
        {
            textView5.setText("\u7B49\u7EA78\uFF1ASUV");
            imageView5.setImageResource(0x7f020086);
        } else
        if(j < 1000)
        {
            textView5.setText("\u7B49\u7EA79\uFF1A\u8C6A\u534E\u8F66");
            imageView5.setImageResource(0x7f020087);
        } else
        {
            textView5.setText("\u7B49\u7EA710\uFF1A\u8D85\u8DD1");
            imageView5.setImageResource(0x7f02007f);
        }
        button7.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                finish();
            }

//            final xunzhang this$0;
//
//            
//            {
//                this$0 = xunzhang.this;
//                super();
//            }
        }
);
    }

    public void onPause()
    {
        super.onPause();
//        StatService.onPause(this);
    }

    public void onResume()
    {
        super.onResume();
//        StatService.onResume(this);
    }

    Button button7;
    ImageView imageView5;
    android.content.SharedPreferences.Editor sharedata1;
    TextView textView4;
    TextView textView5;
}
