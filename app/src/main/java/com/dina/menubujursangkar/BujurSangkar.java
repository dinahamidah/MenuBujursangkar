package com.dina.menubujursangkar;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class BujurSangkar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bujur_sangkar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.bujur_sangkar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        Toast.makeText(getApplicationContext(),    item.getTitle() + " selected", Toast.LENGTH_SHORT).show();
        Intent i = null;
        switch (item.getItemId()) {
            case R.id.InputSisi:
                i = new    Intent(this,InputSisi.class);
                startActivity(i);
                break;
            case R.id.InputLuas:
                i = new    Intent(this,InputLuas.class);
                startActivity(i);
                break;
            case R.id.InputKeliling:
                i = new    Intent(this,InputKeliling.class);
                startActivity(i);
                break;
        }
        return true;
    }
}