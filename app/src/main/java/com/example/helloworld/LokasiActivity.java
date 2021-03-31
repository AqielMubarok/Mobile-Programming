package com.example.helloworld;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class LokasiActivity  extends AppCompatActivity {

    RadioButton jakarta;
    RadioButton bekasi;
    RadioButton tangerang;
    RadioButton banten;
    RadioButton cikarang;
    RadioButton cikampek;
    RadioButton purwakarta;
    RadioButton bandung;

    private Button lanjut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lokasi);

        jakarta = (RadioButton) findViewById(R.id.jakarta);
        bekasi = (RadioButton) findViewById(R.id.bekasi);
        tangerang= (RadioButton) findViewById(R.id.tangerang);
        banten = (RadioButton) findViewById(R.id.banten);
        cikarang = (RadioButton) findViewById(R.id.cikarang);
        cikampek = (RadioButton) findViewById(R.id.cikampek);
        purwakarta = (RadioButton) findViewById(R.id.purwakarta);
        bandung = (RadioButton) findViewById(R.id.bandung);

        lanjut = (Button) findViewById(R.id.lanjut);

        lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (jakarta.isChecked()) {
                    startActivity(new Intent(LokasiActivity.this, DashboardActivityJakarta.class));
                    finish();
                } else if (purwakarta.isChecked()) {
                    startActivity(new Intent(LokasiActivity.this, DashboardActivity.class));
                    finish();
                } else {
                    Toast.makeText(LokasiActivity.this, "Hanya baru tersedia Jakarta dan Purwakarta", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void info(View view) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Pemberitahuan");
        alertDialogBuilder.setMessage("Hanya baru tersedia Jakarta dan Purwakarta");
        alertDialogBuilder.setCancelable(false);
        alertDialogBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        AlertDialog alertDialog=alertDialogBuilder.create();
        alertDialog.show();
    }
}
