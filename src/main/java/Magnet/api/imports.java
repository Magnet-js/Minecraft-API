package Magnet.api;

import Magnet.api.versions.Listener1_8_8_RO_1;
import org.bukkit.Bukkit;

public class imports {

    //Booleans
    public static boolean damage;
    public static boolean freezeWeather;
    public static boolean hunger;
    public static boolean drop;
    public static String sversion = "N/A";


    //Boolean Method

    public static boolean setupManager(){
        try {
            sversion = Bukkit.getServer().getClass().getPackage().getName().split("\\.")[3];
        }catch (ArrayIndexOutOfBoundsException e){
            return false;
        }
        if(sversion.equals("v1_8_8_R1")) {
            new Listener1_8_8_RO_1();
            return true;
        }
        return false;
    }

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
