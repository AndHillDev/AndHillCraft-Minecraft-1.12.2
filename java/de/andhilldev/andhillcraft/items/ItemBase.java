package de.andhilldev.andhillcraft.items;

import de.andhilldev.andhillcraft.AndHillCraft;
import de.andhilldev.andhillcraft.init.ModItems;
import de.andhilldev.andhillcraft.util.IHasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
	
	public ItemBase(String itemName) {
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
