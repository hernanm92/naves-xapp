package com.xapp.naves.xapp;

/**
 * Created by hmaschwitz on 6/7/15.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TrucoArrayAdapter extends ArrayAdapter<Truco> {

    public TrucoArrayAdapter(Context context, List<Truco> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        //Obteniendo una instancia del inflater
        LayoutInflater inflater = (LayoutInflater)getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //Salvando la referencia del View de la fila
        View listItemView = convertView;

        //Comprobando si el View no existe
        if (null == convertView) {
            //Si no existe, entonces inflarlo con image_list_view.xml
            listItemView = inflater.inflate(
                    R.layout.image_list_item,
                    parent,
                    false);
        }

        //Obteniendo instancias de los elementos
        TextView titulo = (TextView)listItemView.findViewById(R.id.text1);
        TextView subtitulo = (TextView)listItemView.findViewById(R.id.text2);
        ImageView categoria = (ImageView)listItemView.findViewById(R.id.category);


        //Obteniendo instancia del Truco en la posición actual
        Truco item = getItem(position);

        titulo.setText(item.getNombre());
        subtitulo.setText(item.getHora());
        categoria.setImageResource(item.getCategoria());

        //Devolver al ListView la fila creada
        return listItemView;

    }
}