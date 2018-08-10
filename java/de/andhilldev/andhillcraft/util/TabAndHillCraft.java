package de.andhilldev.andhillcraft.util;

import de.andhilldev.andhillcraft.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TabAndHillCraft extends CreativeTabs {

	public TabAndHillCraft(int index, String label) {
		super(index, label);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.CONVERSIONBALL);
	}

}