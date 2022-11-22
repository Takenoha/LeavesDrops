package pro.freeserver.plugin.takenoha.leavesdrops;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Tag;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.LeavesDecayEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;

public class BlockBreak implements Listener {

    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {
        Player p = e.getPlayer();
        if (p.getGameMode() != GameMode.SURVIVAL){
           return;
        }
        Location brakeLocate = e.getBlock().getLocation();
        ItemStack item = new ItemStackAPI(Material.ACACIA_BOAT,2,"aa",Arrays.asList("a","b"),0).getItemStack();
        int matchNum = 0;

        Material breakBlock = e.getBlock().getType();

        if (Tag.LEAVES.isTagged(breakBlock)) {
            if (RandomNum.getRandom() == matchNum){
                brakeLocate.getWorld().dropItem(brakeLocate,item);
            }
        }
    }

    @EventHandler
    public void onBlockBreakNatural(LeavesDecayEvent e) {

        Location brakeLocate = e.getBlock().getLocation();
        ItemStack item = new ItemStackAPI(Material.ACACIA_BOAT,2,"aa",Arrays.asList("a","b"),0).getItemStack();
        int matchNum = 0;

        Material breakBlock = e.getBlock().getType();

        if (Tag.LEAVES.isTagged(breakBlock)) {
            if (RandomNum.getRandom() == matchNum){
                brakeLocate.getWorld().dropItem(brakeLocate,item);
            }
        }
    }
}