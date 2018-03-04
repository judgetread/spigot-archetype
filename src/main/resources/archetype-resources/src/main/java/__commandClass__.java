#set( $symbol_dollar = '$' )
package ${package};

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/** 
 * 
 * @author: 
 * @date: 
 * @encoding: 
 */
public class ${commandClass} implements CommandExecutor {

    private static ${mainClass} plugin = ${mainClass}.getPlugin();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

    if (!(sender instanceof Player)) return false;

    return false;
    
    }

}
