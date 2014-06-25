// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.example.aaashichebiao;

import net.youmi.android.banner.AdSize;
import net.youmi.android.banner.AdView;

import com.android.adlib.ADbaseActivity;
import com.myapps.aaashichebiao.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;

// Referenced classes of package com.example.aaashichebiao:
//            daquan2

public class daquan extends ADbaseActivity
{
    public class ImageAdapter extends BaseAdapter
    {

        public int getCount()
        {
            return imageIDs.length;
        }

        public Object getItem(int i)
        {
            return Integer.valueOf(i);
        }

        public long getItemId(int i)
        {
            return (long)i;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            ImageView imageview;
            if(view == null)
            {
                imageview = new ImageView(context);
                imageview.setLayoutParams(new android.widget.AbsListView.LayoutParams(85, 85));
                imageview.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                imageview.setPadding(5, 5, 5, 5);
            } else
            {
                imageview = (ImageView)view;
            }
            imageview.setImageResource(imageIDs[i].intValue());
            return imageview;
        }

        private Context context;
//        final daquan this$0;

        public ImageAdapter(Context context1)
        {
//            this$0 = daquan.this;
            super();
            context = context1;
        }
    }


    public daquan()
    {
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
        Integer ainteger[] = new Integer[120];
        ainteger[0] = Integer.valueOf(0x7f020000);
        ainteger[1] = Integer.valueOf(0x7f020001);
        ainteger[2] = Integer.valueOf(0x7f020002);
        ainteger[3] = Integer.valueOf(0x7f020003);
        ainteger[4] = Integer.valueOf(0x7f020004);
        ainteger[5] = Integer.valueOf(0x7f020005);
        ainteger[6] = Integer.valueOf(0x7f020006);
        ainteger[7] = Integer.valueOf(0x7f020007);
        ainteger[8] = Integer.valueOf(0x7f020008);
        ainteger[9] = Integer.valueOf(0x7f020009);
        ainteger[10] = Integer.valueOf(0x7f02000a);
        ainteger[11] = Integer.valueOf(0x7f02000b);
        ainteger[12] = Integer.valueOf(0x7f02000c);
        ainteger[13] = Integer.valueOf(0x7f02000d);
        ainteger[14] = Integer.valueOf(0x7f02000e);
        ainteger[15] = Integer.valueOf(0x7f02000f);
        ainteger[16] = Integer.valueOf(0x7f020010);
        ainteger[17] = Integer.valueOf(0x7f020011);
        ainteger[18] = Integer.valueOf(0x7f020012);
        ainteger[19] = Integer.valueOf(0x7f020013);
        ainteger[20] = Integer.valueOf(0x7f020014);
        ainteger[21] = Integer.valueOf(0x7f020015);
        ainteger[22] = Integer.valueOf(0x7f020016);
        ainteger[23] = Integer.valueOf(0x7f020017);
        ainteger[24] = Integer.valueOf(0x7f020018);
        ainteger[25] = Integer.valueOf(0x7f020019);
        ainteger[26] = Integer.valueOf(0x7f02001a);
        ainteger[27] = Integer.valueOf(0x7f02001b);
        ainteger[28] = Integer.valueOf(0x7f02001c);
        ainteger[29] = Integer.valueOf(0x7f02001d);
        ainteger[30] = Integer.valueOf(0x7f02001e);
        ainteger[31] = Integer.valueOf(0x7f02001f);
        ainteger[32] = Integer.valueOf(0x7f020020);
        ainteger[33] = Integer.valueOf(0x7f020021);
        ainteger[34] = Integer.valueOf(0x7f020022);
        ainteger[35] = Integer.valueOf(0x7f020023);
        ainteger[36] = Integer.valueOf(0x7f020024);
        ainteger[37] = Integer.valueOf(0x7f020025);
        ainteger[38] = Integer.valueOf(0x7f020026);
        ainteger[39] = Integer.valueOf(0x7f020027);
        ainteger[40] = Integer.valueOf(0x7f020028);
        ainteger[41] = Integer.valueOf(0x7f020029);
        ainteger[42] = Integer.valueOf(0x7f02002a);
        ainteger[43] = Integer.valueOf(0x7f02002b);
        ainteger[44] = Integer.valueOf(0x7f02002c);
        ainteger[45] = Integer.valueOf(0x7f02002d);
        ainteger[46] = Integer.valueOf(0x7f02002e);
        ainteger[47] = Integer.valueOf(0x7f02002f);
        ainteger[48] = Integer.valueOf(0x7f020030);
        ainteger[49] = Integer.valueOf(0x7f020031);
        ainteger[50] = Integer.valueOf(0x7f020032);
        ainteger[51] = Integer.valueOf(0x7f020033);
        ainteger[52] = Integer.valueOf(0x7f020034);
        ainteger[53] = Integer.valueOf(0x7f020035);
        ainteger[54] = Integer.valueOf(0x7f020036);
        ainteger[55] = Integer.valueOf(0x7f020037);
        ainteger[56] = Integer.valueOf(0x7f020038);
        ainteger[57] = Integer.valueOf(0x7f020039);
        ainteger[58] = Integer.valueOf(0x7f02003a);
        ainteger[59] = Integer.valueOf(0x7f02003b);
        ainteger[60] = Integer.valueOf(0x7f02003c);
        ainteger[61] = Integer.valueOf(0x7f02003d);
        ainteger[62] = Integer.valueOf(0x7f02003e);
        ainteger[63] = Integer.valueOf(0x7f02003f);
        ainteger[64] = Integer.valueOf(0x7f020040);
        ainteger[65] = Integer.valueOf(0x7f020041);
        ainteger[66] = Integer.valueOf(0x7f020042);
        ainteger[67] = Integer.valueOf(0x7f020043);
        ainteger[68] = Integer.valueOf(0x7f020044);
        ainteger[69] = Integer.valueOf(0x7f020045);
        ainteger[70] = Integer.valueOf(0x7f020046);
        ainteger[71] = Integer.valueOf(0x7f020047);
        ainteger[72] = Integer.valueOf(0x7f020048);
        ainteger[73] = Integer.valueOf(0x7f020049);
        ainteger[74] = Integer.valueOf(0x7f02004e);
        ainteger[75] = Integer.valueOf(0x7f02004f);
        ainteger[76] = Integer.valueOf(0x7f020050);
        ainteger[77] = Integer.valueOf(0x7f020051);
        ainteger[78] = Integer.valueOf(0x7f020052);
        ainteger[79] = Integer.valueOf(0x7f020053);
        ainteger[80] = Integer.valueOf(0x7f020054);
        ainteger[81] = Integer.valueOf(0x7f020055);
        ainteger[82] = Integer.valueOf(0x7f020056);
        ainteger[83] = Integer.valueOf(0x7f020057);
        ainteger[84] = Integer.valueOf(0x7f020058);
        ainteger[85] = Integer.valueOf(0x7f020059);
        ainteger[86] = Integer.valueOf(0x7f02005a);
        ainteger[87] = Integer.valueOf(0x7f02005b);
        ainteger[88] = Integer.valueOf(0x7f02005c);
        ainteger[89] = Integer.valueOf(0x7f02005d);
        ainteger[90] = Integer.valueOf(0x7f02005e);
        ainteger[91] = Integer.valueOf(0x7f02005f);
        ainteger[92] = Integer.valueOf(0x7f020060);
        ainteger[93] = Integer.valueOf(0x7f020061);
        ainteger[94] = Integer.valueOf(0x7f020062);
        ainteger[95] = Integer.valueOf(0x7f020063);
        ainteger[96] = Integer.valueOf(0x7f020064);
        ainteger[97] = Integer.valueOf(0x7f020065);
        ainteger[98] = Integer.valueOf(0x7f020066);
        ainteger[99] = Integer.valueOf(0x7f020067);
        ainteger[100] = Integer.valueOf(0x7f020068);
        ainteger[101] = Integer.valueOf(0x7f020069);
        ainteger[102] = Integer.valueOf(0x7f02006a);
        ainteger[103] = Integer.valueOf(0x7f02006b);
        ainteger[104] = Integer.valueOf(0x7f02006c);
        ainteger[105] = Integer.valueOf(0x7f02006d);
        ainteger[106] = Integer.valueOf(0x7f02006e);
        ainteger[107] = Integer.valueOf(0x7f02006f);
        ainteger[108] = Integer.valueOf(0x7f020070);
        ainteger[109] = Integer.valueOf(0x7f020071);
        ainteger[110] = Integer.valueOf(0x7f020072);
        ainteger[111] = Integer.valueOf(0x7f020073);
        ainteger[112] = Integer.valueOf(0x7f020074);
        ainteger[113] = Integer.valueOf(0x7f020075);
        ainteger[114] = Integer.valueOf(0x7f020077);
        ainteger[115] = Integer.valueOf(0x7f020078);
        ainteger[116] = Integer.valueOf(0x7f020079);
        ainteger[117] = Integer.valueOf(0x7f02007a);
        ainteger[118] = Integer.valueOf(0x7f02007b);
        ainteger[119] = Integer.valueOf(0x7f02007c);
        imageIDs = ainteger;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030002);
        
        LinearLayout adLayout = (LinearLayout) findViewById(R.id.adLayout);
        AdView adView = new AdView(this, AdSize.FIT_SCREEN);
        adLayout.addView(adView);
        
        GridView gridview = (GridView)findViewById(0x7f08000e);
        gridview.setAdapter(new ImageAdapter(this));
        gridview.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                Intent intent = new Intent();
                intent.setClass(daquan.this, daquan2.class);
                intent.putExtra("int1", i);
                startActivityForResult(intent, 1);
            }

//            final daquan this$0;
//
//            
//            {
//                this$0 = daquan.this;
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

    Integer imageIDs[];
    String name[];
}
