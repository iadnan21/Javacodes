package com.adnan.javainterfaces;

public class Coolcar {
    private Engine engine;
    private Musicplayer player = new Musicplayer();
    public Coolcar(){
        engine = new PowerEngine();
    }
    public Coolcar(Engine engine) {
        this.engine = engine;
    }
    void start(){
        engine.start();
    }
    void stop(){
        engine.stop();
    }
    void startmusic(){
        player.start();
    }
    void stopmusic(){
        player.stop();
    }
    void upgradeengine(){
        this.engine = new ElectricEngine();
    }
}
