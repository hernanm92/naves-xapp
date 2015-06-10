package com.xapp.naves.xapp;

/**
 * Created by hmaschwitz on 6/6/15.
 */
public class Tarea{

    private String id;
    private String nombre;
    private String hora;
    private int categoria;

    public Tarea(String id, String nombre, String hora, int categoria){
        this.id = id;
        this.nombre = nombre;
        this.hora = hora;
        this.categoria = categoria;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setHora(String hora){
        this.hora = hora;
    }

    public void setCategoria(int categoria){
        this.categoria=categoria;
    }

    public String getId(){return id;} //es parte de la clase, pero no necesito mostrarlo en la vista
    public String getNombre(){return nombre;}
    public String getHora(){return hora;}
    public int getCategoria(){return categoria;}

}
