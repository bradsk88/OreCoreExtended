package ca.bradj.orecoreext.item.nickel;

import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.OreCoreItems.OreCoreRegistration;
import ca.bradj.orecoreext.item.IDsExtended;
import ca.bradj.orecoreext.item.OreCoreExtendedItems;
import ca.bradj.orecoreext.item.nickel.NickelClump;
import ca.bradj.orecoreext.item.nickel.NickelCrystal;
import ca.bradj.orecoreext.item.nickel.NickelShard;

public class NickelExt {

	private static final String NICKEL_CRYSTAL_DICT = "crystalNickel";
	private static final String NICKEL_SHARD_DICT = "shardNickel";
	private static final String NICKEL_CLUMP_DICT = "clumpNickel";

	private static final String NICKEL_CRYSTAL_NAME = "Nickel.Crystal";
	private static final String NICKEL_SHARD_NAME = "Nickel.Shard";
	private static final String NICKEL_CLUMP_NAME = "Nickel.Clump";

	public static void init() {

		OreCoreExtendedItems.nickelClump = OreCoreRegistration.registerItem(new NickelClump(IDsExtended.NICKEL_CLUMP_ID), NICKEL_CLUMP_NAME);
		OreCoreExtendedItems.nickelCrystal = OreCoreRegistration.registerItem(new NickelCrystal(IDsExtended.NICKEL_CRYSTAL_ID), NICKEL_CRYSTAL_NAME);
		OreCoreExtendedItems.nickelShard = OreCoreRegistration.registerItem(new NickelShard(IDsExtended.NICKEL_SHARD_ID), NICKEL_SHARD_NAME);

		OreDictionary.registerOre(NICKEL_CLUMP_DICT, OreCoreExtendedItems.nickelClump);
		OreDictionary.registerOre(NICKEL_CRYSTAL_DICT, OreCoreExtendedItems.nickelCrystal);
		OreDictionary.registerOre(NICKEL_SHARD_DICT, OreCoreExtendedItems.nickelShard);

		//TODO: Add recipes errwhere, if appropriate (check what Mekanism does) -BJ

	}
}
