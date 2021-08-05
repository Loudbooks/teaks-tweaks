package me.teakivy.vanillatweaks.Commands;

import me.teakivy.vanillatweaks.Main;
import me.teakivy.vanillatweaks.Packs.Hermitcraft.GemVillagers.GemVllagers;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class testCommand implements CommandExecutor {

    Main main = Main.getPlugin(Main.class);
    String vt = ChatColor.GRAY + "[" + ChatColor.GOLD.toString() + ChatColor.BOLD + "VT" + ChatColor.GRAY + "] ";

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("test")) {
            Player player = (Player) sender;
            World world = player.getWorld();
            if (main.getConfig().getBoolean("config.dev-mode")) {
                player.sendMessage(vt + ChatColor.GREEN + "Gems!");
                new GemVllagers().summonGemTraderVillager(player.getLocation());
            } else {
                player.sendMessage(vt + ChatColor.YELLOW + "Hey! Looks like you found my test command! :D");
                if (player.isOp()) {
                    player.sendMessage(ChatColor.YELLOW + "This command is used to test new features! Enable it by marking " + ChatColor.GRAY + "config.dev-mode: true" + ChatColor.YELLOW + "!");
                }
            }
        }
        return false;
    }
}
