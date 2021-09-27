package Magnet.api;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.concurrent.ExecutionException;

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
        if(imports.setupManager()){
            Bukkit.getConsoleSender().sendMessage("§bimports §aloaded");
        }else {
            Bukkit.getConsoleSender().sendMessage("§bimports load §4ERROR");
        }
    }
}
