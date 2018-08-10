package de.andhilldev.andhillcraft.items.tools;

import de.andhilldev.andhillcraft.AndHillCraft;
import de.andhilldev.andhillcraft.init.ModItems;
import de.andhilldev.andhillcraft.util.IHasModel;
import net.minecraft.item.ItemSword;

public class RedDiamondSword extends ItemSword implements IHasModel{
	
	public RedDiamondSword(String itemName, ToolMaterial material) {
		super(material);
		setCreativeTab(AndHillCraft.tabAndHillCraft);
		setUnlocalizedName(itemName);
		setRegistryName(itemName);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		AndHillCraft.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}