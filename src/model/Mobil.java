package model;

public class Mobil {
    private int status;

    public void start(Engine e){
        e.on();
    }
    public void stop(Engine e){
        e.off();
    }
    public void run(){
        System.out.println("Mobil berjalan");
    }
}
