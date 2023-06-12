package model;

public class Mobil {
    private Engine engine;
    private int status;

    public Mobil() {
    }

    public Mobil(Engine engine, int status) {
        this.engine = engine;
        this.status = status;
    }

    public void start(){
        engine.on();
    }
    public void stop(){
        engine.off();
    }
    public void run(){
        System.out.println("Mobil berjalan");
    }

    public Engine getEngine() {
        return this.engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
}
