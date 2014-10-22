package ca.bradj.orecoreext.item.steel;

import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.OreCoreItems.OreCoreRegistration;
import ca.bradj.orecoreext.item.IDsExtended;
import ca.bradj.orecoreext.item.OreCoreExtendedItems;
import ca.bradj.orecoreext.item.steel.SteelClump;
import ca.bradj.orecoreext.item.steel.SteelCrystal;
import ca.bradj.orecoreext.item.steel.SteelShard;

public class SteelExt {

	private static final String STEEL_CRYSTAL_DICT = "crystalSteel";
	private static final String STEEL_SHARD_DICT = "shardSteel";
	private static final String STEEL_CLUMP_DICT = "clumpSteel";

	private static final String STEEL_CRYSTAL_NAME = "Steel.Crystal";
	private static final String STEEL_SHARD_NAME = "Steel.Shard";
	private static final String STEEL_CLUMP_NAME = "Steel.Clump";

	public static void init() {

		OreCoreExtendedItems.steelClump = OreCoreRegistration.registerItem(new SteelClump(IDsExtended.STEEL_CLUMP_ID), STEEL_CLUMP_NAME);
		OreCoreExtendedItems.steelCrystal = OreCoreRegistration.registerItem(new SteelCrystal(IDsExtended.STEEL_CRYSTAL_ID), STEEL_CRYSTAL_NAME);
		OreCoreExtendedItems.steelShard = OreCoreRegistration.registerItem(new SteelShard(IDsExtended.STEEL_SHARD_ID), STEEL_SHARD_NAME);

		OreDictionary.registerOre(STEEL_CLUMP_DICT, OreCoreExtendedItems.steelClump);
		OreDictionary.registerOre(STEEL_CRYSTAL_DICT, OreCoreExtendedItems.steelCrystal);
		OreDictionary.registerOre(STEEL_SHARD_DICT, OreCoreExtendedItems.steelShard);

		//TODO: Add recipes errwhere, if appropriate (check what Mekanism does) -BJ

	}
	
}
