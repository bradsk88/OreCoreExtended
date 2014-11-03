package ca.bradj.orecoreext.item.osmium;

import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.forge.OreCoreRegistration;
import ca.bradj.orecoreext.item.IDsExtended;
import ca.bradj.orecoreext.item.OreCoreExtendedItems;

public class OsmiumExt {

	private static final String OSMIUM_CRYSTAL_DICT = "crystalOsmium";
	private static final String OSMIUM_SHARD_DICT = "shardOsmium";
	private static final String OSMIUM_CLUMP_DICT = "clumpOsmium";
	private static final String OSMIUM_DIRTY_DUST_DICT = "dustDirtyOsmium";

	private static final String OSMIUM_CRYSTAL_NAME = "Osmium.Crystal";
	private static final String OSMIUM_SHARD_NAME = "Osmium.Shard";
	private static final String OSMIUM_CLUMP_NAME = "Osmium.Clump";
	private static final String OSMIUM_DIRTY_DUST_NAME = "Osmium.Dirty.Dust";

	public static void init() {

		OreCoreExtendedItems.osmiumClump = OreCoreRegistration.registerItem(new OsmiumClump(IDsExtended.OSMIUM_CLUMP_ID), OSMIUM_CLUMP_NAME);
		OreCoreExtendedItems.osmiumCrystal = OreCoreRegistration.registerItem(new OsmiumCrystal(IDsExtended.OSMIUM_CRYSTAL_ID), OSMIUM_CRYSTAL_NAME);
		OreCoreExtendedItems.osmiumShard = OreCoreRegistration.registerItem(new OsmiumShard(IDsExtended.OSMIUM_SHARD_ID), OSMIUM_SHARD_NAME);
		OreCoreExtendedItems.osmiumDirtyDust = OreCoreRegistration.registerItem(new OsmiumDirtyDust(IDsExtended.OSMIUM_DIRTY_DUST_ID), OSMIUM_DIRTY_DUST_NAME);

		OreDictionary.registerOre(OSMIUM_CLUMP_DICT, OreCoreExtendedItems.osmiumClump);
		OreDictionary.registerOre(OSMIUM_CRYSTAL_DICT, OreCoreExtendedItems.osmiumCrystal);
		OreDictionary.registerOre(OSMIUM_SHARD_DICT, OreCoreExtendedItems.osmiumShard);
		OreDictionary.registerOre(OSMIUM_DIRTY_DUST_DICT, OreCoreExtendedItems.osmiumDirtyDust);

		//TODO: Add recipes errwhere, if appropriate (check what Mekanism does) -BJ

	}

}
