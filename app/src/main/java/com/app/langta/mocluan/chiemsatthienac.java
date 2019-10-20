package com.app.langta.mocluan;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
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
import com.google.android.gms.ads.InterstitialAd;

import java.util.Random;

public class chiemsatthienac extends AppCompatActivity {

    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;
    ImageView imageView8;
    ImageView imageView9;
    ImageView imageView10;

    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    TextView textView7;
    TextView textView8;
    TextView textView9;
    TextView textView10;

    Button layque;
    Button dong;
    Button xemketqua;

    int luan1;
    int luan2;
    int luan3;
    int luan4;
    int luan5;
    int luan6;
    int luan7;
    int luan8;
    int luan9;
    int luan10;

    int dem = 0;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_chiemsatthienac );

        AdView adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId(getString(R.string.id_video));
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        imageView1 = findViewById( R.id.img1 );
        imageView2 = findViewById( R.id.img2 );
        imageView3 = findViewById( R.id.img3 );
        imageView4 = findViewById( R.id.img4 );
        imageView5 = findViewById( R.id.img5 );
        imageView6 = findViewById( R.id.img6 );
        imageView7 = findViewById( R.id.img7 );
        imageView8 = findViewById( R.id.img8 );
        imageView9 = findViewById( R.id.img9 );
        imageView10 = findViewById( R.id.img10 );

        textView1 = findViewById( R.id.tv1 );
        textView2 = findViewById( R.id.tv2 );
        textView3 = findViewById( R.id.tv3 );
        textView4 = findViewById( R.id.tv4 );
        textView5 = findViewById( R.id.tv5 );
        textView6 = findViewById( R.id.tv6 );
        textView7 = findViewById( R.id.tv7 );
        textView8 = findViewById( R.id.tv8 );
        textView9 = findViewById( R.id.tv9 );
        textView10 = findViewById( R.id.tv10 );

        layque = findViewById( R.id.btlayque );
        dong = findViewById( R.id.btdong );
        xemketqua = findViewById( R.id.btxemketqua );

        dong.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        } );

        layque.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dem = dem + 1;
                if (dem == 1){
                    Random rd = new Random();
                    luan1 = rd.nextInt( 5 - 1) + 1;
                    Log.e( "rd1", luan1 + "" );
                    if (luan1 == 2){
                        imageView1.setBackgroundResource( R.drawable.vang2 );
                    }
                    if (luan1 == 4){
                        imageView1.setBackgroundResource( R.drawable.vang2 );
                    }
                    if (luan1 == 3){
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
                                        imageView1.setBackgroundResource( R.drawable.vang2 );
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
                                        imageView1.setBackgroundResource( R.drawable.vang2 );
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
                                        textView1.setText( "Không Dâm Dật" );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }, 1000 );
                        textView1.setOnClickListener( new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent i = new Intent(chiemsatthienac.this, chiemsatthienac_click.class);
                                i.putExtra("thien", "thien");
                                chiemsatthienac.this.startActivityForResult( i, 2 );

                                if (mInterstitialAd.isLoaded()) {
                                    mInterstitialAd.show();
                                }
                            }
                        } );
                    }


                    if (luan1 == 1){
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
                                        imageView1.setBackgroundResource( R.drawable.vang2 );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }
                        ;
                        final Handler handler = new Handler();
                        handler.postDelayed( new Runnable() {
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
                                        imageView1.setBackgroundResource( R.drawable.vang2 );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }, 500 );

                        final Handler handler1 = new Handler();
                        handler1.postDelayed( new Runnable() {
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
                                        textView1.setText( "Dâm Dật" );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }, 1000 );
                        textView1.setOnClickListener( new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent i = new Intent(chiemsatthienac.this, chiemsatthienac_click.class);
                                i.putExtra("thien", "ac");
                                chiemsatthienac.this.startActivityForResult( i, 2 );

                                if (mInterstitialAd.isLoaded()) {
                                    mInterstitialAd.show();
                                }
                            }
                        } );
                    }



                    Random rd2 = new Random();
                    luan2 = rd2.nextInt( 5 - 1) + 1;
                    if (luan2 == 2){
                        imageView2.setBackgroundResource( R.drawable.vang2 );
                    }
                    if (luan2 == 4) {
                        imageView2.setBackgroundResource( R.drawable.vang2 );
                    }
                    if (luan2 == 1){

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
                                        imageView2.setBackgroundResource( R.drawable.vang2 );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }
                        ;
                        final Handler handler2 = new Handler();
                        handler2.postDelayed( new Runnable() {
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
                                        imageView2.setBackgroundResource( R.drawable.vang2 );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }, 500 );

                        final Handler handler3 = new Handler();
                        handler3.postDelayed( new Runnable() {
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
                                        textView2.setText(  "Tham Lam" );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }, 1000 );
                        textView2.setOnClickListener( new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent i = new Intent(chiemsatthienac.this, chiemsatthienac_click.class);
                                i.putExtra("thien", "ac");
                                chiemsatthienac.this.startActivityForResult( i, 2 );

                                if (mInterstitialAd.isLoaded()) {
                                    mInterstitialAd.show();
                                }
                            }
                        } );
                    }
                    if (luan2 == 3){
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
                                        imageView2.setBackgroundResource( R.drawable.vang2 );
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
                                        imageView2.setBackgroundResource( R.drawable.vang2 );
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
                                        textView2.setText( "Không Tham Lam" );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }, 1000 );
                        textView2.setOnClickListener( new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent i = new Intent(chiemsatthienac.this, chiemsatthienac_click.class);
                                i.putExtra("thien", "thien");
                                chiemsatthienac.this.startActivityForResult( i, 2 );

                                if (mInterstitialAd.isLoaded()) {
                                    mInterstitialAd.show();
                                }
                            }
                        } );
                    }

                    Random rd3 = new Random();
                    luan3 = rd3.nextInt( 5 - 1) + 1;
                    if (luan3 == 2){
                        imageView3.setBackgroundResource( R.drawable.vang2 );
                    }
                    if (luan3 == 4){
                        imageView3.setBackgroundResource( R.drawable.vang2 );
                    }
                    if (luan3 == 1){
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
                                        imageView3.setBackgroundResource( R.drawable.vang2 );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }
                        ;
                        final Handler handler4 = new Handler();
                        handler4.postDelayed( new Runnable() {
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
                                        imageView3.setBackgroundResource( R.drawable.vang2 );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }, 500 );

                        final Handler handler5 = new Handler();
                        handler5.postDelayed( new Runnable() {
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
                                        textView3.setText( "Trộm Cắp" );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }, 1000 );
                        textView3.setOnClickListener( new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent i = new Intent(chiemsatthienac.this, chiemsatthienac_click.class);
                                i.putExtra("thien", "ac");
                                chiemsatthienac.this.startActivityForResult( i, 2 );

                                if (mInterstitialAd.isLoaded()) {
                                    mInterstitialAd.show();
                                }
                            }
                        } );
                    }
                    if (luan3 == 3){

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
                                        imageView3.setBackgroundResource( R.drawable.vang2 );
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
                                        imageView3.setBackgroundResource( R.drawable.vang2 );
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
                                        textView3.setText( "Không Trộm Cắp" );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }, 1000 );
                        textView3.setOnClickListener( new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent i = new Intent(chiemsatthienac.this, chiemsatthienac_click.class);
                                i.putExtra("thien", "thien");
                                chiemsatthienac.this.startActivityForResult( i, 2 );

                                if (mInterstitialAd.isLoaded()) {
                                    mInterstitialAd.show();
                                }
                            }
                        } );
                    }


                    Random rd4 = new Random();
                    luan4 = rd4.nextInt( 5 - 1) + 1;

                    if (luan4 == 2){
                        imageView4.setBackgroundResource( R.drawable.vang2 );
                    }
                    if (luan4 == 4){
                        imageView4.setBackgroundResource( R.drawable.vang2 );
                    }
                    if (luan4 == 1){

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
                                        imageView4.setBackgroundResource( R.drawable.vang2 );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }
                        ;
                        final Handler handler6 = new Handler();
                        handler6.postDelayed( new Runnable() {
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
                                        imageView4.setBackgroundResource( R.drawable.vang2 );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }, 500 );

                        final Handler handler7 = new Handler();
                        handler7.postDelayed( new Runnable() {
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
                                        textView4.setText( "Nói Lời Hung Ác" );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }, 1000 );
                        textView4.setOnClickListener( new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent i = new Intent(chiemsatthienac.this, chiemsatthienac_click.class);
                                i.putExtra("thien", "ac");
                                chiemsatthienac.this.startActivityForResult( i, 2 );
                                if (mInterstitialAd.isLoaded()) {
                                    mInterstitialAd.show();
                                }
                            }
                        } );
                    }

                    if (luan4 == 3){

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
                                        imageView4.setBackgroundResource( R.drawable.vang2 );
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
                                        imageView4.setBackgroundResource( R.drawable.vang2 );
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
                                        textView4.setText( "Không Nói Lời Hung Ác" );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }, 1000 );
                        textView4.setOnClickListener( new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                Intent i = new Intent(chiemsatthienac.this, chiemsatthienac_click.class);
                                i.putExtra("thien", "thien");
                                chiemsatthienac.this.startActivityForResult( i, 2 );

                                if (mInterstitialAd.isLoaded()) {
                                    mInterstitialAd.show();
                                }
                            }
                        } );
                    }

                    Random rd5 = new Random();
                    luan5 = rd5.nextInt( 5 - 1) + 1;
                    if (luan5 == 2){
                        imageView5.setBackgroundResource( R.drawable.vang2 );
                    }
                    if (luan5 == 4){
                        imageView5.setBackgroundResource( R.drawable.vang2 );
                    }
                    if (luan5 == 1){
                        {
                            {
                                final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView5, "scaleY", 1f, 0f );
                                final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView5, "scaleY", 0f, 1f );
                                oa1.setInterpolator( new DecelerateInterpolator() );
                                oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                oa1.addListener( new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animation) {
                                        super.onAnimationEnd( animation );
                                        imageView5.setBackgroundResource( R.drawable.vang2 );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }
                        ;
                        final Handler handler8 = new Handler();
                        handler8.postDelayed( new Runnable() {
                            @Override
                            public void run() {
                                final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView5, "scaleY", 1f, 0f );
                                final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView5, "scaleY", 0f, 1f );
                                oa1.setInterpolator( new DecelerateInterpolator() );
                                oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                oa1.addListener( new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animation) {
                                        super.onAnimationEnd( animation );
                                        imageView5.setBackgroundResource( R.drawable.vang2 );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }, 500 );

                        final Handler handler9 = new Handler();
                        handler9.postDelayed( new Runnable() {
                            @Override
                            public void run() {
                                final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView5, "scaleY", 1f, 0f );
                                final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView5, "scaleY", 0f, 1f );
                                oa1.setInterpolator( new DecelerateInterpolator() );
                                oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                oa1.addListener( new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animation) {
                                        super.onAnimationEnd( animation );
                                        textView5.setVisibility( View.VISIBLE );// Hiển thị dòng text đã ẩn
                                        textView5.setText( "Sát Sanh" );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }, 1000 );
                        textView5.setOnClickListener( new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent i = new Intent(chiemsatthienac.this, chiemsatthienac_click.class);
                                i.putExtra("thien", "ac");
                                chiemsatthienac.this.startActivityForResult( i, 2 );

                                if (mInterstitialAd.isLoaded()) {
                                    mInterstitialAd.show();
                                }
                            }
                        } );
                    }
                    if (luan5 == 3){
                        {
                            {
                                final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView5, "scaleY", 1f, 0f );
                                final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView5, "scaleY", 0f, 1f );
                                oa1.setInterpolator( new DecelerateInterpolator() );
                                oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                oa1.addListener( new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animation) {
                                        super.onAnimationEnd( animation );
                                        imageView5.setBackgroundResource( R.drawable.vang2 );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }
                        ;
                        final Handler handler08 = new Handler();
                        handler08.postDelayed( new Runnable() {
                            @Override
                            public void run() {
                                final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView5, "scaleY", 1f, 0f );
                                final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView5, "scaleY", 0f, 1f );
                                oa1.setInterpolator( new DecelerateInterpolator() );
                                oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                oa1.addListener( new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animation) {
                                        super.onAnimationEnd( animation );
                                        imageView5.setBackgroundResource( R.drawable.vang2 );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }, 500 );

                        final Handler handler09 = new Handler();
                        handler09.postDelayed( new Runnable() {
                            @Override
                            public void run() {
                                final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView5, "scaleY", 1f, 0f );
                                final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView5, "scaleY", 0f, 1f );
                                oa1.setInterpolator( new DecelerateInterpolator() );
                                oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                oa1.addListener( new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animation) {
                                        super.onAnimationEnd( animation );
                                        textView5.setVisibility( View.VISIBLE );// Hiển thị dòng text đã ẩn
                                        textView5.setText( "Không Sát Sanh" );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }, 1000 );
                        textView5.setOnClickListener( new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent i = new Intent(chiemsatthienac.this, chiemsatthienac_click.class);
                                i.putExtra("thien", "thien");
                                chiemsatthienac.this.startActivityForResult( i, 2 );

                                if (mInterstitialAd.isLoaded()) {
                                    mInterstitialAd.show();
                                }
                            }
                        } );
                    }


                    Random rd6 = new Random();
                    luan6 = rd6.nextInt( 5 - 1) + 1;
                    if (luan6 == 2){
                        imageView6.setBackgroundResource( R.drawable.vang2 );
                    }
                    if (luan6 == 4){
                        imageView6.setBackgroundResource( R.drawable.vang2 );
                    }
                    if (luan6 == 1){
                        {
                            {
                                final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView6, "scaleY", 1f, 0f );
                                final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView6, "scaleY", 0f, 1f );
                                oa1.setInterpolator( new DecelerateInterpolator() );
                                oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                oa1.addListener( new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animation) {
                                        super.onAnimationEnd( animation );
                                        imageView6.setBackgroundResource( R.drawable.vang2 );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }
                        ;
                        final Handler handler10 = new Handler();
                        handler10.postDelayed( new Runnable() {
                            @Override
                            public void run() {
                                final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView6, "scaleY", 1f, 0f );
                                final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView6, "scaleY", 0f, 1f );
                                oa1.setInterpolator( new DecelerateInterpolator() );
                                oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                oa1.addListener( new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animation) {
                                        super.onAnimationEnd( animation );
                                        imageView6.setBackgroundResource( R.drawable.vang2 );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }, 500 );

                        final Handler handler11 = new Handler();
                        handler11.postDelayed( new Runnable() {
                            @Override
                            public void run() {
                                final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView6, "scaleY", 1f, 0f );
                                final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView6, "scaleY", 0f, 1f );
                                oa1.setInterpolator( new DecelerateInterpolator() );
                                oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                oa1.addListener( new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animation) {
                                        super.onAnimationEnd( animation );
                                        textView6.setVisibility( View.VISIBLE );// Hiển thị dòng text đã ẩn
                                        textView6.setText( "Nói Lưỡi Hai Chiều" );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }, 1000 );
                        textView6.setOnClickListener( new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                Intent i = new Intent(chiemsatthienac.this, chiemsatthienac_click.class);
                                i.putExtra("thien", "ac");
                                chiemsatthienac.this.startActivityForResult( i, 2 );

                                if (mInterstitialAd.isLoaded()) {
                                    mInterstitialAd.show();
                                }
                            }
                        } );
                    }
                    if (luan6 == 3){
                        {
                            {
                                final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView6, "scaleY", 1f, 0f );
                                final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView6, "scaleY", 0f, 1f );
                                oa1.setInterpolator( new DecelerateInterpolator() );
                                oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                oa1.addListener( new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animation) {
                                        super.onAnimationEnd( animation );
                                        imageView6.setBackgroundResource( R.drawable.vang2 );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }
                        ;
                        final Handler handler010 = new Handler();
                        handler010.postDelayed( new Runnable() {
                            @Override
                            public void run() {
                                final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView6, "scaleY", 1f, 0f );
                                final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView6, "scaleY", 0f, 1f );
                                oa1.setInterpolator( new DecelerateInterpolator() );
                                oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                oa1.addListener( new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animation) {
                                        super.onAnimationEnd( animation );
                                        imageView6.setBackgroundResource( R.drawable.vang2 );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }, 500 );

                        final Handler handler011 = new Handler();
                        handler011.postDelayed( new Runnable() {
                            @Override
                            public void run() {
                                final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView6, "scaleY", 1f, 0f );
                                final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView6, "scaleY", 0f, 1f );
                                oa1.setInterpolator( new DecelerateInterpolator() );
                                oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                oa1.addListener( new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animation) {
                                        super.onAnimationEnd( animation );
                                        textView6.setVisibility( View.VISIBLE );// Hiển thị dòng text đã ẩn
                                        textView6.setText( "Không Nói Lưỡi Hai Chiều" );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }, 1000 );
                        textView6.setOnClickListener( new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent i = new Intent(chiemsatthienac.this, chiemsatthienac_click.class);
                                i.putExtra("thien", "thien");
                                chiemsatthienac.this.startActivityForResult( i, 2 );

                                if (mInterstitialAd.isLoaded()) {
                                    mInterstitialAd.show();
                                }
                            }
                        } );
                    }


                    Random rd7 = new Random();
                    luan7 = rd7.nextInt( 5 - 1) + 1;
                    if (luan7 == 2){
                        imageView7.setBackgroundResource( R.drawable.vang2 );
                    }
                    if (luan7 == 4){
                        imageView7.setBackgroundResource( R.drawable.vang2 );
                    }
                    if (luan7 == 1){
                        {
                            {
                                final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView7, "scaleY", 1f, 0f );
                                final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView7, "scaleY", 0f, 1f );
                                oa1.setInterpolator( new DecelerateInterpolator() );
                                oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                oa1.addListener( new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animation) {
                                        super.onAnimationEnd( animation );
                                        imageView7.setBackgroundResource( R.drawable.vang2 );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }
                        ;
                        final Handler handler12 = new Handler();
                        handler12.postDelayed( new Runnable() {
                            @Override
                            public void run() {
                                final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView7, "scaleY", 1f, 0f );
                                final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView7, "scaleY", 0f, 1f );
                                oa1.setInterpolator( new DecelerateInterpolator() );
                                oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                oa1.addListener( new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animation) {
                                        super.onAnimationEnd( animation );
                                        imageView7.setBackgroundResource( R.drawable.vang2 );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }, 500 );

                        final Handler handler13 = new Handler();
                        handler13.postDelayed( new Runnable() {
                            @Override
                            public void run() {
                                final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView7, "scaleY", 1f, 0f );
                                final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView7, "scaleY", 0f, 1f );
                                oa1.setInterpolator( new DecelerateInterpolator() );
                                oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                oa1.addListener( new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animation) {
                                        super.onAnimationEnd( animation );
                                        textView7.setVisibility( View.VISIBLE );// Hiển thị dòng text đã ẩn
                                        textView7.setText( "Nói Dối" );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }, 1000 );
                        textView7.setOnClickListener( new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                Intent i = new Intent(chiemsatthienac.this, chiemsatthienac_click.class);
                                i.putExtra("thien", "ac");
                                chiemsatthienac.this.startActivityForResult( i, 2 );

                                if (mInterstitialAd.isLoaded()) {
                                    mInterstitialAd.show();
                                }
                            }
                        } );
                    }
                    if (luan7 == 3){
                        {
                            {
                                final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView7, "scaleY", 1f, 0f );
                                final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView7, "scaleY", 0f, 1f );
                                oa1.setInterpolator( new DecelerateInterpolator() );
                                oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                oa1.addListener( new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animation) {
                                        super.onAnimationEnd( animation );
                                        imageView7.setBackgroundResource( R.drawable.vang2 );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }
                        ;
                        final Handler handler012 = new Handler();
                        handler012.postDelayed( new Runnable() {
                            @Override
                            public void run() {
                                final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView7, "scaleY", 1f, 0f );
                                final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView7, "scaleY", 0f, 1f );
                                oa1.setInterpolator( new DecelerateInterpolator() );
                                oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                oa1.addListener( new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animation) {
                                        super.onAnimationEnd( animation );
                                        imageView7.setBackgroundResource( R.drawable.vang2 );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }, 500 );

                        final Handler handler013 = new Handler();
                        handler013.postDelayed( new Runnable() {
                            @Override
                            public void run() {
                                final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView7, "scaleY", 1f, 0f );
                                final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView7, "scaleY", 0f, 1f );
                                oa1.setInterpolator( new DecelerateInterpolator() );
                                oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                oa1.addListener( new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animation) {
                                        super.onAnimationEnd( animation );
                                        textView7.setVisibility( View.VISIBLE );// Hiển thị dòng text đã ẩn
                                        textView7.setText( "Không Nói Dối" );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }, 1000 );
                        textView7.setOnClickListener( new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                Intent i = new Intent(chiemsatthienac.this, chiemsatthienac_click.class);
                                i.putExtra("thien", "thien");
                                chiemsatthienac.this.startActivityForResult( i, 2 );

                                if (mInterstitialAd.isLoaded()) {
                                    mInterstitialAd.show();
                                }
                            }
                        } );
                    }


                    Random rd8 = new Random();
                    luan8 = rd8.nextInt( 5 - 1) + 1;
                    if (luan8 == 2){
                        imageView8.setBackgroundResource( R.drawable.vang2 );
                    }
                    if (luan8 == 4){
                        imageView8.setBackgroundResource( R.drawable.vang2 );
                    }
                    if (luan8 == 1){
                        {
                            {
                                final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView8, "scaleY", 1f, 0f );
                                final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView8, "scaleY", 0f, 1f );
                                oa1.setInterpolator( new DecelerateInterpolator() );
                                oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                oa1.addListener( new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animation) {
                                        super.onAnimationEnd( animation );
                                        imageView8.setBackgroundResource( R.drawable.vang2 );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }
                        ;
                        final Handler handler14 = new Handler();
                        handler14.postDelayed( new Runnable() {
                            @Override
                            public void run() {
                                final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView8, "scaleY", 1f, 0f );
                                final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView8, "scaleY", 0f, 1f );
                                oa1.setInterpolator( new DecelerateInterpolator() );
                                oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                oa1.addListener( new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animation) {
                                        super.onAnimationEnd( animation );
                                        imageView8.setBackgroundResource( R.drawable.vang2 );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }, 500 );

                        final Handler handler15 = new Handler();
                        handler15.postDelayed( new Runnable() {
                            @Override
                            public void run() {
                                final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView8, "scaleY", 1f, 0f );
                                final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView8, "scaleY", 0f, 1f );
                                oa1.setInterpolator( new DecelerateInterpolator() );
                                oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                oa1.addListener( new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animation) {
                                        super.onAnimationEnd( animation );
                                        textView8.setVisibility( View.VISIBLE );// Hiển thị dòng text đã ẩn
                                        textView8.setText( "Giận Hờn" );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }, 1000 );
                        textView8.setOnClickListener( new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                Intent i = new Intent(chiemsatthienac.this, chiemsatthienac_click.class);
                                i.putExtra("thien", "ac");
                                chiemsatthienac.this.startActivityForResult( i, 2 );

                                if (mInterstitialAd.isLoaded()) {
                                    mInterstitialAd.show();
                                }
                            }
                        } );
                    }
                    if (luan8 == 3){
                        {
                            {
                                final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView8, "scaleY", 1f, 0f );
                                final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView8, "scaleY", 0f, 1f );
                                oa1.setInterpolator( new DecelerateInterpolator() );
                                oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                oa1.addListener( new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animation) {
                                        super.onAnimationEnd( animation );
                                        imageView8.setBackgroundResource( R.drawable.vang2 );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }
                        ;
                        final Handler handler014 = new Handler();
                        handler014.postDelayed( new Runnable() {
                            @Override
                            public void run() {
                                final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView8, "scaleY", 1f, 0f );
                                final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView8, "scaleY", 0f, 1f );
                                oa1.setInterpolator( new DecelerateInterpolator() );
                                oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                oa1.addListener( new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animation) {
                                        super.onAnimationEnd( animation );
                                        imageView8.setBackgroundResource( R.drawable.vang2 );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }, 500 );

                        final Handler handler015 = new Handler();
                        handler015.postDelayed( new Runnable() {
                            @Override
                            public void run() {
                                final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView8, "scaleY", 1f, 0f );
                                final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView8, "scaleY", 0f, 1f );
                                oa1.setInterpolator( new DecelerateInterpolator() );
                                oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                oa1.addListener( new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animation) {
                                        super.onAnimationEnd( animation );
                                        textView8.setVisibility( View.VISIBLE );// Hiển thị dòng text đã ẩn
                                        textView8.setText( "Không Giân Hờn" );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }, 1000 );
                        textView8.setOnClickListener( new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                Intent i = new Intent(chiemsatthienac.this, chiemsatthienac_click.class);
                                i.putExtra("thien", "thien");
                                chiemsatthienac.this.startActivityForResult( i, 2 );

                                if (mInterstitialAd.isLoaded()) {
                                    mInterstitialAd.show();
                                }
                            }
                        } );
                    }


                    Random rd9 = new Random();
                    luan9 = rd9.nextInt( 5 - 1) + 1;
                    if (luan9 == 2){
                        imageView9.setBackgroundResource( R.drawable.vang2 );
                    }
                    if (luan9 == 4){
                        imageView9.setBackgroundResource( R.drawable.vang2 );
                    }
                    if (luan9 == 1){
                        {
                            {
                                final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView9, "scaleY", 1f, 0f );
                                final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView9, "scaleY", 0f, 1f );
                                oa1.setInterpolator( new DecelerateInterpolator() );
                                oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                oa1.addListener( new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animation) {
                                        super.onAnimationEnd( animation );
                                        imageView9.setBackgroundResource( R.drawable.vang2 );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }
                        ;
                        final Handler handler16 = new Handler();
                        handler16.postDelayed( new Runnable() {
                            @Override
                            public void run() {
                                final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView9, "scaleY", 1f, 0f );
                                final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView9, "scaleY", 0f, 1f );
                                oa1.setInterpolator( new DecelerateInterpolator() );
                                oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                oa1.addListener( new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animation) {
                                        super.onAnimationEnd( animation );
                                        imageView9.setBackgroundResource( R.drawable.vang2 );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }, 500 );

                        final Handler handler17 = new Handler();
                        handler17.postDelayed( new Runnable() {
                            @Override
                            public void run() {
                                final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView9, "scaleY", 1f, 0f );
                                final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView9, "scaleY", 0f, 1f );
                                oa1.setInterpolator( new DecelerateInterpolator() );
                                oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                oa1.addListener( new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animation) {
                                        super.onAnimationEnd( animation );
                                        textView9.setVisibility( View.VISIBLE );// Hiển thị dòng text đã ẩn
                                        textView9.setText( "Nói Thêu Dệt" );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }, 1000 );
                        textView9.setOnClickListener( new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                Intent i = new Intent(chiemsatthienac.this, chiemsatthienac_click.class);
                                i.putExtra("thien", "ac");
                                chiemsatthienac.this.startActivityForResult( i, 2 );

                                if (mInterstitialAd.isLoaded()) {
                                    mInterstitialAd.show();
                                }
                            }
                        } );
                    }
                    if (luan9 == 3){
                        {
                            {
                                final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView9, "scaleY", 1f, 0f );
                                final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView9, "scaleY", 0f, 1f );
                                oa1.setInterpolator( new DecelerateInterpolator() );
                                oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                oa1.addListener( new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animation) {
                                        super.onAnimationEnd( animation );
                                        imageView9.setBackgroundResource( R.drawable.vang2 );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }
                        ;
                        final Handler handler016 = new Handler();
                        handler016.postDelayed( new Runnable() {
                            @Override
                            public void run() {
                                final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView9, "scaleY", 1f, 0f );
                                final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView9, "scaleY", 0f, 1f );
                                oa1.setInterpolator( new DecelerateInterpolator() );
                                oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                oa1.addListener( new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animation) {
                                        super.onAnimationEnd( animation );
                                        imageView9.setBackgroundResource( R.drawable.vang2 );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }, 500 );

                        final Handler handler017 = new Handler();
                        handler017.postDelayed( new Runnable() {
                            @Override
                            public void run() {
                                final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView9, "scaleY", 1f, 0f );
                                final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView9, "scaleY", 0f, 1f );
                                oa1.setInterpolator( new DecelerateInterpolator() );
                                oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                oa1.addListener( new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animation) {
                                        super.onAnimationEnd( animation );
                                        textView9.setVisibility( View.VISIBLE );// Hiển thị dòng text đã ẩn
                                        textView9.setText( "Không Nói Thêu Dệt" );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }, 1000 );
                        textView9.setOnClickListener( new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                Intent i = new Intent(chiemsatthienac.this, chiemsatthienac_click.class);
                                i.putExtra("thien", "thien");
                                chiemsatthienac.this.startActivityForResult( i, 2 );

                                if (mInterstitialAd.isLoaded()) {
                                    mInterstitialAd.show();
                                }
                            }
                        } );
                    }


                    Random rd10 = new Random();
                    luan10 = rd10.nextInt( 5 - 1) + 1;
                    if (luan10 == 2){
                        imageView10.setBackgroundResource( R.drawable.vang2 );
                    }
                    if (luan10 == 4){
                        imageView10.setBackgroundResource( R.drawable.vang2 );
                    }
                    if (luan10 == 1){
                        {
                            {
                                final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView10, "scaleY", 1f, 0f );
                                final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView10, "scaleY", 0f, 1f );
                                oa1.setInterpolator( new DecelerateInterpolator() );
                                oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                oa1.addListener( new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animation) {
                                        super.onAnimationEnd( animation );
                                        imageView10.setBackgroundResource( R.drawable.vang2 );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }
                        ;
                        final Handler handler18 = new Handler();
                        handler18.postDelayed( new Runnable() {
                            @Override
                            public void run() {
                                final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView10, "scaleY", 1f, 0f );
                                final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView10, "scaleY", 0f, 1f );
                                oa1.setInterpolator( new DecelerateInterpolator() );
                                oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                oa1.addListener( new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animation) {
                                        super.onAnimationEnd( animation );
                                        imageView10.setBackgroundResource( R.drawable.vang2 );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }, 500 );

                        final Handler handler19 = new Handler();
                        handler19.postDelayed( new Runnable() {
                            @Override
                            public void run() {
                                final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView10, "scaleY", 1f, 0f );
                                final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView10, "scaleY", 0f, 1f );
                                oa1.setInterpolator( new DecelerateInterpolator() );
                                oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                oa1.addListener( new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animation) {
                                        super.onAnimationEnd( animation );
                                        textView10.setVisibility( View.VISIBLE );// Hiển thị dòng text đã ẩn
                                        textView10.setText( "Si Mê" );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }, 1000 );
                        textView10.setOnClickListener( new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                Intent i = new Intent(chiemsatthienac.this, chiemsatthienac_click.class);
                                i.putExtra("thien", "ac");
                                chiemsatthienac.this.startActivityForResult( i, 2 );

                                if (mInterstitialAd.isLoaded()) {
                                    mInterstitialAd.show();
                                }
                            }
                        } );
                    }
                    if (luan10 == 3){
                        {
                            {
                                final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView10, "scaleY", 1f, 0f );
                                final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView10, "scaleY", 0f, 1f );
                                oa1.setInterpolator( new DecelerateInterpolator() );
                                oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                oa1.addListener( new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animation) {
                                        super.onAnimationEnd( animation );
                                        imageView10.setBackgroundResource( R.drawable.vang2 );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }
                        ;
                        final Handler handler018 = new Handler();
                        handler018.postDelayed( new Runnable() {
                            @Override
                            public void run() {
                                final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView10, "scaleY", 1f, 0f );
                                final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView10, "scaleY", 0f, 1f );
                                oa1.setInterpolator( new DecelerateInterpolator() );
                                oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                oa1.addListener( new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animation) {
                                        super.onAnimationEnd( animation );
                                        imageView10.setBackgroundResource( R.drawable.vang2 );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }, 500 );

                        final Handler handler019 = new Handler();
                        handler019.postDelayed( new Runnable() {
                            @Override
                            public void run() {
                                final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView10, "scaleY", 1f, 0f );
                                final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView10, "scaleY", 0f, 1f );
                                oa1.setInterpolator( new DecelerateInterpolator() );
                                oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                                oa1.addListener( new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animation) {
                                        super.onAnimationEnd( animation );
                                        textView10.setVisibility( View.VISIBLE );// Hiển thị dòng text đã ẩn
                                        textView10.setText( "Không Si Mê" );
                                        oa2.start();
                                        oa1.setDuration( 250 );
                                        oa2.setDuration( 250 );
                                    }
                                } );
                                oa1.start();
                            }
                        }, 1000 );
                        textView10.setOnClickListener( new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                Intent i = new Intent(chiemsatthienac.this, chiemsatthienac_click.class);
                                i.putExtra("thien", "thien");
                                chiemsatthienac.this.startActivityForResult( i, 2 );

                                if (mInterstitialAd.isLoaded()) {
                                    mInterstitialAd.show();
                                }
                            }
                        } );
                }


                }


            }

        } );


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult( requestCode, resultCode, data );
        if (resultCode == 2 ){
            Log.e( "t", "t" );
            finish();
        }
    }
}






