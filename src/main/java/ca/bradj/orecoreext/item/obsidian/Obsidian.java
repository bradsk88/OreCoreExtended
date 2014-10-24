package ca.bradj.orecoreext.item.obsidian;

import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.OreCoreItems.OreCoreRegistration;
import ca.bradj.orecoreext.item.IDsExtended;
import ca.bradj.orecoreext.item.OreCoreExtendedItems;

public class Obsidian {
	
	public static final String DUST_DICT = "dustObsidian";
	public static final String INGOT_DICT = "ingotObsidian";
	public static final String NUGGET_DICT = "nuggetObsidian";
	public static final String DIRTY_DUST_DICT = "dustDirtyObsidian";

	private static final String OBSIDIAN_DUST_NAME = "Obsidian.Dust";
	private static final String OBSIDIAN_NUGGET_NAME = "Obsidian.Nugget";
	private static final String OBSIDIAN_INGOT_NAME = "Obsidian.Ingot";
	private static final String OBSIDIAN_DIRTY_DUST_NAME = "Obsidian.Dirty.Dust";
		
	public static void init() {
		OreCoreExtendedItems.obsidianDust = OreCoreRegistration.registerItem(new ObsidianDust(IDsExtended.OBSIDIAN_DUST_ID), OBSIDIAN_DUST_NAME);
		OreCoreExtendedItems.obsidianNugget = OreCoreRegistration.registerItem(new ObsidianNugget(IDsExtended.OBSIDIAN_NUGGET_ID), OBSIDIAN_NUGGET_NAME);
		OreCoreExtendedItems.obsidianIngot = OreCoreRegistration.registerItem(new ObsidianIngot(IDsExtended.OBSIDIAN_INGOT_ID), OBSIDIAN_INGOT_NAME);
		OreCoreExtendedItems.obsidianDirtyDust = OreCoreRegistration.registerItem(new ObsidianDirtyDust(IDsExtended.OBSIDIAN_DIRTY_DUST_ID), OBSIDIAN_DIRTY_DUST_NAME);

		OreDictionary.registerOre(DUST_DICT, OreCoreExtendedItems.obsidianDust);
		OreDictionary.registerOre(INGOT_DICT, OreCoreExtendedItems.obsidianIngot);
		OreDictionary.registerOre(NUGGET_DICT, OreCoreExtendedItems.obsidianNugget);
		OreDictionary.registerOre(DIRTY_DUST_DICT, OreCoreExtendedItems.obsidianDirtyDust);
	}
	
}
