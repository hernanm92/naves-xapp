package com.xapp.naves.xapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class ListActivity extends Activity implements AdapterView.OnItemClickListener {

    ListView lista;
    ArrayAdapter adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        //Instancia del ListView
        lista = (ListView)findViewById(R.id.lista);

        //Inicializar el adaptador con la fuente de datos
        adaptador = new TareaArrayAdapter(this,DataSource.TAREAS);

        //Relacionando la lista con el adaptador
        lista.setAdapter(adaptador);

        //Estableciendo la escucha
        lista.setOnItemClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_clear) {
            //Limpiar todos los elementos
            adaptador.clear();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Tarea tareaActual = (Tarea)adaptador.getItem(position);
        String msg = "Elegiste la tarea:\n"+tareaActual.getNombre()+"-"+tareaActual.getId();
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();


        Intent intent = new Intent(ListActivity.this, ViewVideoActivity.class);
        intent.putExtra("VideoId", tareaActual.getId()); //Your id
        startActivity(intent);

    }
}