package de.andhilldev.andhillcraft.items;

public class ConversionWand extends ItemBase {

	public ConversionWand(String itemName) {
		super(itemName);
		setMaxStackSize(1);
		setMaxDamage(2000);
		canRepair = true;
	}

}
