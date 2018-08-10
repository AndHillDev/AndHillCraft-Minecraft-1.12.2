package de.andhilldev.andhillcraft;

import de.andhilldev.andhillcraft.init.ModRecipes;
import de.andhilldev.andhillcraft.proxies.ICommonProxy;
import de.andhilldev.andhillcraft.util.Reference;
import de.andhilldev.andhillcraft.util.TabAndHillCraft;
import de.andhilldev.andhillcraft.util.handlers.FuelHandler;
import de.andhilldev.andhillcraft.util.handlers.WorldGenerator;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.SidedProxy;

@Mod(modid=Reference.MODID, name=Reference.MODNAME, version=Reference.MODVERSION, acceptedMinecraftVersions=Reference.MCVERSIONS)
public class AndHillCraft {
	
	// Create Mod Instance
	@Instance
	public static AndHillCraft instance;
	
	// Proxies
	@SidedProxy(clientSide=Reference.CLIENTPROXY, serverSide=Reference.SERVERPROXY)
	public static ICommonProxy proxy;
	
	// CreativeTab
	public static CreativeTabs tabAndHillCraft = new TabAndHillCraft(CreativeTabs.getNextID(),"TabAndHillCraft");
	
	// World Generator
	public static WorldGenerator worldGen = new WorldGenerator();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		ModRecipes.registerRecipes();
		GameRegistry.registerFuelHandler(new FuelHandler());
		GameRegistry.registerWorldGenerator(worldGen, 0);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
}
