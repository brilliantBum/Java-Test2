package com.anotherspectrum.sententiaboss.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Default;
import com.anotherspectrum.sententiaboss.boss.BossMenu;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandAlias("boss|보스")
public class BossCommands extends BaseCommand {

    @Default
    public void boss(CommandSender sender) {

        if (!(sender instanceof Player)) return;

        Player player = (Player) sender;

        new BossMenu().open(player);

    }


}
