package kqz.stackingitems.Blocks;

import kqz.stackingitems.Item.SetName;
import kqz.stackingitems.Item.SetValue;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryPickupItemEvent;

public class HopperCollectItem implements Listener {
    @EventHandler
    public void BlockCollectItem (InventoryPickupItemEvent I) {
        Item CollectedItem = I.getItem();
        String CollectedItemAmountString = "";
        for(int j = 6 ; j < CollectedItem.getCustomName().length(); j++){
            if (CollectedItem.getCustomName().charAt(j) == ' ') {
                break;
            }
            CollectedItemAmountString = CollectedItemAmountString + CollectedItem.getCustomName().charAt(j);
        }
        int CollectedItemAmount = Integer.parseInt(CollectedItemAmountString);
        if (CollectedItemAmount >= CollectedItem.getItemStack().getMaxStackSize()) {
            I.setCancelled(true);
            //System.out.println("Test 1 pass;");
            if (I.getInventory().firstEmpty() != -1) {
                int Itemleft = CollectedItemAmount - CollectedItem.getItemStack().getMaxStackSize();
                I.getInventory().addItem(CollectedItem.getItemStack());
                new SetName().setName(CollectedItem, Itemleft);
                new SetValue().setItemValue(CollectedItem, Itemleft);
            } else {
                int ItemInInventory = new GetItemInHopper().getAmountHopper(I.getInventory(), CollectedItem.getItemStack());
                ItemInInventory = ItemInInventory % CollectedItem.getItemStack().getMaxStackSize();
                I.getInventory().addItem(CollectedItem.getItemStack());
                int Itemleft = CollectedItemAmount - ItemInInventory;
                new SetName().setName(CollectedItem, Itemleft);
                new SetValue().setItemValue(CollectedItem, Itemleft);
            }
        } else {
            int Itemleft = CollectedItem.getItemStack().getAmount();
            new SetName().setName(CollectedItem, Itemleft);
            new SetValue().setItemValue(CollectedItem, Itemleft);
        }
    }
}
