package c.example.mainscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import gr.net.maroulis.library.EasySplashScreen;

public class splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EasySplashScreen config = new EasySplashScreen(splash_screen.this)
               .withFullScreen()
                .withTargetActivity(MainActivity.class)
                .withSplashTimeOut(5000)
                //.withBackgroundColor(Color.parseColor("#1a1b29"))
                .withBackgroundColor(Color.BLACK)
                //.withHeaderText("Header")
                .withFooterText("@Copyright By HTL 2001-2020")
                .withBeforeLogoText("Perfect Haircut")
                .withAfterLogoText("Perfect Life")
                //.withBackgroundResource(R.drawable.exodus)
                .withLogo(R.drawable.logo);


        //config.getHeaderTextView().setTextColor(Color.WHITE);
        config.getFooterTextView().setTextColor(Color.WHITE);
        config.getBeforeLogoTextView().setTextColor(Color.WHITE);
        config.getAfterLogoTextView().setTextColor(Color.WHITE);

        View easySplashScreen = config.create();
        setContentView(easySplashScreen);
    }
}