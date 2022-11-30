import controller.MusicaController;
import model.entity.Musica;
import view.MusicaView;

public class App {
    public static void main(String[] args) throws Exception {
        MusicaView view = new MusicaView();
        MusicaController controller = new MusicaController(view);
        controller.add(new Musica("teste", 12));
        controller.add(new Musica("teste1", 14));
        controller.add(new Musica("teste2", 16));
        controller.list();
    }
}
