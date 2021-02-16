package com.cmplx.cmplxcore_materials.items.HammerBase;

import com.cmplx.cmplxcore_materials.CMPLXCoreMaterials;
import com.cmplx.cmplxcore_materials.tooltypes.HammerItem;

import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;

public class WoodHammer extends HammerItem {
	public WoodHammer() {
		super(ItemTier.WOOD, 4, -3.2F, (new Item.Properties()).group(CMPLXCoreMaterials.CMPLXCORE_MATERIALS_TAB));
	}
}