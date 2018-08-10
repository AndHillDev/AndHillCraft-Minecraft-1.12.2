package de.andhilldev.andhillcraft.blocks;

import de.andhilldev.andhillcraft.AndHillCraft;
import de.andhilldev.andhillcraft.init.ModBlocks;
import de.andhilldev.andhillcraft.init.ModItems;
import de.andhilldev.andhillcraft.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.Mod.Instance;

public class BlockBase extends Block implements IHasModel {

	public BlockBase(String blockName, Material material) {
		super(material);
		setCreativeTab(AndHillCraft.tabAndHillCraft);
		setUnlocalizedName(blockName);
		setRegistryName(blockName);
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	public BlockBase(String blockName, Material material, float hardness, float resistance) {
		super(material);
		setCreativeTab(AndHillCraft.tabAndHillCraft);
		setUnlocalizedName(blockName);
		setRegistryName(blockName);
		setHardness(hardness);
		setResistance(resistance);
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		AndHillCraft.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	
}
