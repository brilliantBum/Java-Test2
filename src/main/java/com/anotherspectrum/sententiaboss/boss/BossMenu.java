package com.anotherspectrum.sententiaboss.boss;

import com.anotherspectrum.anotherlibrary.menu.ItemCreator;
import com.anotherspectrum.anotherlibrary.menu.MenuManager;
import com.anotherspectrum.anotherlibrary.utils.StringUtil;
import net.kyori.adventure.text.Component;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class BossMenu extends MenuManager {

    private final Component PREFIX = StringUtil.format("<b><red>[WARNING] 필요한 레벨을 달성하지 못했습니다.</b>");

    public BossMenu() {
        super(5, "<b>보스창</b>", true);

        fillBorders(ItemCreator.create(Material.RED_STAINED_GLASS_PANE, 1, Component.empty()));

        setItem(4, ItemCreator.create(Material.DRAGON_HEAD,1, StringUtil.format("<b><gray>[BossList]"),
                StringUtil.ellipsis("<b><white>[BossList]를 확인하실 수 있습니다."), true));

        setItem(10, ItemCreator.create(Material.PAPER, 1,
                StringUtil.format(BossList.SUBBoss1.getName()),
                StringUtil.ellipsis("필요 레벨 : 60"), true), (player, inventoryClickEvent) -> {

            if (player.getLevel() < 60) {
                player.closeInventory();
                player.sendMessage(PREFIX);
                return;
            }
            Location location = new Location(player.getWorld(), BossList.SUBBoss1.getXCoordinate(), BossList.SUBBoss1.getYCoordinate(), BossList.SUBBoss1.getZCoordinate());
            player.teleport(location);
            player.closeInventory();
            player.showTitle(StringUtil.title(BossList.SUBBoss1.getBossMapName(), "", 30,40, 30));
            player.sendMessage(BossList.SUBBoss1.getBossMapName() + " <b><white>으로 이동하였습니다.</b>");

        });
        setItem(12, ItemCreator.create(Material.DIAMOND,1,
                StringUtil.format(BossList.SUBBoss2.getName()),
                StringUtil.ellipsis("필요 레벨 : 60"), true), (player, inventoryClickEvent) -> {

            if (player.getLevel() < 60) {
                player.closeInventory();
                player.sendMessage(PREFIX);
                return;
            }
            Location location = new Location(player.getWorld(), BossList.SUBBoss2.getXCoordinate(), BossList.SUBBoss2.getYCoordinate(), BossList.SUBBoss2.getZCoordinate());
            player.teleport(location);
            player.closeInventory();
            player.showTitle(StringUtil.title(BossList.SUBBoss2.getBossMapName(), "", 30, 40, 30));
            player.sendMessage(BossList.SUBBoss2.getBossMapName() + " <b><white>으로 이동하였습니다.</b>");

        });

        setItem(14, ItemCreator.create(Material.ACACIA_BOAT,1,
                StringUtil.format(BossList.SUBBoss3.getName()),
                StringUtil.ellipsis("필요 레벨 : 60"), true), (player, inventoryClickEvent) -> {

            if (player.getLevel() < 60) {
                player.closeInventory();
                player.sendMessage(PREFIX);
                return;
            }

            Location location = new Location(player.getWorld(), BossList.SUBBoss3.getXCoordinate(), BossList.SUBBoss3.getYCoordinate(), BossList.SUBBoss3.getZCoordinate());
            player.teleport(location);
            player.closeInventory();
            player.showTitle(StringUtil.title(BossList.SUBBoss3.getBossMapName(),"", 30, 40, 30));
            player.sendMessage(BossList.SUBBoss3.getBossMapName() + " <b><white>으로 이동하였습니다.</b>");

        });

        setItem(16, ItemCreator.create(Material.ZOMBIE_HEAD,1,
                StringUtil.format(BossList.SUBBoss4.getName()),
                StringUtil.ellipsis("필요 레벨 : 60"), true), (player, inventoryClickEvent) -> {

            if (player.getLevel() < 60) {
                player.closeInventory();
                player.sendMessage(PREFIX);
                return;
            }

            Location location = new Location(player.getWorld(), BossList.SUBBoss4.getXCoordinate(), BossList.SUBBoss4.getYCoordinate(), BossList.SUBBoss4.getZCoordinate());
            player.teleport(location);
            player.closeInventory();
            player.showTitle(StringUtil.title(BossList.SUBBoss4.getBossMapName(), "", 30, 40, 30));
            player.sendMessage(StringUtil.format(BossList.SUBBoss4.getBossMapName() + " <b><white>으로 이동하였습니다.</b>"));

        });

        setItem(28, ItemCreator.create(Material.PIGLIN_HEAD, 1,
                StringUtil.format(BossList.Boss1.getName()),
                StringUtil.ellipsis("필요 레벨 : 90"), true), (player, inventoryClickEvent) -> {

            if (player.getLevel() < 90) {
                player.closeInventory();
                player.sendMessage(PREFIX);
                return;
            }

            Location location = new Location(player.getWorld(), BossList.Boss1.getXCoordinate(), BossList.Boss1.getYCoordinate(), BossList.Boss1.getZCoordinate());
            player.teleport(location);
            player.closeInventory();
            player.showTitle(StringUtil.title(BossList.Boss1.getBossMapName(), "", 30, 40, 30));
            player.sendMessage(StringUtil.format(BossList.Boss1.getBossMapName() + " <b><white>으로 이동하였습니다.</b>"));

        });

        setItem(30, ItemCreator.create(Material.PLAYER_HEAD, 1,
                StringUtil.format(BossList.Boss2.getName()),
                StringUtil.ellipsis("필요 레벨 : 90"),true), (player, inventoryClickEvent) -> {

            if (player.getLevel() < 90) {
                player.closeInventory();
                player.sendMessage(PREFIX);
                return;
            }

            Location location = new Location(player.getWorld(), BossList.Boss2.getXCoordinate(), BossList.Boss2.getYCoordinate(), BossList.Boss2.getZCoordinate());
            player.teleport(location);
            player.closeInventory();
            player.showTitle(StringUtil.title(BossList.Boss2.getBossMapName(), "", 30, 40, 30));
            player.sendMessage(StringUtil.format(BossList.Boss2.getBossMapName() + " <b><white>으로 이동하였습니다.</b>"));

        });

        setItem(32, ItemCreator.create(Material.BOOK, 1,
                StringUtil.format(BossList.Boss3.getName()),
                StringUtil.ellipsis("필요 레벨 : 90"), true), (player, inventoryClickEvent) -> {

            if (player.getLevel() < 90) {
                player.closeInventory();
                player.sendMessage(PREFIX);
                return;
            }

            Location location = new Location(player.getWorld(), BossList.Boss3.getXCoordinate(), BossList.Boss3.getYCoordinate(), BossList.Boss3.getZCoordinate());
            player.teleport(location);
            player.closeInventory();
            player.showTitle(StringUtil.title(BossList.Boss3.getBossMapName(), "", 30, 40, 30));
            player.sendMessage(StringUtil.format(BossList.Boss3.getBossMapName() + " <b><white>으로 이동하였습니다.</b>"));

        });

        setItem(34, ItemCreator.create(Material.PAPER,1,
                StringUtil.format(BossList.Boss4.getName()),
                StringUtil.ellipsis("필요 레벨 : 90"), true), (player, inventoryClickEvent) -> {

            if (player.getLevel() < 90) {
                player.closeInventory();
                player.sendMessage(PREFIX);
                return;
            }

            Location location = new Location(player.getWorld(), BossList.Boss4.getXCoordinate(), BossList.Boss4.getYCoordinate(), BossList.Boss4.getZCoordinate());
            player.teleport(location);
            player.closeInventory();
            player.showTitle(StringUtil.title(BossList.Boss4.getBossMapName(), "", 30, 40, 30));
            player.sendMessage(StringUtil.format(BossList.Boss4.getBossMapName() + " <b><white>으로 이동하였습니다.</b>"));

        });
    }
}
