package com.cmplx.cmplxcore_materials.tiers;

import java.util.function.Supplier;

import com.cmplx.cmplxcore_materials.util.RegistryHandler;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum ModTiers implements IItemTier{
	/*
	 * WOODEN_AXE = register("wooden_axe", new AxeItem(ItemTier.WOOD, 6.0F, -3.2F, (new Item.Properties()).group(ItemGroup.TOOLS)));
	 * STONE_AXE = register("stone_axe", new AxeItem(ItemTier.STONE, 7.0F, -3.2F, (new Item.Properties()).group(ItemGroup.TOOLS)));
	 * IRON_AXE = register("iron_axe", new AxeItem(ItemTier.IRON, 6.0F, -3.1F, (new Item.Properties()).group(ItemGroup.TOOLS)));
	 * GOLDEN_AXE = register("golden_axe", new AxeItem(ItemTier.GOLD, 6.0F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
	 * DIAMOND_AXE = register("diamond_axe", new AxeItem(ItemTier.DIAMOND, 5.0F, -3.0F, (new Item.Properties()).group(ItemGroup.TOOLS)));
	*/
	
	GRAPHITE(1, 95, 3.0F, 2.0F, 10, () -> {return Ingredient.fromItems(RegistryHandler.GRAPHITE_INGOT.get());});
	
	private final int harvestLevel;
	private final int maxUses;
	private final float efficiency;
	private final float attackDamage;
	private final int enchantability;
	private final LazyValue<Ingredient> repairMaterial;

	private ModTiers(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Supplier<Ingredient> repairMaterialIn) {
		this.harvestLevel = harvestLevelIn;
		this.maxUses = maxUsesIn;
		this.efficiency = efficiencyIn;
		this.attackDamage = attackDamageIn;
		this.enchantability = enchantabilityIn;
		this.repairMaterial = new LazyValue<>(repairMaterialIn);
	}

	public int getMaxUses() {return this.maxUses;}
	public float getEfficiency() {return this.efficiency;}
	public float getAttackDamage() {return this.attackDamage;}
	public int getHarvestLevel() {return this.harvestLevel;}
	public int getEnchantability() {return this.enchantability;}
	public Ingredient getRepairMaterial() {return this.repairMaterial.getValue();}
}