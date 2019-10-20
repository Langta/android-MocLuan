package com.app.langta.mocluan;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

import java.util.Random;

public class chiemsatthienac_click extends AppCompatActivity {
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;

    View view1;
    View view2;
    View view3;
    View view4;

    int request_Code;

    int ketqua;

    int xoay;
    int dem = 0;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;

    int luan1;
    int luan2;
    int luan3;
    int luan4;


    Button dong;
    Button layque;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_chiemsatthienac_click );

        AdView adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height = displayMetrics.heightPixels;
        final int widh = displayMetrics.widthPixels;

        dong = findViewById( R.id.btdong );
        layque = findViewById( R.id.btlayque );

        imageView1 = findViewById( R.id.img1 );
        imageView2 = findViewById( R.id.img2 );
        imageView3 = findViewById( R.id.img3 );
        imageView4 = findViewById( R.id.img4 );

        textView1 = findViewById( R.id.tv1 );
        textView2 = findViewById( R.id.tv2 );
        textView3 = findViewById( R.id.tv3 );
        textView4 = findViewById( R.id.tv4 );
        textView5 = findViewById( R.id.tv5 );

        view1 = findViewById(R.id.view1);
        view2 = findViewById(R.id.view2);
        view3 = findViewById(R.id.view3);
        view4 = findViewById(R.id.view4);

        dong.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        } );

        layque.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = getIntent();
                final String thien = intent.getStringExtra( "thien" );
                Log.e( "thienac", thien );

                dem = dem + 1;
                if (dem == 1) {
                    Random rd = new Random();
                    xoay = rd.nextInt( 5 - 1 ) + 1;

                    if (xoay == 4) {
                        Random rd4 = new Random();
                        luan4 = rd4.nextInt( 5 - 1 ) + 1;

                        if (luan4 == 4) {
                            {
                                {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView4, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView4, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            imageView4.setImageResource( R.drawable.vang2 );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }
                            ;
                            final Handler handler06 = new Handler();
                            handler06.postDelayed( new Runnable() {
                                @Override
                                public void run() {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView4, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView4, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            imageView4.setImageResource( R.drawable.vang2 );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }, 500 );

                            final Handler handler07 = new Handler();
                            handler07.postDelayed( new Runnable() {
                                @Override
                                public void run() {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView4, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView4, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            textView4.setVisibility( View.VISIBLE );// Hiển thị dòng text đã ẩn
                                            view4.setVisibility(View.VISIBLE);
                                            view4.getLayoutParams().width = widh/4;
                                            textView4.setText( "Vệt Ngắn" );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }, 1000 );
                            final Handler handler006 = new Handler();
                            handler006.postDelayed( new Runnable() {
                                                        @Override
                                                        public void run() {
                                                            if (thien.equals( "ac" )) {
                                                                showPopup( "Tâm chưa thành, hãy thu thập rồi quay trở lại" );
                                                            }
                                                            if (thien.equals( "thien" )) {

                                                            }
                                                        }
                                                    },
                                    2000 );

                        }
                        if (luan4 == 3) {
                            {
                                {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView4, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView4, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            imageView4.setImageResource( R.drawable.vang2 );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }
                            ;
                            final Handler handler06 = new Handler();
                            handler06.postDelayed( new Runnable() {
                                @Override
                                public void run() {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView4, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView4, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            imageView4.setImageResource( R.drawable.vang2 );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }, 500 );

                            final Handler handler07 = new Handler();
                            handler07.postDelayed( new Runnable() {
                                @Override
                                public void run() {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView4, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView4, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            textView4.setVisibility( View.VISIBLE );// Hiển thị dòng text đã ẩn
                                            view4.setVisibility(View.VISIBLE);
                                            view4.getLayoutParams().width = widh/4;
                                            view4.setBackgroundResource(R.drawable.hansau);
                                            textView4.setText( "Hằn Ngắn" );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }, 1000 );
                            final Handler handler006 = new Handler();
                            handler006.postDelayed( new Runnable() {
                                                        @Override
                                                        public void run() {
                                                            if (thien.equals( "ac" )) {

                                                            }
                                                            if (thien.equals( "thien" )) {
                                                                showPopup( "Tâm chưa thành, hãy thu thập rồi quay trở lại" );
                                                            }
                                                        }
                                                    },
                                    2500 );

                        }
                        if (luan4 == 2) {
                            {
                                {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView4, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView4, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            imageView4.setImageResource( R.drawable.vang2 );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }
                            ;
                            final Handler handler06 = new Handler();
                            handler06.postDelayed( new Runnable() {
                                @Override
                                public void run() {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView4, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView4, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            imageView4.setImageResource( R.drawable.vang2 );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }, 500 );

                            final Handler handler07 = new Handler();
                            handler07.postDelayed( new Runnable() {
                                @Override
                                public void run() {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView4, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView4, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            textView4.setVisibility( View.VISIBLE );// Hiển thị dòng text đã ẩn
                                            view4.setVisibility(View.VISIBLE);
                                            textView4.setText( "Vệt Dài" );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }, 1000 );
                            final Handler handler006 = new Handler();
                            handler006.postDelayed( new Runnable() {
                                                        @Override
                                                        public void run() {
                                                            if (thien.equals( "ac" )) {
                                                                showPopup( "Tâm chưa thành, hãy thu thập rồi quay trở lại" );
                                                            }
                                                            if (thien.equals( "thien" )) {

                                                            }
                                                        }
                                                    },
                                    2500 );

                        }
                        if (luan4 == 1) {
                            {
                                {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView4, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView4, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            imageView4.setImageResource( R.drawable.vang2 );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }
                            ;
                            final Handler handler06 = new Handler();
                            handler06.postDelayed( new Runnable() {
                                @Override
                                public void run() {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView4, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView4, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            imageView4.setImageResource( R.drawable.vang2 );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }, 500 );

                            final Handler handler07 = new Handler();
                            handler07.postDelayed( new Runnable() {
                                @Override
                                public void run() {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView4, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView4, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            textView4.setVisibility( View.VISIBLE );// Hiển thị dòng text đã ẩn
                                            view4.setVisibility(View.VISIBLE);
                                            view4.setBackgroundResource(R.drawable.hansau);
                                            textView4.setText( "Hằn Sâu" );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }, 1000 );
                            final Handler handler006 = new Handler();
                            handler006.postDelayed( new Runnable() {
                                                        @Override
                                                        public void run() {
                                                            if (thien.equals( "ac" )) {

                                                            }
                                                            if (thien.equals( "thien" )) {
                                                                showPopup( "Tâm chưa thành, hãy thu thập rồi quay trở lại" );
                                                            }
                                                        }
                                                    },
                                    2500 );
                        }

                    }

                    if (xoay == 3) {
                        Random rd3 = new Random();
                        luan3 = rd3.nextInt( 5 - 1 ) + 1;

                        if (luan3 == 4) {
                            {
                                {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView3, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView3, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            imageView3.setImageResource( R.drawable.vang2 );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }
                            ;
                            final Handler handler04 = new Handler();
                            handler04.postDelayed( new Runnable() {
                                @Override
                                public void run() {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView3, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView3, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            imageView3.setImageResource( R.drawable.vang2 );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }, 500 );

                            final Handler handler05 = new Handler();
                            handler05.postDelayed( new Runnable() {
                                @Override
                                public void run() {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView3, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView3, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            textView3.setVisibility( View.VISIBLE );// Hiển thị dòng text đã ẩn
                                            view3.setVisibility(View.VISIBLE);
                                            view3.getLayoutParams().width = widh/4;
                                            textView3.setText( "Vệt Ngắn" );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }, 1000 );
                            final Handler handler006 = new Handler();
                            handler006.postDelayed( new Runnable() {
                                                        @Override
                                                        public void run() {
                                                            if (thien.equals( "ac" )) {
                                                                showPopup( "Tâm chưa thành, hãy thu thập rồi quay trở lại" );
                                                            }
                                                            if (thien.equals( "thien" )) {

                                                            }
                                                        }
                                                    },
                                    2500 );

                        }
                        if (luan3 == 3) {
                            {
                                {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView3, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView3, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            imageView3.setImageResource( R.drawable.vang2 );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }
                            ;
                            final Handler handler04 = new Handler();
                            handler04.postDelayed( new Runnable() {
                                @Override
                                public void run() {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView3, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView3, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            imageView3.setImageResource( R.drawable.vang2 );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }, 500 );

                            final Handler handler05 = new Handler();
                            handler05.postDelayed( new Runnable() {
                                @Override
                                public void run() {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView3, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView3, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            textView3.setVisibility( View.VISIBLE );// Hiển thị dòng text đã ẩn
                                            view3.setVisibility(View.VISIBLE);
                                            view3.getLayoutParams().width = widh/4;
                                            view3.setBackgroundResource(R.drawable.hansau);
                                            textView3.setText( "Hằn Ngắn" );

                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }, 1000 );
                            final Handler handler006 = new Handler();
                            handler006.postDelayed( new Runnable() {
                                                        @Override
                                                        public void run() {
                                                            if (thien.equals( "ac" )) {

                                                            }
                                                            if (thien.equals( "thien" )) {
                                                                showPopup( "Tâm chưa thành, hãy thu thập rồi quay trở lại" );
                                                            }
                                                        }
                                                    },
                                    2500 );

                        }
                        if (luan3 == 2) {
                            {
                                {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView3, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView3, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            imageView3.setImageResource( R.drawable.vang2 );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }
                            ;
                            final Handler handler04 = new Handler();
                            handler04.postDelayed( new Runnable() {
                                @Override
                                public void run() {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView3, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView3, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            imageView3.setImageResource( R.drawable.vang2 );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }, 500 );

                            final Handler handler05 = new Handler();
                            handler05.postDelayed( new Runnable() {
                                @Override
                                public void run() {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView3, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView3, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            textView3.setVisibility( View.VISIBLE );// Hiển thị dòng text đã ẩn
                                            view3.setVisibility(View.VISIBLE);
                                            textView3.setText( "Vệt Dài" );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }, 1000 );
                            final Handler handler006 = new Handler();
                            handler006.postDelayed( new Runnable() {
                                                        @Override
                                                        public void run() {
                                                            if (thien.equals( "ac" )) {
                                                                showPopup( "Tâm chưa thành, hãy thu thập rồi quay trở lại" );
                                                            }
                                                            if (thien.equals( "thien" )) {

                                                            }
                                                        }
                                                    },
                                    2500 );

                        }
                        if (luan3 == 1) {
                            {
                                {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView3, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView3, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            imageView3.setImageResource( R.drawable.vang2 );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }
                            ;
                            final Handler handler04 = new Handler();
                            handler04.postDelayed( new Runnable() {
                                @Override
                                public void run() {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView3, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView3, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            imageView3.setImageResource( R.drawable.vang2 );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }, 500 );

                            final Handler handler05 = new Handler();
                            handler05.postDelayed( new Runnable() {
                                @Override
                                public void run() {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView3, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView3, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            textView3.setVisibility( View.VISIBLE );// Hiển thị dòng text đã ẩn
                                            view3.setVisibility(View.VISIBLE);
                                            view3.setBackgroundResource(R.drawable.hansau);
                                            textView3.setText( "Hằn Sâu" );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }, 1000 );
                            final Handler handler006 = new Handler();
                            handler006.postDelayed( new Runnable() {
                                                        @Override
                                                        public void run() {
                                                            if (thien.equals( "ac" )) {

                                                            }
                                                            if (thien.equals( "thien" )) {
                                                                showPopup( "Tâm chưa thành, hãy thu thập rồi quay trở lại" );
                                                            }
                                                        }
                                                    },
                                    2500 );

                        }

                    }

                    if (xoay == 2) {
                        Random rd2 = new Random();
                        luan2 = rd2.nextInt( 5 - 1 ) + 1;

                        if (luan2 == 4) {
                            {
                                {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView2, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView2, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            imageView2.setImageResource( R.drawable.vang2 );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }
                            ;
                            final Handler handler02 = new Handler();
                            handler02.postDelayed( new Runnable() {
                                @Override
                                public void run() {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView2, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView2, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            imageView2.setImageResource( R.drawable.vang2 );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }, 500 );

                            final Handler handler03 = new Handler();
                            handler03.postDelayed( new Runnable() {
                                @Override
                                public void run() {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView2, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView2, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            textView2.setVisibility( View.VISIBLE );// Hiển thị dòng text đã ẩn
                                            view2.setVisibility(View.VISIBLE);
                                            view2.getLayoutParams().width = widh/4;
                                            textView2.setText( "Vệt Ngắn" );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }, 1000 );
                            final Handler handler006 = new Handler();
                            handler006.postDelayed( new Runnable() {
                                                        @Override
                                                        public void run() {
                                                            if (thien.equals( "ac" )) {
                                                                showPopup( "Tâm chưa thành, hãy thu thập rồi quay trở lại" );
                                                            }
                                                            if (thien.equals( "thien" )) {

                                                            }
                                                        }
                                                    },
                                    2500 );

                        }
                        if (luan2 == 3) {
                            {
                                {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView2, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView2, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            imageView2.setImageResource( R.drawable.vang2 );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }
                            ;
                            final Handler handler02 = new Handler();
                            handler02.postDelayed( new Runnable() {
                                @Override
                                public void run() {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView2, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView2, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            imageView2.setImageResource( R.drawable.vang2 );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }, 500 );

                            final Handler handler03 = new Handler();
                            handler03.postDelayed( new Runnable() {
                                @Override
                                public void run() {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView2, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView2, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            textView2.setVisibility( View.VISIBLE );// Hiển thị dòng text đã ẩn
                                            view2.setVisibility(View.VISIBLE);
                                            view2.getLayoutParams().width = widh/4;
                                            view2.setBackgroundResource(R.drawable.hansau);
                                            textView2.setText( "Hằn Ngắn" );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }, 1000 );
                            final Handler handler006 = new Handler();
                            handler006.postDelayed( new Runnable() {
                                                        @Override
                                                        public void run() {
                                                            if (thien.equals( "ac" )) {

                                                            }
                                                            if (thien.equals( "thien" )) {
                                                                showPopup( "Tâm chưa thành, hãy thu thập rồi quay trở lại" );
                                                            }
                                                        }
                                                    },
                                    2500 );

                        }
                        if (luan2 == 2) {
                            {
                                {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView2, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView2, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            imageView2.setImageResource( R.drawable.vang2 );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }
                            ;
                            final Handler handler02 = new Handler();
                            handler02.postDelayed( new Runnable() {
                                @Override
                                public void run() {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView2, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView2, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            imageView2.setImageResource( R.drawable.vang2 );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }, 500 );

                            final Handler handler03 = new Handler();
                            handler03.postDelayed( new Runnable() {
                                @Override
                                public void run() {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView2, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView2, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            textView2.setVisibility( View.VISIBLE );// Hiển thị dòng text đã ẩn
                                            view2.setVisibility(View.VISIBLE);
                                            textView2.setText( "Vệt Dài" );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }, 1000 );
                            final Handler handler006 = new Handler();
                            handler006.postDelayed( new Runnable() {
                                                        @Override
                                                        public void run() {
                                                            if (thien.equals( "ac" )) {
                                                                showPopup( "Tâm chưa thành, hãy thu thập rồi quay trở lại" );
                                                            }
                                                            if (thien.equals( "thien" )) {

                                                            }
                                                        }
                                                    },
                                    2500 );

                        }
                        if (luan2 == 1) {
                            {
                                {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView2, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView2, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            imageView2.setImageResource( R.drawable.vang2 );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }
                            ;
                            final Handler handler02 = new Handler();
                            handler02.postDelayed( new Runnable() {
                                @Override
                                public void run() {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView2, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView2, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            imageView2.setImageResource( R.drawable.vang2 );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }, 500 );

                            final Handler handler03 = new Handler();
                            handler03.postDelayed( new Runnable() {
                                @Override
                                public void run() {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView2, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView2, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            textView2.setVisibility( View.VISIBLE );// Hiển thị dòng text đã ẩn
                                            view2.setVisibility(View.VISIBLE);
                                            view2.setBackgroundResource(R.drawable.hansau);
                                            textView2.setText( "Hằn Sâu" );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }, 1000 );
                            final Handler handler006 = new Handler();
                            handler006.postDelayed( new Runnable() {
                                                        @Override
                                                        public void run() {
                                                            if (thien.equals( "ac" )) {

                                                            }
                                                            if (thien.equals( "thien" )) {
                                                                showPopup( "Tâm chưa thành, hãy thu thập rồi quay trở lại" );
                                                            }
                                                        }
                                                    },
                                    2500 );

                        }

                    }

                    if (xoay == 1) {
                        Random rd1 = new Random();
                        luan1 = rd1.nextInt( 5 - 1 ) + 1;

                        if (luan1 == 4) {
                            {
                                {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView1, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView1, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            imageView1.setImageResource( R.drawable.vang2 );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }
                            ;
                            final Handler handler00 = new Handler();
                            handler00.postDelayed( new Runnable() {
                                @Override
                                public void run() {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView1, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView1, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            imageView1.setImageResource( R.drawable.vang2 );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }, 500 );

                            final Handler handler01 = new Handler();
                            handler01.postDelayed( new Runnable() {
                                @Override
                                public void run() {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView1, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView1, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );

                                            textView1.setVisibility( View.VISIBLE );// Hiển thị dòng text đã ẩn
                                            view1.setVisibility(View.VISIBLE);
                                            view1.getLayoutParams().width = widh/4;
                                            textView1.setText( "Vệt Ngắn" );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }, 1000 );
                            final Handler handler006 = new Handler();
                            handler006.postDelayed( new Runnable() {
                                                        @Override
                                                        public void run() {
                                                            if (thien.equals( "ac" )) {
                                                                showPopup( "Tâm chưa thành, hãy thu thập rồi quay trở lại" );
                                                            }
                                                            if (thien.equals( "thien" )) {

                                                            }
                                                        }
                                                    },
                                    2500 );

                        }
                        if (luan1 == 3) {
                            {
                                {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView1, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView1, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            imageView1.setImageResource( R.drawable.vang2 );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }
                            ;
                            final Handler handler00 = new Handler();
                            handler00.postDelayed( new Runnable() {
                                @Override
                                public void run() {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView1, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView1, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            imageView1.setImageResource( R.drawable.vang2 );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }, 500 );

                            final Handler handler01 = new Handler();
                            handler01.postDelayed( new Runnable() {
                                @Override
                                public void run() {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView1, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView1, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );

                                            textView1.setVisibility( View.VISIBLE );// Hiển thị dòng text đã ẩn
                                            view1.setVisibility(View.VISIBLE);
                                            view1.getLayoutParams().width = widh/4;
                                            view1.setBackgroundResource(R.drawable.hansau);
                                            textView1.setText( "Hằn Ngắn" );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }, 1000 );
                            final Handler handler006 = new Handler();
                            handler006.postDelayed( new Runnable() {
                                                        @Override
                                                        public void run() {
                                                            if (thien.equals( "ac" )) {

                                                            }
                                                            if (thien.equals( "thien" )) {
                                                                showPopup( "Tâm chưa thành, hãy thu thập rồi quay trở lại" );
                                                            }
                                                        }
                                                    },
                                    2500 );

                        }
                        if (luan1 == 2) {
                            {
                                {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView1, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView1, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            imageView1.setImageResource( R.drawable.vang2 );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }
                            ;
                            final Handler handler00 = new Handler();
                            handler00.postDelayed( new Runnable() {
                                @Override
                                public void run() {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView1, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView1, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            imageView1.setImageResource( R.drawable.vang2 );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }, 500 );

                            final Handler handler01 = new Handler();
                            handler01.postDelayed( new Runnable() {
                                @Override
                                public void run() {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView1, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView1, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );

                                            textView1.setVisibility( View.VISIBLE );// Hiển thị dòng text đã ẩn
                                            view1.setVisibility(View.VISIBLE);
                                            textView1.setText( "Vệt Dài" );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }, 1000 );
                            final Handler handler006 = new Handler();
                            handler006.postDelayed( new Runnable() {
                                                        @Override
                                                        public void run() {
                                                            if (thien.equals( "ac" )) {
                                                                showPopup( "Tâm chưa thành, hãy thu thập rồi quay trở lại" );
                                                            }
                                                            if (thien.equals( "thien" )) {

                                                            }
                                                        }
                                                    },
                                    2500 );

                        }
                        if (luan1 == 1) {
                            {
                                {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView1, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView1, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            imageView1.setImageResource( R.drawable.vang2 );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }
                            ;
                            final Handler handler00 = new Handler();
                            handler00.postDelayed( new Runnable() {
                                @Override
                                public void run() {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView1, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView1, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );
                                            imageView1.setImageResource( R.drawable.vang2 );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }, 500 );

                            final Handler handler01 = new Handler();
                            handler01.postDelayed( new Runnable() {
                                @Override
                                public void run() {
                                    final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView1, "scaleY", 1f, 0f );
                                    final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView1, "scaleY", 0f, 1f );
                                    oa1.setInterpolator( new DecelerateInterpolator() );
                                    oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                    oa1.addListener( new AnimatorListenerAdapter() {
                                        @Override
                                        public void onAnimationEnd(Animator animation) {
                                            super.onAnimationEnd( animation );

                                            textView1.setVisibility( View.VISIBLE );// Hiển thị dòng text đã ẩn
                                            view1.setVisibility(View.VISIBLE);
                                            view1.setBackgroundResource(R.drawable.hansau);
                                            textView1.setText( "Hằn Sâu" );
                                            oa2.start();
                                            oa1.setDuration( 250 );
                                            oa2.setDuration( 250 );
                                        }
                                    } );
                                    oa1.start();
                                }
                            }, 1000 );
                            final Handler handler006 = new Handler();
                            handler006.postDelayed( new Runnable() {
                                                        @Override
                                                        public void run() {
                                                            if (thien.equals( "ac" )) {

                                                            }
                                                            if (thien.equals( "thien" )) {
                                                                showPopup( "Tâm chưa thành, hãy thu thập rồi quay trở lại" );
                                                            }
                                                        }
                                                    },
                                    2500 );


                        }

                    }

                }
            }
        } );
    }


    private void showPopup(String message) {

        //code Popup
        AlertDialog.Builder builder = new AlertDialog.Builder( chiemsatthienac_click.this );
        builder.setCancelable( true );
        builder.setTitle( "Thông báo" );
        builder.setMessage("Tâm chưa thành, hãy tu tập rồi quay trở lại");
        builder.setNegativeButton( android.R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                setResult( 2 );
                finish();
            }
        } );
        AlertDialog dialog = builder.create();
        dialog.show();
        //Code Popup
    }


}
