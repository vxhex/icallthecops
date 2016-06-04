package com.vxhex.icallthecops;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final String[] _possiblySex = {
            "TOUCH ME ALL OVER",
            "BACK OFF LADIES",
            "MAYBE ;)"
    };

    private int _sexyMenuOption = 0;

    private TextView _sexyText = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sand);
        mp.start();
        mp.setLooping(true);
        _sexyText = (TextView)findViewById(R.id.textView1);
        nextSexy();
    }

    public void onClick(View v) {
        nextSexy();
    }

    private void nextSexy() {
        _sexyText.setText(_possiblySex[_sexyMenuOption]);
        _sexyMenuOption = (_sexyMenuOption + 1) % _possiblySex.length;
    }
}
