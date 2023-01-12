package com.anotherspectrum.sententiaboss;

import co.aikar.commands.PaperCommandManager;
import com.anotherspectrum.anotherlibrary.AnotherLibrary;
import com.anotherspectrum.sententiaboss.commands.BossCommands;
import com.anotherspectrum.sententiaboss.events.EventsHandler;
import com.anotherspectrum.sententiaboss.events.JoinEvents;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public final class SententiaBoss extends JavaPlugin {

    private @Getter AnotherLibrary library;

    @Override
    public void onEnable() {

        this.library = new AnotherLibrary("SententiaBoss", this);
        PaperCommandManager manager = new PaperCommandManager(this);


        // Events
        getServer().getPluginManager().registerEvents(new JoinEvents(), this);
        new EventsHandler(this);

        // Commands
        manager.registerCommand(new BossCommands());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    public AnotherLibrary getLibrary () {
        return library;
    }
}
