package ca.bradj.orecoreext.item;

import net.minecraft.item.Item;
import ca.bradj.orecoreext.OreCoreExtended;

public class OreCoreExtendedItem extends Item {

	public OreCoreExtendedItem(int id, String name) {
		setTextureName("orecoreext:"+name);
		setCreativeTab(OreCoreExtended.tabOreCoreExtended);
	}

	
	
}
