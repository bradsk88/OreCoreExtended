package ca.bradj.orecoreext.item.zinc;

import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.forge.OreCoreRegistration;
import ca.bradj.orecoreext.item.IDsExtended;
import ca.bradj.orecoreext.item.OreCoreExtendedItems;

public class ZincExt {

	private static final String ZINC_CRYSTAL_DICT = "crystalZinc";
	private static final String ZINC_SHARD_DICT = "shardZinc";
	private static final String ZINC_CLUMP_DICT = "clumpZinc";
	private static final String ZINC_DIRTY_DUST_DICT = "dustDirtyZinc";

	private static final String ZINC_CRYSTAL_NAME = "Zinc.Crystal";
	private static final String ZINC_SHARD_NAME = "Zinc.Shard";
	private static final String ZINC_CLUMP_NAME = "Zinc.Clump";
	private static final String ZINC_DIRTY_DUST_NAME = "Zinc.Dirty.Dust";

	public static void init() {

		OreCoreExtendedItems.zincClump = OreCoreRegistration.registerItem(new ZincClump(IDsExtended.ZINC_CLUMP_ID), ZINC_CLUMP_NAME);
		OreCoreExtendedItems.zincCrystal = OreCoreRegistration.registerItem(new ZincCrystal(IDsExtended.ZINC_CRYSTAL_ID), ZINC_CRYSTAL_NAME);
		OreCoreExtendedItems.zincShard = OreCoreRegistration.registerItem(new ZincShard(IDsExtended.ZINC_SHARD_ID), ZINC_SHARD_NAME);
		OreCoreExtendedItems.zincDirtyDust = OreCoreRegistration.registerItem(new ZincDirtyDust(IDsExtended.ZINC_DIRTY_DUST_ID), ZINC_DIRTY_DUST_NAME);

		OreDictionary.registerOre(ZINC_CLUMP_DICT, OreCoreExtendedItems.zincClump);
		OreDictionary.registerOre(ZINC_CRYSTAL_DICT, OreCoreExtendedItems.zincCrystal);
		OreDictionary.registerOre(ZINC_SHARD_DICT, OreCoreExtendedItems.zincShard);
		OreDictionary.registerOre(ZINC_DIRTY_DUST_DICT, OreCoreExtendedItems.zincDirtyDust);

		//TODO: Add recipes errwhere, if appropriate (check what Mekanism does) -BJ

	}

}
