package ca.bradj.orecoreext.item.brass;

import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.OreCoreItems.OreCoreRegistration;
import ca.bradj.orecoreext.item.IDsExtended;
import ca.bradj.orecoreext.item.OreCoreExtendedItems;
import ca.bradj.orecoreext.item.brass.BrassClump;
import ca.bradj.orecoreext.item.brass.BrassCrystal;
import ca.bradj.orecoreext.item.brass.BrassShard;

public class BrassExt {

	private static final String BRASS_CRYSTAL_DICT = "crystalBrass";
	private static final String BRASS_SHARD_DICT = "shardBrass";
	private static final String BRASS_CLUMP_DICT = "clumpBrass";
	private static final String BRASS_DIRTY_DUST_DICT = "dustDirtyBrass";

	private static final String BRASS_CRYSTAL_NAME = "Brass.Crystal";
	private static final String BRASS_SHARD_NAME = "Brass.Shard";
	private static final String BRASS_CLUMP_NAME = "Brass.Clump";
	private static final String BRASS_DIRTY_DUST_NAME = "Brass.Dirty.Dust";

	public static void init() {

		OreCoreExtendedItems.brassClump = OreCoreRegistration.registerItem(new BrassClump(IDsExtended.BRASS_CLUMP_ID), BRASS_CLUMP_NAME);
		OreCoreExtendedItems.brassCrystal = OreCoreRegistration.registerItem(new BrassCrystal(IDsExtended.BRASS_CRYSTAL_ID), BRASS_CRYSTAL_NAME);
		OreCoreExtendedItems.brassShard = OreCoreRegistration.registerItem(new BrassShard(IDsExtended.BRASS_SHARD_ID), BRASS_SHARD_NAME);
		OreCoreExtendedItems.brassDirtyDust = OreCoreRegistration.registerItem(new BrassDirtyDust(IDsExtended.BRASS_DIRTY_DUST_ID), BRASS_DIRTY_DUST_NAME);

		OreDictionary.registerOre(BRASS_CLUMP_DICT, OreCoreExtendedItems.brassClump);
		OreDictionary.registerOre(BRASS_CRYSTAL_DICT, OreCoreExtendedItems.brassCrystal);
		OreDictionary.registerOre(BRASS_SHARD_DICT, OreCoreExtendedItems.brassShard);
		OreDictionary.registerOre(BRASS_DIRTY_DUST_DICT, OreCoreExtendedItems.brassDirtyDust);

		//TODO: Add recipes errwhere, if appropriate (check what Mekanism does) -BJ

	}

}
