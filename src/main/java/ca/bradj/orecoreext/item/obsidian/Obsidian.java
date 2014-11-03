package ca.bradj.orecoreext.item.obsidian;

import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.forge.OreCoreRegistration;
import ca.bradj.orecoreext.item.IDsExtended;
import ca.bradj.orecoreext.item.OreCoreExtendedItems;

public class Obsidian {

	public static final String DUST_DICT = "dustObsidian";
	public static final String INGOT_DICT = "ingotObsidian";
	public static final String NUGGET_DICT = "nuggetObsidian";
	public static final String DIRTY_DUST_DICT = "dustDirtyObsidian";
	private static final String OBSIDIAN_CLUMP_DICT = "clumpObsidian";
	private static final String OBSIDIAN_CRYSTAL_DICT = "crystalObsidian";
	private static final String OBSIDIAN_SHARD_DICT = "shardObsidian";


	private static final String OBSIDIAN_DUST_NAME = "Obsidian.Dust";
	private static final String OBSIDIAN_NUGGET_NAME = "Obsidian.Nugget";
	private static final String OBSIDIAN_INGOT_NAME = "Obsidian.Ingot";
	private static final String OBSIDIAN_DIRTY_DUST_NAME = "Obsidian.Dirty.Dust";
	private static final String OBSIDIAN_CLUMP_NAME = "Obsidian.Clump";
	private static final String OBSIDIAN_CRYSTAL_NAME = "Obsidian.Crystal";
	private static final String OBSIDIAN_SHARD_NAME = "Obsidian.Shard";

	public static void init() {
		OreCoreExtendedItems.obsidianDust = OreCoreRegistration.registerItem(new ObsidianDust(IDsExtended.OBSIDIAN_DUST_ID), OBSIDIAN_DUST_NAME);
		OreCoreExtendedItems.obsidianNugget = OreCoreRegistration.registerItem(new ObsidianNugget(IDsExtended.OBSIDIAN_NUGGET_ID), OBSIDIAN_NUGGET_NAME);
		OreCoreExtendedItems.obsidianIngot = OreCoreRegistration.registerItem(new ObsidianIngot(IDsExtended.OBSIDIAN_INGOT_ID), OBSIDIAN_INGOT_NAME);

		OreCoreExtendedItems.obsidianDirtyDust = OreCoreRegistration.registerItem(new ObsidianDirtyDust(IDsExtended.OBSIDIAN_DIRTY_DUST_ID), OBSIDIAN_DIRTY_DUST_NAME);
		OreCoreExtendedItems.obsidianClump = OreCoreRegistration.registerItem(new ObsidianClump(IDsExtended.OBSIDIAN_CLUMP_ID), OBSIDIAN_CLUMP_NAME);
		OreCoreExtendedItems.obsidianCrystal = OreCoreRegistration.registerItem(new ObsidianCrystal(IDsExtended.OBSIDIAN_CRYSTAL_ID), OBSIDIAN_CRYSTAL_NAME);
		OreCoreExtendedItems.obsidianShard = OreCoreRegistration.registerItem(new ObsidianShard(IDsExtended.OBSIDIAN_SHARD_ID), OBSIDIAN_SHARD_NAME);

		OreDictionary.registerOre(DUST_DICT, OreCoreExtendedItems.obsidianDust);
		OreDictionary.registerOre(INGOT_DICT, OreCoreExtendedItems.obsidianIngot);
		OreDictionary.registerOre(NUGGET_DICT, OreCoreExtendedItems.obsidianNugget);
		OreDictionary.registerOre(DIRTY_DUST_DICT, OreCoreExtendedItems.obsidianDirtyDust);
		OreDictionary.registerOre(OBSIDIAN_CLUMP_DICT, OreCoreExtendedItems.obsidianClump);
		OreDictionary.registerOre(OBSIDIAN_CRYSTAL_DICT, OreCoreExtendedItems.obsidianCrystal);
		OreDictionary.registerOre(OBSIDIAN_SHARD_DICT, OreCoreExtendedItems.obsidianShard);
	}

}
