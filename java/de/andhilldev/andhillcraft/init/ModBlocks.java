package de.andhilldev.andhillcraft.init;

import java.util.ArrayList;
import java.util.List;

import de.andhilldev.andhillcraft.blocks.BlockBase;
import de.andhilldev.andhillcraft.blocks.NetherRedCoalOre;
import de.andhilldev.andhillcraft.blocks.NetherRedDiamondOre;
import de.andhilldev.andhillcraft.blocks.RedCoalOre;
import de.andhilldev.andhillcraft.blocks.RedDiamondOre;
import de.andhilldev.andhillcraft.blocks.XPNetherRack;
import de.andhilldev.andhillcraft.blocks.XPStone;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block XPSTONE_BLOCK = new XPStone("xpstone_block", Material.ROCK);
	public static final Block XPNETHERRACK_BLOCK = new XPNetherRack("xpnetherrack_block", Material.ROCK);
	public static final Block REDDIAMOND_ORE_BLOCK = new RedDiamondOre("reddiamond_ore_block", Material.ROCK);
	public static final Block NETHER_REDDIAMOND_ORE_BLOCK = new NetherRedDiamondOre("nether_reddiamond_ore_block", Material.ROCK);
	public static final Block REDCOAL_ORE_BLOCK = new RedCoalOre("redcoal_ore_block", Material.ROCK);
	public static final Block NETHER_REDCOAL_ORE_BLOCK = new NetherRedCoalOre("nether_redcoal_ore_block", Material.ROCK);
	public static final Block REDDIAMOND_BLOCK = new BlockBase("reddiamond_block", Material.IRON, 5f, 10f);
	public static final Block REDCOAL_BLOCK = new BlockBase("redcoal_block", Material.ROCK, 3f, 5f);
	
}