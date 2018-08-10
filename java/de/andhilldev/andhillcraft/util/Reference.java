package de.andhilldev.andhillcraft.util;

public class Reference {

	public static final String MODID = "andhillcraft";
	public static final String MODNAME = "AndHillCraft";
	public static final String MODVERSION = "1.0.0-alpha";
	public static final String MCVERSIONS = "[1.12.2]";
	
	public static final String CLIENTPROXY = "de.andhilldev.andhillcraft.proxies.ClientProxy";
	public static final String SERVERPROXY = "de.andhilldev.andhillcraft.proxies.ServerProxy";
	
	public static enum backPackSize {
		
		SMALL("small"),
		MEDIUM("medium"),
		BIG("big");
		
		private String inventorySize;
		
		backPackSize(String inventorySize) {
			this.inventorySize = inventorySize;
		}

		public String getInventorySize() {
			return inventorySize;
		}
		
	}
	
}