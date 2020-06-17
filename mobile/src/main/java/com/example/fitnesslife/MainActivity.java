package com.example.fitnesslife;
import androidx.appcompat.app.AppCompatActivity;
import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Paint;
import android.nfc.Tag;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.one.data.model.LoggedInUser;

import com.example.one.ui.fragment1.FragmentActivity;
import com.example.one.ui.login.LoginActivity;

import org.w3c.dom.Text;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.one.ui.login;";



    public void view1( View view) {

        EditText editText = (EditText) findViewById(R.id.edittext);
        EditText editText1 = (EditText) findViewById(R.id.edittext1);

    }


















    private static final int pick_code = 1000;
    private static final int permission_code = 1001;
    ImageView im;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);








        String [] St1;
        String [] St2;
        String [] St3;
        Spinner numbers30 = (Spinner) findViewById(R.id.numbers2);
        Spinner  numbers20= (Spinner) findViewById(R.id.numbers);
        Spinner numbers10 = (Spinner) findViewById(R.id.numbers6);
        St1 = getResources().getStringArray ( R.array.numbers2 );
        St2 = getResources().getStringArray ( R.array.numbers6 );
        St3 = getResources().getStringArray ( R.array.numbers );
        ArrayAdapter adapter = new ArrayAdapter ( this,android.R.layout.simple_spinner_item ,St1);

        adapter.setDropDownViewResource ( android.R.layout.simple_spinner_dropdown_item );
        numbers30.setAdapter ( adapter );



        ArrayAdapter adapter2 = new ArrayAdapter ( this,android.R.layout.simple_spinner_item ,St2);
        adapter.setDropDownViewResource ( android.R.layout.simple_spinner_dropdown_item );
        numbers20.setAdapter ( adapter );








        ArrayAdapter adapter3 = new ArrayAdapter ( this,android.R.layout.simple_spinner_item ,St3);

        adapter.setDropDownViewResource ( android.R.layout.simple_spinner_dropdown_item );
        numbers10.setAdapter ( adapter );




        im = (ImageView) findViewById(R.id.impic_im);
        Button button = (Button) findViewById(R.id.imagebutton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) ==
                        PackageManager.PERMISSION_DENIED) {
                        String[] permissions = {Manifest.permission.READ_EXTERNAL_STORAGE};
                        requestPermissions(permissions, permission_code);
                    } else {
                        pickimage();
                    }
                }
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        switch (requestCode) {
            case permission_code:
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    pickimage();
                } else {
                    Toast.makeText(this, " Permission Denied.... ", Toast.LENGTH_SHORT).show();
                }
        }
    }

    private void pickimage() {
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent, pick_code);
        Log.i("data", "onCreate called");
    }

   public void  message6
            ( View view) {

      Intent intent = new Intent(MainActivity.this, FragmentActivity.class);
       Button Button20 = (Button ) findViewById(R.id.button2);
    Button20.setPaintFlags(Button20.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

      Intent intent15 = getIntent();
       String message = intent15.getStringExtra( MainActivity.EXTRA_MESSAGE);



      Button20.setText(message);
       startActivity ( intent );}



















    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && requestCode == pick_code) {

            im.setImageURI(data.getData());
        }
    }

    public static class YourPreference {
        private static YourPreference yourPreference;
        private SharedPreferences sharedPreferences;

        public static YourPreference getInstance ( Context context ) {
            if ( yourPreference == null ) {
                yourPreference = new YourPreference ( context );
            }
            return yourPreference;
        }

        private YourPreference ( Context context ) {
            sharedPreferences = context.getSharedPreferences ( "YourCustomNamedPreference" , Context.MODE_PRIVATE );
        }

        public void saveData ( String key , String value ) {
            SharedPreferences.Editor prefsEditor = sharedPreferences.edit ( );
            prefsEditor.putString ( key , value );
            prefsEditor.commit ( );
        }

        public String getData ( String key ) {
            if ( sharedPreferences != null ) {
                return sharedPreferences.getString ( key , "" );
            }
            return "";
        }
    }}






