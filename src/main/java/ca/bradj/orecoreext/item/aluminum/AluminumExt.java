package ca.bradj.orecoreext.item.aluminum;

import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.OreCoreItems.OreCoreRegistration;
import ca.bradj.orecoreext.item.IDsExtended;
import ca.bradj.orecoreext.item.OreCoreExtendedItems;

public class AluminumExt {

	private static final String ALUMINUM_CRYSTAL_DICT = "crystalAluminum";
	private static final String ALUMINUM_SHARD_DICT = "shardAluminum";
	private static final String ALUMINUM_CLUMP_DICT = "clumpAluminum";

	private static final String ALUMINUM_CRYSTAL_NAME = "Aluminum.Crystal";
	private static final String ALUMINUM_SHARD_NAME = "Aluminum.Shard";
	private static final String ALUMINUM_CLUMP_NAME = "Aluminum.Clump";

	public static void init() {

		OreCoreExtendedItems.aluminumClump = OreCoreRegistration.registerItem(new AluminumClump(IDsExtended.ALUMINUM_CLUMP_ID), ALUMINUM_CLUMP_NAME);
		OreCoreExtendedItems.aluminumCrystal = OreCoreRegistration.registerItem(new AluminumCrystal(IDsExtended.ALUMINUM_CRYSTAL_ID), ALUMINUM_CRYSTAL_NAME);
		OreCoreExtendedItems.aluminumShard = OreCoreRegistration.registerItem(new AluminumShard(IDsExtended.ALUMINUM_SHARD_ID), ALUMINUM_SHARD_NAME);

		OreDictionary.registerOre(ALUMINUM_CLUMP_DICT, OreCoreExtendedItems.aluminumClump);
		OreDictionary.registerOre(ALUMINUM_CRYSTAL_DICT, OreCoreExtendedItems.aluminumCrystal);
		OreDictionary.registerOre(ALUMINUM_SHARD_DICT, OreCoreExtendedItems.aluminumShard);

		//TODO: Add recipes errwhere, if appropriate (check what Mekanism does) -BJ

	}

}
