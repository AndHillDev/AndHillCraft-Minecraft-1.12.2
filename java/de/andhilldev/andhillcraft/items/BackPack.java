package de.andhilldev.andhillcraft.items;

public class BackPack extends ItemBase {
	
	private String inventorySize;

	public BackPack(String itemName, String inventorySize) {
		super(itemName);
		setMaxStackSize(1);
		this.inventorySize = inventorySize;
	}

}
