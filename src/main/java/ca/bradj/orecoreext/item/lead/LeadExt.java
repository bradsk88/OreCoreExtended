package ca.bradj.orecoreext.item.lead;

import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.OreCoreItems.OreCoreRegistration;
import ca.bradj.orecoreext.item.IDsExtended;
import ca.bradj.orecoreext.item.OreCoreExtendedItems;

public class LeadExt {

	private static final String LEAD_CRYSTAL_DICT = "crystalLead";
	private static final String LEAD_SHARD_DICT = "shardLead";
	private static final String LEAD_CLUMP_DICT = "clumpLead";
	private static final String LEAD_DIRTY_DUST_DICT = "dustDirtyLead";

	private static final String LEAD_CRYSTAL_NAME = "Lead.Crystal";
	private static final String LEAD_SHARD_NAME = "Lead.Shard";
	private static final String LEAD_CLUMP_NAME = "Lead.Clump";
	private static final String LEAD_DIRTY_DUST_NAME = "Lead.Dirty.Dust";

	public static void init() {

		OreCoreExtendedItems.leadClump = OreCoreRegistration.registerItem(new LeadClump(IDsExtended.LEAD_CLUMP_ID), LEAD_CLUMP_NAME);
		OreCoreExtendedItems.leadCrystal = OreCoreRegistration.registerItem(new LeadCrystal(IDsExtended.LEAD_CRYSTAL_ID), LEAD_CRYSTAL_NAME);
		OreCoreExtendedItems.leadShard = OreCoreRegistration.registerItem(new LeadShard(IDsExtended.LEAD_SHARD_ID), LEAD_SHARD_NAME);
		OreCoreExtendedItems.leadDirtyDust = OreCoreRegistration.registerItem(new LeadDirtyDust(IDsExtended.LEAD_DIRTY_DUST_ID), LEAD_DIRTY_DUST_NAME);

		OreDictionary.registerOre(LEAD_CLUMP_DICT, OreCoreExtendedItems.leadClump);
		OreDictionary.registerOre(LEAD_CRYSTAL_DICT, OreCoreExtendedItems.leadCrystal);
		OreDictionary.registerOre(LEAD_SHARD_DICT, OreCoreExtendedItems.leadShard);
		OreDictionary.registerOre(LEAD_DIRTY_DUST_DICT, OreCoreExtendedItems.leadDirtyDust);

		//TODO: Add recipes errwhere, if appropriate (check what Mekanism does) -BJ

	}	

}
