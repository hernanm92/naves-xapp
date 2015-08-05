package com.xapp.naves.xapp;

/**
 * Created by hmaschwitz on 6/7/15.
 */

import java.util.ArrayList;
import java.util.List;


public class DataSource {

    static List<Truco> TAREAS=new ArrayList<Truco>();

    static{

        TAREAS.add(new Truco("oqIdEKzqPh0", "Shove it","Longboard",R.drawable.shove_it)); //poner imagenes de baja resolucion (buscar optima)
        TAREAS.add(new Truco("Mmjbaa5Q4Dk", "Kickflip","Longboard",R.drawable.kickflip));
        TAREAS.add(new Truco("2750ooxbUM4", "Flat top","Longboard",R.drawable.flat_top));
        TAREAS.add(new Truco("o-K0Y-yfPjM", "Ghostride kickflip","Longboard",R.drawable.ghostride_kickflip)); //cambiar video
        TAREAS.add(new Truco("wU26njmPuZE", "Footbrake","Longboard",R.drawable.footbrake));
        TAREAS.add(new Truco("wU26njmPuZE", "Turndown","BMX",R.drawable.turndown));
        TAREAS.add(new Truco("wU26njmPuZE", "Footjam","BMX",R.drawable.footjam));
        TAREAS.add(new Truco("wU26njmPuZE", "360 bunny hop ","BMX",R.drawable.bunny_hop));


    }

}
