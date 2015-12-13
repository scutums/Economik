package com.example.alexander.economik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Metod1 extends AppCompatActivity {
    //1
    TextView Bj1;
    TextView Xj1;
    TextView BjX1;
    TextView X1;
    TextView BjXj1;
    //2
    TextView Bj2;
    TextView Xj2;
    TextView BjX2;
    TextView X2;
    TextView BjXj2;
    //3
    TextView Bj3;
    TextView Xj3;
    TextView BjX3;
    TextView X3;
    TextView BjXj3;
    //4
    TextView Bj4;
    TextView Xj4;
    TextView BjX4;
    TextView X4;
    TextView BjXj4;
    //5
    TextView Bj5;
    TextView Xj5;
    TextView BjX5;
    TextView X5;
    TextView BjXj5;
    //6
    TextView Bj6;
    TextView Xj6;
    TextView BjX6;
    TextView X6;
    TextView BjXj6;
    //7
    TextView Bj7;
    TextView Xj7;
    TextView BjX7;
    TextView X7;
    TextView BjXj7;
    //8
    TextView Bj8;
    TextView Xj8;
    TextView BjX8;
    TextView X8;
    TextView BjXj8;
    //9
    TextView Bj9;
    TextView Xj9;
    TextView BjX9;
    TextView X9;
    TextView BjXj9;
    //
    float BjX;
    float BjXj;
    float BjX11;
    float BjXj11;
    float BjX22;
    float BjXj22;
    float BjX33;
    float BjXj33;
    float BjX44;
    float BjXj44;
    float BjX55;
    float BjXj55;
    float BjX66;
    float BjXj66;
    float BjX77;
    float BjXj77;
    float BjX88;
    float BjXj88;

    Button button;
    Button button2;
    Spinner spinner;
    TextView Vivod;
    EditText BjeditText;
    EditText XjeditText;
    EditText XeditText;
    float Bj,Jety11,Jety22,Ak;
    int X,Xj;

    TextView Jety1;
    TextView Jety2;
    float AK1;



    int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metod1);

        spinner =(Spinner)findViewById(R.id.spinner);
        button = (Button) findViewById(R.id.buttons);
       // button.setOnClickListener(this);
        BjeditText =(EditText)findViewById(R.id.BjeditText);
        XjeditText =(EditText)findViewById(R.id.XjeditText);
        XeditText =(EditText)findViewById(R.id.XeditText);
        button2 =(Button)findViewById(R.id.button2);


        Vivod =(TextView)findViewById(R.id.Vivod);
        //1
        Bj1 = (TextView)findViewById(R.id.Bj1);
        Xj1 = (TextView)findViewById(R.id.Xj1);
        BjX1 = (TextView)findViewById(R.id.BjX1);
        X1 = (TextView)findViewById(R.id.X1);
        BjXj1 = (TextView)findViewById(R.id.BjXj1);
        //2
        Bj2 = (TextView)findViewById(R.id.Bj2);
        Xj2 = (TextView)findViewById(R.id.Xj2);
        BjX2 = (TextView)findViewById(R.id.BjX2);
        X2 = (TextView)findViewById(R.id.X2);
        BjXj2 = (TextView)findViewById(R.id.BjXj2);
        //3
        Bj3 = (TextView)findViewById(R.id.Bj3);
        Xj3 = (TextView)findViewById(R.id.Xj3);
        BjX3 = (TextView)findViewById(R.id.BjX3);
        X3 = (TextView)findViewById(R.id.X3);
        BjXj3 = (TextView)findViewById(R.id.BjXj3);
        //4
        Bj4 = (TextView)findViewById(R.id.Bj4);
        Xj4 = (TextView)findViewById(R.id.Xj4);
        BjX4 = (TextView)findViewById(R.id.BjX4);
        X4 = (TextView)findViewById(R.id.X4);
        BjXj4 = (TextView)findViewById(R.id.BjXj4);
        //5
        Bj5 = (TextView)findViewById(R.id.Bj5);
        Xj5 = (TextView)findViewById(R.id.Xj5);
        BjX5 = (TextView)findViewById(R.id.BjX5);
        X5 = (TextView)findViewById(R.id.X5);
        BjXj5 = (TextView)findViewById(R.id.BjXj5);
        //6
        Bj6 = (TextView)findViewById(R.id.Bj6);
        Xj6 = (TextView)findViewById(R.id.Xj6);
        BjX6 = (TextView)findViewById(R.id.BjX6);
        X6 = (TextView)findViewById(R.id.X6);
        BjXj6 = (TextView)findViewById(R.id.BjXj6);
        //7
        Bj7 = (TextView)findViewById(R.id.Bj7);
        Xj7 = (TextView)findViewById(R.id.Xj7);
        BjX7 = (TextView)findViewById(R.id.BjX7);
        X7 = (TextView)findViewById(R.id.X7);
        BjXj7 = (TextView)findViewById(R.id.BjXj7);
        //8
        Bj8 = (TextView)findViewById(R.id.Bj8);
        Xj8 = (TextView)findViewById(R.id.Xj8);
        BjX8 = (TextView)findViewById(R.id.BjX8);
        X8 = (TextView)findViewById(R.id.X8);
        BjXj8 = (TextView)findViewById(R.id.BjXj8);
        //9
        Bj9 = (TextView)findViewById(R.id.Bj9);
        Xj9 = (TextView)findViewById(R.id.Xj9);
        BjX9 = (TextView)findViewById(R.id.BjX9);
        X9 = (TextView)findViewById(R.id.X9);
        BjXj9 = (TextView)findViewById(R.id.BjXj9);

        Jety1 =(TextView)findViewById(R.id.Jety1);
        Jety2 =(TextView)findViewById(R.id.Jety2);
    }


    public void klik1 (View view) {


        switch (spinner.getSelectedItemPosition())
        {
            case (0):
                try {
                    Bj = Float.parseFloat(BjeditText.getText().toString());
                    X = Integer.parseInt(XeditText.getText().toString());
                    Xj = Integer.parseInt(XjeditText.getText().toString());
                } catch (NumberFormatException e) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            R.string.exeption, Toast.LENGTH_SHORT);
                    toast.show();
                }
                //
                BjX = Bj*X;
                BjXj = Bj*Xj;
                //
                String strBj =Float.toString(Bj);
                String strX = Integer.toString(X);
                String strXj =Integer.toString(Xj);
                String strBjX =Float.toString(BjX);
                String strBjXj =Float.toString(BjXj);
                //индексы полей
                Bj1.setText(strBj);
                Xj1.setText(strXj);
                BjX1.setText(strBjXj);
                X1.setText(strX);
                BjXj1.setText(strBjX);
                break;
            case (1):
                try {
                    Bj = Float.parseFloat(BjeditText.getText().toString());
                    X = Integer.parseInt(XeditText.getText().toString());
                    Xj = Integer.parseInt(XjeditText.getText().toString());
                } catch (NumberFormatException e) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            R.string.exeption, Toast.LENGTH_SHORT);
                    toast.show();
                }
                //
                BjX11 = Bj*X;
                BjXj11 = Bj*Xj;
                //
                String strBj11 =Float.toString(Bj);
                String strX11 = Integer.toString(X);
                String strXj11 =Integer.toString(Xj);
                String strBjX11 =Float.toString(BjX11);
                String strBjXj11 =Float.toString(BjXj11);
                //индексы полей
                Bj2.setText(strBj11);
                Xj2.setText(strXj11);
                BjX2.setText(strBjXj11);
                X2.setText(strX11);
                BjXj2.setText(strBjX11);
                break;
            case (2):
                try {
                    Bj = Float.parseFloat(BjeditText.getText().toString());
                    X = Integer.parseInt(XeditText.getText().toString());
                    Xj = Integer.parseInt(XjeditText.getText().toString());
                } catch (NumberFormatException e) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            R.string.exeption, Toast.LENGTH_SHORT);
                    toast.show();
                }
                //
                BjX22 = Bj*X;
                BjXj22 = Bj*Xj;
                //
                String strBj22 =Float.toString(Bj);
                String strX22 = Integer.toString(X);
                String strXj22 =Integer.toString(Xj);
                String strBjX22 =Float.toString(BjX22);
                String strBjXj22 =Float.toString(BjXj22);
                //индексы полей
                Bj3.setText(strBj22);
                Xj3.setText(strXj22);
                BjX3.setText(strBjXj22);
                X3.setText(strX22);
                BjXj3.setText(strBjX22);
                break;
            case (3):
                try {
                    Bj = Float.parseFloat(BjeditText.getText().toString());
                    X = Integer.parseInt(XeditText.getText().toString());
                    Xj = Integer.parseInt(XjeditText.getText().toString());
                } catch (NumberFormatException e) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            R.string.exeption, Toast.LENGTH_SHORT);
                    toast.show();
                }
                //
                BjX33 = Bj*X;
                BjXj33 = Bj*Xj;
                //
                String strBj33 =Float.toString(Bj);
                String strX33 = Integer.toString(X);
                String strXj33 =Integer.toString(Xj);
                String strBjX33 =Float.toString(BjX33);
                String strBjXj33 =Float.toString(BjXj33);
                //индексы полей
                Bj4.setText(strBj33);
                Xj4.setText(strXj33);
                BjX4.setText(strBjXj33);
                X4.setText(strX33);
                BjXj4.setText(strBjX33);
                break;case (4):
            try {
                Bj = Float.parseFloat(BjeditText.getText().toString());
                X = Integer.parseInt(XeditText.getText().toString());
                Xj = Integer.parseInt(XjeditText.getText().toString());
            } catch (NumberFormatException e) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        R.string.exeption, Toast.LENGTH_SHORT);
                toast.show();
            }
            //
            BjX44 = Bj*X;
            BjXj44 = Bj*Xj;
            //
            String strBj44 =Float.toString(Bj);
            String strX44 = Integer.toString(X);
            String strXj44 =Integer.toString(Xj);
            String strBjX44 =Float.toString(BjX44);
            String strBjXj44 =Float.toString(BjXj44);
            //индексы полей
            Bj5.setText(strBj44);
            Xj5.setText(strXj44);
            BjX5.setText(strBjXj44);
            X5.setText(strX44);
            BjXj5.setText(strBjX44);
            break;case (5):
            try {
                Bj = Float.parseFloat(BjeditText.getText().toString());
                X = Integer.parseInt(XeditText.getText().toString());
                Xj = Integer.parseInt(XjeditText.getText().toString());
            } catch (NumberFormatException e) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        R.string.exeption, Toast.LENGTH_SHORT);
                toast.show();
            }
            //
            BjX55 = Bj*X;
            BjXj55 = Bj*Xj;
            //
            String strBj55 =Float.toString(Bj);
            String strX55 = Integer.toString(X);
            String strXj55 =Integer.toString(Xj);
            String strBjX55 =Float.toString(BjX55);
            String strBjXj55 =Float.toString(BjXj55);
            //индексы полей
            Bj6.setText(strBj55);
            Xj6.setText(strXj55);
            BjX6.setText(strBjXj55);
            X6.setText(strX55);
            BjXj6.setText(strBjX55);
            break;case (6):
            try {
                Bj = Float.parseFloat(BjeditText.getText().toString());
                X = Integer.parseInt(XeditText.getText().toString());
                Xj = Integer.parseInt(XjeditText.getText().toString());
            } catch (NumberFormatException e) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        R.string.exeption, Toast.LENGTH_SHORT);
                toast.show();
            }
            //
            BjX66 = Bj*X;
            BjXj66 = Bj*Xj;
            //
            String strBj66 =Float.toString(Bj);
            String strX66 = Integer.toString(X);
            String strXj66 =Integer.toString(Xj);
            String strBjX66 =Float.toString(BjX66);
            String strBjXj66 =Float.toString(BjXj66);
            //индексы полей
            Bj7.setText(strBj66);
            Xj7.setText(strXj66);
            BjX7.setText(strBjXj66);
            X7.setText(strX66);
            BjXj7.setText(strBjX66);
            break;case (7):
            try {
                Bj = Float.parseFloat(BjeditText.getText().toString());
                X = Integer.parseInt(XeditText.getText().toString());
                Xj = Integer.parseInt(XjeditText.getText().toString());
            } catch (NumberFormatException e) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        R.string.exeption, Toast.LENGTH_SHORT);
                toast.show();
            }
            //
            BjX77 = Bj*X;
            BjXj77 = Bj*Xj;
            //
            String strBj77 =Float.toString(Bj);
            String strX77 = Integer.toString(X);
            String strXj77 =Integer.toString(Xj);
            String strBjX77 =Float.toString(BjX77);
            String strBjXj77 =Float.toString(BjXj77);
            //индексы полей
            Bj8.setText(strBj77);
            Xj8.setText(strXj77);
            BjX8.setText(strBjXj77);
            X8.setText(strX77);
            BjXj8.setText(strBjX77);
            break;case (8):
            try {
                Bj = Float.parseFloat(BjeditText.getText().toString());
                X = Integer.parseInt(XeditText.getText().toString());
                Xj = Integer.parseInt(XjeditText.getText().toString());
            } catch (NumberFormatException e) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        R.string.exeption, Toast.LENGTH_SHORT);
                toast.show();
            }
            //
            BjX88 = Bj*X;
            BjXj88 = Bj*Xj;
            //
            String strBj88 =Float.toString(Bj);
            String strX88 = Integer.toString(X);
            String strXj88 =Integer.toString(Xj);
            String strBjX88 =Float.toString(BjX88);
            String strBjXj88 =Float.toString(BjXj88);
            //индексы полей
            Bj9.setText(strBj88);
            Xj9.setText(strXj88);
            BjX9.setText(strBjXj88);
            X9.setText(strX88);
            BjXj9.setText(strBjX88);
            break;


        }
    }



    public void onCliks (View view)
    {
        try {
            Jety11 = (BjX + BjX11 + BjX22 + BjX33 + BjX44 + BjX55 + BjX66 + BjX77 + BjX88) / 9;
            Jety22 = (BjXj + BjXj11 + BjXj22 + BjXj33 + BjXj44 + BjXj55 + BjXj66 + BjXj77 + BjXj88) / 9;

            AK1 = Jety11 / Jety22;
        }catch (NumberFormatException e){
            Toast toast = Toast.makeText(getApplicationContext(),
                    R.string.exeption, Toast.LENGTH_SHORT);
            toast.show();
        }

        String strJety1 = Float.toString(Jety11);
        String strJety2 = Float.toString(Jety22);
        String strAK1 = Float.toString(AK1);

        Jety1.setText(strJety1);
        Jety2.setText(strJety2);

        Vivod.setText(strAK1);
    }




}
