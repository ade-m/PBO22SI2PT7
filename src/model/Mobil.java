package model;

public class Mobil {
    private String merkEngine;
    private int status;

    public Mobil() {
    }

    public void start(){
       
    }
    public void stop(){
       
    }
    public void run(){
        System.out.println("Mobil berjalan");
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMerkEngine() {
        return this.merkEngine;
    }

    public void setMerkEngine(String merkEngine) {
        this.merkEngine = merkEngine;
    }
    
}
