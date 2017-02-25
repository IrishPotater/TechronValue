package io.github.hiztree.techronvalue;

import org.bukkit.inventory.ItemStack;

public enum EmcValues {

    THING("Thing", 1, 1, 1);
    WATER_SOURCE("Water Source", 8, 0, 1);
    WATER_STILL("Water Still", 9, 0, 1);
    LAVA_SOURCE("Lava Source", 10, 0, 64);
    LAVA_STILL("Lava Still", 11, 0, 64);
    GOLD_ORE("Gold Ore", 14, 0, 2048);
    IRON_ORE("Iron Ore", 15, 0, 256);
    COAL_ORE("Coal Ore", 16, 0, 128);
    /* Check if we should have this. It's creative only */
    SPONGE("Sponge", 19, 0, 9999);
    LAPIS_LAZULI_ORE("Lapis Lazuli Ore", 21, 0, 864);
    /* Check if we should have this. It's OP only */
    FIRE("Fire", 51, 0, 9999);
    CREEPER_SPAWNER("Creeper Spawner", 52, 50, 9998);
    SKELETON_SPAWNER("Skeleton Spawner", 52, 51, 9999);
    SPIDER_SPAWNER("Spider Spawner", 52, 52, 9999);
    GIANT_SPAWNER("Giant Spawner", 52, 53, 9999);
    ZOMBIE_SPAWNER("Zombie Spawner", 52, 54, 9999);
    SLIME_SPAWNER("Slime Spawner", 52, 55, 9999);
    GHAST_SPAWNER("Ghast Spawner", 52, 56, 9999);
    PIGZOMBIE_SPAWNER("Pig Zombie Spanwer", 52, 57, 9999);
    ENDERMAN_SPAWNER("Enderman Spawner", 52, 58, 9999);
    CAVESPIDER_SPAWNER("Cave Spider Spawner", 52, 59, 9999);
    SILVERFISH_SPAWNER("Silverfish Spawner", 52, 60, 9999);
    BLAZE_SPAWNER("Blaze Spawner", 52, 61, 9999);
    LAVASLIME_SPAWNER("Lava Slime Spawner", 52, 62, 9999);
    PIG_SPAWNER("Pig Spawner", 52, 90, 9999);
    SHEEP_SPAWNER("Sheep Spawner", 52, 91, 9999);
    COW_SPAWNER("Cow Spawner", 52, 92, 9999);
    CHICKEN_SPAWNER("Chicken Spawner", 52, 93, 9999);
    SQUID_SPAWNER("Squid Spawner", 52, 94, 9999);
    WOLF_SPAWMER("Wolf Spawner", 52, 95, 9999);
    MUSHROOMCOW_SPAWNER("Mooshroom Cow Spawner", 52, 96, 9999);
    SNOWMAN_SPAWNER("Snowman Spawner", 52, 97, 9999);
    OCELOT_SPAWNER("Ocelot Spawner", 52, 98, 9999);
    IRONGOLEM_SPAWNER("Iron Goldem Spawner", 52, 99, 9999);
    VILLAGER_SPAWNER("Villager Spawner", 52, 120, 9999);
    DIAMOND_ORE("Diamond Ore", 56, 0, 8192);
    FARMLAND("Farmland", 60, 0, 1);
    FURNACE("Furnace", 62, 0, 8);
    REDSTONE_ORE("Redstone Ore", 73, 0, 64);
    SNOW("Snow", 78, 0, 1);
    PORTAL("Potal", 90, 0, 1);
    CAKE("Cake", 92, 0, 411);
    LOCKED_CHEST("Locked Chest", 95, 0, 64);
    SILVERFISH_STONE("Silverfish Stone", 97, 0, 1);
    MUHSROOM("Mushroom", 99, 0, 1);
    MUSHROM("Mushroom", 100, 0, 1);
    GLASS_PANE("Glass Pane", 102, 0, 6);
    NETHER_WART("Nether Wart", 115, 0, 1);
    END_PORTAL("End Portal", 119, 0, 1);
    END_PORTAL_FRAME("End Portal Frame", 120, 0, 1);
    REDSTONE_LAMP("Redstone Lamp", 124, 0, 1792);
    BACKPLANE("Backplane", 133, 0, 14870);
    8K_RAM_MODULE("8K RAM Module", 133, 1, 30636);
    MONITOR("Monitor", 134, 0, 28214);
    CENTRAL_PROCESSING_UNIT("Central Processing Unit", 134, 1, 93252);
    DISK_DRIVE("Disk Drive", 134, 2, 30171);
    NETHER_COAL_ORE("Nether Coal", 135, 0, 128);
    NETHER_DIAMOND_ORE("Nether Diamond", 135, 1, 8192);
    NETHER_GOLD_ORE("Nether Gold", 135, 2, 2048);
    NETHER_IRON_ORE("Nether Iron", 135, 3, 256);
    NETHER_LAPIS_LAZULI_ORE("Nether Lapis Lazuli Ore", 135, 4, 864);
    NETHER_REDSTONE_ORE("Nether Redstone Ore", 125, 5, 64);
    NETHER_COPPER_ORE("Nether Copper Ore", 125, 6, 85);
    NETHER_TIN_ORE("Nether Tin Ore", 135, 7, 256);
    /* I'm assuming we're skipping Forge Microblocks pls >.> */
    ALLOY_FURNACE("Alloy Furnace", 127, 0, 512);













    private final String name;
    private final int itemID;
    private final int itemData;
    private final int emc;

    /**
     * Creates a new emc value.
     *
     * @param name The name of the item.
     * @param itemID The id of the item.
     * @param itemData The data of the item.
     * @param emc The emc of the item.
     */
    EmcValues(String name, int itemID, int itemData, int emc) {
        this.name = name;
        this.itemID = itemID;
        this.itemData = itemData;
        this.emc = emc;
    }

    /**
     * Gets the name of the item.
     *
     * @return The name of the item
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the id of the item.
     *
     * @return The id of the item
     */
    public int getItemID() {
        return itemID;
    }

    /**
     * Gets the data of the item.
     *
     * @return The data of the item
     */
    public int getItemData() {
        return itemData;
    }

    /**
     * Gets the emc of the item.
     *
     * @return The emc of the item
     */
    public int getEmc() {
        return emc;
    }

    /**
     * Gets an emc value from an item stack.
     *
     * @param stack The item stack to check for.
     *
     * @return The emc value
     */
    public static EmcValues getEmcValue(ItemStack stack) {
        for(EmcValues value : values()) {
            if(value.getItemID() == stack.getTypeId() && value.getItemData() == stack.getData().getData()) {
                return value;
            }
        }

        return null;
    }
}
