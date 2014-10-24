package ca.bradj.orecoreext.item.manganese;

import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.OreCoreItems.OreCoreRegistration;
import ca.bradj.orecoreext.item.IDsExtended;
import ca.bradj.orecoreext.item.OreCoreExtendedItems;
import ca.bradj.orecoreext.item.manganese.ManganeseClump;
import ca.bradj.orecoreext.item.manganese.ManganeseCrystal;
import ca.bradj.orecoreext.item.manganese.ManganeseShard;

public class ManganeseExt {

	private static final String MANGANESE_CRYSTAL_DICT = "crystalManganese";
	private static final String MANGANESE_SHARD_DICT = "shardManganese";
	private static final String MANGANESE_CLUMP_DICT = "clumpManganese";
	private static final String MANGANESE_DIRTY_DUST_DICT = "dustDirtyManganese";

	private static final String MANGANESE_CRYSTAL_NAME = "Manganese.Crystal";
	private static final String MANGANESE_SHARD_NAME = "Manganese.Shard";
	private static final String MANGANESE_CLUMP_NAME = "Manganese.Clump";
	private static final String MANGANESE_DIRTY_DUST_NAME = "Manganese.Dirty.Dust";

	public static void init() {

		OreCoreExtendedItems.manganeseClump = OreCoreRegistration.registerItem(new ManganeseClump(IDsExtended.MANGANESE_CLUMP_ID), MANGANESE_CLUMP_NAME);
		OreCoreExtendedItems.manganeseCrystal = OreCoreRegistration.registerItem(new ManganeseCrystal(IDsExtended.MANGANESE_CRYSTAL_ID), MANGANESE_CRYSTAL_NAME);
		OreCoreExtendedItems.manganeseShard = OreCoreRegistration.registerItem(new ManganeseShard(IDsExtended.MANGANESE_SHARD_ID), MANGANESE_SHARD_NAME);
		OreCoreExtendedItems.manganeseDirtyDust = OreCoreRegistration.registerItem(new ManganeseDirtyDust(IDsExtended.MANGANESE_DIRTY_DUST_ID), MANGANESE_DIRTY_DUST_NAME);

		OreDictionary.registerOre(MANGANESE_CLUMP_DICT, OreCoreExtendedItems.manganeseClump);
		OreDictionary.registerOre(MANGANESE_CRYSTAL_DICT, OreCoreExtendedItems.manganeseCrystal);
		OreDictionary.registerOre(MANGANESE_SHARD_DICT, OreCoreExtendedItems.manganeseShard);
		OreDictionary.registerOre(MANGANESE_DIRTY_DUST_DICT, OreCoreExtendedItems.manganeseDirtyDust);

		//TODO: Add recipes errwhere, if appropriate (check what Mekanism does) -BJ

	}	
}
