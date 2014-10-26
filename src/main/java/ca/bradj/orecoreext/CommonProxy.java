package ca.bradj.orecoreext;

import ca.bradj.orecoreext.item.OreCoreExtendedItems;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
	}
	
	public void init(FMLInitializationEvent e) {
		OreCoreExtendedItems.init();
	}
	
	public void postInit(FMLPostInitializationEvent e) {
		
	}
	
}
