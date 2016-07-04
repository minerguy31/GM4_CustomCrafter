package co.gm4.GM4_CustomCrafter.objects;

import org.bukkit.Location;
import org.bukkit.block.Dropper;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.UUID;

/**
 * Project: GM4_CustomCrafter
 * Author: SpiderRobotMan
 * Date: Jul 04 2016
 * Website: http://www.spiderrobotman.com
 */

public class Crafter {
    private Location loc;
    private Dropper d;
    private UUID uuid;

    public Crafter(Dropper dropper) {
        this.loc = new Location(dropper.getWorld(), dropper.getX(), dropper.getY(), dropper.getZ());
        this.d = dropper;
        this.uuid = UUID.randomUUID();
    }

    public UUID getUUID() {
        return this.uuid;
    }

    public Location getLocation() {
        return loc;
    }

    public Inventory getInventory() {
        return this.d.getInventory();
    }

    public void setInventory(ItemStack[] items) {
        this.getInventory().setContents(items);
    }

    public void clearInventory() {
        this.getInventory().clear();
    }
}
