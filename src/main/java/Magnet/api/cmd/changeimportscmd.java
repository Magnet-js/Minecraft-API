package Magnet.api.cmd;

import Magnet.api.imports;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class changeimportscmd implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        //if(args.length == 2){
        if(args[0].equals("damage")){
            if(args[1].equals("true")){
                imports.damage(true);
                sender.sendMessage("true");
            }else if (args[1].equals("false")){
                imports.damage(false);
                sender.sendMessage("false");
            }
            sender.sendMessage("22");
        }
      //  }
        return false;

    }
}
