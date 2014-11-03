package ca.bradj.orecoreext.item.copper;

import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.forge.OreCoreRegistration;
import ca.bradj.orecoreext.item.IDsExtended;
import ca.bradj.orecoreext.item.OreCoreExtendedItems;

public class CopperExt {

	private static final String COPPER_CRYSTAL_DICT = "crystalCopper";
	private static final String COPPER_SHARD_DICT = "shardCopper";
	private static final String COPPER_CLUMP_DICT = "clumpCopper";
	private static final String COPPER_DIRTY_DUST_DICT = "dustDirtyCopper";

	private static final String COPPER_CRYSTAL_NAME = "Copper.Crystal";
	private static final String COPPER_SHARD_NAME = "Copper.Shard";
	private static final String COPPER_CLUMP_NAME = "Copper.Clump";
	private static final String COPPER_DIRTY_DUST_NAME = "Copper.Dirty.Dust";

	public static void init() {

		OreCoreExtendedItems.copperClump = OreCoreRegistration.registerItem(new CopperClump(IDsExtended.COPPER_CLUMP_ID), COPPER_CLUMP_NAME);
		OreCoreExtendedItems.copperCrystal = OreCoreRegistration.registerItem(new CopperCrystal(IDsExtended.COPPER_CRYSTAL_ID), COPPER_CRYSTAL_NAME);
		OreCoreExtendedItems.copperShard = OreCoreRegistration.registerItem(new CopperShard(IDsExtended.COPPER_SHARD_ID), COPPER_SHARD_NAME);
		OreCoreExtendedItems.copperDirtyDust = OreCoreRegistration.registerItem(new CopperDirtyDust(IDsExtended.COPPER_DIRTY_DUST_ID), COPPER_DIRTY_DUST_NAME);

		OreDictionary.registerOre(COPPER_CLUMP_DICT, OreCoreExtendedItems.copperClump);
		OreDictionary.registerOre(COPPER_CRYSTAL_DICT, OreCoreExtendedItems.copperCrystal);
		OreDictionary.registerOre(COPPER_SHARD_DICT, OreCoreExtendedItems.copperShard);
		OreDictionary.registerOre(COPPER_DIRTY_DUST_DICT, OreCoreExtendedItems.copperDirtyDust);

		//TODO: Add recipes errwhere, if appropriate (check what Mekanism does) -BJ

	}
}
