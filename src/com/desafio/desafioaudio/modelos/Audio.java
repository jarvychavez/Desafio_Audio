package com.desafio.desafioaudio.modelos;

public class Audio {
    private String titulo;
    private int totalDeLasReproducciones;
    private int totalDeMeGusta;
    private int clasificacion;

    public void meGusta(){
        this.totalDeMeGusta++;

    }

    public void reproduce(){
        this.totalDeLasReproducciones++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeLasReproducciones() {
        return totalDeLasReproducciones;
    }

    public void setTotalDeLasReproducciones(int totalDeLasReproducciones) {
        this.totalDeLasReproducciones = totalDeLasReproducciones;
    }

    public int getTotalDeMeGusta() {
        return totalDeMeGusta;
    }

    public void setTotalDeMeGusta(int totalDeMeGusta) {
        this.totalDeMeGusta = totalDeMeGusta;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }
}

