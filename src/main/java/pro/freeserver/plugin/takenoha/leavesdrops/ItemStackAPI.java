package pro.freeserver.plugin.takenoha.leavesdrops;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class ItemStackAPI {
    private Material material;
    private int amount;
    private String itemName;
    private List<String> lore;
    private int customModelData;

    ItemStackAPI(Material material, int amount, String itemName, List<String> lore, int customModelData) {
        this.material = material;
        this.amount = amount;
        this.itemName = itemName;
        this.lore = lore;
        this.customModelData = customModelData;
    }

    public ItemStack getItemStack() {
        ItemStack item = new ItemStack(material);
        item.setAmount(amount);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(itemName);
        meta.setLore(lore);
        meta.setCustomModelData(customModelData);
        item.setItemMeta(meta);
        return item;
    }
}
