package com.cmplx.cmplxcore_materials.tooltypes;

import java.util.Set;

import com.google.common.collect.ImmutableSet;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolItem;
import net.minecraftforge.common.ToolType;

public class CrushbowlItem extends ToolItem{
	public static final ToolType CRUSHBOWL = ToolType.get("crushbowl");
	
	private static final Set<Block> EFFECTIVE_ON = ImmutableSet.of();

	public CrushbowlItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Item.Properties builder) {super((float)attackDamageIn, attackSpeedIn, tier, EFFECTIVE_ON,
			builder.addToolType(CRUSHBOWL, tier.getHarvestLevel()));}
	
	public boolean canHarvestBlock(BlockState blockIn) {
		@SuppressWarnings("unused")
		Block block = blockIn.getBlock();
		int i = this.getTier().getHarvestLevel();
		if (blockIn.getHarvestTool() == CRUSHBOWL) {
			return i >= blockIn.getHarvestLevel();
		}
		return false;
	}

	@SuppressWarnings("unused")
	public float getDestroySpeed(ItemStack stack, BlockState state) {return false ? super.getDestroySpeed(stack, state) : this.efficiency;}
}
