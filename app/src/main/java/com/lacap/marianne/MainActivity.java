package com.lacap.marianne;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4ITF ", "On create has executed....");

        Intent i =  new Intent(this, MyService.class);
        startService(i);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ITF ", "On start has executed....");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ITF ", "On resume has executed....");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4ITF ", "On pause has executed....");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4ITF ", "On stop has executed....");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4ITF ", "On Restart has executed....");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ITF ", "The object has been deallocated...");
    }
    public void display2(View v) {
        Intent i = new Intent(this, SecondLayout.class);
        startActivity(i);
    }

    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btnNext) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.610400,120.991916"));
            chooser = Intent.createChooser(i, "Select your map app");

            startActivity(chooser);
        }
    }
}
