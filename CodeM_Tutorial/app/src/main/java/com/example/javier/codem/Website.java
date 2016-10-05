package com.example.javier.codem;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;

public class Website extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.7),(int)(height*.3));
    }

    public void portal(View view) {
        Uri website = Uri.parse("http://web.eecs.umich.edu/~cseschol/");
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, website);
        startActivity(launchBrowser);
    }
}
