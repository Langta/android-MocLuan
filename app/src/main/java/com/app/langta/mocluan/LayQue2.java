package com.app.langta.mocluan;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Handler;
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

import java.util.Random;

public class LayQue2 extends AppCompatActivity {
    ImageView imageView;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    Button layque1;
    Button dong;
    Button xemketqua;
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    TextView textView7;
    TextView textView8;
    TextView textView9;

    int luan6;
    int luan5;
    int luan4;
    int luan3;
    int luan2;
    int luan1;
    int dem = 0;
    int tongluot1;
    int tongluot2;
    int tongluot3;
    int tongluot;
    int tong;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_lay_que2 );

        AdView adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        textView1 = findViewById( R.id.tv1 );
        textView2 = findViewById( R.id.tv2 );
        textView3 = findViewById( R.id.tv3 );
        textView4 = findViewById( R.id.tv4 );
        textView5 = findViewById( R.id.tv5 );
        textView6 = findViewById( R.id.tv6 );
        textView7 = findViewById( R.id.tv7 );
        textView8 = findViewById( R.id.tv8 );
        textView9 = findViewById( R.id.tv9 );

        layque1 = findViewById( R.id.btlayque );
        xemketqua = findViewById( R.id.btxemketqua );

        imageView = findViewById( R.id.img1 );
        imageView2 = findViewById( R.id.img2 );
        imageView3 = findViewById( R.id.img3 );
        imageView4 = findViewById( R.id.img4 );
        imageView5 = findViewById( R.id.img5 );
        imageView6 = findViewById( R.id.img6 );

        dong = findViewById( R.id.btdong );

        dong.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        } );

        xemketqua.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchCode( tongluot );

            }
        } );

        layque1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView1.setVisibility( View.GONE );// ẩn dòng text
                textView2.setVisibility( View.GONE );
                textView3.setVisibility( View.GONE );
                textView4.setVisibility( View.GONE );
                textView5.setVisibility( View.GONE );
                textView6.setVisibility( View.GONE );


                dem = dem + 1;

                layque1.setVisibility( View.GONE );

                Random rd = new Random();
                luan1 = rd.nextInt( 4 );
                Log.e( "rd1", luan1 + "" );


                if (luan1 == 0) {
                    imageView.setImageResource( R.drawable.vang2 );
                } else {
                    {
                        {
                            //Code xoay img
                            final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView5, "scaleY", 0f, 1f );
                            final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView5, "scaleY", 1f, 0f );
                            oa1.setInterpolator( new DecelerateInterpolator() );
                            oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                            oa1.addListener( new AnimatorListenerAdapter() {
                                @SuppressLint("ResourceType")
                                @Override
                                public void onAnimationEnd(Animator animation) {
                                    super.onAnimationEnd( animation );
                                    imageView5.setImageResource( R.drawable.vang2 );
//                                imageView.setImageResource(R.id.img1);
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
                            final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView5, "scaleY", 0f, 1f );
                            final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView5, "scaleY", 1f, 0f );
                            oa1.setInterpolator( new DecelerateInterpolator() );
                            oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                            oa1.addListener( new AnimatorListenerAdapter() {
                                @SuppressLint("ResourceType")
                                @Override
                                public void onAnimationEnd(Animator animation) {
                                    super.onAnimationEnd( animation );
                                    imageView5.setImageResource( R.drawable.vang2 );
//                                imageView.setImageResource(R.id.img1);
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
                            final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView5, "scaleY", 0f, 1f );
                            final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView5, "scaleY", 1f, 0f );
                            oa1.setInterpolator( new DecelerateInterpolator() );
                            oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                            oa1.addListener( new AnimatorListenerAdapter() {
                                @SuppressLint("ResourceType")
                                @Override
                                public void onAnimationEnd(Animator animation) {
                                    super.onAnimationEnd( animation );
                                    textView5.setVisibility( View.VISIBLE );// Hiển thị dòng text đã ẩn
                                    textView5.setText( luan1 + "" );
                                }

                            } );
                            oa1.start();
                        }
                    }, 1000 ); //Code Xoay
                    textView5.setVisibility( View.GONE );
                }

                Random rd2 = new Random();
                luan2 = rd2.nextInt( 4 );

                if (luan2 == 0) {
                    imageView.setImageResource( R.drawable.vang2 );
                } else {
                    if (luan2 == 1) {
                        luan2 = 4;
                    }
                    if (luan2 == 2) {
                        luan2 = 5;
                    }
                    if (luan2 == 3) {
                        luan2 = 6;
                    }
                    Log.e( "rd2", luan2 + "" );
                    {
                        {
                            final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView3, "scaleY", 0f, 1f );
                            final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView3, "scaleY", 1f, 0f );
                            oa1.setInterpolator( new DecelerateInterpolator() );
                            oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                            oa1.addListener( new AnimatorListenerAdapter() {
                                @SuppressLint("ResourceType")
                                @Override
                                public void onAnimationEnd(Animator animation) {
                                    super.onAnimationEnd( animation );
                                    imageView3.setImageResource( R.drawable.vang2 );
//                                imageView.setImageResource(R.id.img1);
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
                            final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView3, "scaleY", 0f, 1f );
                            final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView3, "scaleY", 1f, 0f );
                            oa1.setInterpolator( new DecelerateInterpolator() );
                            oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                            oa1.addListener( new AnimatorListenerAdapter() {
                                @SuppressLint("ResourceType")
                                @Override
                                public void onAnimationEnd(Animator animation) {
                                    super.onAnimationEnd( animation );
                                    imageView3.setImageResource( R.drawable.vang2 );
//                                imageView.setImageResource(R.id.img1);
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
                            final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView3, "scaleY", 0f, 1f );
                            final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView3, "scaleY", 1f, 0f );
                            oa1.setInterpolator( new DecelerateInterpolator() );
                            oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                            oa1.addListener( new AnimatorListenerAdapter() {
                                @SuppressLint("ResourceType")
                                @Override
                                public void onAnimationEnd(Animator animation) {
                                    super.onAnimationEnd( animation );
                                    textView3.setVisibility( View.VISIBLE );
                                    textView3.setText( luan2 + "" );
                                }
                            } );
                            oa1.start();
                        }
                    }, 1000 );
                    textView3.setVisibility( View.GONE );
                }
                //Code random
                Random rd3 = new Random();
                luan3 = rd3.nextInt( 4 ); //Lấy ngẫu nhiên 1 số từ 0 - 4
                if (luan3 == 0) {
                    imageView.setImageResource( R.drawable.vang2 );
                } else {
                    if (luan3 == 1) {
                        luan3 = 17;
                    }
                    if (luan3 == 2) {
                        luan3 = 8;
                    }
                    if (luan3 == 3) {
                        luan3 = 9;
                    }
                    Log.e( "rd3", luan3 + "" );
                    {
                        {
                            final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView, "scaleY", 0f, 1f );
                            final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView, "scaleY", 1f, 0f );
                            oa1.setInterpolator( new DecelerateInterpolator() );
                            oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                            oa1.addListener( new AnimatorListenerAdapter() {
                                @SuppressLint("ResourceType")
                                @Override
                                public void onAnimationEnd(Animator animation) {
                                    super.onAnimationEnd( animation );
                                    imageView.setImageResource( R.drawable.vang2 );
//                                imageView.setImageResource(R.id.img1);
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
                            final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView, "scaleY", 0f, 1f );
                            final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView, "scaleY", 1f, 0f );
                            oa1.setInterpolator( new DecelerateInterpolator() );
                            oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                            oa1.addListener( new AnimatorListenerAdapter() {
                                @SuppressLint("ResourceType")
                                @Override
                                public void onAnimationEnd(Animator animation) {
                                    super.onAnimationEnd( animation );
                                    imageView.setImageResource( R.drawable.vang2 );
//                                imageView.setImageResource(R.id.img1);
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
                            final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView, "scaleY", 0f, 1f );
                            final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView, "scaleY", 1f, 0f );
                            oa1.setInterpolator( new DecelerateInterpolator() );
                            oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                            oa1.addListener( new AnimatorListenerAdapter() {
                                @SuppressLint("ResourceType")
                                @Override
                                public void onAnimationEnd(Animator animation) {
                                    super.onAnimationEnd( animation );
                                    textView1.setVisibility( View.VISIBLE );
                                    textView1.setText( luan3 + "" );

                                }
                            } );
                            oa1.start();
                        }
                    }, 1000 );
                    textView1.setVisibility( View.GONE );
                }


                Random rd4 = new Random();
                luan4 = rd4.nextInt( 4 );

                if (luan4 == 0) {
                    imageView.setImageResource( R.drawable.vang2 );
                } else {
                    if (luan4 == 1) {
                        luan4 = 10;
                    }
                    if (luan4 == 2) {
                        luan4 = 11;
                    }
                    if (luan4 == 3) {
                        luan4 = 12;
                    }
                    Log.e( "rd4", luan4 + "" );
                    {
                        {
                            final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView6, "scaleY", 0f, 1f );
                            final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView6, "scaleY", 1f, 0f );
                            oa1.setInterpolator( new DecelerateInterpolator() );
                            oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                            oa1.addListener( new AnimatorListenerAdapter() {
                                @SuppressLint("ResourceType")
                                @Override
                                public void onAnimationEnd(Animator animation) {
                                    super.onAnimationEnd( animation );
                                    imageView6.setImageResource( R.drawable.vang2 );
//                                imageView.setImageResource(R.id.img1);
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
                            final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView6, "scaleY", 0f, 1f );
                            final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView6, "scaleY", 1f, 0f );
                            oa1.setInterpolator( new DecelerateInterpolator() );
                            oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                            oa1.addListener( new AnimatorListenerAdapter() {
                                @SuppressLint("ResourceType")
                                @Override
                                public void onAnimationEnd(Animator animation) {
                                    super.onAnimationEnd( animation );
                                    imageView6.setImageResource( R.drawable.vang2 );
//                                imageView.setImageResource(R.id.img1);
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
                            final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView6, "scaleY", 0f, 1f );
                            final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView6, "scaleY", 1f, 0f );
                            oa1.setInterpolator( new DecelerateInterpolator() );
                            oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                            oa1.addListener( new AnimatorListenerAdapter() {
                                @SuppressLint("ResourceType")
                                @Override
                                public void onAnimationEnd(Animator animation) {
                                    super.onAnimationEnd( animation );
                                    textView6.setVisibility( View.VISIBLE );
                                    textView6.setText( luan4 + "" );
                                }
                            } );
                            oa1.start();
                        }
                    }, 1000 );
                    textView6.setVisibility( View.GONE );
                }


                Random rd5 = new Random();
                luan5 = rd5.nextInt( 4 );

                if (luan5 == 0) {
                    imageView.setImageResource( R.drawable.vang2 );
                } else {
                    if (luan5 == 1) {
                        luan5 = 13;
                    }
                    if (luan5 == 2) {
                        luan5 = 14;
                    }
                    if (luan5 == 3) {
                        luan5 = 15;
                    }
                    Log.e( "rd5", luan5 + "" );

                    {
                        {
                            final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView4, "scaleY", 0f, 1f );
                            final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView4, "scaleY", 1f, 0f );
                            oa1.setInterpolator( new DecelerateInterpolator() );
                            oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                            oa1.addListener( new AnimatorListenerAdapter() {
                                @SuppressLint("ResourceType")
                                @Override
                                public void onAnimationEnd(Animator animation) {
                                    super.onAnimationEnd( animation );
                                    imageView4.setImageResource( R.drawable.vang2 );
//                                imageView.setImageResource(R.id.img1);
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
                            final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView4, "scaleY", 0f, 1f );
                            final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView4, "scaleY", 1f, 0f );
                            oa1.setInterpolator( new DecelerateInterpolator() );
                            oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                            oa1.addListener( new AnimatorListenerAdapter() {
                                @SuppressLint("ResourceType")
                                @Override
                                public void onAnimationEnd(Animator animation) {
                                    super.onAnimationEnd( animation );
                                    imageView4.setImageResource( R.drawable.vang2 );
//                                imageView.setImageResource(R.id.img1);
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
                            final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView4, "scaleY", 0f, 1f );
                            final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView4, "scaleY", 1f, 0f );
                            oa1.setInterpolator( new DecelerateInterpolator() );
                            oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                            oa1.addListener( new AnimatorListenerAdapter() {
                                @SuppressLint("ResourceType")
                                @Override
                                public void onAnimationEnd(Animator animation) {
                                    super.onAnimationEnd( animation );
                                    textView4.setVisibility( View.VISIBLE );
                                    textView4.setText( luan5 + "" );
                                }
                            } );
                            oa1.start();
                        }
                    }, 1000 );
                    textView4.setVisibility( View.GONE );

                }


                Random rd6 = new Random();
                luan6 = rd6.nextInt( 4 );
                if (luan6 == 0) {
                    imageView.setImageResource( R.drawable.vang2 );
                } else {
                    if (luan6 == 1) {
                        luan6 = 16;
                    }
                    if (luan6 == 2) {
                        luan6 = 17;
                    }
                    if (luan6 == 3) {
                        luan6 = 18;
                    }
                    Log.e( "rd6", luan6 + "" );

                    {
                        {
                            final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView2, "scaleY", 0f, 1f );
                            final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView2, "scaleY", 1f, 0f );
                            oa1.setInterpolator( new DecelerateInterpolator() );
                            oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                            oa1.addListener( new AnimatorListenerAdapter() {
                                @SuppressLint("ResourceType")
                                @Override
                                public void onAnimationEnd(Animator animation) {
                                    super.onAnimationEnd( animation );
                                    imageView2.setImageResource( R.drawable.vang2 );
//                                imageView.setImageResource(R.id.img1);
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
                            final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView2, "scaleY", 0f, 1f );
                            final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView2, "scaleY", 1f, 0f );
                            oa1.setInterpolator( new DecelerateInterpolator() );
                            oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                            oa1.addListener( new AnimatorListenerAdapter() {
                                @SuppressLint("ResourceType")
                                @Override
                                public void onAnimationEnd(Animator animation) {
                                    super.onAnimationEnd( animation );
                                    imageView2.setImageResource( R.drawable.vang2 );
//                                imageView.setImageResource(R.id.img1);
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
                            final ObjectAnimator oa1 = ObjectAnimator.ofFloat( imageView2, "scaleY", 0f, 1f );
                            final ObjectAnimator oa2 = ObjectAnimator.ofFloat( imageView2, "scaleY", 1f, 0f );
                            oa1.setInterpolator( new DecelerateInterpolator() );
                            oa2.setInterpolator( new AccelerateDecelerateInterpolator() );
                            oa1.addListener( new AnimatorListenerAdapter() {
                                @SuppressLint("ResourceType")
                                @Override
                                public void onAnimationEnd(Animator animation) {
                                    super.onAnimationEnd( animation );
                                    textView2.setVisibility( View.VISIBLE );
                                    textView2.setText( luan6 + "" );
                                }
                            } );
                            oa1.start();
                        }
                    }, 1000 );
                    textView2.setVisibility( View.GONE );

                }

                final Handler handler000 = new Handler();
                handler000.postDelayed( new Runnable() {
                    @Override
                    public void run() {
                        layque1.setVisibility( View.VISIBLE );
                        tong = luan1 + luan2 + luan3 + luan4 + luan5 + luan6;
                        if (dem == 1) {
                            textView7.setText( tong + "" );
                            tongluot1 = tong;
                        }
                        if (dem == 2) {
                            textView8.setText( tong + "" );
                            tongluot2 = tong;
                        }
                        if (dem == 3) {
                            textView9.setText( tong + "" );
                            tongluot3 = tong;
                            layque1.setVisibility( View.GONE );
                            xemketqua.setVisibility( View.VISIBLE );
                        }
                        tongluot = tongluot1 + tongluot2 + tongluot3;
                    }
                    },
                        1500 );


            }
        } );

    }

    private void switchCode(int tongluot) {
        switch (tongluot) {
            case 1:
                showPopup( "1.Cầu Thượng thừa sẽ được bất thoái chuyển." );
                break;
            case 2:
                showPopup( "2.Cầu quả được chứng, hiện tại sẽ chứng." );
                break;
            case 3:
                showPopup( "3.Cầu Duyên Giác thừa, được không thoái chuyển." );
                break;
            case 4:
                showPopup( "4.Cầu Thanh Văn thừa, được bất thoái chuyển." );
                break;
            case 5:
                showPopup( "5.Cầu sức thần thông, được sự thành tựu." );
                break;
            case 6:
                showPopup( "6.Tu bốn phạm hạnh (27) được sự thành tựu." );
                break;
            case 7:
                showPopup( "7.Tu thiền thế gian, được sự thành tựu." );
                break;
            case 8:
                showPopup( "8.Giới nào muốn thọ, là được Diệu giới." );
                break;
            case 9:
                showPopup( "9.Giới nào từng thọ, được đầy đủ giới." );
                break;
            case 10:
                showPopup( "10.Cầu Thượng thừa nhưng đức tin chưa trụ." );
                break;
            case 11:
                showPopup( "11.Cầu Duyên Giác thừa nhưng đức tin chưa vững." );
                break;
            case 12:
                showPopup( "12.Cầu Thanh Văn thừa nhưng đức tin chưa vững." );
                break;
            case 13:
                showPopup( "13.Người được chiêm sát chính là bạn lành." );
                break;
            case 14:
                showPopup( "14.Tùy nghe những gì đều đúng Chính Pháp." );
                break;
            case 15:
                showPopup( "15.Người được chiêm sát chính là bạn ác." );
                break;
            case 16:
                showPopup( "16.Người được chiêm sát chính là bạn ác." );
                break;
            case 17:
                showPopup( "17.Người đang được xem có đức thật sự." );
                break;
            case 18:
                showPopup( "18.Người đang được xem không có thật đức." );
                break;
            case 19:
                showPopup( "19.Nghĩa được tu quán là không sai lầm." );
                break;
            case 20:
                showPopup( "20.Nghĩa được tu quán là bị lầm lộn." );
                break;
            case 21:
                showPopup( "21.Những gì đọc tụng là không lầm lộn." );
                break;
            case 22:
                showPopup( "22.Những gì đọc tụng là bị lầm lộn." );
                break;
            case 23:
                showPopup( "23.Những hạnh được tu chẳng bị sai lầm." );
                break;
            case 24:
                showPopup( "24.Những gì thấy nghe, đều là tướng lành." );
                break;
            case 25:
                showPopup( "25.Có sở chứng gì đều là chân thật." );
                break;
            case 26:
                showPopup( "26.Có học những gì đều là sai lầm." );
                break;
            case 27:
                showPopup( "27.Những gì thấy nghe, chẳng phải tướng lành." );
                break;
            case 28:
                showPopup( "28.Có chứng ngộ gì đều chẳng phải chính." );
                break;
            case 29:
                showPopup( "29.Có kết quả gì, là do tà thần giúp giữ." );
                break;
            case 30:
                showPopup( "30.Nói giỏi điều gì, là trí tà biện bác." );
                break;
            case 31:
                showPopup( "31.Biết chỗ huyền diệu, chẳng phải sức người." );
                break;
            case 32:
                showPopup( "32.Nên trước tập quán đường lối sáng suốt." );
                break;
            case 33:
                showPopup( "33.Nên trước tập quán đường lối sáng suốt." );
                break;
            case 34:
                showPopup( "34.Xem chỗ được học, không bị chướng ngại." );
                break;
            case 35:
                showPopup( "35.Xem chỗ được học, là điều thích nghi." );
                break;
            case 36:
                showPopup( "36.Xem chỗ được học, chẳng phải thích nghi." );
                break;
            case 37:
                showPopup( "37.Xem chỗ được học, là đã tu tập đời trước" );
                break;
            case 38:
                showPopup( "38.Xem chỗ được học, chẳng phải đời trước tu tập." );
                break;
            case 39:
                showPopup( "39.Xem chỗ được học, khéo tăng trưởng lên." );
                break;
            case 40:
                showPopup( "40.Xem chỗ được học, là phương tiện nhỏ." );
                break;
            case 41:
                showPopup( "41.Xem chỗ được học, không sự tiến thú." );
                break;
            case 42:
                showPopup( "42.Quả gì mong cầu, hiện tại chưa được." );
                break;
            case 43:
                showPopup( "43.Cầu xuất gia thì sẽ được ra đi." );
                break;
            case 44:
                showPopup( "44.Mong cầu nghe Pháp sẽ được chỉ dạy." );
                break;
            case 45:
                showPopup( "45.Cầu những quyển Kinh sẽ được đọc tụng." );
                break;
            case 46:
                showPopup( "46.Hãy xem việc làm đều là ma sự." );
                break;
            case 47:
                showPopup( "47.Xem những việc đã làm đều thành tựu." );
                break;
            case 48:
                showPopup( "48.Xem việc được làm, chẳng được thành tựu." );
                break;
            case 49:
                showPopup( "49.Cầu giàu của cải, sẽ được sung thạnh." );
                break;
            case 50:
                showPopup( "50.Cầu địa vị quan sẽ được kết quả." );
                break;
            case 51:
                showPopup( "51.Cầu sống lâu sẽ được thêm tuổi thọ." );
                break;
            case 52:
                showPopup( "52.Cầu tiên đạo thế gian, sẽ được kết quả." );
                break;
            case 53:
                showPopup( "53.Xem chỗ học vấn, đạt được nhiều chỗ." );
                break;
            case 54:
                showPopup( "54.Xem chỗ học vấn, ít đạt kết quả." );
                break;
            case 55:
                showPopup( "55.Tìm thầy, tìm bạn, được như ý muốn." );
                break;
            case 56:
                showPopup( "56.Tìm đệ tử, được như ý." );
                break;
            case 57:
                showPopup( "57.Tìm cha mẹ, được như ý muốn." );
                break;
            case 58:
                showPopup( "58.Cầu con trai con gái, được như ý." );
                break;
            case 59:
                showPopup( "59.Tìm thê thiếp như ý." );
                break;
            case 60:
                showPopup( "60.Tìm bạn đồng học, được như ý muốn." );
                break;
            case 61:
                showPopup( "61.Xem lại những gì lo lự, được hòa hợp." );
                break;
            case 62:
                showPopup( "62.Người được xem, tâm họ mang hờn giận." );
                break;
            case 63:
                showPopup( "63.Mong người không giận, sẽ được hoan hỷ." );
                break;
            case 64:
                showPopup( "64.Cầu sự hòa hợp, được như ý muốn." );
                break;
            case 65:
                showPopup( "65.Tâm của người được xem thì hoan hỷ." );
                break;
            case 66:
                showPopup( "66.Người mình nghĩ đến, sẽ được gặp gỡ." );
                break;
            case 67:
                showPopup( "67.Người mình nghĩ đến, chẳng được gặp lại." );
                break;
            case 68:
                showPopup( "68.Người được mời gọi, sẽ được nhóm đến." );
                break;
            case 69:
                showPopup( "69.Người bị chê ghét, được rời khỏi họ." );
                break;
            case 70:
                showPopup( "70.Người mình kính mến, sẽ được gần họ." );
                break;
            case 71:
                showPopup( "71.Quán Pháp ly dục, ý được tập trung." );
                break;
            case 72:
                showPopup( "72.Quán Pháp ly dục, ý chẳng tập trung." );
                break;
            case 73:
                showPopup( "73.Người được mời gọi, họ sẽ chẳng đến." );
                break;
            case 74:
                showPopup( "74.Người được hẹn trước, chắc chắn sẽ đến." );
                break;
            case 75:
                showPopup( "75.Người được hẹn trước, ở lại không đến." );
                break;
            case 76:
                showPopup( "76.Người đang được xem, được sự an lành." );
                break;
            case 77:
                showPopup( "77.Người đang được xem, hiện chẳng an lành." );
                break;
            case 78:
                showPopup( "78.Người đang được xem, đã không còn thân." );
                break;
            case 79:
                showPopup( "79.Người mình trông gặp, sẽ được gặp họ." );
                break;
            case 80:
                showPopup( "80.Những gì mình đang tìm, được gặp lại." );
                break;
            case 81:
                showPopup( "81.Những gì cầu nghe, sẽ được lợi lành." );
                break;
            case 82:
                showPopup( "82.Những gì mong tìm thấy, chẳng như ý." );
                break;
            case 83:
                showPopup( "83.Xem chỗ bị nghi, chính là đúng thật." );
                break;
            case 84:
                showPopup( "84.Xem lại chỗ bị nghi, là chẳng thật." );
                break;
            case 85:
                showPopup( "85.Người đang được xem, chẳng còn hòa hợp." );
                break;
            case 86:
                showPopup( "86.Cầu làm Phật sự, sẽ được kết quả." );
                break;
            case 87:
                showPopup( "87.Cầu những món cúng, sẽ được kết quả." );
                break;
            case 88:
                showPopup( "88.Tìm những của cải, sẽ được như ý." );
                break;
            case 89:
                showPopup( "89.Tìm của nuôi thân, ít được kết quả." );
                break;
            case 90:
                showPopup( "90.Có cầu những gì, thảy đều sẽ đượcc." );
                break;
            case 91:
                showPopup( "91.Có cầu những gì, ít được kết quả." );
                break;
            case 92:
                showPopup( "92.Có cầu những gì, ít được kết quả." );
                break;
            case 93:
                showPopup( "92.Có cầu những gì, đều được như ý." );
                break;
            case 94:
                showPopup( "94.Có cầu những gì, chẳng được nhanh chóng.." );
                break;
            case 95:
                showPopup( "95.Có cầu những gì, chẳng được nhanh chóng.." );
                break;
            case 96:
                showPopup( "96.Có cầu những gì, sẽ được lợi lành." );
                break;
            case 97:
                showPopup( "97.Có cầu những gì, sẽ được lợi lành" );
                break;
            case 98:
                showPopup( "98.Có cầu những gì, nhưng sẽ chịu khổ." );
                break;
            case 99:
                showPopup( "99.Xem vật bị mất, sẽ tìm lại được." );
                break;
            case 100:
                showPopup( "100.Xem vật bị mất, chẳng tìm lại được." );
                break;
            case 101:
                showPopup( "101.Xem vật bị mất, tự trở về lại." );
                break;
            case 102:
                showPopup( "102.Cầu lìa ách nạn, được thoát ách nạn." );
                break;
            case 103:
                showPopup( "103.Cầu khỏi bệnh hoạn, sẽ được trừ lành." );
                break;
            case 104:
                showPopup( "104.Xem những việc đã qua, không chướng ngại." );
                break;
            case 105:
                showPopup( "105.Xem những việc đã qua, có chướng ngại." );
                break;
            case 106:
                showPopup( "106.Xem nơi đang ở, được dừng ở yên." );
                break;
            case 107:
                showPopup( "107.Xem nơi đang ở, chẳng được bình an." );
                break;
            case 108:
                showPopup( "108.Nơi vừa mới đến, được sự an vui." );
                break;
            case 109:
                showPopup( "109.Nơi vừa mới đến, là có ách nạn." );
                break;
            case 110:
                showPopup( "110.Nơi vừa mới đến, là lưới của ma." );
                break;
            case 111:
                showPopup( "111.Nơi vừa mới đến, khó thể khai hóa." );
                break;
            case 112:
                showPopup( "112.Nơi vừa mới đến, có thể khai hóa." );
                break;
            case 113:
                showPopup( "113.Nơi vừa mới đến, tự được lợi ích." );
                break;
            case 114:
                showPopup( "114.Con đường dạo qua, không bị não hại." );
                break;
            case 115:
                showPopup( "115.Con đường dạo qua, có bị não hại." );
                break;
            case 116:
                showPopup( "116.Vua dân ác, nên đói kém nổi lên." );
                break;
            case 117:
                showPopup( "117.Vua dân ác, nên nhiều bệnh ôn dịch." );
                break;
            case 118:
                showPopup( "118.Vua dân tốt, nên nước được giàu vui." );
                break;
            case 119:
                showPopup( "119.Vua vô đạo, nên nước tai hại lớn." );
                break;
            case 120:
                showPopup( "120.Vua tu đức, tai nạn loạn ly diệt." );
                break;
            case 121:
                showPopup( "121.Vua làm ác, nước sắp bị phá hoại." );
                break;
            case 122:
                showPopup( "122.Vua tu thiện, nước được xây dựng lại." );
                break;
            case 123:
                showPopup( "123.Xem chỗ dạo qua, được khỏi các nạn." );
                break;
            case 124:
                showPopup( "124.Xem chỗ dạo qua, chẳng thoát khỏi nạn." );
                break;
            case 125:
                showPopup( "125.Nơi đang được ở, mọi người an ổn." );
                break;
            case 126:
                showPopup( "126.Nơi đang được ở, có sự chướng ngại." );
                break;
            case 127:
                showPopup( "127.Tụ lạc đang ở, mọi người chẳng yên." );
                break;
            case 128:
                showPopup( "128.Là nơi nhàn tịnh, không có ác nạn." );
                break;
            case 129:
                showPopup( "129.Xem ra quái lạ, nhưng không tổn hại." );
                break;
            case 130:
                showPopup( "130.Xem ra quái lạ, có sự tổn hại." );
                break;
            case 131:
                showPopup( "131.Xem ra quái lạ, tinh tấn thì an." );
                break;
            case 132:
                showPopup( "132.Giấc mộng được thấy, không gây tổn hại." );
                break;
            case 133:
                showPopup( "133.Giấc mộng được thấy, có sự tổn hại." );
                break;
            case 134:
                showPopup( "134.Giấc mộng được thấy, có sự tổn hại." );
                break;
            case 135:
                showPopup( "135.Giấc mộng được thấy, là một lợi lành." );
                break;
            case 136:
                showPopup( "136.Thấy chướng loạn đó, nhưng mau được lìa." );
                break;
            case 137:
                showPopup( "137.Thấy chướng nạn đó, lần lần được lìa" );
                break;
            case 138:
                showPopup( "138.Thấy chướng loạn đó, mà chẳng lìa khỏi." );
                break;
            case 139:
                showPopup( "139.Thấy chướng loạn đó, nhứt tâm là trừ." );
                break;
            case 140:
                showPopup( "140.Thấy nạn đang bị, nhưng mau được thoát." );
                break;
            case 141:
                showPopup( "141.Thấy nạn đang bị, lâu mới được thoát." );
                break;
            case 142:
                showPopup( "142.Thấy nạn đang bị, chịu nhiều suy não." );
                break;
            case 143:
                showPopup( "143.Thấy nạn đang bị, tinh tấn sẽ thoát." );
                break;
            case 144:
                showPopup( "144.Thấy nạn đang bị, biết mạng sắp chết." );
                break;
            case 145:
                showPopup( "145.Thấy bệnh đang mắc, rất chẳng nên điều trị." );
                break;
            case 146:
                showPopup( "146.Thấy bệnh đang mắc, chẳng phải người phá." );
                break;
            case 147:
                showPopup( "147.Thấy bệnh đang mắc, hợp với phi nhân." );
                break;
            case 148:
                showPopup( "148.Thấy bệnh đang mắc, có thể trị liệu." );
                break;
            case 149:
                showPopup( "149.Thấy bệnh đang mắc, khó thể trị liệu." );
                break;
            case 150:
                showPopup( "150.Thấy bệnh đang mắc, tinh tấn là lành." );
                break;
            case 151:
                showPopup( "151.Thấy bệnh đang mắc, phải khổ lâu dài." );
                break;
            case 152:
                showPopup( "152.Thấy bệnh đang mắc, tự động sẽ lành." );
                break;
            case 153:
                showPopup( "153.Thấy bệnh đang mắc, đến thầy khám mới trị nổi." );
                break;
            case 154:
                showPopup( "154.Thấy bệnh được chữa, là trị đúng pháp." );
                break;
            case 155:
                showPopup( "155.Thuốc đang được uống, sẽ được hiệu lực." );
                break;
            case 156:
                showPopup( "156.Thấy bệnh đang mắc, được trừ lành hẳn." );
                break;
            case 157:
                showPopup( "157.Thầy được tìm đến, chẳng thể trị liệu." );
                break;
            case 158:
                showPopup( "158.Cách được trị liệu, là chữa trị sai." );
                break;
            case 159:
                showPopup( "159.Thuốc đem cho uống, chẳng được hiệu lực." );
                break;
            case 160:
                showPopup( "160.Thấy bệnh đang mắc, là mạng sắp chết." );
                break;
            case 161:
                showPopup( "161.Đó là trong đường địa ngục mà đến." );
                break;
            case 162:
                showPopup( "162.Từ trong con đường súc sinh mà đến." );
                break;
            case 163:
                showPopup( "163.Từ trong con đường súc sinh mà đến." );
                break;
            case 164:
                showPopup( "164.Từ trong con đường A tu la mà đến." );
                break;
            case 165:
                showPopup( "165.Từ trong nhân loại mà đến." );
                break;
            case 166:
                showPopup( "166.Từ trong loài trời mà tái sinh đến." );
                break;
            case 167:
                showPopup( "167.Từ trong những người tại gia mà đến." );
                break;
            case 168:
                showPopup( "168.Từ trong hàng ngũ xuất gia mà đến." );
                break;
            case 169:
                showPopup( "169.Đã từng gặp Phật cúng dường mà đến." );
                break;
            case 170:
                showPopup( "170.Từng gần cúng dường Hiền Thánh mà đến." );
                break;
            case 171:
                showPopup( "171.Từng được nghe Pháp rất sâu mà đến." );
                break;
            case 172:
                showPopup( "172.Bỏ thân này rồi, sẽ vào địa ngục." );
                break;
            case 173:
                showPopup( "173.Bỏ thân rồi, sẽ đọa làm súc sinh." );
                break;
            case 174:
                showPopup( "174.Bỏ thân rồi, sẽ đọa làm ngã qủy." );
                break;
            case 175:
                showPopup( "175.Bỏ thân rồi, sẽ làm A tu la." );
                break;
            case 176:
                showPopup( "176.Bỏ thân rồi, sẽ sinh vào nhân đạo." );
                break;
            case 177:
                showPopup( "177.Bỏ thân rồi, làm vua trong loài người." );
                break;
            case 178:
                showPopup( "178.Bỏ thân rồi, sẽ sinh lên cõi trời." );
                break;
            case 179:
                showPopup( "179.Bỏ thân rồi, sẽ làm vua cõi trời." );
                break;
            case 180:
                showPopup( "180.Bỏ thân rồi, sẽ nghe Pháp rất sâu." );
                break;
            case 181:
                showPopup( "181.Bỏ thân rồi, được xuất gia tu học." );
                break;
            case 182:
                showPopup( "182.Bỏ thân rồi, sẽ được gặp Thánh Tăng." );
                break;
            case 183:
                showPopup( "183.Bỏ thân rồi, sinh lên trời Đâu Suất." );
                break;
            case 184:
                showPopup( "184.Bỏ thân rồi, sinh Tịnh độ của Phật." );
                break;
            case 185:
                showPopup( "185.Bỏ thân rồi, liền được thấy đức Phật." );
                break;
            case 186:
                showPopup( "186.Bỏ thân rồi, sẽ trụ vào thừa dưới (Thanh Văn)." );
                break;
            case 187:
                showPopup( "187.Bỏ thân rồi, sẽ trụ vào thừa giữa (Duyên Giác)." );
                break;
            case 188:
                showPopup( "188.Bỏ thân rồi, sẽ chứng được đạo quả." );
                break;
            case 189:
                showPopup( "189.Bỏ thân rồi, liền được bậc Thượng thừa." );
                break;
            default:
                break;
        }
    }

    private void showPopup(String message) {

        //code Popup
        AlertDialog.Builder builder = new AlertDialog.Builder( LayQue2.this );
        builder.setCancelable( true );
        builder.setTitle( "Kết Quả" );
        builder.setMessage( message );
        builder.setNegativeButton( android.R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        } );
        AlertDialog dialog = builder.create();
        dialog.show();
        //Code Popup
    }

}
