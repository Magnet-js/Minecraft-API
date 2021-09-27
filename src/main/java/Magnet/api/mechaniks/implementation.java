package Magnet.api.mechaniks;

import org.bukkit.Bukkit;

public class implementation {

    public static String a = Bukkit.getServer().getClass().getPackage().getName();
    public static String version = a.substring(a.lastIndexOf('.') + 1);
}
