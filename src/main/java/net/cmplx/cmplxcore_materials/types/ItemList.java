package net.cmplx.cmplxcore_materials.types;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Nullable;

import net.cmplx.cmplxcore_materials.util.RegistryHandler;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

@SuppressWarnings("unused")
public class ItemList<E> extends NonNullList<E> {
	/*private List<ItemStack> delegate = Arrays.asList(new ItemStack[]{
		new ItemStack(RegistryHandler.ALUMINUM_INGOT.get()), new ItemStack(RegistryHandler.ALUMINUM_DUST.get()), new ItemStack(RegistryHandler.ALUMINUM_NUGGET.get()), new ItemStack(RegistryHandler.BRASS_INGOT.get()),
		new ItemStack(RegistryHandler.BRASS_DUST.get()), new ItemStack(RegistryHandler.BRASS_NUGGET.get()), new ItemStack(RegistryHandler.BRONZE_INGOT.get()), new ItemStack(RegistryHandler.BRONZE_DUST.get()),
		new ItemStack(RegistryHandler.BRONZE_NUGGET.get()), new ItemStack(RegistryHandler.COBALT_INGOT.get()), new ItemStack(RegistryHandler.COBALT_DUST.get()), new ItemStack(RegistryHandler.COBALT_NUGGET.get()),
		new ItemStack(RegistryHandler.COPPER_INGOT.get()), new ItemStack(RegistryHandler.COPPER_DUST.get()), new ItemStack(RegistryHandler.COPPER_NUGGET.get()), new ItemStack(RegistryHandler.GRAPHITE_INGOT.get()),
		new ItemStack(RegistryHandler.CARBON_DUST.get()), new ItemStack(RegistryHandler.GRAPHITE_CHUNK.get()), new ItemStack(RegistryHandler.IRIDIUM_INGOT.get()), new ItemStack(RegistryHandler.IRIDIUM_DUST.get()),
		new ItemStack(RegistryHandler.IRIDIUM_NUGGET.get()), new ItemStack(RegistryHandler.LEAD_INGOT.get()), new ItemStack(RegistryHandler.LEAD_DUST.get()), new ItemStack(RegistryHandler.LEAD_NUGGET.get()),
		new ItemStack(RegistryHandler.MERCURY.get()), new ItemStack(RegistryHandler.NICKEL_INGOT.get()),new ItemStack(RegistryHandler.NICKEL_DUST.get()), new ItemStack(RegistryHandler.NICKEL_NUGGET.get()),
		new ItemStack(RegistryHandler.OSMIUM_INGOT.get()), new ItemStack(RegistryHandler.OSMIUM_DUST.get()), new ItemStack(RegistryHandler.OSMIUM_NUGGET.get()), new ItemStack(RegistryHandler.PURE_SILICON_INGOT.get()),
		new ItemStack(RegistryHandler.PURE_SILICON_FLAKES.get()), new ItemStack(RegistryHandler.PURE_SILICON_MESH.get()), new ItemStack(RegistryHandler.PURE_SILICON_NUGGET.get()), new ItemStack(RegistryHandler.RAW_SILICON_INGOT.get()),
		new ItemStack(RegistryHandler.RAW_SILICON_FLAKES.get()), new ItemStack(RegistryHandler.RAW_SILICON_MESH.get()), new ItemStack(RegistryHandler.RAW_SILICON_NUGGET.get()), new ItemStack(RegistryHandler.SILVER_INGOT.get()),
		new ItemStack(RegistryHandler.SILVER_DUST.get()), new ItemStack(RegistryHandler.SILVER_NUGGET.get()), new ItemStack(RegistryHandler.STEEL_INGOT.get()), new ItemStack(RegistryHandler.STEEL_DUST.get()),
		new ItemStack(RegistryHandler.STEEL_NUGGET.get()), new ItemStack(RegistryHandler.TIN_INGOT.get()), new ItemStack(RegistryHandler.TIN_DUST.get()), new ItemStack(RegistryHandler.TIN_NUGGET.get()),
		new ItemStack(RegistryHandler.TITANIUM_INGOT.get()), new ItemStack(RegistryHandler.TITANIUM_DUST.get()), new ItemStack(RegistryHandler.TITANIUM_NUGGET.get()), new ItemStack(RegistryHandler.ZINC_INGOT.get()),
		new ItemStack(RegistryHandler.ZINC_DUST.get()), new ItemStack(RegistryHandler.ZINC_NUGGET.get()), new ItemStack(RegistryHandler.OBSIDIAN_INGOT.get()), new ItemStack(RegistryHandler.OBSIDIAN_DUST.get()),
		new ItemStack(RegistryHandler.OBSIDIAN_FLAKES.get()), new ItemStack(RegistryHandler.OBSIDIAN_NUGGET.get()), new ItemStack(RegistryHandler.ALUMINUM_ORE_CHUNK.get()), new ItemStack(RegistryHandler.CINNABAR_ORE_CHUNK.get()),
		new ItemStack(RegistryHandler.COAL_ORE_CHUNK.get()), new ItemStack(RegistryHandler.COBALT_ORE_CHUNK.get()), new ItemStack(RegistryHandler.COPPER_ORE_CHUNK.get()), new ItemStack(RegistryHandler.DIAMOND_ORE_CHUNK.get()),
		new ItemStack(RegistryHandler.EMERALD_ORE_CHUNK.get()), new ItemStack(RegistryHandler.GOLD_ORE_CHUNK.get()), new ItemStack(RegistryHandler.IRIDIUM_ORE_CHUNK.get()), new ItemStack(RegistryHandler.IRON_ORE_CHUNK.get()),
		new ItemStack(RegistryHandler.LAPIS_ORE_CHUNK.get()), new ItemStack(RegistryHandler.QUARTZ_ORE_CHUNK.get()), new ItemStack(RegistryHandler.NICKEL_ORE_CHUNK.get()), new ItemStack(RegistryHandler.OSMIUM_ORE_CHUNK.get()),
		new ItemStack(RegistryHandler.REDSTONE_ORE_CHUNK.get()),
		new ItemStack(RegistryHandler.SILVER_ORE_CHUNK.get()), new ItemStack(RegistryHandler.SULFUR_ORE_CHUNK.get()), new ItemStack(RegistryHandler.TIN_ORE_CHUNK.get()), new ItemStack(RegistryHandler.TITANIUM_ORE_CHUNK.get()),
		new ItemStack(RegistryHandler.ZINC_ORE_CHUNK.get()), new ItemStack(RegistryHandler.ROCK.get()), new ItemStack(RegistryHandler.NETHERROCK.get()), new ItemStack(RegistryHandler.IRON_DUST.get()), new ItemStack(RegistryHandler.GOLD_DUST.get()),
		new ItemStack(RegistryHandler.QUARTZ_DUST.get()), new ItemStack(RegistryHandler.QUARTZ_SHARD.get()), new ItemStack(RegistryHandler.DIAMOND_DUST.get()), new ItemStack(RegistryHandler.DIAMOND_NUGGET.get()),
		new ItemStack(RegistryHandler.EMERALD_DUST.get()), new ItemStack(RegistryHandler.EMERALD_NUGGET.get()), new ItemStack(RegistryHandler.NITER.get()), new ItemStack(RegistryHandler.SULFUR_DUST.get()),
		new ItemStack(RegistryHandler.SMALL_FINE_SAND.get()), new ItemStack(RegistryHandler.SMALL_SAND.get()), new ItemStack(RegistryHandler.WOOD_CRUSHBOWL.get()), new ItemStack(RegistryHandler.GRAPHITE_CRUSHBOWL.get()),
		new ItemStack(RegistryHandler.STONE_CRUSHBOWL.get()), new ItemStack(RegistryHandler.IRON_CRUSHBOWL.get()), new ItemStack(RegistryHandler.GOLD_CRUSHBOWL.get()), new ItemStack(RegistryHandler.DIAMOND_CRUSHBOWL.get()),
		new ItemStack(RegistryHandler.ALUMINUM_BLOCK_ITEM.get()), new ItemStack(RegistryHandler.ALUMINUM_ORE_ITEM.get()),
		new ItemStack(RegistryHandler.BRASS_BLOCK_ITEM.get()), new ItemStack(RegistryHandler.BRONZE_BLOCK_ITEM.get()), new ItemStack(RegistryHandler.COBALT_BLOCK_ITEM.get()), new ItemStack(RegistryHandler.COBALT_ORE_ITEM.get()),
		new ItemStack(RegistryHandler.COPPER_BLOCK_ITEM.get()), new ItemStack(RegistryHandler.COPPER_ORE_ITEM.get()), new ItemStack(RegistryHandler.FINE_SAND_ITEM.get()), new ItemStack(RegistryHandler.GRAPHITE_BLOCK_ITEM.get()),
		new ItemStack(RegistryHandler.GUNPOWDER_BLOCK_ITEM.get()), new ItemStack(RegistryHandler.IRIDIUM_BLOCK_ITEM.get()), new ItemStack(RegistryHandler.IRIDIUM_ORE_ITEM.get()), new ItemStack(RegistryHandler.LEAD_BLOCK_ITEM.get()),
		new ItemStack(RegistryHandler.LEAD_ORE_ITEM.get()), new ItemStack(RegistryHandler.NICKEL_BLOCK_ITEM.get()), new ItemStack(RegistryHandler.NICKEL_ORE_ITEM.get()), new ItemStack(RegistryHandler.NITER_BLOCK_ITEM.get()),
		new ItemStack(RegistryHandler.NITER_ORE_ITEM.get()), new ItemStack(RegistryHandler.OSMIUM_BLOCK_ITEM.get()), new ItemStack(RegistryHandler.OSMIUM_ORE_ITEM.get()), new ItemStack(RegistryHandler.PURE_SILICON_BLOCK_ITEM.get()),
		new ItemStack(RegistryHandler.RAW_SILICON_BLOCK_ITEM.get()), new ItemStack(RegistryHandler.SILVER_BLOCK_ITEM.get()), new ItemStack(RegistryHandler.SILVER_ORE_ITEM.get()), new ItemStack(RegistryHandler.STEEL_BLOCK_ITEM.get()),
		new ItemStack(RegistryHandler.SULFUR_BLOCK_ITEM.get()), new ItemStack(RegistryHandler.SULFUR_ORE_ITEM.get()), new ItemStack(RegistryHandler.TIN_BLOCK_ITEM.get()), new ItemStack(RegistryHandler.TIN_ORE_ITEM.get()),
		new ItemStack(RegistryHandler.TITANIUM_BLOCK_ITEM.get()), new ItemStack(RegistryHandler.TITANIUM_ORE_ITEM.get()), new ItemStack(RegistryHandler.ZINC_BLOCK_ITEM.get()), new ItemStack(RegistryHandler.ZINC_ORE_ITEM.get())
	});*/
	
	public ItemList() {super();}
}
