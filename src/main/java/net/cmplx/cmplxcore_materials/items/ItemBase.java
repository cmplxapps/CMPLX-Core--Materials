package net.cmplx.cmplxcore_materials.items;

import net.cmplx.cmplxcore_materials.CMPLXCoreMaterials;
import net.minecraft.item.Item;

public class ItemBase extends Item {
	public ItemBase(){
		super(new Item.Properties().group(CMPLXCoreMaterials.CMPLXCORE_MATERIALS_TAB));
	}
}