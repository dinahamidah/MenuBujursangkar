package com.dina.menubujursangkar;

import android.support.v7.app.ActionBarActivity;
//import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class InputSisi extends AppCompatActivity implements OnClickListener {
    TextView Ssisi;
    Button Sproses;
    TextView Shasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sisi);
        Ssisi = (TextView) this.findViewById(R.id.sisi);
        Shasil = (TextView) this.findViewById(R.id.hasil);
        Sproses = (Button) this.findViewById(R.id.proses);
        Sproses.setOnClickListener(this);
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
                i = new    Intent(this,InputSisi.class);                startActivity(i);
                break;
            case R.id.InputLuas:
                i = new    Intent(this,InputLuas.class);                startActivity(i);
                break;
            case R.id.InputKeliling:
                i = new    Intent(this,InputKeliling.class);                startActivity(i);
                break;
        }
        return true;
    }

    @Override
    public void onClick(View v) {
        double Dluas, Dkeliling, Dsisi;                Dsisi = Double.parseDouble(Ssisi.getText().toString());
        Dluas = Dsisi * Dsisi;
        Dkeliling = 4 * Dsisi;
        String Cetak="";
        Cetak += "Diketahui sisi bujursangkar = "+Dsisi+"\n\n";
        Cetak += "Luas Bujursangkar = "+Dsisi+" x "+Dsisi+" = "+Dluas+"\n\n";
        Cetak += "Keliling Bujursangkar = "+Dsisi+" x 4 = "+Dkeliling+"\n";
        Shasil.setText (Cetak);
    }}