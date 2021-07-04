package net.cmplx.cmplxcore_materials.items.HammerBase;

import net.cmplx.cmplxcore_materials.CMPLXCoreMaterials;
import net.cmplx.cmplxcore_materials.tooltypes.HammerItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;

public class DiamondHammer extends HammerItem {
	public DiamondHammer() {
		super(ItemTier.DIAMOND, 4, -3.0F, (new Item.Properties()).group(CMPLXCoreMaterials.CMPLXCORE_MATERIALS_TAB));
	}
}
