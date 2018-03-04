#set( $symbol_dollar = '$' )
package ${package};

import java.util.logging.Logger;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Create documentation!
 */
public class ${mainClass} extends JavaPlugin {

    private static ${mainClass} plugin;

    @Override
    public void onEnable()
    {
       plugin = this;

       plugin.getCommand("${commandName}").setExecutor(new ${commandClass}());
       Bukkit.getPluginManager().registerEvents(new ${listenerClass}(), plugin);
    }

    /**
     * Plugins instance.
     */
    public static ${mainClass} getPlugin(){
        return plugin;
    }

}
