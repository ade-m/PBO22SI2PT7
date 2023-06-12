import model.Engine;
import model.Mobil;

public class App {
    public static void main(String[] args) throws Exception {
        Mobil mobil = new Mobil();
        Engine engine = new Engine();
        Engine engine2 = new Engine();
        mobil.setEngine(engine2);
        mobil.start();
        mobil.start();
        mobil.stop();
    }
}
