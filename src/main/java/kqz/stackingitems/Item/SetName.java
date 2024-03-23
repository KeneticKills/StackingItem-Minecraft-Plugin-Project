package kqz.stackingitems.Item;

import org.bukkit.ChatColor;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityChangeBlockEvent;
import org.bukkit.event.entity.ItemMergeEvent;
import org.bukkit.event.entity.ItemSpawnEvent;
import sun.jvmstat.monitor.AbstractMonitor;

public class SetName implements Listener {

    @EventHandler
    public void setItemNameSpawn(ItemSpawnEvent itemSpawn){
        Item item = itemSpawn.getEntity();
        int itemAmount = item.getItemStack().getAmount();
        setName(item,itemAmount);
    }

    @EventHandler
    public void CancelledItemMerge(ItemMergeEvent itemMerge){
        itemMerge.setCancelled(true);
    }

    public void setName(Item item,int Amount){
        String itemAmount = Integer.toString(Amount);
        String itemname = item.getName();
        item.setCustomName("");
        if(item.getItemStack().getItemMeta() != null) {
            if (item.getItemStack().getItemMeta().hasDisplayName()) {
                itemname = item.getItemStack().getItemMeta().getDisplayName();
            } else {
                itemname = item.getName();
            }
        }
        item.setCustomName(ChatColor.BOLD + "" + ChatColor.RED + "➤" + ChatColor.YELLOW + "x" + itemAmount + " " + ChatColor.BOLD + "" + ChatColor.WHITE + itemname);
        item.setCustomNameVisible(true);
    }

}
