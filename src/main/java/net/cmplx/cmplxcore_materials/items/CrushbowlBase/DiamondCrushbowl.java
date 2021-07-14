package net.cmplx.cmplxcore_materials.items.CrushbowlBase;

import net.cmplx.cmplxcore_materials.CMPLXCoreMaterials;
import net.cmplx.cmplxcore_materials.tooltypes.CrushbowlItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;

public class DiamondCrushbowl extends CrushbowlItem {
	public DiamondCrushbowl() {
		super(ItemTier.DIAMOND, -3, 0.0F, (new Item.Properties()).group(CMPLXCoreMaterials.CMPLXCORE_MATERIALS_TAB));
	}
}