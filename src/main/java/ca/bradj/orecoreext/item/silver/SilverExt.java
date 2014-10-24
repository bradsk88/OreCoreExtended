package ca.bradj.orecoreext.item.silver;

import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.OreCoreItems.OreCoreRegistration;
import ca.bradj.orecoreext.item.IDsExtended;
import ca.bradj.orecoreext.item.OreCoreExtendedItems;
import ca.bradj.orecoreext.item.silver.SilverClump;
import ca.bradj.orecoreext.item.silver.SilverCrystal;
import ca.bradj.orecoreext.item.silver.SilverShard;

public class SilverExt {

	private static final String SILVER_CRYSTAL_DICT = "crystalSilver";
	private static final String SILVER_SHARD_DICT = "shardSilver";
	private static final String SILVER_CLUMP_DICT = "clumpSilver";
	private static final String SILVER_DIRTY_DUST_DICT = "dustDirtySilver";

	private static final String SILVER_CRYSTAL_NAME = "Silver.Crystal";
	private static final String SILVER_SHARD_NAME = "Silver.Shard";
	private static final String SILVER_CLUMP_NAME = "Silver.Clump";
	private static final String SILVER_DIRTY_DUST_NAME = "Silver.Dirty.Dust";

	public static void init() {

		OreCoreExtendedItems.silverClump = OreCoreRegistration.registerItem(new SilverClump(IDsExtended.SILVER_CLUMP_ID), SILVER_CLUMP_NAME);
		OreCoreExtendedItems.silverCrystal = OreCoreRegistration.registerItem(new SilverCrystal(IDsExtended.SILVER_CRYSTAL_ID), SILVER_CRYSTAL_NAME);
		OreCoreExtendedItems.silverShard = OreCoreRegistration.registerItem(new SilverShard(IDsExtended.SILVER_SHARD_ID), SILVER_SHARD_NAME);
		OreCoreExtendedItems.silverDirtyDust = OreCoreRegistration.registerItem(new SilverDirtyDust(IDsExtended.SILVER_DIRTY_DUST_ID), SILVER_DIRTY_DUST_NAME);

		OreDictionary.registerOre(SILVER_CLUMP_DICT, OreCoreExtendedItems.silverClump);
		OreDictionary.registerOre(SILVER_CRYSTAL_DICT, OreCoreExtendedItems.silverCrystal);
		OreDictionary.registerOre(SILVER_SHARD_DICT, OreCoreExtendedItems.silverShard);
		OreDictionary.registerOre(SILVER_DIRTY_DUST_DICT, OreCoreExtendedItems.silverDirtyDust);

		//TODO: Add recipes errwhere, if appropriate (check what Mekanism does) -BJ

	}
	
}
