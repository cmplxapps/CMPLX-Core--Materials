package com.cmplx.cmplxcore_materials.tooltypes;

import java.util.Set;

import com.google.common.collect.ImmutableSet;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolItem;
import net.minecraftforge.common.ToolType;

public class HammerItem extends ToolItem {
	public static final ToolType HAMMER = ToolType.get("hammer");
	
	private static final Set<Block> EFFECTIVE_ON = ImmutableSet.of();

	public HammerItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Item.Properties builder) {super((float)attackDamageIn, attackSpeedIn, tier, EFFECTIVE_ON,
		builder.addToolType(HAMMER, tier.getHarvestLevel()));}
		
	public boolean canHarvestBlock(BlockState blockIn) {
		@SuppressWarnings("unused")
		Block block = blockIn.getBlock();
		int i = this.getTier().getHarvestLevel();
		if (blockIn.getHarvestTool() == HAMMER) {
			return i >= blockIn.getHarvestLevel();
		}
		Material material = blockIn.getMaterial();
		return material == Material.ROCK;
	}

	public float getDestroySpeed(ItemStack stack, BlockState state) {
		Material material = state.getMaterial();
		return material != Material.ROCK ? super.getDestroySpeed(stack, state) : this.efficiency;
	}
}
