package com.anotherspectrum.sententiaboss.events;

import com.anotherspectrum.sententiaboss.SententiaBoss;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class EventsHandler implements Listener {

    public EventsHandler(SententiaBoss sententiaBoss) {
        sententiaBoss.getServer().getPluginManager().registerEvents(this, sententiaBoss);

    }

    @EventHandler
    private void onJoin(PlayerJoinEvent event) {new JoinEvents().onJoin(event);}


}
