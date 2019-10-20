package com.app.langta.mocluan;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainActivity extends AppCompatActivity {
    RelativeLayout rl_menu;
    LinearLayout ln_animation;
    Button kinhchiemsat;
    Button layque2;
    Button chiemsatthienac;
    private InterstitialAd mInterstitialAd;
    static boolean showPopup = false;
    ImageView img_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_menu = findViewById(R.id.img_menu);
        rl_menu = findViewById(R.id.rl_menu);
        ln_animation = findViewById(R.id.ln_animation);
        img_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rl_menu.setVisibility(View.VISIBLE);
                ln_animation.setVisibility(View.VISIBLE);
                ln_animation.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.left_to_right));
            }
        });
        View view_menu = findViewById(R.id.view_menu);
        view_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ln_animation.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.right_to_left));
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        rl_menu.setVisibility(View.GONE);
                        ln_animation.setVisibility(View.GONE);
                    }
                }, 300);
            }
        });

        TextView tv_tuthien = findViewById(R.id.tv_tuthien);

        tv_tuthien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ln_animation.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.right_to_left));
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        rl_menu.setVisibility(View.GONE);
                        show2("Chủ TK Vũ Thị Thu Hà\n" +
                                "Số TK: 018100358179\n" +
                                "Ngân hàng Vietcombank\n" +
                                "Chi nhánh Sài Gòn");
                    }
                }, 300);
            }
        });

        TextView tv_antong = findViewById(R.id.tv_antong);
        tv_antong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ln_animation.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.right_to_left));
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        rl_menu.setVisibility(View.GONE);
                        show2("Chủ TK Vũ Thị Thu Hà\n" +
                                "Số TK: 1459937\n" +
                                "Ngân hàng Á Châu ACB\n" +
                                "PGD Phước Bình\n" +
                                "Lưu ý: khi gửi online chọn ACB (HCM)");
                    }
                }, 300);
            }
        });

        TextView tv_khuyenhoc = findViewById(R.id.tv_khuyenhoc);
        tv_khuyenhoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ln_animation.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.right_to_left));
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        rl_menu.setVisibility(View.GONE);
                        show2("Chủ TK Vũ Thị Thu Hà\n" +
                                "Số TK: 0071001281072\n" +
                                "Ngân hàng Vietcombank\n" +
                                "Chi nhánh Hồ Chí Minh");
                    }
                }, 300);
            }
        });

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
                Log.e("error", initializationStatus.getAdapterStatusMap().toString());
            }
        });

        AdView adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId(getString(R.string.id_video));
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        if (!showPopup) {
            showPopup = true;
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setCancelable(true);
            builder.setTitle("Chú ý");
            builder.setMessage("Muốn linh ứng hãy niệm phật trong 3 tháng và mỗi lần hỏi hãy niệm danh hiệu phật hoặc bồ tát.");
            builder.setNegativeButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        kinhchiemsat = findViewById( R.id.kinhchiemsat );
        kinhchiemsat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, Kinh.class);
                MainActivity.this.startActivity(myIntent);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
            }
        });
        layque2 = findViewById( R.id.layque );
        layque2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                Intent myIntent = new Intent(MainActivity.this, LayQue2.class);
                MainActivity.this.startActivity(myIntent);
            }
        } );

        chiemsatthienac = findViewById( R.id.chiemsatthienac );
        chiemsatthienac.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, chiemsatthienac.class);
                MainActivity.this.startActivity(myIntent);
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
            }
        } );

    }

    private void show2(String text){
        final Context context = this;
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                context);

        // set title
        alertDialogBuilder.setTitle("Thông Tin");

        // set dialog message
        alertDialogBuilder
                .setMessage(text)
                .setNegativeButton("OK",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        // if this button is clicked, just close
                        // the dialog box and do nothing
                        dialog.cancel();
                    }
                });

        // create alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();

        // show it
        alertDialog.show();
    }
}
