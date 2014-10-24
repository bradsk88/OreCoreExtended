package ca.bradj.orecoreext.item.diamond;

import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.OreCoreItems.OreCoreRegistration;
import ca.bradj.orecoreext.item.IDsExtended;
import ca.bradj.orecoreext.item.OreCoreExtendedItems;

public class Diamond {

	public static final String DUST_DICT = "dustDiamond";
	public static final String INGOT_DICT = "ingotDiamond";
	public static final String NUGGET_DICT = "nuggetDiamond";
	private static final String DIRTY_DUST_DICT = "dustDirtyDiamond";

	private static final String DIAMOND_DUST_NAME = "Diamond.Dust";
	private static final String DIAMOND_NUGGET_NAME = "Diamond.Nugget";
	private static final String DIAMOND_INGOT_NAME = "Diamond.Ingot";
	private static final String DIAMOND_DIRTY_DUST_NAME = "Diamond.Dirty.Dust";

	public static void init() {
		OreCoreExtendedItems.diamondDust = OreCoreRegistration.registerItem(new DiamondDust(IDsExtended.DIAMOND_DUST_ID), DIAMOND_DUST_NAME);
		OreCoreExtendedItems.diamondNugget = OreCoreRegistration.registerItem(new DiamondNugget(IDsExtended.DIAMOND_NUGGET_ID), DIAMOND_NUGGET_NAME);
		OreCoreExtendedItems.diamondIngot = OreCoreRegistration.registerItem(new DiamondIngot(IDsExtended.DIAMOND_INGOT_ID), DIAMOND_INGOT_NAME);
		OreCoreExtendedItems.diamondDirtyDust = OreCoreRegistration.registerItem(new DiamondDirtyDust(IDsExtended.DIAMOND_DIRTY_DUST_ID), DIAMOND_DIRTY_DUST_NAME);
		
		OreDictionary.registerOre(DUST_DICT, OreCoreExtendedItems.diamondDust);
		OreDictionary.registerOre(INGOT_DICT, OreCoreExtendedItems.diamondIngot);
		OreDictionary.registerOre(NUGGET_DICT, OreCoreExtendedItems.diamondNugget);
		OreDictionary.registerOre(DIRTY_DUST_DICT, OreCoreExtendedItems.diamondDirtyDust);
	}
}
