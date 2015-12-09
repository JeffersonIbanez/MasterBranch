package com.walltel.walltel;

import android.app.AlertDialog;
import android.content.Intent;
import android.database.SQLException;
import android.os.Bundle;
import android.view.View;
import static com.walltel.walltel.R.layout.menu;

public class Menu extends WalltelActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(menu);


        try {

        }catch (SQLException ex)
        {
            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setMessage(ex.getMessage());
            dlg.setNeutralButton("Ok", null);
            dlg.show();
        }


    }
    public void onclick(View v) {
        switch (v.getId()) {
            case R.id.buttonlogout:
                Intent a = new Intent();
                a.setClass(this, WalltelActivity.class);
                startActivity(a);
                break;

            case R.id.buttoncafe:
                Intent b = new Intent();
                b.setClass(this, Cafe.class);
                startActivity(b);
                break;
            case R.id.buttonalmoco:
                Intent c = new Intent();
                c.setClass(this, Almoco.class);
                startActivity(c);
                break;
            case R.id.buttonbebidas:
                Intent d = new Intent();
                d.setClass(this, Bebidas.class);
                startActivity(d);
                break;
            case R.id.buttonsobremesa:
                Intent e = new Intent();
                e.setClass(this, Sobremesa.class);
                startActivity(e);
                break;
            case R.id.buttonfinalizar:

                Intent f = new Intent();
                f.setClass(this, Finalizar.class);
                startActivity(f);
                break;
                }
    }
}