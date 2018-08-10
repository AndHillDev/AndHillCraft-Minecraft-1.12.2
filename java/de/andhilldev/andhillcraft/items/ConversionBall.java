package de.andhilldev.andhillcraft.items;

public class ConversionBall extends ItemBase {

	public ConversionBall(String itemName) {
		super(itemName);
		setMaxStackSize(1);
		setMaxDamage(2000);
		canRepair = true;
	}

}
