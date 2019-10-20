package com.app.langta.mocluan;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.app.langta.mocluan.readPDF.PDFView;
import com.app.langta.mocluan.readPDF.listener.OnLoadCompleteListener;
import com.app.langta.mocluan.readPDF.listener.OnPageChangeListener;
import com.app.langta.mocluan.readPDF.listener.OnPageErrorListener;
import com.app.langta.mocluan.readPDF.scroll.DefaultScrollHandle;
import com.app.langta.mocluan.readPDF.util.FitPolicy;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;


public class Kinh extends AppCompatActivity implements OnPageChangeListener, OnLoadCompleteListener,
        OnPageErrorListener {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kinh);

        AdView adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("kinh.pdf")
                .defaultPage(0)
                .onPageChange(this)
                .enableAnnotationRendering(true)
                .onLoad(this)
                .scrollHandle(new DefaultScrollHandle(this))
                .spacing(10) // in dp
                .onPageError(this)
                .pageFitPolicy(FitPolicy.BOTH)
                .load();
    }

    @Override
    public void loadComplete(int nbPages) {

    }

    @Override
    public void onPageChanged(int page, int pageCount) {

    }

    @Override
    public void onPageError(int page, Throwable t) {

    }
}
