package de.andhilldev.andhillcraft.init;

import java.util.ArrayList;
import java.util.List;

import de.andhilldev.andhillcraft.items.BackPack;
import de.andhilldev.andhillcraft.items.ConversionBall;
import de.andhilldev.andhillcraft.items.ConversionWand;
import de.andhilldev.andhillcraft.items.ItemBase;
import de.andhilldev.andhillcraft.items.PortableCraftingTable;
import de.andhilldev.andhillcraft.items.tools.RedDiamondAxe;
import de.andhilldev.andhillcraft.items.tools.RedDiamondHoe;
import de.andhilldev.andhillcraft.items.tools.RedDiamondPickAxe;
import de.andhilldev.andhillcraft.items.tools.RedDiamondSpade;
import de.andhilldev.andhillcraft.items.tools.RedDiamondSword;
import de.andhilldev.andhillcraft.util.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	// Materials
	public static final ToolMaterial MATERIAL_REDDIAMOND_INGOT = EnumHelper.addToolMaterial("material_reddiamond_ingot", 3, 3000, 10F, 8F, 30);
	
	//public static final ArmorMaterial MATERIAL_REDDIAMOND_INGOT_ARMOR = EnumHelper.addArmorMaterial("RedDiamondArmorMaterial","andhillcraft:reddiamond", 70, new int[]{3, 10, 9, 6}, 30F);
	
	// Conversion Mod Items
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
	
	// Tools
	public static final ItemAxe REDDIAMOND_AXE = new RedDiamondAxe("reddiamond_axe", MATERIAL_REDDIAMOND_INGOT);
	public static final ItemPickaxe REDDIAMOND_PICKAXE = new RedDiamondPickAxe("reddiamond_pickaxe",MATERIAL_REDDIAMOND_INGOT);
	public static final ItemSpade REDDIAMOND_SPADE = new RedDiamondSpade("reddiamond_spade", MATERIAL_REDDIAMOND_INGOT);
	public static final ItemHoe REDIAMOND_HOE = new RedDiamondHoe("reddiamond_hoe", MATERIAL_REDDIAMOND_INGOT);
	public static final ItemSword REDDIAMOND_SWORD = new RedDiamondSword("reddiamond_sword", MATERIAL_REDDIAMOND_INGOT);
	
}
