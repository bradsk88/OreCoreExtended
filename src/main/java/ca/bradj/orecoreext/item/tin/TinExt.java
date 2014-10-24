package ca.bradj.orecoreext.item.tin;

import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.OreCoreItems.OreCoreRegistration;
import ca.bradj.orecoreext.item.IDsExtended;
import ca.bradj.orecoreext.item.OreCoreExtendedItems;
import ca.bradj.orecoreext.item.tin.TinClump;
import ca.bradj.orecoreext.item.tin.TinCrystal;
import ca.bradj.orecoreext.item.tin.TinShard;

public class TinExt {

	private static final String TIN_CRYSTAL_DICT = "crystalTin";
	private static final String TIN_SHARD_DICT = "shardTin";
	private static final String TIN_CLUMP_DICT = "clumpTin";
	private static final String TIN_DIRTY_DUST_DICT = "dustDirtyTin";

	private static final String TIN_CRYSTAL_NAME = "Tin.Crystal";
	private static final String TIN_SHARD_NAME = "Tin.Shard";
	private static final String TIN_CLUMP_NAME = "Tin.Clump";
	private static final String TIN_DIRTY_DUST_NAME = "Tin.Dirty.Dust";

	public static void init() {

		OreCoreExtendedItems.tinClump = OreCoreRegistration.registerItem(new TinClump(IDsExtended.TIN_CLUMP_ID), TIN_CLUMP_NAME);
		OreCoreExtendedItems.tinCrystal = OreCoreRegistration.registerItem(new TinCrystal(IDsExtended.TIN_CRYSTAL_ID), TIN_CRYSTAL_NAME);
		OreCoreExtendedItems.tinShard = OreCoreRegistration.registerItem(new TinShard(IDsExtended.TIN_SHARD_ID), TIN_SHARD_NAME);
		OreCoreExtendedItems.tinDirtyDust = OreCoreRegistration.registerItem(new TinDirtyDust(IDsExtended.TIN_DIRTY_DUST_ID), TIN_DIRTY_DUST_NAME);

		OreDictionary.registerOre(TIN_CLUMP_DICT, OreCoreExtendedItems.tinClump);
		OreDictionary.registerOre(TIN_CRYSTAL_DICT, OreCoreExtendedItems.tinCrystal);
		OreDictionary.registerOre(TIN_SHARD_DICT, OreCoreExtendedItems.tinShard);
		OreDictionary.registerOre(TIN_DIRTY_DUST_DICT, OreCoreExtendedItems.tinDirtyDust);

		//TODO: Add recipes errwhere, if appropriate (check what Mekanism does) -BJ

	}
	
}
