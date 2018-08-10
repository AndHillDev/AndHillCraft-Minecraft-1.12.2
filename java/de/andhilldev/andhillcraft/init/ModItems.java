package de.andhilldev.andhillcraft.init;

import java.util.ArrayList;
import java.util.List;

import de.andhilldev.andhillcraft.items.BackPack;
import de.andhilldev.andhillcraft.items.ConversionBall;
import de.andhilldev.andhillcraft.items.ConversionWand;
import de.andhilldev.andhillcraft.items.ItemBase;
import de.andhilldev.andhillcraft.items.PortableCraftingTable;
import de.andhilldev.andhillcraft.util.Reference;
import net.minecraft.item.Item;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item CONVERSIONBALL = new ConversionBall("conversionball");
	public static final Item CONVERSIONWAND = new ConversionWand("conversionwand");
	public static final Item REDDIAMOND = new ItemBase("reddiamond");
	public static final Item REDCOAL = new ItemBase("redcoal");
	public static final Item REDDIAMOND_INGOT = new ItemBase("reddiamond_ingot");
	public static final Item REDDIAMOND_DUST = new ItemBase("reddiamond_dust");
	public static final Item GRAVEL_DUST = new ItemBase("gravel_dust");
	public static final Item FLINT_DUST = new ItemBase("flint_dust");
	public static final Item SMALL_BACKPACK = new BackPack("small_backpack", Reference.backPackSize.SMALL.getInventorySize());
	public static final Item MEDIUM_BACKPACK = new BackPack("medium_backpack", Reference.backPackSize.MEDIUM.getInventorySize());
	public static final Item BIG_BACKPACK = new BackPack("big_backpack", Reference.backPackSize.BIG.getInventorySize());
	public static final Item PORTABLE_CRAFTINGTABLE = new PortableCraftingTable("portable_craftingtable");
	
}
