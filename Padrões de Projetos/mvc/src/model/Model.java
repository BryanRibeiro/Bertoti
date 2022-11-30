package model;

import java.util.ArrayList;
import java.util.List;

import model.entity.Musica;

public class Model {
    
    private static Model instance;
    private List<Musica> musicas = new ArrayList<>();    

    public Model(){}

    public static Model getInstance(){
        if(instance == null){
            instance = new Model();
        }
        return instance;
    }

    public void addMusica(Musica musica){
        this.musicas.add(musica);
    }

    public List<Musica> listMusica(){
        return this.musicas;
    }

}
