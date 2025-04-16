package com.desafio.desafioaudio.principal;

import com.desafio.desafioaudio.modelos.Cancion;
import com.desafio.desafioaudio.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");

        Podcast miPosdcast = new Podcast();
        miPosdcast.setPresentador("Gabriela Aguilar");
        miPosdcast.setTitulo("Cafe.Tech");

        for (int i = 0; i < 100 ; i++) {
            miCancion.meGusta();

        }
        for (int i = 0; i < 5000 ; i++) {
            miCancion.reproduce();
        }

        System.out.println("Total de reproducciones: " + miCancion.getTotalDeLasReproducciones());
        System.out.println("Total de me gusta: " + miCancion.getTotalDeMeGusta());

        for (int i = 0; i < 200 ; i++) {
            miPosdcast.meGusta();
        }

        for (int i = 0; i < 600 ; i++) {
            miPosdcast.reproduce();
        }
        System.out.println("Reproducciones en total: " + miPosdcast.getTotalDeLasReproducciones());
        System.out.println("Los me gusta en total: " + miPosdcast.getTotalDeMeGusta());
    }
}
