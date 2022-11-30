package view;

public class MusicaView implements ViewObserver{

    @Override
    public void update(String data) {
        System.out.println(data);
    }
    
}
