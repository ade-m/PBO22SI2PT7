import model.Engine;
import model.Mobil;

public class App {
    public static void main(String[] args) throws Exception {
        Mobil mobil = new Mobil();

        mobil.start();
        mobil.start();
        mobil.stop();
    }
}
