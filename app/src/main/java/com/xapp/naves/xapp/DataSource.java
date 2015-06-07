package com.xapp.naves.xapp;

/**
 * Created by hmaschwitz on 6/7/15.
 */

import java.util.ArrayList;
import java.util.List;


public class DataSource {

    static List<Tarea> TAREAS=new ArrayList<Tarea>();

    static{

        TAREAS.add(new Tarea("Shuvit","Longboard",R.drawable.shuvit));
        TAREAS.add(new Tarea("Kickflip","Longboard",R.drawable.kickflip));
        TAREAS.add(new Tarea("Flat top","Longboard",R.drawable.flat_top));
        TAREAS.add(new Tarea("Ghostride kickflip","Longboard",R.drawable.ghostride_kickflip));
        TAREAS.add(new Tarea("Footbrake","Longboard",R.drawable.footbrake));
        TAREAS.add(new Tarea("Turndown","BMX",R.drawable.turndown));
        TAREAS.add(new Tarea("Footjam","BMX",R.drawable.footjam));
        TAREAS.add(new Tarea("360 bunny hop ","BMX",R.drawable.bunny_hop));


    }

}
