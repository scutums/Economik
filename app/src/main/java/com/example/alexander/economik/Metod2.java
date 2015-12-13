package com.example.alexander.economik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Metod2 extends AppCompatActivity {

    Button MyButton;
    LinearLayout leaut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metod2);

       // leaut =(LinearLayout) findViewById(R.id.leaut);
        MyButton =(Button) findViewById(R.id.MyButton);
    }

    public void Kliket (View view){
        Toast toast = Toast.makeText(getApplicationContext(),
                "+", Toast.LENGTH_SHORT);
        toast.show();

        LinearLayout.LayoutParams lParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        int btnGravitu = Gravity.LEFT;
        lParams.gravity = btnGravitu;
       // Button bntNew = new Button(???????);
        //bntNew.setText(R.string.app_name);
       // leaut.addView(bntNew, lParams);


    };





   // public void Klik (View view){

/*
        try {
          //  R.id.buttons;
            LinearLayout.LayoutParams lParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            int btnGravitu = Gravity.LEFT;
            lParams.gravity = btnGravitu;
            Button bntNew = new Button(this);
          //  bntNew.setText(R.string.app_name);
            leaut.addView(bntNew, lParams);

        }   catch (Exception e) {
            e.printStackTrace();
        }

*/
//    };

}
