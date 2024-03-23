package kqz.stackingitems.Item;

import org.bukkit.Material;

public class GetType {
    public boolean isArmor(Material Item){
        //Head
        if(Item.equals(Material.CHAINMAIL_HELMET)) return true;
        else if(Item.equals(Material.DIAMOND_HELMET)) return true;
        else if(Item.equals(Material.GOLDEN_HELMET)) return true;
        else if(Item.equals(Material.IRON_HELMET)) return true;
        else if(Item.equals(Material.LEATHER_HELMET)) return true;
        else if(Item.equals(Material.NETHERITE_HELMET)) return true;
        else if(Item.equals(Material.TURTLE_HELMET)) return true;
        else if(Item.equals(Material.CARVED_PUMPKIN)) return true;
        //Chest
        else if(Item.equals(Material.CHAINMAIL_CHESTPLATE)) return true;
        else if(Item.equals(Material.DIAMOND_CHESTPLATE)) return true;
        else if(Item.equals(Material.GOLDEN_CHESTPLATE)) return true;
        else if(Item.equals(Material.IRON_CHESTPLATE)) return true;
        else if(Item.equals(Material.LEATHER_CHESTPLATE)) return true;
        else if(Item.equals(Material.NETHERITE_CHESTPLATE)) return true;
        //Legs
        else if(Item.equals(Material.CHAINMAIL_LEGGINGS)) return true;
        else if(Item.equals(Material.DIAMOND_LEGGINGS)) return true;
        else if(Item.equals(Material.GOLDEN_LEGGINGS)) return true;
        else if(Item.equals(Material.IRON_LEGGINGS)) return true;
        else if(Item.equals(Material.LEATHER_LEGGINGS)) return true;
        else if(Item.equals(Material.NETHERITE_LEGGINGS)) return true;
        //foots
        else if(Item.equals(Material.CHAINMAIL_BOOTS)) return true;
        else if(Item.equals(Material.DIAMOND_BOOTS)) return true;
        else if(Item.equals(Material.GOLDEN_BOOTS)) return true;
        else if(Item.equals(Material.IRON_BOOTS)) return true;
        else if(Item.equals(Material.LEATHER_BOOTS)) return true;
        else return Item.equals(Material.NETHERITE_BOOTS);
    }

    public boolean isShield(Material Item){
        return Item.equals(Material.SHIELD);
    }

    public boolean isHelmet(Material Item){
        if(Item.equals(Material.CHAINMAIL_HELMET)) return true;
        else if(Item.equals(Material.DIAMOND_HELMET)) return true;
        else if(Item.equals(Material.GOLDEN_HELMET)) return true;
        else if(Item.equals(Material.IRON_HELMET)) return true;
        else if(Item.equals(Material.LEATHER_HELMET)) return true;
        else if(Item.equals(Material.NETHERITE_HELMET)) return true;
        else if(Item.equals(Material.TURTLE_HELMET)) return true;
        else return Item.equals(Material.CARVED_PUMPKIN);
    }
    public boolean isChestplate(Material Item){
        if(Item.equals(Material.CHAINMAIL_CHESTPLATE)) return true;
        else if(Item.equals(Material.DIAMOND_CHESTPLATE)) return true;
        else if(Item.equals(Material.GOLDEN_CHESTPLATE)) return true;
        else if(Item.equals(Material.IRON_CHESTPLATE)) return true;
        else if(Item.equals(Material.LEATHER_CHESTPLATE)) return true;
        else return Item.equals(Material.NETHERITE_CHESTPLATE);
    }
    public boolean isLeggings(Material Item){
        if(Item.equals(Material.CHAINMAIL_LEGGINGS)) return true;
        else if(Item.equals(Material.DIAMOND_LEGGINGS)) return true;
        else if(Item.equals(Material.GOLDEN_LEGGINGS)) return true;
        else if(Item.equals(Material.IRON_LEGGINGS)) return true;
        else if(Item.equals(Material.LEATHER_LEGGINGS)) return true;
        else return Item.equals(Material.NETHERITE_LEGGINGS);
    }
    public boolean isBoots(Material Item){
        if(Item.equals(Material.CHAINMAIL_BOOTS)) return true;
        else if(Item.equals(Material.DIAMOND_BOOTS)) return true;
        else if(Item.equals(Material.GOLDEN_BOOTS)) return true;
        else if(Item.equals(Material.IRON_BOOTS)) return true;
        else if(Item.equals(Material.LEATHER_BOOTS)) return true;
        else return Item.equals(Material.NETHERITE_BOOTS);
    }
}
