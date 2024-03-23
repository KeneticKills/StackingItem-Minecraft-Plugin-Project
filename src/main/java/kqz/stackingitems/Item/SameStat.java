package kqz.stackingitems.Item;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SameStat {
    public boolean StatCheck(Item FirstItem,Item SecondItem) {
        if(FirstItem.getItemStack().getItemMeta() == null)return false;
        if(SecondItem.getItemStack().getItemMeta() == null)return false;
        ItemStack FirstItemMeta = FirstItem.getItemStack();
        ItemStack SecondItemMeta = SecondItem.getItemStack();
        if (!(FirstItemMeta.isSimilar(SecondItemMeta))) return false;
        /*
        if (FirstItemMeta.hasEnchants() != SecondItemMeta.hasEnchants()) return false;
        if (FirstItemMeta.hasDisplayName() != SecondItemMeta.hasDisplayName()) return false;
        if (FirstItemMeta.hasAttributeModifiers() != SecondItemMeta.hasAttributeModifiers()) return false;
        if (FirstItemMeta.hasCustomModelData() != SecondItemMeta.hasCustomModelData()) return false;
        if (FirstItemMeta.hasLore() != SecondItemMeta.hasLore()) return false;
        //Enchanment
        if (FirstItemMeta.getEnchantLevel(Enchantment.DURABILITY) != SecondItemMeta.getEnchantLevel(Enchantment.DURABILITY)) return false;
        if (FirstItemMeta.getEnchantLevel(Enchantment.MENDING) != SecondItemMeta.getEnchantLevel(Enchantment.MENDING)) return false;
        //Bow
        if (FirstItemMeta.getEnchantLevel(Enchantment.ARROW_DAMAGE) != SecondItemMeta.getEnchantLevel(Enchantment.ARROW_DAMAGE)) return false;
        if (FirstItemMeta.getEnchantLevel(Enchantment.ARROW_FIRE) != SecondItemMeta.getEnchantLevel(Enchantment.ARROW_FIRE)) return false;
        if (FirstItemMeta.getEnchantLevel(Enchantment.ARROW_INFINITE) != SecondItemMeta.getEnchantLevel(Enchantment.ARROW_INFINITE)) return false;
        if (FirstItemMeta.getEnchantLevel(Enchantment.ARROW_KNOCKBACK) != SecondItemMeta.getEnchantLevel(Enchantment.ARROW_KNOCKBACK)) return false;
        //Sword
        if (FirstItemMeta.getEnchantLevel(Enchantment.DAMAGE_ALL) != SecondItemMeta.getEnchantLevel(Enchantment.DAMAGE_ALL)) return false;
        if (FirstItemMeta.getEnchantLevel(Enchantment.DAMAGE_ARTHROPODS) != SecondItemMeta.getEnchantLevel(Enchantment.DAMAGE_ARTHROPODS)) return false;
        if (FirstItemMeta.getEnchantLevel(Enchantment.DAMAGE_UNDEAD) != SecondItemMeta.getEnchantLevel(Enchantment.DAMAGE_UNDEAD)) return false;
        */
        return true;
        }
}
