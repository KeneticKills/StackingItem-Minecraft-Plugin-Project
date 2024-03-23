package kqz.stackingitems.Blocks;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class GetItemInHopper {

    public int getAmountHopper(Inventory I, ItemStack item){
        if (item == null)
            return 0;
        int amount = 0;
        for (int i = 0; i < 5; i++) {
            ItemStack slot = I.getItem(i);
            if (slot == null || !slot.isSimilar(item))
                continue;
            amount += slot.getAmount();
        }
        return amount;
    }
}
