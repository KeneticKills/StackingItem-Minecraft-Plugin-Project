package kqz.stackingitems.Events;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ItemMovement extends Event {
    private static final HandlerList HANDLERS = new HandlerList();

    Entity entity;
    Location oldlocation;
    Location newlocation;

    public ItemMovement(Entity entity,Location oldlocation,Location newlocation){
        this.entity = entity;
        this.oldlocation = oldlocation;
        this.newlocation = newlocation;
    }

    public Item getEntity() {
        return (Item) entity;
    }

    public Location getOldlocation() {
        return oldlocation;
    }

    public Location getNewlocation() {
        return newlocation;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public HandlerList getHandlers() {
        return HANDLERS;
    }
}
