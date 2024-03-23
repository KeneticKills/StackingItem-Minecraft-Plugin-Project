package kqz.stackingitems.Item;

import kqz.stackingitems.Events.ItemMovement;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ItemSpawnEvent;

import java.util.List;

public class OverStack implements Listener {

    @EventHandler(priority = EventPriority.MONITOR)
    public void DetectItemAround1(ItemMovement item){
        if(item == null || item.getEntity().getItemStack().getType().equals(Material.AIR)){
            return;
        }
        double Radius = 2.5;
        Item EntityItem = item.getEntity();
        SetName ItemName = new SetName();
        SetValue ItemValue = new SetValue();
        List<Entity> nearbyEntity = EntityItem.getNearbyEntities(Radius,Radius,Radius);
        for(int i = 0; i < nearbyEntity.size() ; i++) {
            Entity SortedNearbyEntity = nearbyEntity.get(i);
            if (SortedNearbyEntity.getType() == EntityType.DROPPED_ITEM) {
                Item AroundItem = (Item) SortedNearbyEntity;
                if (new SameStat().StatCheck(AroundItem, EntityItem)) {
                    int FirstItem = EntityItem.getItemStack().getAmount();
                    int SecondItem = AroundItem.getItemStack().getAmount();
                    if (FirstItem >= EntityItem.getItemStack().getMaxStackSize()) {
                        String FirstItemAmount = "";
                        for (int j = 6; j < EntityItem.getCustomName().length(); j++) {
                            if (EntityItem.getCustomName().charAt(j) == ' ') {
                                break;
                            }
                            FirstItemAmount = FirstItemAmount + EntityItem.getCustomName().charAt(j);
                        }
                        FirstItem = Integer.parseInt(FirstItemAmount);
                    }
                    if (SecondItem >= AroundItem.getItemStack().getMaxStackSize()) {
                        String SecondItemAmount = "";
                        for (int j = 6; j < AroundItem.getCustomName().length(); j++) {
                            if (AroundItem.getCustomName().charAt(j) == ' ') {
                                break;
                            }
                            SecondItemAmount = SecondItemAmount + AroundItem.getCustomName().charAt(j);
                        }
                        SecondItem = Integer.parseInt(SecondItemAmount);
                    }
                    int MergeItem = FirstItem + SecondItem;
                    AroundItem.getItemStack().setAmount(0);
                    ItemName.setName(EntityItem, MergeItem);
                    ItemValue.setItemValue(EntityItem, MergeItem);
                }
            }

        }

    }

    @EventHandler(priority = EventPriority.HIGH)
    public void DetectItemAround2(ItemSpawnEvent item){
        if(item == null || item.getEntity().getItemStack().getType().equals(Material.AIR)){
            return;
        }
        double Radius = 2.5;
        Item EntityItem = item.getEntity();
        SetName ItemName = new SetName();
        SetValue ItemValue = new SetValue();
        List<Entity> nearbyEntity = EntityItem.getNearbyEntities(Radius,Radius,Radius);
        for(int i = 0; i < nearbyEntity.size() ; i++) {
            Entity SortedNearbyEntity = nearbyEntity.get(i);
            if (SortedNearbyEntity.getType() == EntityType.DROPPED_ITEM) {
                Item AroundItem = (Item) SortedNearbyEntity;
                if (new SameStat().StatCheck(AroundItem, EntityItem)) {
                    int FirstItem = EntityItem.getItemStack().getAmount();
                    int SecondItem = AroundItem.getItemStack().getAmount();
                    if (FirstItem >= EntityItem.getItemStack().getMaxStackSize()) {
                        String FirstItemAmount = "";
                        for (int j = 6; j < EntityItem.getCustomName().length(); j++) {
                            if (EntityItem.getCustomName().charAt(j) == ' ') {
                                break;
                            }
                            FirstItemAmount = FirstItemAmount + EntityItem.getCustomName().charAt(j);
                        }
                        FirstItem = Integer.parseInt(FirstItemAmount);
                    }
                    if (SecondItem >= AroundItem.getItemStack().getMaxStackSize()) {
                        String SecondItemAmount = "";
                        for (int j = 6; j < AroundItem.getCustomName().length(); j++) {
                            if (AroundItem.getCustomName().charAt(j) == ' ') {
                                break;
                            }
                            SecondItemAmount = SecondItemAmount + AroundItem.getCustomName().charAt(j);
                        }
                        SecondItem = Integer.parseInt(SecondItemAmount);
                    }
                    int MergeItem = FirstItem + SecondItem;
                    AroundItem.getItemStack().setAmount(0);
                    ItemName.setName(EntityItem, MergeItem);
                    ItemValue.setItemValue(EntityItem, MergeItem);
                }
            }

        }

    }

}
