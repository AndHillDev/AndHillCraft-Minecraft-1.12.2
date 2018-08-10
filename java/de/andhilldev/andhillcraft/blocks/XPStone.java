package de.andhilldev.andhillcraft.blocks;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class XPStone extends BlockBase {

	public XPStone(String blockName, Material material) {
		super(blockName, material);
		setHardness(1.2F);
		setResistance(10F);
		setHarvestLevel("pickaxe", 0);
		setSoundType(SoundType.STONE);
	}
	
	@Override
	public void onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state) {
		super.onBlockDestroyedByPlayer(worldIn, pos, state);
		dropXpOnBlockBreak(worldIn, pos, 1);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(Blocks.COBBLESTONE);
	}

}
