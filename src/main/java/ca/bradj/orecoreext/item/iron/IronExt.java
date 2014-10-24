package ca.bradj.orecoreext.item.iron;

import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.OreCoreItems.OreCoreRegistration;
import ca.bradj.orecoreext.item.IDsExtended;
import ca.bradj.orecoreext.item.OreCoreExtendedItems;
import ca.bradj.orecoreext.item.iron.IronClump;
import ca.bradj.orecoreext.item.iron.IronCrystal;
import ca.bradj.orecoreext.item.iron.IronShard;

public class IronExt {

	private static final String IRON_CRYSTAL_DICT = "crystalIron";
	private static final String IRON_SHARD_DICT = "shardIron";
	private static final String IRON_CLUMP_DICT = "clumpIron";
	private static final String IRON_DIRTY_DUST_DICT = "dustDirtyIron";

	private static final String IRON_CRYSTAL_NAME = "Iron.Crystal";
	private static final String IRON_SHARD_NAME = "Iron.Shard";
	private static final String IRON_CLUMP_NAME = "Iron.Clump";
	private static final String IRON_DIRTY_DUST_NAME = "Iron.Dirty.Dust";

	public static void init() {

		OreCoreExtendedItems.ironClump = OreCoreRegistration.registerItem(new IronClump(IDsExtended.IRON_CLUMP_ID), IRON_CLUMP_NAME);
		OreCoreExtendedItems.ironCrystal = OreCoreRegistration.registerItem(new IronCrystal(IDsExtended.IRON_CRYSTAL_ID), IRON_CRYSTAL_NAME);
		OreCoreExtendedItems.ironShard = OreCoreRegistration.registerItem(new IronShard(IDsExtended.IRON_SHARD_ID), IRON_SHARD_NAME);
		OreCoreExtendedItems.ironDirtyDust = OreCoreRegistration.registerItem(new IronDirtyDust(IDsExtended.IRON_DIRTY_DUST_ID), IRON_DIRTY_DUST_NAME);

		OreDictionary.registerOre(IRON_CLUMP_DICT, OreCoreExtendedItems.ironClump);
		OreDictionary.registerOre(IRON_CRYSTAL_DICT, OreCoreExtendedItems.ironCrystal);
		OreDictionary.registerOre(IRON_SHARD_DICT, OreCoreExtendedItems.ironShard);
		OreDictionary.registerOre(IRON_DIRTY_DUST_DICT, OreCoreExtendedItems.ironDirtyDust);

		//TODO: Add recipes errwhere, if appropriate (check what Mekanism does) -BJ

	}
	
}
