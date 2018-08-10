package de.andhilldev.andhillcraft.util.handlers;

import java.util.Random;

import de.andhilldev.andhillcraft.init.ModBlocks;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenerator implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.getDimension()) {
		case -1:
			generateInNether(world, random, chunkX*16, chunkZ*16);
			break;
		case 0:
			generateInOverworld(world, random, chunkX*16, chunkZ*16);
			break;
		case 1:
			generateInEnd(world, random, chunkX*16, chunkZ*16);
			break;
		}
	}

	private void generateInEnd(World world, Random random, int x, int z) {
		
	}

	private void generateInOverworld(World world, Random random, int x, int z) {
		// Generate BlockBloodDiamondOre
		for (int i=0; i<5; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(15);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(ModBlocks.REDDIAMOND_ORE_BLOCK.getDefaultState(), 6)).generate(world, random, new BlockPos(chunkX, chunkY, chunkZ));
		}
		
		// Generate BlockRedCoalOre
		for (int i=0; i<10; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(45);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(ModBlocks.REDCOAL_ORE_BLOCK.getDefaultState(), 10)).generate(world, random, new BlockPos(chunkX, chunkY, chunkZ));
		}
		
		// Generate BlockXPStone
		for (int i=0; i<80; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(64);
			int chunkZ = z + random.nextInt(16);
		
			(new WorldGenMinable(ModBlocks.XPSTONE_BLOCK.getDefaultState(), 25)).generate(world, random, new BlockPos(chunkX, chunkY, chunkZ));
		}
	}

	private void generateInNether(World world, Random random, int x, int z) {
		// Generate BlockNetherRedCoalOre
		for (int i=0; i<10; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(80);
			int chunkZ = z + random.nextInt(16);
				
			(new WorldGenMinable(ModBlocks.NETHER_REDCOAL_ORE_BLOCK.getDefaultState(), 10, BlockMatcher.forBlock(Blocks.NETHERRACK))).generate(world, random, new BlockPos(chunkX, chunkY, chunkZ));
		}
		
		// Generate BlockXPNetherRack
		for (int i=0; i<80; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(128);
			int chunkZ = z + random.nextInt(16);
				
			(new WorldGenMinable(ModBlocks.XPNETHERRACK_BLOCK.getDefaultState(), 25, BlockMatcher.forBlock(Blocks.NETHERRACK))).generate(world, random, new BlockPos(chunkX, chunkY, chunkZ));
		}
		
		// Generate BlockNetherDiamondOre
		for (int i=0; i<5; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = random.nextInt(80);
			int chunkZ = z + random.nextInt(16);
			
			(new WorldGenMinable(ModBlocks.NETHER_REDDIAMOND_ORE_BLOCK.getDefaultState(), 6, BlockMatcher.forBlock(Blocks.NETHERRACK))).generate(world, random, new BlockPos(chunkX, chunkY, chunkZ));
		}
	}

}
