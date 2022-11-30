package model.entity;

import model.EntityObserver;

public class Musica implements EntityObserver{
    
    private String nome;
    private Integer segundos;

    public Musica(String nome, Integer segundos){
        this.nome = nome;
        this.segundos = segundos;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getSegundos() {
        return segundos;
    }
    public void setSegundos(Integer segundos) {
        this.segundos = segundos;
    }

    

}
