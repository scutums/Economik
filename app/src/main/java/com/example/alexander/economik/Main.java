package com.example.alexander.economik;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class Main extends AppCompatActivity {

    Button metod1;
    Button metod2;
    Button metod3;
    Button metod4;
    Button metod5;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        metod1 = (Button) findViewById(R.id.metod1);
        metod2 = (Button) findViewById(R.id.metod2);
        metod3 = (Button) findViewById(R.id.metod3);
        metod4 = (Button) findViewById(R.id.metod4);
        metod5 = (Button) findViewById(R.id.metod5);


    }
    public void metod_one (View view){
        Intent intent = new Intent(Main.this, Metod1.class);
        startActivity(intent);
    };
    public void metod_tu (View view){
        Intent intent = new Intent(Main.this, Metod2.class);
        startActivity(intent);
    };
    public void metod_tri (View view){
        return;
    };
    public void metod_fo (View view){
        return;
    };
    public void metod_five (View view){
        return;
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if (id == R.id.action_setting) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
