package kqz.stackingitems;

import kqz.stackingitems.Blocks.HopperCollectItem;
import kqz.stackingitems.Item.OverStack;
import kqz.stackingitems.Item.SetName;
import kqz.stackingitems.Entity.EntityCollectItem;
import kqz.stackingitems.Events.RunItemEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class main extends JavaPlugin {
    @Override
    public void onEnable(){
        register1();
        PluginManager PM = getServer().getPluginManager();
        PM.registerEvents(new SetName(), this);
        PM.registerEvents(new OverStack(), this);
        PM.registerEvents(new EntityCollectItem(this), this);
        PM.registerEvents(new RunItemEvent(),this);
        PM.registerEvents(new HopperCollectItem(),this);
        new RunItemEvent().Run(this);
    }

    public void register1(){
        Objects.requireNonNull(getCommand("stackingitems")).setExecutor(new cmds());
    }
}


