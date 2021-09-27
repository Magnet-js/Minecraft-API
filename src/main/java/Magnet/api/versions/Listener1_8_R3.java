package Magnet.api.versions;


import Magnet.api.imports;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.weather.WeatherChangeEvent;


public class Listener1_8_R3 implements Listener {

    @EventHandler
    public void onDamage(EntityDamageEvent e) {
        if(imports.damage){
            e.setCancelled(false);
        }else{
            e.setCancelled(true);
        }
    }
    public void onRain(WeatherChangeEvent e) {
        if(imports.freezeWeather){
            e.setCancelled(true);
        }else{
            e.setCancelled(false);
        }
    }
}
