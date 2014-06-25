// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.example.aaashichebiao;

import com.android.adlib.ADbaseActivity;
import com.myapps.aaashichebiao.R;

import net.youmi.android.AdManager;
import net.youmi.android.banner.AdSize;
import net.youmi.android.banner.AdView;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;


// Referenced classes of package com.example.aaashichebiao:
//            ceshi, daquan, xunzhang, guanyu

public class MainActivity extends ADbaseActivity
{

    public MainActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030000);
        AdManager.getInstance(this).init("b9887c655ec0ae6d",
        	    "b819bd9abac84b58", false);
        
      LinearLayout adLayout = (LinearLayout) findViewById(R.id.adLayout);
      AdView adView = new AdView(this, AdSize.FIT_SCREEN);
      adLayout.addView(adView);
        imageButton1 = (ImageButton)findViewById(0x7f080002);
        imageButton2 = (ImageButton)findViewById(0x7f080003);
        imageButton3 = (ImageButton)findViewById(0x7f080004);
//        imageButton4 = (ImageButton)findViewById(0x7f080005);
//        imageButton5 = (ImageButton)findViewById(0x7f080006);
        imageButton1.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, ceshi.class);
                startActivity(intent);
            }

//            final MainActivity this$0;
//
//            
//            {
//                this$0 = MainActivity.this;
//                super();
//            }
        }
);
        imageButton2.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, daquan.class);
                startActivity(intent);
            }

//            final MainActivity this$0;
//
//            
//            {
//                this$0 = MainActivity.this;
//                super();
//            }
        }
);
        imageButton3.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, xunzhang.class);
                startActivity(intent);
            }

//            final MainActivity this$0;
//
//            
//            {
//                this$0 = MainActivity.this;
//                super();
//            }
        }
);
//        imageButton4.setOnClickListener(new android.view.View.OnClickListener() {
//
//            public void onClick(View view)
//            {
//                Intent intent = new Intent();
//                intent.setClass(MainActivity.this, guanyu.class);
//                startActivity(intent);
//            }
//
//        }
//);
    }

    protected void onDestroy()
    {
//        AppConnect.getInstance(this).close();
        super.onDestroy();
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

    private ImageButton imageButton1;
    private ImageButton imageButton2;
    private ImageButton imageButton3;
    private ImageButton imageButton4;
    private ImageButton imageButton5;
}
