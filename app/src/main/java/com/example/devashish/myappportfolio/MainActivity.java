package com.example.devashish.myappportfolio;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void DisplayToastSpt(View view){
        Toast.makeText(getApplicationContext(),"This Button will launch my SPOTIFY STREAMER",Toast.LENGTH_SHORT).show();
    }

    public void DisplayToastLib(View view){
        Toast.makeText(getApplicationContext(),"This Button will launch my LIBRARY APP",Toast.LENGTH_SHORT).show();
    }

    public void DisplayToastScr(View view){
        Toast.makeText(getApplicationContext(),"This Button will launch my SCORES APP",Toast.LENGTH_SHORT).show();
    }

    public void DisplayToastBgr(View view){
        Toast.makeText(getApplicationContext(),"This Button will launch my BUILD IT BIGGER APP",Toast.LENGTH_SHORT).show();
    }

    public void DisplayToastRdr(View view){
        Toast.makeText(getApplicationContext(),"This Button will launch my READER APP",Toast.LENGTH_SHORT).show();
    }

    public void DisplayToastApp(View view){
        Toast.makeText(getApplicationContext(),"This Button will launch my CAPSTONE APP",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

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

        return super.onOptionsItemSelected(item);
    }
}
