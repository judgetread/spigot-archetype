#set( $symbol_dollar = '$' )
package ${package};

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/** 
 * 
 * @author: 
 * @date: 
 * @encoding: 
 */
public class ${listenerClass} implements Listener {

    private static ${mainClass} plugin = ${mainClass}.getPlugin();

    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent event) {
		
    }

}
