package net.cmplx.cmplxcore_materials.items.CrushbowlBase;

import net.cmplx.cmplxcore_materials.CMPLXCoreMaterials;
import net.cmplx.cmplxcore_materials.tooltypes.CrushbowlItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;

public class StoneCrushbowl extends CrushbowlItem {
	public StoneCrushbowl() {
		super(ItemTier.STONE, -1, 0.0F, (new Item.Properties()).group(CMPLXCoreMaterials.CMPLXCORE_MATERIALS_TAB));
	}
}