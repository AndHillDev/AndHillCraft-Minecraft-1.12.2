package de.andhilldev.andhillcraft.util.handlers;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		if(fuel.getUnlocalizedName().contains("redcoal")) {
			return 3200;
		} else {
			return 0;
		}
	}

}
