package com.lightgo.zhongxing;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;

public class JidiActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView tongxun;
    private ImageView yidongtongxin;
    private ImageView chengzai;
    private ImageView yidongyufangzheng;
    private ImageView yunjisuan;
    private ImageView shixunyewu;
    private ImageView gongcheng;
    private ImageButton vgtx,vydtx,vczyaq,vydyfz,vyjs,vsxyw,vgcsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jidi);

        tongxun=(ImageView)findViewById(R.id.tongxun);  //挂ＨＴＭＬ
        chengzai=(ImageView)findViewById(R.id.Chengzaiyuanquan);
        yidongtongxin=(ImageView)findViewById(R.id.YiDongTongxin);
        yidongyufangzheng=(ImageView)findViewById(R.id.YiDongFangzheng);
        yunjisuan=(ImageView)findViewById(R.id.yunjisuan);
        shixunyewu=(ImageView)findViewById(R.id.shixunyewu);
        gongcheng=(ImageView)findViewById(R.id.Gongcheng);

        vgtx = (ImageButton)findViewById(R.id.vgtx);
        vydtx = (ImageButton)findViewById(R.id.vydtx);
        vczyaq = (ImageButton)findViewById(R.id.vczyaq);
        vydyfz = (ImageButton)findViewById(R.id.vydyfz);
        vyjs = (ImageButton)findViewById(R.id.vyjs);
        vsxyw = (ImageButton)findViewById(R.id.vsxyw);
        vgcsg = (ImageButton) findViewById(R.id.vgcsg);

        vgtx.setOnClickListener(this);
        vydtx.setOnClickListener(this);
        vczyaq.setOnClickListener(this);
        vydyfz.setOnClickListener(this);
        vyjs.setOnClickListener(this);
        vsxyw.setOnClickListener(this);
        vgcsg.setOnClickListener(this);

        tongxun.setOnClickListener(this);
        chengzai.setOnClickListener(this);
        yidongtongxin.setOnClickListener(this);
        yidongyufangzheng.setOnClickListener(this);
        yunjisuan.setOnClickListener(this);
        shixunyewu.setOnClickListener(this);
        gongcheng.setOnClickListener(this);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
        } else if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
        }
    }

    void StartIntent(String str){
        Intent intent = new Intent(JidiActivity.this, labvedioone.class);
        intent.putExtra("fn", str);
        startActivity(intent);
    }
    @Override
    public void onClick(View view) {
       switch (view.getId()){
           case R.id.vgtx:
               StartIntent("520");    //光通讯
               break;
           case R.id.vydtx:
               StartIntent("517");  //移动通讯
               break;
           case R.id.vczyaq:
               StartIntent("519"); //承载
               break;
           case R.id.vydyfz:
               StartIntent("516");   //移动仿真
               break;
           case R.id.vyjs:
               StartIntent("515"); //云计算
               break;
           case R.id.vsxyw:
               StartIntent("510"); //视讯
               break;
           case R.id.vgcsg:
               StartIntent("512");  //工程
               break;
           case R.id.tongxun:
               Intent tongxunintent = new Intent(JidiActivity.this,Inweb.class);
               tongxunintent.putExtra("wb","http://q.eqxiu.com/s/qZXvrXSx");
               startActivity(tongxunintent);
               break;
           case R.id.Chengzaiyuanquan:
               Intent intent = new Intent(JidiActivity.this,Inweb.class);
               intent.putExtra("wb","http://c.eqxiu.com/s/AvNRbkA8");
               startActivity(intent);
               break;
           case R.id.YiDongTongxin:
               Intent YiDongTongxinintent = new Intent(JidiActivity.this,Inweb.class);
               YiDongTongxinintent.putExtra("wb","http://c.eqxiu.com/s/KslklXx3");
               startActivity(YiDongTongxinintent);
               break;
           case R.id.YiDongFangzheng:
               Intent YiDongFangzhengintent = new Intent(JidiActivity.this,Inweb.class);
               YiDongFangzhengintent.putExtra("wb","http://x.eqxiu.com/s/IfNikoqN");
               startActivity(YiDongFangzhengintent);
               break;
           case R.id.yunjisuan:
               Intent yunjisuanintent = new Intent(JidiActivity.this,Inweb.class);
               yunjisuanintent.putExtra("wb","http://d.eqxiu.com/s/qOoTLpGP");
               startActivity(yunjisuanintent);
               break;
           case R.id.shixunyewu:
               Intent shixunyewuintent = new Intent(JidiActivity.this,Inweb.class);
               shixunyewuintent.putExtra("wb","http://q.eqxiu.com/s/pBrpKCgM");
               startActivity(shixunyewuintent);
               break;
           case R.id.Gongcheng:
               Intent Gongchengintent = new Intent(JidiActivity.this,Inweb.class);
               Gongchengintent.putExtra("wb","http://u.eqxiu.com/s/EWSLJ2QN");
               startActivity(Gongchengintent);
               break;
           default:
               break;
       }
    }
}





