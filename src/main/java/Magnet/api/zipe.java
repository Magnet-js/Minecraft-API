package Magnet.api;

import Magnet.api.mechaniks.implementation;
import Magnet.api.versions.Listener1_8_R3;
import org.bukkit.Bukkit;

public class zipe {

    //Booleans
    public static boolean damage;
    public static boolean freezeWeather;
    public static boolean hunger;
    public static boolean drop;


    //Boolean Method



    public static void damage(boolean bool){
        if(bool){
            damage = true;
        }else{
            damage = false;
        }
    }
    public static void freezeWeather(boolean bool){
        if(bool){
            freezeWeather = true;
        }else{
            freezeWeather = false;
        }
    }
    public static void hunger(boolean bool){
        if(bool){
            hunger = true;
        }else{
            hunger = false;
        }
    }
    public static void drop(boolean bool){
        if(bool){
            drop = true;
        }else{
            drop = false;
        }
    }


}
