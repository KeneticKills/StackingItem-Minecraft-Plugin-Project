package kqz.stackingitems.Entity;

import kqz.stackingitems.Item.GetType;
import kqz.stackingitems.Item.SetName;
import kqz.stackingitems.Item.SetValue;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.event.world.EntitiesLoadEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Objects;

public class EntityCollectItem implements Listener {
    private final Plugin plugin;

    public EntityCollectItem(Plugin plugin){
        this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void CollectItem(EntityPickupItemEvent Pick){
        Item CollectedItem = Pick.getItem();
        //int CollectedItemAmount = CollectedItem.getItemStack().getAmount();
        LivingEntity e = Pick.getEntity();
        //if (CollectedItemAmount >= CollectedItem.getItemStack().getMaxStackSize()) {
            StringBuilder CollectedItemAmountString = new StringBuilder();
            if (CollectedItem.getCustomName() == null){
                CollectedItemAmountString = new StringBuilder("0");
            }
            for(int j = 6 ; j < CollectedItem.getCustomName().length(); j++){
                if (CollectedItem.getCustomName().charAt(j) == ' ') {
                    break;
                }
                CollectedItemAmountString.append(CollectedItem.getCustomName().charAt(j));
            }
            int CollectedItemAmount = Integer.parseInt(CollectedItemAmountString.toString());
        //}
        //new SetValue().setItemValue(CollectedItem, CollectedItemAmount);
        if(e instanceof Player) {
            //System.out.println("Item Amount : " + CollectedItemAmount);
            Player P = (Player) e;
            if (CollectedItemAmount >= CollectedItem.getItemStack().getMaxStackSize()) {
                Pick.setCancelled(true);
                if (P.getInventory().firstEmpty() != -1) {
                    int Itemleft = CollectedItemAmount - CollectedItem.getItemStack().getMaxStackSize();
                    new SetName().setName(CollectedItem, Itemleft);
                    new SetValue().setItemValue(CollectedItem, Itemleft);
                    P.getInventory().addItem(CollectedItem.getItemStack());
                } else {
                    int ItemInInventory = new GetItemInInventory().getAmount(P, CollectedItem.getItemStack());
                    ItemInInventory = ItemInInventory % CollectedItem.getItemStack().getMaxStackSize();
                    int Itemleft = CollectedItemAmount - (CollectedItem.getItemStack().getMaxStackSize()-ItemInInventory);
                    new SetName().setName(CollectedItem, Itemleft);
                    new SetValue().setItemValue(CollectedItem, Itemleft);
                    P.getInventory().addItem(CollectedItem.getItemStack());
                }
            } else {
                int Itemleft = Pick.getRemaining();
                new SetName().setName(CollectedItem, Itemleft);
                new SetValue().setItemValue(CollectedItem, Itemleft);
            }
        }
        else if(e instanceof Villager){
            Villager V = (Villager) e;
            if (CollectedItemAmount >= CollectedItem.getItemStack().getMaxStackSize()) {
                Pick.setCancelled(true);
                if(V.getInventory().firstEmpty() != -1) {
                    int Itemleft = CollectedItemAmount - CollectedItem.getItemStack().getMaxStackSize();
                    V.getInventory().addItem(CollectedItem.getItemStack());
                    new SetName().setName(CollectedItem, Itemleft);
                    new SetValue().setItemValue(CollectedItem, Itemleft);
                }
                else{
                    int ItemInInventory = new GetItemInInventory().getAmountVillager(V,CollectedItem.getItemStack());
                    ItemInInventory = ItemInInventory % CollectedItem.getItemStack().getMaxStackSize();
                    V.getInventory().addItem(CollectedItem.getItemStack());
                    int Itemleft = CollectedItemAmount - (CollectedItem.getItemStack().getMaxStackSize()-ItemInInventory);
                    new SetName().setName(CollectedItem, Itemleft);
                    new SetValue().setItemValue(CollectedItem, Itemleft);
                }
            }
            else{
                Pick.setCancelled(true);
                if(V.getInventory().firstEmpty() != -1) {
                    int Itemleft = CollectedItemAmount - CollectedItem.getItemStack().getMaxStackSize();
                    V.getInventory().addItem(CollectedItem.getItemStack());
                    new SetName().setName(CollectedItem, Itemleft);
                    new SetValue().setItemValue(CollectedItem, Itemleft);
                }
                else{
                    int ItemInInventory = new GetItemInInventory().getAmountVillager(V,CollectedItem.getItemStack());
                    ItemInInventory = ItemInInventory % CollectedItem.getItemStack().getMaxStackSize();
                    V.getInventory().addItem(CollectedItem.getItemStack());
                    int Itemleft = CollectedItemAmount - (CollectedItem.getItemStack().getMaxStackSize()-ItemInInventory);
                    new SetName().setName(CollectedItem, Itemleft);
                    new SetValue().setItemValue(CollectedItem, Itemleft);
                }
            }
        }
        else if(e instanceof Allay){
            Allay allay = (Allay) e;
            if (CollectedItemAmount >= CollectedItem.getItemStack().getMaxStackSize()) {
                Pick.setCancelled(true);
                if(allay.getInventory().firstEmpty() != -1) {
                    int Itemleft = CollectedItemAmount - CollectedItem.getItemStack().getMaxStackSize();
                    allay.getInventory().addItem(CollectedItem.getItemStack());
                    new SetName().setName(CollectedItem, Itemleft);
                    new SetValue().setItemValue(CollectedItem, Itemleft);
                }
                else{
                    int ItemInInventory = new GetItemInInventory().getAmountAllay(allay,CollectedItem.getItemStack());
                    ItemInInventory = ItemInInventory % CollectedItem.getItemStack().getMaxStackSize();
                    allay.getInventory().addItem(CollectedItem.getItemStack());
                    int Itemleft = CollectedItemAmount - (CollectedItem.getItemStack().getMaxStackSize()-ItemInInventory);
                    new SetName().setName(CollectedItem, Itemleft);
                    new SetValue().setItemValue(CollectedItem, Itemleft);
                }
            }
            else{
                Pick.setCancelled(true);
                if(allay.getInventory().firstEmpty() != -1) {
                    int Itemleft = CollectedItemAmount - CollectedItem.getItemStack().getMaxStackSize();
                    allay.getInventory().addItem(CollectedItem.getItemStack());
                    new SetName().setName(CollectedItem, Itemleft);
                    new SetValue().setItemValue(CollectedItem, Itemleft);
                }
                else{
                    int ItemInInventory = new GetItemInInventory().getAmountAllay(allay,CollectedItem.getItemStack());
                    ItemInInventory = ItemInInventory % CollectedItem.getItemStack().getMaxStackSize();
                    allay.getInventory().addItem(CollectedItem.getItemStack());
                    int Itemleft = CollectedItemAmount - (CollectedItem.getItemStack().getMaxStackSize()-ItemInInventory);
                    new SetName().setName(CollectedItem, Itemleft);
                    new SetValue().setItemValue(CollectedItem, Itemleft);
                }
            }
        }
        else if(e instanceof Piglin){
            if(CollectedItemAmount > 1){
                new BukkitRunnable(){
                    @Override
                    public void run() {
                        int Itemleft = CollectedItemAmount-1;
                        new SetName().setName(CollectedItem, Itemleft);
                        new SetValue().setItemValue(CollectedItem, Itemleft);
                    }
                }.runTaskLater(plugin,5);
                return;
            }
            new SetName().setName(CollectedItem, 0);
        }
        else {
            if (CollectedItemAmount >= CollectedItem.getItemStack().getMaxStackSize()) {
                Pick.setCancelled(true);
                Objects.requireNonNull(e.getEquipment()).getItemInMainHand();
                int ItemInInventory = e.getEquipment().getItemInMainHand().getAmount();
                ItemInInventory = ItemInInventory % CollectedItem.getItemStack().getMaxStackSize();
                GetType type = new GetType();
                if (type.isArmor(CollectedItem.getItemStack().getType())) {
                    if (type.isHelmet(CollectedItem.getItemStack().getType())) e.getEquipment().setHelmet(CollectedItem.getItemStack());
                    if (type.isChestplate(CollectedItem.getItemStack().getType())) e.getEquipment().setChestplate(CollectedItem.getItemStack());
                    if (type.isLeggings(CollectedItem.getItemStack().getType())) e.getEquipment().setLeggings(CollectedItem.getItemStack());
                    if (type.isBoots(CollectedItem.getItemStack().getType())) e.getEquipment().setBoots(CollectedItem.getItemStack());
                }
                else if(type.isShield(CollectedItem.getItemStack().getType())){
                    e.getEquipment().setItemInOffHand(CollectedItem.getItemStack());
                }
                else{
                    e.getEquipment().setItemInMainHand(CollectedItem.getItemStack());
                }
                int Itemleft = CollectedItemAmount - (CollectedItem.getItemStack().getMaxStackSize()-ItemInInventory);
                new SetName().setName(CollectedItem, Itemleft);
                new SetValue().setItemValue(CollectedItem, Itemleft);
            }
            else{
                int Itemleft = Pick.getRemaining();
                new SetName().setName(CollectedItem, Itemleft);
                new SetValue().setItemValue(CollectedItem, Itemleft);
            }
        }
    }
}
