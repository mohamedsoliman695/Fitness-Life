package com.example.fitnesslife;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.one.navigation_drawer;


@SuppressLint("Registered")
public class FragmentActivity extends AppCompatActivity {



    Intent intent18;



    private Intent intent13;
    private Intent intent14;
    private Intent getIntent;


    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.fragment_activity );
        if ( savedInstanceState == null ) {
            getSupportFragmentManager ( ).beginTransaction ( )
                    .replace ( R.id.container , com.example.one.ui.fragment.FragmentAcivity.fragment.newInstance ( ) )
                    .commitNow ( );


    }
}

    private Object fragment;




    public static String EXTRA_MESSAGE;
    public void  message6
            ( View view) {

        Intent intent = new Intent( FragmentActivity.this, navigation_drawer.class);
        Button button20 = (Button ) findViewById(R.id.stg);
        button20.setPaintFlags( button20.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        Intent intent15 = getIntent();
        String message = intent15.getStringExtra( MainActivity.EXTRA_MESSAGE);



        button20.setText(message);
        startActivity ( intent );







































    }
}
