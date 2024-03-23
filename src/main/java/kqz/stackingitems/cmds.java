package kqz.stackingitems;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class cmds implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender,Command cmd1,String label,String[] args) {
        if(sender instanceof  Player){
            if(cmd1.getName().equals("stackingitems")){
                Player p = (Player)sender;
                if(args.length > 0){
                    if (args[0].equals("help")) {
                        p.sendMessage(ChatColor.RED+"There is no another command now. Thanks.");
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }
}
