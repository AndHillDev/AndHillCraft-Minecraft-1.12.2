package de.andhilldev.andhillcraft.proxies;

import net.minecraft.item.Item;

public interface ICommonProxy {

	public void registerItemRenderer(Item item, int meta, String id);
	
}