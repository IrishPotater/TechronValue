package io.github.hiztree.techronvalue;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.logging.Logger;

import ee.EEMaps;

public class TechronValue extends JavaPlugin {

    private Logger logger = Logger.getLogger("TechronValue");

    private FileConfiguration config;

    private String prefix;
    private int emcPerDollar;

    private DecimalFormat format = new DecimalFormat("#.##");

    public void onEnable() {
        File mainDir = new File("plugins/TechronValue");

        if(!mainDir.exists()) {
            mainDir.mkdirs();
        }

        File configFile = new File(mainDir, "config.yml");

        if(!configFile.exists()) {
            try {
                configFile.createNewFile();
            } catch (IOException e) {
                logger.severe("Could not create config.yml!");
            }
        }

        config = YamlConfiguration.loadConfiguration(configFile);
        prefix = config.getString("Prefix", "&8[&bTechron&8] ");
        emcPerDollar = config.getInt("EmcPerDollar", 4);

        getCommand("value").setExecutor(this);
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(label.equalsIgnoreCase("value")) {
            ItemStack item = null;

            if(args.length < 1) {
                if(!(sender instanceof Player)) {
                    sendMessage(sender, "&cYou must be a player to perform this command!");
                    return true;
                }

                Player player = (Player) sender;

                if(player.getItemInHand() == null) {
                    sendMessage(sender, "&cPlease specify a valid item, or hold an item!");
                    return true;
                }

                item = player.getItemInHand();
            } else if(args.length >= 1) {
                String itemString = args[0];
                int itemID;
                int quantity = 1;
                byte itemData = 0;

                try {
                    if (itemString.contains(":")) {
                        String[] split = itemString.split(":");

                        itemID = Integer.parseInt(split[0]);
                        itemData = Byte.parseByte(split[1]);
                    } else {
                        itemID = Integer.parseInt(itemString);
                    }

                    if(args.length >= 2) {
                        quantity = Integer.parseInt(args[1]);
                    }

                    item = new ItemStack(itemID, quantity, (short) 0, itemData);
                } catch (NumberFormatException e) {
                    sendMessage(sender, "&cPlease specify a valid item, or hold an item!");
                    return true;
                }
            }

            if(item == null) {
                sendMessage(sender, "&cPlease specify a valid item, or hold an item!");
                return true;
            }

            sendMessage(sender, "&7The value of &6" + getItemValue(item) + "&7.");
        }

        return true;
    }

    public void sendMessage(CommandSender sender, String msg) {
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix + msg));
    }

    public String getItemValue(ItemStack stack) {
        String formatString;
        int emc = EEMaps.getEMC(stack.getTypeId(), stack.getData().getData());

        if(emc != 0) {
            formatString = stack.getAmount() + "x " + stack.getTypeId() + ":" + stack.getData().getData() + " &7is &a$" + format.format(emc / emcPerDollar);
        } else {
            EmcValues value = EmcValues.getEmcValue(stack);

            formatString = stack.getAmount() + "x " + value.getName() + " &7is &a$" + (value != null ? format.format(value.getEmc() / emcPerDollar) : "0.00");
        }

        return formatString;
    }
}
