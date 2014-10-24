package ca.bradj.orecoreext.item.bronze;

import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.OreCoreItems.OreCoreRegistration;
import ca.bradj.orecoreext.item.IDsExtended;
import ca.bradj.orecoreext.item.OreCoreExtendedItems;
import ca.bradj.orecoreext.item.bronze.BronzeClump;
import ca.bradj.orecoreext.item.bronze.BronzeCrystal;
import ca.bradj.orecoreext.item.bronze.BronzeShard;


public class BronzeExt {

	private static final String BRONZE_CRYSTAL_DICT = "crystalBronze";
	private static final String BRONZE_SHARD_DICT = "shardBronze";
	private static final String BRONZE_CLUMP_DICT = "clumpBronze";
	private static final String BRONZE_DIRTY_DUST_DICT = "dustDirtyBronze";

	private static final String BRONZE_CRYSTAL_NAME = "Bronze.Crystal";
	private static final String BRONZE_SHARD_NAME = "Bronze.Shard";
	private static final String BRONZE_CLUMP_NAME = "Bronze.Clump";
	private static final String BRONZE_DIRTY_DUST_NAME = "Bronze.Dirty.Dust";

	public static void init() {

		OreCoreExtendedItems.bronzeClump = OreCoreRegistration.registerItem(new BronzeClump(IDsExtended.BRONZE_CLUMP_ID), BRONZE_CLUMP_NAME);
		OreCoreExtendedItems.bronzeCrystal = OreCoreRegistration.registerItem(new BronzeCrystal(IDsExtended.BRONZE_CRYSTAL_ID), BRONZE_CRYSTAL_NAME);
		OreCoreExtendedItems.bronzeShard = OreCoreRegistration.registerItem(new BronzeShard(IDsExtended.BRONZE_SHARD_ID), BRONZE_SHARD_NAME);
		OreCoreExtendedItems.bronzeDirtyDust = OreCoreRegistration.registerItem(new BronzeDirtyDust(IDsExtended.BRONZE_DIRTY_DUST_ID), BRONZE_DIRTY_DUST_NAME);

		OreDictionary.registerOre(BRONZE_CLUMP_DICT, OreCoreExtendedItems.bronzeClump);
		OreDictionary.registerOre(BRONZE_CRYSTAL_DICT, OreCoreExtendedItems.bronzeCrystal);
		OreDictionary.registerOre(BRONZE_SHARD_DICT, OreCoreExtendedItems.bronzeShard);
		OreDictionary.registerOre(BRONZE_DIRTY_DUST_DICT, OreCoreExtendedItems.bronzeDirtyDust);

		//TODO: Add recipes errwhere, if appropriate (check what Mekanism does) -BJ

	}
}
