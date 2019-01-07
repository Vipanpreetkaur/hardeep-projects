package com.example.deathwalker.aadlabtest11;

import java.util.Timer;

import android.graphics.Rect;
import android.graphics.LinearGradient;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Color;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( new MyView ( this ) );
    }


    public class MyView extends View {

        public MyView(Context context) {
            super ( context );
        }

        @Override


        protected void onSizeChanged(int w, int h, int oldW, int oldH) {

            int centerY = 50;
        }






        protected void onDraw(Canvas canvas) {
            super.onDraw ( canvas );

            float x = getWidth ( );
            float y = getHeight ( );
            float hor = x/2;
            float ver = y/2;
            float left = (float) (hor-125), right = (float) (hor+125), top = 0, bottom = 250;

            int flag1 = 0;
            int flag2 = 0;

            Paint paint = new Paint ( );
            Rect ourRect = new Rect();
            paint.setColor ( Color.parseColor ( "blue" ) );
            canvas.drawRect(left, top, right, bottom, paint);


            while (flag1 == 0)
            {
                if(flag2 == 0)
                {
                    paint.setColor ( Color.parseColor ( "blue" ) );
                    canvas.drawRect(left, top, right, bottom, paint);
                    top += 150;
                    bottom +=150;
                    if(bottom >= y){
                        flag2 = 1;
                    }
                    postInvalidateDelayed(100);
                }
                else if (flag2 == 1) {
                    paint.setColor ( Color.parseColor ( "blue" ) );
                    canvas.drawRect ( left, top, right, bottom, paint );
                    top -= 150;
                    bottom -= 150;
                    if (top <= 0) {
                        flag2 = 0;
                    }
                    postInvalidateDelayed ( 100 );
                }
                else
                {
                    paint.setColor ( Color.parseColor ( "blue" ) );
                    canvas.drawRect(left, top, right, bottom, paint);
                    top += 150;
                    bottom +=150;
                    if(bottom >= y){
                        flag2 = 1;
                    }
                    postInvalidateDelayed(100);
                }
            }

        }

    }
}