package Magnet.api;

import Magnet.api.mechaniks.implementation;
import Magnet.api.versions.Listener1_8_R3;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {

    @Override
    public void onEnable() {
        try {
            onLoad();
        }catch (Exception e){

        }
    }

    @Override
    public void onDisable() {

    }

    @Override
    public void onLoad() {

        Manager();

    }
    public void Manager(){
        if(setupManager()){
            Bukkit.getConsoleSender().sendMessage("§bimports §aloaded");
        }else {
            Bukkit.getConsoleSender().sendMessage("§bimports load §4ERROR");
        }
    }
    public void testingapi(){

        imports.damage(false);

    }

    public boolean setupManager(){
        try {
            Bukkit.getConsoleSender().sendMessage(implementation.version);
        }catch (Exception e){
            return false;
        }
        if(implementation.version.equals("v1_8_R3")) {
            new Listener1_8_R3();
            Bukkit.getPluginManager().registerEvents(new Listener1_8_R3(),this);
            return true;
        }
        return false;
    }

}
