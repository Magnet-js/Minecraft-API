package Magnet.api.cmd;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class apicmd implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        sender.sendMessage("§6----------ZipeAPI----------\n§aThis is a API (Application Programming Interface)\nfor Minecraft developer\n§bWebsite:\ncoming soon...");
        return false;
    }
}
