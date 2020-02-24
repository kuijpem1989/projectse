package com.example.scanbewust.view;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.scanbewust.R;

import gr.net.maroulis.library.EasySplashScreen;

/**
 * Android front end ScanBewust app
 * Doel van deze class is om een beginscherm te tonen voor een aantal seconden
 * @author michaelkuijpers
 */
public class SplashScreenActivity extends AppCompatActivity {

    // Finals
    private final static int SPLASH_SECONDS = 4000;
    private final static String BACKGROUND_COLOR = "#EC576B";

    // Class variabelen
    protected EasySplashScreen splashScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Roept de methode aan die de splash screen zal starten
        startSplashScreen();

    }

    /**
     * Methode waarmee de splash wordt gestart
     * Na aantal seconden van de finalzal het scherm naar het inlogscherm overspringen
     */
    private void startSplashScreen() {
        splashScreen = new EasySplashScreen(SplashScreenActivity.this)
                .withFullScreen()
                .withTargetActivity(MainActivity.class)
                .withSplashTimeOut(SPLASH_SECONDS)
                .withBackgroundColor(Color.parseColor(BACKGROUND_COLOR));
                // TODO: Logo verwerken
                //.withLogo(R.drawable.scanbewust_logo);
        View view = splashScreen.create();
        setContentView(view);
    }

}
