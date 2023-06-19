import model.Engine;
import model.Mobil;
import model.SUV;
import model.Sedan;

public class App {
    public static void main(String[] args) throws Exception {
        Mobil mobil = new Mobil();
        mobil.setMerkEngine("abc");
        mobil.start();
        mobil.start();
        mobil.stop();
        Sedan vios = new Sedan();
        vios.start();
        SUV hrv = new SUV();
        hrv.start();
        Mobil mobil2 = new Sedan();
        Mobil mobil3 = new SUV();


    }
}
