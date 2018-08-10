package de.andhilldev.andhillcraft.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	private static void smeltingRecipes() {
		GameRegistry.addSmelting(Items.FLINT, new ItemStack(ModItems.FLINT_DUST, 2), 0.5f);
		GameRegistry.addSmelting(Blocks.GRAVEL, new ItemStack(ModItems.GRAVEL_DUST, 2), 0.5f);
		GameRegistry.addSmelting(ModItems.REDDIAMOND, new ItemStack(ModItems.REDDIAMOND_INGOT, 1), 0.5f);
		GameRegistry.addSmelting(ModItems.REDDIAMOND_INGOT, new ItemStack(ModItems.REDDIAMOND_DUST, 2), 0.5f);
	}
	
	public static void registerRecipes() {
		smeltingRecipes();
	}
	
}
