package com.cmplx.cmplxcore_materials.items.CrushbowlBase;

import com.cmplx.cmplxcore_materials.CMPLXCoreMaterials;
import com.cmplx.cmplxcore_materials.tiers.ModTiers;
import com.cmplx.cmplxcore_materials.tooltypes.CrushbowlItem;

import net.minecraft.item.Item;

public class GraphiteCrushbowl extends CrushbowlItem {
	public GraphiteCrushbowl() {
		super(ModTiers.GRAPHITE, -2, 0.0F, (new Item.Properties()).group(CMPLXCoreMaterials.CMPLXCORE_MATERIALS_TAB));
	}
}