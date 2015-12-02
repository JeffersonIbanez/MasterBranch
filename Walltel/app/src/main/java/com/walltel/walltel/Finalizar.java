package com.walltel.walltel;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Finalizar extends WalltelActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finalizar);
    }

    public void onclick(View v) {
        switch (v.getId()) {
            case R.id.buttonvoltar:
                Intent a = new Intent();
                a.setClass(this, Menu.class);
                startActivity(a);
                break;
            case R.id.buttoncancelar:
                Intent b = new Intent();
                b.setClass(this, Menu.class);
                startActivity(b);
                break;
            case R.id.Finalizar:
                AlertDialog alertDialog;
                alertDialog = new AlertDialog.Builder(this).create();
                alertDialog.setTitle("Pedido Enviado");
                alertDialog.setMessage("Seu Pedido Chegara em 10 minutos.");
                alertDialog.show();
/*                Intent c = new Intent();
                c.setClass(this, Menu.class);
                startActivity(c);
*/                break;
        }
    }
}
