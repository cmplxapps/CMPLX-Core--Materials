package net.cmplx.cmplxcore_materials.items;

import net.cmplx.cmplxcore_materials.CMPLXCoreMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FuelBase extends Item {
	
	@SuppressWarnings("unused") private final int MOD_ITEM_BURNTIME;
	
	public FuelBase(int burntime) {
		super(new Item.Properties().group(CMPLXCoreMaterials.CMPLXCORE_MATERIALS_TAB));
		this.MOD_ITEM_BURNTIME = burntime;
	}

	@Override public int getBurnTime(ItemStack i) {return this.MOD_ITEM_BURNTIME;}
}
