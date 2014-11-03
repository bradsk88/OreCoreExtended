package ca.bradj.orecoreext.item.gold;

import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.forge.OreCoreRegistration;
import ca.bradj.orecoreext.item.IDsExtended;
import ca.bradj.orecoreext.item.OreCoreExtendedItems;

public class GoldExt {

	private static final String GOLD_CRYSTAL_DICT = "crystalGold";
	private static final String GOLD_SHARD_DICT = "shardGold";
	private static final String GOLD_CLUMP_DICT = "clumpGold";
	private static final String GOLD_DIRTY_DUST_DICT = "dustDirtyGold";

	private static final String GOLD_CRYSTAL_NAME = "Gold.Crystal";
	private static final String GOLD_SHARD_NAME = "Gold.Shard";
	private static final String GOLD_CLUMP_NAME = "Gold.Clump";
	private static final String GOLD_DIRTY_DUST_NAME = "Gold.Dirty.Dust";

	public static void init() {

		OreCoreExtendedItems.goldClump = OreCoreRegistration.registerItem(new GoldClump(IDsExtended.GOLD_CLUMP_ID), GOLD_CLUMP_NAME);
		OreCoreExtendedItems.goldCrystal = OreCoreRegistration.registerItem(new GoldCrystal(IDsExtended.GOLD_CRYSTAL_ID), GOLD_CRYSTAL_NAME);
		OreCoreExtendedItems.goldShard = OreCoreRegistration.registerItem(new GoldShard(IDsExtended.GOLD_SHARD_ID), GOLD_SHARD_NAME);
		OreCoreExtendedItems.goldDirtyDust = OreCoreRegistration.registerItem(new GoldDirtyDust(IDsExtended.GOLD_DIRTY_DUST_ID), GOLD_DIRTY_DUST_NAME);

		OreDictionary.registerOre(GOLD_CLUMP_DICT, OreCoreExtendedItems.goldClump);
		OreDictionary.registerOre(GOLD_CRYSTAL_DICT, OreCoreExtendedItems.goldCrystal);
		OreDictionary.registerOre(GOLD_SHARD_DICT, OreCoreExtendedItems.goldShard);
		OreDictionary.registerOre(GOLD_DIRTY_DUST_DICT, OreCoreExtendedItems.goldDirtyDust);

		//TODO: Add recipes errwhere, if appropriate (check what Mekanism does) -BJ

	}
}
