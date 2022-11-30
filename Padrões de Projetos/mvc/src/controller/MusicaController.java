package controller;

import model.Model;
import model.entity.Musica;
import view.MusicaView;

public class MusicaController {

    private MusicaView view;
    private Model model = Model.getInstance();

    public MusicaController(MusicaView view){
        this.view = view;
    }

    public void add(Musica musica){
        model.addMusica(musica);
        view.update("Nova música adicionada");
    }

    public void list(){
        final StringBuilder builder = new StringBuilder();
        model.listMusica().forEach(m->{
            builder.append(m.getNome()+"("+m.getSegundos()+"s)\n");
        });;
        String res = builder.toString();
        view.update(res);
    }



}
