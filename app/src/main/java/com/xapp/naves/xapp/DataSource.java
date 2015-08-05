package com.xapp.naves.xapp;

/**
 * Created by hmaschwitz on 6/7/15.
 */

import java.util.ArrayList;
import java.util.List;


public class DataSource {

    static List<Truco> TAREAS=new ArrayList<Truco>();
    static List<Truco> bmxTricks=new ArrayList<Truco>();
    static List<Truco> longboardTricks=new ArrayList<Truco>();
    static List<Truco> skateTricks=new ArrayList<Truco>();
    static List<Truco> skiTricks=new ArrayList<Truco>();
    static List<Truco> snowboardTricks=new ArrayList<Truco>();
    static List<Truco> surfTricks=new ArrayList<Truco>();

    static{

        TAREAS.add(new Truco("oqIdEKzqPh0", "Shove it","Longboard",R.drawable.shove_it)); //poner imagenes de baja resolucion (buscar optima)
        TAREAS.add(new Truco("Mmjbaa5Q4Dk", "Kickflip","Longboard",R.drawable.kickflip));
        TAREAS.add(new Truco("2750ooxbUM4", "Flat top","Longboard",R.drawable.flat_top));
        TAREAS.add(new Truco("o-K0Y-yfPjM", "Ghostride kickflip","Longboard",R.drawable.ghostride_kickflip)); //cambiar video
        TAREAS.add(new Truco("wU26njmPuZE", "Footbrake","Longboard",R.drawable.footbrake));
        TAREAS.add(new Truco("wU26njmPuZE", "Turndown","BMX",R.drawable.turndown));
        TAREAS.add(new Truco("wU26njmPuZE", "Footjam","BMX",R.drawable.footjam));
        TAREAS.add(new Truco("wU26njmPuZE", "360 bunny hop ","BMX",R.drawable.bunny_hop));


        bmxTricks.add(new Truco("wU26njmPuZE", "Turndown","BMX",R.drawable.turndown));
        bmxTricks.add(new Truco("wU26njmPuZE", "Footjam","BMX",R.drawable.footjam));
        bmxTricks.add(new Truco("wU26njmPuZE", "360 bunny hop ","BMX",R.drawable.bunny_hop));

        longboardTricks.add(new Truco("oqIdEKzqPh0", "Shove it","Longboard",R.drawable.shove_it));
        longboardTricks.add(new Truco("Mmjbaa5Q4Dk", "Kickflip","Longboard",R.drawable.kickflip));
        longboardTricks.add(new Truco("2750ooxbUM4", "Flat top","Longboard",R.drawable.flat_top));
        longboardTricks.add(new Truco("o-K0Y-yfPjM", "Ghostride kickflip","Longboard",R.drawable.ghostride_kickflip));
        longboardTricks.add(new Truco("wU26njmPuZE", "Footbrake","Longboard",R.drawable.footbrake));

        skateTricks.add(new Truco("oqIdEKzqPh0", "Shove it","Skate",R.drawable.app_logo));
        skateTricks.add(new Truco("Mmjbaa5Q4Dk", "Kickflip","Skate",R.drawable.app_logo));
        skateTricks.add(new Truco("2750ooxbUM4", "Flat top","Skate",R.drawable.app_logo));
        skateTricks.add(new Truco("o-K0Y-yfPjM", "Ghostride kickflip","Skate",R.drawable.app_logo));
        skateTricks.add(new Truco("wU26njmPuZE", "Footbrake","Skate",R.drawable.app_logo));

        skiTricks.add(new Truco("oqIdEKzqPh0", "Shove it","Ski",R.drawable.app_logo));
        skiTricks.add(new Truco("Mmjbaa5Q4Dk", "Kickflip","Ski",R.drawable.app_logo));
        skiTricks.add(new Truco("2750ooxbUM4", "Flat top","Ski",R.drawable.app_logo));
        skiTricks.add(new Truco("o-K0Y-yfPjM", "Ghostride kickflip","Ski",R.drawable.app_logo));
        skiTricks.add(new Truco("wU26njmPuZE", "Footbrake","Ski",R.drawable.app_logo));

        snowboardTricks.add(new Truco("oqIdEKzqPh0", "Shove it","Snowboard",R.drawable.app_logo));
        snowboardTricks.add(new Truco("Mmjbaa5Q4Dk", "Kickflip","Snowboard",R.drawable.app_logo));
        snowboardTricks.add(new Truco("2750ooxbUM4", "Flat top","Snowboard",R.drawable.app_logo));
        snowboardTricks.add(new Truco("o-K0Y-yfPjM", "Ghostride kickflip","Snowboard",R.drawable.app_logo));
        snowboardTricks.add(new Truco("wU26njmPuZE", "Footbrake","Snowboard",R.drawable.app_logo));

        surfTricks.add(new Truco("oqIdEKzqPh0", "Shove it","Surf",R.drawable.app_logo));
        surfTricks.add(new Truco("Mmjbaa5Q4Dk", "Kickflip","Surf",R.drawable.app_logo));
        surfTricks.add(new Truco("2750ooxbUM4", "Flat top","Surf",R.drawable.app_logo));
        surfTricks.add(new Truco("o-K0Y-yfPjM", "Ghostride kickflip","Surf",R.drawable.app_logo));
        surfTricks.add(new Truco("wU26njmPuZE", "Footbrake","Surf",R.drawable.app_logo));
    }

}
