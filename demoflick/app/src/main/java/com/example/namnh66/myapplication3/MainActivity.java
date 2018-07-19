package com.example.namnh66.myapplication3;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener, GestureDetector.OnGestureListener {
    ImageView mbnt4 ;
    ImageView mbnt5 ;
    GestureDetector gd;
    LinearLayout mlist1;
    LinearLayout mlist2;
    int  _xDelta;
    int  _yDelta;
     int  _rightMargin;
     int  _bottomMargin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();


    }
    void init(){
        mbnt4 = findViewById(R.id.img_buton4);
        mbnt5 = findViewById(R.id.img_buton5);
        mlist1= findViewById(R.id.list_item1);
        mlist2= findViewById(R.id.list_item2);
        mlist1.setOnTouchListener((View.OnTouchListener) this);
        mlist2.setOnTouchListener((View.OnTouchListener) this);

        gd = new GestureDetector((GestureDetector.OnGestureListener) this);
    }

    @Override
    public boolean onDown(MotionEvent e) {
        //Log.d("NamNH66", "Down");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        //Log.d("NamNH66", "Show");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        //Log.d("NamNH66", "Sing");
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        //Log.d("NamNH66", "Scroll");
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        //Log.d("NamNH66", "Long");
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        float e1x = e1.getX();
        float e2x = e2.getX();
        if (e1x-e2x>250)
        {
            mlist2.setVisibility(View.VISIBLE);
            mlist1.setVisibility(View.GONE);
        }
        else if (e2x-e1x>150){
            mlist2.setVisibility(View.GONE);
            mlist1.setVisibility(View.VISIBLE);
        }
        else {
            return false;
        }

        return false;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (v.getId()){
            case R.id.list_item1:
                return gd.onTouchEvent(event);
            case R.id.list_item2:
                return gd.onTouchEvent(event);
                default:
                    break;
        }
        return false;
    }


}
