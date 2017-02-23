package io.github.hiztree.techronvalue;

import org.bukkit.inventory.ItemStack;

public enum EmcValues {

    THING("Thing", 1, 1, 1);

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
