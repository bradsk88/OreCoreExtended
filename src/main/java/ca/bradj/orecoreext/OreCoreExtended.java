package ca.bradj.orecoreext;

import java.util.logging.Logger;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import ca.bradj.orecoreext.item.OreCoreExtendedItems;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = OreCoreExtended.MODID, version = OreCoreExtended.VERSION, dependencies = "required-after:OreCore@[2.1.0,)")
public class OreCoreExtended {

	@SidedProxy(clientSide="ca.bradj.orecoreext.ClientProxy", serverSide="ca.bradj.orecoreext.ServerProxy")
    public static CommonProxy proxy;

	@SuppressWarnings("unused")
	private static final Logger LOGGER = Logger.getLogger("Minecraft");

	public static final String MODID = "OreCoreExtended";
	public static final String VERSION = "0.1.0";

	public static CreativeTabs tabOreCoreExtended = new CreativeTabs("tabOreCoreExtended") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return OreCoreExtendedItems.copperCrystal;
	    }
	};

    /**
     * Run before anything else. Read your config, create blocks, items, etc, and
     * register them with the GameRegistry.
     */
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        OreCoreExtended.proxy.preInit(e);
    }

    /**
     * Do your mod setup. Build whatever data structures you care about. Register recipes.
     */
    @EventHandler
    public void init(FMLInitializationEvent e) {
    	OreCoreExtended.proxy.init(e);
    }

    /**
     * Handle interaction with other mods, complete your setup based on this.
     */
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	OreCoreExtended.proxy.postInit(e);
    }

}