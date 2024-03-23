package kqz.stackingitems.Events;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ItemSpawnEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

import static org.bukkit.Bukkit.getServer;

public class RunItemEvent implements Listener {

    static Plugin Plugin;

    public void Run(Plugin Plugin){
        RunItemEvent.Plugin = Plugin;
    }

    @EventHandler
    public void ItemMovementDetect(ItemSpawnEvent itemspawn){
        if (itemspawn.getEntity().getItemStack().getType().equals(Material.AIR)){
            return;
        }
        new BukkitRunnable() {
            Location oldlocation = itemspawn.getLocation();

            @Override
            public void run() {
                Item itementity = itemspawn.getEntity();
                Location newlocation = itemspawn.getLocation();
                boolean e = itemspawn.getEntity().isValid();
                if (e) {
                    if (!(oldlocation.equals(newlocation))) {
                        getServer().getPluginManager().callEvent(new ItemMovement(itementity, oldlocation, newlocation));
                        this.oldlocation = itemspawn.getLocation();
                    }
                } else {
                    cancel();
                }
            }
        }.runTaskTimer(Plugin, 0L, 1L);
    }
}
