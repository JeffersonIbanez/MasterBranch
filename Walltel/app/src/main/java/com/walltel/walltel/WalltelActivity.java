package com.walltel.walltel;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.widget.EditText;

public class WalltelActivity extends Activity {
    private EditText senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.walltel);

        senha = (EditText) findViewById(R.id.senha);


    }

    public void onclickmenu(View v) {
        String senhal = senha.getText().toString();
        if ("walltel01".equals(senhal))
        {
            Intent i = new Intent();
            i.setClass(this, Menu.class);
            startActivity(i);
            stopService(i);
        }
        else if ("walltel02".equals(senhal))
        {
            Intent i = new Intent();
            i.setClass(this, Menu.class);
            startActivity(i);
            stopService(i);
        }
        else if ("walltel03".equals(senhal))
        {
            Intent i = new Intent();
            i.setClass(this, Menu.class);
            startActivity(i);
            stopService(i);
        }
        else
        {
          AlertDialog alertDialog;
            alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Erro");
            alertDialog.setMessage("Senha Incorreta!                      " +"                   Entre em contato com a recepção");
            alertDialog.show();
        }
    }

}
