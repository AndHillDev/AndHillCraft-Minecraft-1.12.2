package de.andhilldev.andhillcraft.blocks;

import java.util.Random;

import de.andhilldev.andhillcraft.init.ModItems;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class NetherRedCoalOre extends BlockBase{

	public NetherRedCoalOre(String blockName, Material material) {
		super(blockName, material);
		setHardness(3F);
		setResistance(5F);
		setHarvestLevel("pickaxe", 0);
		setSoundType(SoundType.STONE);
	}
	
	@Override
	public int quantityDropped(Random random) {
		return 2;
	}
	
	@Override
	public void onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state) {
		super.onBlockDestroyedByPlayer(worldIn, pos, state);
		dropXpOnBlockBreak(worldIn, pos, 2);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.REDCOAL;
	}

}
