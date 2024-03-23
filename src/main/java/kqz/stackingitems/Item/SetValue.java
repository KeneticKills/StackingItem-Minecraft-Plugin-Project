package kqz.stackingitems.Item;

import org.bukkit.entity.Item;

public class SetValue{
    public void setItemValue(Item target , int value){
        int Limit = target.getItemStack().getMaxStackSize();
        if (value < Limit) target.getItemStack().setAmount(value);
        else if (value >= Limit) target.getItemStack().setAmount(Limit);

    }
}
