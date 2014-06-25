// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.example.aaashichebiao;

import com.myapps.aaashichebiao.R;

import net.youmi.android.banner.AdSize;
import net.youmi.android.banner.AdView;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ceshi extends Activity
{

    public ceshi()
    {
        i = 0;
        k = 0;
        l = 0;
        a = new int[4];
        String as[] = new String[120];
        as[0] = "\u5E7F\u6C7D";
        as[1] = "\u5947\u745E";
        as[2] = "\u4E00\u6C7D";
        as[3] = "\u6BD4\u4E9A\u8FEA";
        as[4] = "\u957F\u57CE";
        as[5] = "MG";
        as[6] = "\u5E86\u94C3";
        as[7] = "\u529B\u5E06";
        as[8] = "\u9646\u98CE";
        as[9] = "\u5409\u5965";
        as[10] = "\u4F17\u6CF0";
        as[11] = "\u534E\u6668\u4E2D\u534E";
        as[12] = "\u8363\u5A01";
        as[13] = "\u53A6\u95E8\u91D1\u9F99";
        as[14] = "\u82F1\u4F26";
        as[15] = "\u4E1C\u98CE\u98CE\u795E";
        as[16] = "\u6D77\u9A6C\u90D1\u5DDE";
        as[17] = "\u957F\u5B89\uFF08\u5546\u7528\uFF09";
        as[18] = "\u542F\u8FB0";
        as[19] = "\u9752\u5E74\u83B2\u82B1";
        as[20] = "\u4E0A\u6D77\u6C47\u4F17";
        as[21] = "\u4E0A\u6D77\u534E\u666E";
        as[22] = "\u660C\u6CB3";
        as[23] = "\u798F\u8FEA";
        as[24] = "\u4E94\u83F1";
        as[25] = "\u957F\u5B89";
        as[26] = "\u4E2D\u5174";
        as[27] = "\u5317\u6C7D\u5A01\u65FA";
        as[28] = "\u7EB3\u667A\u6377";
        as[29] = "\u5B9D\u9A8F";
        as[30] = "\u4F9D\u7EF4\u67EF";
        as[31] = "\u5DDD\u6C7D\u91CE\u9A6C";
        as[32] = "\u7EA2\u65D7";
        as[33] = "\u9ED1\u8C79";
        as[34] = "\u54C8\u98DE";
        as[35] = "\u6C5F\u94C3";
        as[36] = "\u5317\u6C7D\u798F\u7530";
        as[37] = "\u53CC\u73AF";
        as[38] = "\u534E\u6CF0";
        as[39] = "\u957F\u4E30";
        as[40] = "\u4E1C\u5357";
        as[41] = "\u6D77\u9A6C";
        as[42] = "\u5409\u5229";
        as[43] = "\u5E1D\u8C6A";
        as[44] = "\u6C5F\u6DEE";
        as[45] = "\u4E1C\u98CE";
        as[46] = "\u91D1\u676F";
        as[47] = "\u745E\u9E92";
        as[48] = "\u4E5D\u9F99";
        as[49] = "\u9EC4\u6D77";
        as[50] = "\u5168\u7403\u9E70";
        as[51] = "\u5F00\u745E";
        as[52] = "\u5A01\u9E9F";
        as[53] = "\u5317\u6C7D\u65B0\u80FD\u6E90";
        as[54] = "\u7406\u5FF5";
        as[55] = "\u5317\u6C7D\u5236\u9020";
        as[56] = "\u5357\u4EAC\u6C7D\u8F66";
        as[57] = "\u6C88\u9633\u4E2D\u987A";
        as[58] = "\u6C5F\u5357";
        as[59] = "\u5927\u8FEA";
        as[60] = "\u6C38\u6E90";
        as[61] = "\u81EA\u7531\u98CE";
        as[62] = "\u4E2D\u6B27";
        as[63] = "\u4E30\u7530";
        as[64] = "\u672C\u7530";
        as[65] = "\u9A6C\u81EA\u8FBE";
        as[66] = "\u65E5\u4EA7";
        as[67] = "\u65AF\u5DF4\u9C81";
        as[68] = "\u96F7\u514B\u8428\u65AF";
        as[69] = "\u8BB4\u6B4C";
        as[70] = "\u94C3\u6728";
        as[71] = "\u82F1\u83F2\u5C3C\u8FEA";
        as[72] = "\u4E09\u83F1";
        as[73] = "\u5149\u5188";
        as[74] = "\u52B3\u65AF\u83B1\u65AF";
        as[75] = "\u4FDD\u65F6\u6377";
        as[76] = "\u5954\u9A70";
        as[77] = "\u5B9D\u9A6C";
        as[78] = "\u5965\u8FEA";
        as[79] = "\u5927\u4F17";
        as[80] = "\u52B3\u4F26\u58EB";
        as[81] = "\u6B27\u5B9D";
        as[82] = "\u8FC8\u5DF4\u8D6B";
        as[83] = "Smart";
        as[84] = "\u6807\u81F4";
        as[85] = "\u96EA\u94C1\u9F99";
        as[86] = "\u5E03\u52A0\u8FEA";
        as[87] = "\u96F7\u8BFA";
        as[88] = "\u6CD5\u62C9\u5229";
        as[89] = "\u5E15\u52A0\u5C3C";
        as[90] = "\u739B\u838E\u62C9\u8482";
        as[91] = "\u5170\u535A\u57FA\u5C3C";
        as[92] = "\u963F\u5C14\u6CD5\u7F57\u5BC6\u6B27";
        as[93] = "\u83F2\u4E9A\u7279";
        as[94] = "\u5BBE\u5229";
        as[95] = "\u8FF7\u4F60";
        as[96] = "\u8DEF\u7279\u65AF";
        as[97] = "\u963F\u65AF\u987F\u9A6C\u4E01";
        as[98] = "\u6377\u8C79";
        as[99] = "\u8DEF\u864E";
        as[100] = "\u51EF\u8FEA\u62C9\u514B";
        as[101] = "\u96EA\u4F5B\u5170";
        as[102] = "\u798F\u7279";
        as[103] = "\u522B\u514B";
        as[104] = "\u514B\u83B1\u65AF\u52D2";
        as[105] = "\u608D\u9A6C";
        as[106] = "GMC";
        as[107] = "\u6797\u80AF";
        as[108] = "\u5409\u666E";
        as[109] = "\u9053\u5947";
        as[110] = "Rossion";
        as[111] = "\u8D77\u4E9A";
        as[112] = "\u53CC\u9F99";
        as[113] = "\u73B0\u4EE3";
        as[114] = "\u65AF\u67EF\u8FBE";
        as[115] = "\u67EF\u5C3C\u8D5B\u683C";
        as[116] = "\u897F\u4E9A\u7279";
        as[117] = "\u4E16\u7235";
        as[118] = "\u8428\u535A";
        as[119] = "\u6C83\u5C14\u6C83";
        name = as;
        int ai[] = new int[120];
        ai[0] = 0x7f020000;
        ai[1] = 0x7f020001;
        ai[2] = 0x7f020002;
        ai[3] = 0x7f020003;
        ai[4] = 0x7f020004;
        ai[5] = 0x7f020005;
        ai[6] = 0x7f020006;
        ai[7] = 0x7f020007;
        ai[8] = 0x7f020008;
        ai[9] = 0x7f020009;
        ai[10] = 0x7f02000a;
        ai[11] = 0x7f02000b;
        ai[12] = 0x7f02000c;
        ai[13] = 0x7f02000d;
        ai[14] = 0x7f02000e;
        ai[15] = 0x7f02000f;
        ai[16] = 0x7f020010;
        ai[17] = 0x7f020011;
        ai[18] = 0x7f020012;
        ai[19] = 0x7f020013;
        ai[20] = 0x7f020014;
        ai[21] = 0x7f020015;
        ai[22] = 0x7f020016;
        ai[23] = 0x7f020017;
        ai[24] = 0x7f020018;
        ai[25] = 0x7f020019;
        ai[26] = 0x7f02001a;
        ai[27] = 0x7f02001b;
        ai[28] = 0x7f02001c;
        ai[29] = 0x7f02001d;
        ai[30] = 0x7f02001e;
        ai[31] = 0x7f02001f;
        ai[32] = 0x7f020020;
        ai[33] = 0x7f020021;
        ai[34] = 0x7f020022;
        ai[35] = 0x7f020023;
        ai[36] = 0x7f020024;
        ai[37] = 0x7f020025;
        ai[38] = 0x7f020026;
        ai[39] = 0x7f020027;
        ai[40] = 0x7f020028;
        ai[41] = 0x7f020029;
        ai[42] = 0x7f02002a;
        ai[43] = 0x7f02002b;
        ai[44] = 0x7f02002c;
        ai[45] = 0x7f02002d;
        ai[46] = 0x7f02002e;
        ai[47] = 0x7f02002f;
        ai[48] = 0x7f020030;
        ai[49] = 0x7f020031;
        ai[50] = 0x7f020032;
        ai[51] = 0x7f020033;
        ai[52] = 0x7f020034;
        ai[53] = 0x7f020035;
        ai[54] = 0x7f020036;
        ai[55] = 0x7f020037;
        ai[56] = 0x7f020038;
        ai[57] = 0x7f020039;
        ai[58] = 0x7f02003a;
        ai[59] = 0x7f02003b;
        ai[60] = 0x7f02003c;
        ai[61] = 0x7f02003d;
        ai[62] = 0x7f02003e;
        ai[63] = 0x7f02003f;
        ai[64] = 0x7f020040;
        ai[65] = 0x7f020041;
        ai[66] = 0x7f020042;
        ai[67] = 0x7f020043;
        ai[68] = 0x7f020044;
        ai[69] = 0x7f020045;
        ai[70] = 0x7f020046;
        ai[71] = 0x7f020047;
        ai[72] = 0x7f020048;
        ai[73] = 0x7f020049;
        ai[74] = 0x7f02004e;
        ai[75] = 0x7f02004f;
        ai[76] = 0x7f020050;
        ai[77] = 0x7f020051;
        ai[78] = 0x7f020052;
        ai[79] = 0x7f020053;
        ai[80] = 0x7f020054;
        ai[81] = 0x7f020055;
        ai[82] = 0x7f020056;
        ai[83] = 0x7f020057;
        ai[84] = 0x7f020058;
        ai[85] = 0x7f020059;
        ai[86] = 0x7f02005a;
        ai[87] = 0x7f02005b;
        ai[88] = 0x7f02005c;
        ai[89] = 0x7f02005d;
        ai[90] = 0x7f02005e;
        ai[91] = 0x7f02005f;
        ai[92] = 0x7f020060;
        ai[93] = 0x7f020061;
        ai[94] = 0x7f020062;
        ai[95] = 0x7f020063;
        ai[96] = 0x7f020064;
        ai[97] = 0x7f020065;
        ai[98] = 0x7f020066;
        ai[99] = 0x7f020067;
        ai[100] = 0x7f020068;
        ai[101] = 0x7f020069;
        ai[102] = 0x7f02006a;
        ai[103] = 0x7f02006b;
        ai[104] = 0x7f02006c;
        ai[105] = 0x7f02006d;
        ai[106] = 0x7f02006e;
        ai[107] = 0x7f02006f;
        ai[108] = 0x7f020070;
        ai[109] = 0x7f020071;
        ai[110] = 0x7f020072;
        ai[111] = 0x7f020073;
        ai[112] = 0x7f020074;
        ai[113] = 0x7f020075;
        ai[114] = 0x7f020077;
        ai[115] = 0x7f020078;
        ai[116] = 0x7f020079;
        ai[117] = 0x7f02007a;
        ai[118] = 0x7f02007b;
        ai[119] = 0x7f02007c;
        flag = ai;
    }

    private void choose()
    {
        k = 1 + k;
        a[r] = i;
        textView1.setText((new StringBuilder("\u7B2C")).append(1 + k).append("\u9898\uFF1A").toString());
        imageView1.setImageResource(flag[i]);
        button1.setText(name[a[0]]);
        button2.setText(name[a[1]]);
        button3.setText(name[a[2]]);
        button4.setText(name[a[3]]);
    }

    private void jieshu()
    {
        setContentView(0x7f030005);
        LinearLayout linearlayout = (LinearLayout)findViewById(0x7f080017);
//        AppConnect.getInstance(this).showBannerAd(this, linearlayout);
        textView2 = (TextView)findViewById(0x7f080014);
        textView2.setText((new StringBuilder("\u7ED3\u675F\uFF0C\u60A8\u95EF\u4E86")).append(k).append("\u5173\uFF0C\u6B63\u786E\u7B54\u6848\u5E94\u4E3A\uFF1A").append(name[i]).toString());
        imageView2 = (ImageView)findViewById(0x7f08000f);
        imageView2.setImageResource(flag[i]);
        sharedata.putInt("name", k);
        sharedata.commit();
        button6 = (Button)findViewById(0x7f080016);
        button6.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                finish();
            }

//            final ceshi this$0;
//
//            
//            {
//                this$0 = ceshi.this;
//                super();
//            }
        }
);
    }

    private void rad()
    {
        i = (int)(Math.random() * (double)l);
        a[0] = (int)(Math.random() * (double)l);
        if(a[0] == i)
            a[0] = 1 + i;
        a[1] = (int)(Math.random() * (double)l);
        if(a[1] == i)
            a[1] = 1 + i;
        a[2] = (int)(Math.random() * (double)l);
        if(a[2] == i)
            a[2] = 1 + i;
        a[3] = (int)(Math.random() * (double)l);
        if(a[3] == i)
            a[3] = 1 + i;
        r = (int)(4D * Math.random());
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030001);
        
        LinearLayout adLayout = (LinearLayout) findViewById(R.id.adLayout);
        AdView adView = new AdView(this, AdSize.FIT_SCREEN);
        adLayout.addView(adView);
        
        textView1 = (TextView)findViewById(0x7f080008);
        imageView1 = (ImageView)findViewById(0x7f080001);
        button1 = (Button)findViewById(0x7f080009);
        button2 = (Button)findViewById(0x7f08000a);
        button3 = (Button)findViewById(0x7f08000c);
        button4 = (Button)findViewById(0x7f08000d);
        sharedata = getSharedPreferences("data", 0).edit();
        l = name.length;
        i = (int)(Math.random() * (double)l);
        rad();
        a[r] = i;
        textView1.setText((new StringBuilder("\u7B2C")).append(1 + k).append("\u9898\uFF1A").toString());
        imageView1.setImageResource(flag[i]);
        button1.setText(name[a[0]]);
        button2.setText(name[a[1]]);
        button3.setText(name[a[2]]);
        button4.setText(name[a[3]]);
        button1.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                if(r != 0)
                {
                    jieshu();
                } else
                {
                    rad();
                    choose();
                }
            }

//            final ceshi this$0;
//
//            
//            {
//                this$0 = ceshi.this;
//                super();
//            }
        }
);
        button2.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                if(r != 1)
                {
                    jieshu();
                } else
                {
                    rad();
                    choose();
                }
            }

//            final ceshi this$0;
//
//            
//            {
//                this$0 = ceshi.this;
//                super();
//            }
        }
);
        button3.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                if(r != 2)
                {
                    jieshu();
                } else
                {
                    rad();
                    choose();
                }
            }

//            final ceshi this$0;
//
//            
//            {
//                this$0 = ceshi.this;
//                super();
//            }
        }
);
        button4.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                if(r != 3)
                {
                    jieshu();
                } else
                {
                    rad();
                    choose();
                }
            }
//
//            final ceshi this$0;
//
//            
//            {
//                this$0 = ceshi.this;
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

    int a[];
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button6;
    int flag[];
    private int i;
    private ImageView imageView1;
    private ImageView imageView2;
    private int k;
    private int l;
    String name[];
    private int r;
    android.content.SharedPreferences.Editor sharedata;
    private TextView textView1;
    private TextView textView2;




}
