package com.example.proyecto_libreria_android;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class Base_menu extends AppCompatActivity
{

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id=item.getGroupId();

        switch(id) {
            case 0: {
                Intent i = new Intent(this, Donacion.class);
                startActivityForResult(i, 0);
                break;
            }
            case 1: {
                Intent i = new Intent(this, Intercambio.class);
                startActivityForResult(i, 0);
                break;
            }
            case 2: {
                Intent i = new Intent(this, Reserva.class);
                startActivityForResult(i, 0);
                break;
            }
            case 3: {
                Intent i = new Intent(this, Prestamo.class);
                startActivityForResult(i, 0);
                break;
            }
            case 4: {
                Intent i = new Intent(this, Devolucion.class);
                startActivityForResult(i, 0);
                break;
            }
        }

        return super.onOptionsItemSelected(item);
    }
}
