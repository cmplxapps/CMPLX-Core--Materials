package com.cmplx.cmplxcore_materials.items.HammerBase;

import com.cmplx.cmplxcore_materials.CMPLXCoreMaterials;
import com.cmplx.cmplxcore_materials.tiers.ModTiers;
import com.cmplx.cmplxcore_materials.tooltypes.HammerItem;

import net.minecraft.item.Item;

public class GraphiteHammer extends HammerItem {
	public GraphiteHammer() {
		super(ModTiers.GRAPHITE, 4, -3.0F, (new Item.Properties()).group(CMPLXCoreMaterials.CMPLXCORE_MATERIALS_TAB));
	}
}