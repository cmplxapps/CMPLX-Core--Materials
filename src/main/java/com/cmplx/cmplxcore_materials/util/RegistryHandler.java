package com.cmplx.cmplxcore_materials.util;

import com.cmplx.cmplxcore_materials.CMPLXCoreMaterials;
import com.cmplx.cmplxcore_materials.blocks.*;
import com.cmplx.cmplxcore_materials.items.ItemBase;
import com.cmplx.cmplxcore_materials.items.CrushbowlBase.*;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = CMPLXCoreMaterials.MOD_ID, bus = Bus.MOD)
public class RegistryHandler {
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, CMPLXCoreMaterials.MOD_ID);
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, CMPLXCoreMaterials.MOD_ID);
	
	public static void init() {
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
	
	//@ObjectHolder(CMPLXCoreMaterials.MOD_ID + ":graphite_ingot")
	//public static Item graphite_ingot = null;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		//event.getRegistry().register(new Item(new Item.Properties().group(CMPLXCoreMaterials.CMPLXCORE_MATERIALS_TAB)).setRegistryName("graphite_ingot"));
		
		/*
		event.getRegistry().register(new Item(new Item.Properties().group(CMPLXCoreMaterials.CMPLXCORE_MATERIALS_TAB)).setRegistryName("wood_crushbowl"));
		event.getRegistry().register(new Item(new Item.Properties().group(CMPLXCoreMaterials.CMPLXCORE_MATERIALS_TAB)).setRegistryName("graphite_crushbowl"));
		event.getRegistry().register(new Item(new Item.Properties().group(CMPLXCoreMaterials.CMPLXCORE_MATERIALS_TAB)).setRegistryName("stone_crushbowl"));
		event.getRegistry().register(new Item(new Item.Properties().group(CMPLXCoreMaterials.CMPLXCORE_MATERIALS_TAB)).setRegistryName("iron_crushbowl"));
		event.getRegistry().register(new Item(new Item.Properties().group(CMPLXCoreMaterials.CMPLXCORE_MATERIALS_TAB)).setRegistryName("gold_crushbowl"));
		event.getRegistry().register(new Item(new Item.Properties().group(CMPLXCoreMaterials.CMPLXCORE_MATERIALS_TAB)).setRegistryName("diamond_crushbowl"));
		
		event.getRegistry().register(new Item(new Item.Properties().group(CMPLXCoreMaterials.CMPLXCORE_MATERIALS_TAB)).setRegistryName("wood_hammer"));
		event.getRegistry().register(new Item(new Item.Properties().group(CMPLXCoreMaterials.CMPLXCORE_MATERIALS_TAB)).setRegistryName("graphite_hammer"));
		event.getRegistry().register(new Item(new Item.Properties().group(CMPLXCoreMaterials.CMPLXCORE_MATERIALS_TAB)).setRegistryName("stone_hammer"));
		event.getRegistry().register(new Item(new Item.Properties().group(CMPLXCoreMaterials.CMPLXCORE_MATERIALS_TAB)).setRegistryName("iron_hammer"));
		event.getRegistry().register(new Item(new Item.Properties().group(CMPLXCoreMaterials.CMPLXCORE_MATERIALS_TAB)).setRegistryName("gold_hammer"));
		event.getRegistry().register(new Item(new Item.Properties().group(CMPLXCoreMaterials.CMPLXCORE_MATERIALS_TAB)).setRegistryName("diamond_hammer"));
		*/
	}
	
	
	//    Blocks    ----    public static final RegistryObject<Block> NAME = BLOCKS.register("name", PropertyClass::new);
	
	//Metal Blocks
	
	public static final RegistryObject<Block> ALUMINUM_BLOCK = BLOCKS.register("aluminum_block", MetalBlockIron::new);
	
	public static final RegistryObject<Block> ALUMINUM_ORE = BLOCKS.register("aluminum_ore", MetalOreIron::new);
	
	public static final RegistryObject<Block> BRASS_BLOCK = BLOCKS.register("brass_block", MetalBlockIron::new);
	
	public static final RegistryObject<Block> BRONZE_BLOCK = BLOCKS.register("bronze_block", MetalBlockGold::new);
	
	public static final RegistryObject<Block> CINNABAR_ORE = BLOCKS.register("cinnabar_ore", MetalOreGold::new);
	
	public static final RegistryObject<Block> COBALT_BLOCK = BLOCKS.register("cobalt_block", MetalBlockGold::new);
	
	public static final RegistryObject<Block> COBALT_ORE = BLOCKS.register("cobalt_ore", MetalOreGold::new);
	
	public static final RegistryObject<Block> COPPER_BLOCK = BLOCKS.register("copper_block", MetalBlockIron::new);
	
	public static final RegistryObject<Block> COPPER_ORE = BLOCKS.register("copper_ore", MetalOreIron::new);
	
	public static final RegistryObject<Block> FINE_SAND = BLOCKS.register("fine_sand", SandBlockCoal::new);
	
	public static final RegistryObject<Block> GRAPHITE_BLOCK = BLOCKS.register("graphite_block", MetalBlockCoal::new);
	
	public static final RegistryObject<Block> GUNPOWDER_BLOCK = BLOCKS.register("gunpowder_block", SandBlockCoal::new);
	
	public static final RegistryObject<Block> IRIDIUM_BLOCK = BLOCKS.register("iridium_block", GemBlockGold::new);
	
	public static final RegistryObject<Block> IRIDIUM_ORE = BLOCKS.register("iridium_ore", GemOreGold::new);
	
	public static final RegistryObject<Block> LEAD_BLOCK = BLOCKS.register("lead_block", MetalBlockGold::new);
	
	public static final RegistryObject<Block> LEAD_ORE = BLOCKS.register("lead_ore", MetalOreGold::new);
	
	public static final RegistryObject<Block> NICKEL_BLOCK = BLOCKS.register("nickel_block", MetalBlockIron::new);
	
	public static final RegistryObject<Block> NICKEL_ORE = BLOCKS.register("nickel_ore", MetalOreIron::new);
	
	public static final RegistryObject<Block> NITER_BLOCK = BLOCKS.register("niter_block", SandBlockCoal::new);
	
	public static final RegistryObject<Block> NITER_ORE = BLOCKS.register("niter_ore", SandBlockCoal::new);
	
	public static final RegistryObject<Block> OSMIUM_BLOCK = BLOCKS.register("osmium_block", GemBlockGold::new);
	
	public static final RegistryObject<Block> OSMIUM_ORE = BLOCKS.register("osmium_ore", GemOreGold::new);
	
	public static final RegistryObject<Block> PURE_SILICON_BLOCK = BLOCKS.register("pure_silicon_block", MetalBlockIron::new);
	
	public static final RegistryObject<Block> RAW_SILICON_BLOCK = BLOCKS.register("raw_silicon_block", MetalBlockIron::new);
	
	public static final RegistryObject<Block> SILVER_BLOCK = BLOCKS.register("silver_block", MetalBlockGold::new);
	
	public static final RegistryObject<Block> SILVER_ORE = BLOCKS.register("silver_ore", MetalOreGold::new);
	
	public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register("steel_block", MetalBlockIron::new);
	
	public static final RegistryObject<Block> SULFUR_BLOCK = BLOCKS.register("sulfur_block", MetalBlockIron::new);
	
	public static final RegistryObject<Block> SULFUR_ORE = BLOCKS.register("sulfur_ore", MetalOreIron::new);
	
	public static final RegistryObject<Block> TIN_BLOCK = BLOCKS.register("tin_block", MetalBlockIron::new);
	
	public static final RegistryObject<Block> TIN_ORE = BLOCKS.register("tin_ore", MetalOreIron::new);
	
	public static final RegistryObject<Block> TITANIUM_BLOCK = BLOCKS.register("titanium_block", MetalBlockGold::new);
	
	public static final RegistryObject<Block> TITANIUM_ORE = BLOCKS.register("titanium_ore", MetalOreGold::new);
	
	public static final RegistryObject<Block> ZINC_BLOCK = BLOCKS.register("zinc_block", MetalBlockIron::new);
	
	public static final RegistryObject<Block> ZINC_ORE = BLOCKS.register("zinc_ore", MetalOreIron::new);
	
	//    Items    ----    //public static final RegistryObject<Item> NAME = ITEM.register("name", PropertyClass::new);
	 
	public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot", ItemBase::new);
	
	public static final RegistryObject<Item> ALUMINUM_DUST = ITEMS.register("aluminum_dust", ItemBase::new);
	 
	public static final RegistryObject<Item> ALUMINUM_NUGGET = ITEMS.register("aluminum_nugget", ItemBase::new);
	 
	public static final RegistryObject<Item> BRASS_INGOT = ITEMS.register("brass_ingot", ItemBase::new);
	 
	public static final RegistryObject<Item> BRASS_DUST = ITEMS.register("brass_dust", ItemBase::new);
	 
	public static final RegistryObject<Item> BRASS_NUGGET = ITEMS.register("brass_nugget", ItemBase::new);
	 
	public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", ItemBase::new);
	 
	public static final RegistryObject<Item> BRONZE_DUST = ITEMS.register("bronze_dust", ItemBase::new);
	 
	public static final RegistryObject<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget", ItemBase::new);
	 
	public static final RegistryObject<Item> COBALT_INGOT = ITEMS.register("cobalt_ingot", ItemBase::new);
	 
	public static final RegistryObject<Item> COBALT_DUST = ITEMS.register("cobalt_dust", ItemBase::new);
	 
	public static final RegistryObject<Item> COBALT_NUGGET = ITEMS.register("cobalt_nugget", ItemBase::new);
	 
	public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", ItemBase::new);
	 
	public static final RegistryObject<Item> COPPER_DUST = ITEMS.register("copper_dust", ItemBase::new);
	 
	public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", ItemBase::new);
	
	public static final RegistryObject<Item> GRAPHITE_INGOT = ITEMS.register("graphite_ingot", ItemBase::new);
	
	public static final RegistryObject<Item> CARBON_DUST = ITEMS.register("carbon_dust", ItemBase::new);
	 
	public static final RegistryObject<Item> GRAPHITE_CHUNK = ITEMS.register("graphite_chunk", ItemBase::new);
	 
	public static final RegistryObject<Item> IRIDIUM_INGOT = ITEMS.register("iridium_ingot", ItemBase::new);
	 
	public static final RegistryObject<Item> IRIDIUM_DUST = ITEMS.register("iridium_dust", ItemBase::new);
	 
	public static final RegistryObject<Item> IRIDIUM_NUGGET = ITEMS.register("iridium_nugget", ItemBase::new);
	 
	public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot", ItemBase::new);
	 
	public static final RegistryObject<Item> LEAD_DUST = ITEMS.register("lead_dust", ItemBase::new);
	 
	public static final RegistryObject<Item> LEAD_NUGGET = ITEMS.register("lead_nugget", ItemBase::new);
	 
	public static final RegistryObject<Item> MERCURY = ITEMS.register("mercury", ItemBase::new);
	 
	public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot", ItemBase::new);
	 
	public static final RegistryObject<Item> NICKEL_DUST = ITEMS.register("nickel_dust", ItemBase::new);
	 
	public static final RegistryObject<Item> NICKEL_NUGGET = ITEMS.register("nickel_nugget", ItemBase::new);
	 
	public static final RegistryObject<Item> OSMIUM_INGOT = ITEMS.register("osmium_ingot", ItemBase::new);
	 
	public static final RegistryObject<Item> OSMIUM_DUST = ITEMS.register("osmium_dust", ItemBase::new);
	 
	public static final RegistryObject<Item> OSMIUM_NUGGET = ITEMS.register("osmium_nugget", ItemBase::new);
	 
	public static final RegistryObject<Item> PURE_SILICON_INGOT = ITEMS.register("pure_silicon_ingot", ItemBase::new);
	 
	public static final RegistryObject<Item> PURE_SILICON_FLAKES = ITEMS.register("pure_silicon_flakes", ItemBase::new);
	 
	public static final RegistryObject<Item> PURE_SILICON_MESH = ITEMS.register("pure_silicon_mesh", ItemBase::new);
	 
	public static final RegistryObject<Item> PURE_SILICON_NUGGET = ITEMS.register("pure_silicon_nugget", ItemBase::new);
	 
	public static final RegistryObject<Item> RAW_SILICON_INGOT = ITEMS.register("raw_silicon_ingot", ItemBase::new);
	 
	public static final RegistryObject<Item> RAW_SILICON_FLAKES = ITEMS.register("raw_silicon_flakes", ItemBase::new);
	 
	public static final RegistryObject<Item> RAW_SILICON_MESH = ITEMS.register("raw_silicon_mesh", ItemBase::new);
	 
	public static final RegistryObject<Item> RAW_SILICON_NUGGET = ITEMS.register("raw_silicon_nugget", ItemBase::new);
	 
	public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", ItemBase::new);
	 
	public static final RegistryObject<Item> SILVER_DUST = ITEMS.register("silver_dust", ItemBase::new);
	
	public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", ItemBase::new);
	 
	public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", ItemBase::new);
	
	public static final RegistryObject<Item> STEEL_DUST = ITEMS.register("steel_dust", ItemBase::new);
	 
	public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget", ItemBase::new);
	
	public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", ItemBase::new);
	 
	public static final RegistryObject<Item> TIN_DUST = ITEMS.register("tin_dust", ItemBase::new);
	 
	public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget", ItemBase::new);
	 
	public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot", ItemBase::new);
	 
	public static final RegistryObject<Item> TITANIUM_DUST = ITEMS.register("titanium_dust", ItemBase::new);
	 
	public static final RegistryObject<Item> TITANIUM_NUGGET = ITEMS.register("titanium_nugget", ItemBase::new);
	 
	public static final RegistryObject<Item> ZINC_INGOT = ITEMS.register("zinc_ingot", ItemBase::new);
	
	public static final RegistryObject<Item> ZINC_DUST = ITEMS.register("zinc_dust", ItemBase::new);
	 
	public static final RegistryObject<Item> ZINC_NUGGET = ITEMS.register("zinc_nugget", ItemBase::new);
	 
	public static final RegistryObject<Item> OBSIDIAN_INGOT = ITEMS.register("obsidian_ingot", ItemBase::new);
	 
	public static final RegistryObject<Item> OBSIDIAN_DUST = ITEMS.register("obsidian_dust", ItemBase::new);
	 
	public static final RegistryObject<Item> OBSIDIAN_FLAKES = ITEMS.register("obsidian_flakes", ItemBase::new);
	 
	public static final RegistryObject<Item> OBSIDIAN_NUGGET = ITEMS.register("obsidian_nugget", ItemBase::new);
	 
	public static final RegistryObject<Item> ALUMINUM_ORE_CHUNK = ITEMS.register("aluminum_ore_chunk", ItemBase::new);
	 
	public static final RegistryObject<Item> CINNABAR_ORE_CHUNK = ITEMS.register("cinnabar_ore_chunk", ItemBase::new);
	 
	public static final RegistryObject<Item> COAL_ORE_CHUNK = ITEMS.register("coal_ore_chunk", ItemBase::new);
	 
	public static final RegistryObject<Item> COBALT_ORE_CHUNK = ITEMS.register("cobalt_ore_chunk", ItemBase::new);
	 
	public static final RegistryObject<Item> COPPER_ORE_CHUNK = ITEMS.register("copper_ore_chunk", ItemBase::new);
	 
	public static final RegistryObject<Item> DIAMOND_ORE_CHUNK = ITEMS.register("diamond_ore_chunk", ItemBase::new);
	 
	public static final RegistryObject<Item> EMERALD_ORE_CHUNK = ITEMS.register("emerald_ore_chunk", ItemBase::new);
	 
	public static final RegistryObject<Item> GOLD_ORE_CHUNK = ITEMS.register("gold_ore_chunk", ItemBase::new);
	 
	public static final RegistryObject<Item> IRIDIUM_ORE_CHUNK = ITEMS.register("iridium_ore_chunk", ItemBase::new);
	 
	public static final RegistryObject<Item> IRON_ORE_CHUNK = ITEMS.register("iron_ore_chunk", ItemBase::new);
	 
	public static final RegistryObject<Item> LAPIS_ORE_CHUNK = ITEMS.register("lapis_ore_chunk", ItemBase::new);
	
	public static final RegistryObject<Item> LEAD_ORE_CHUNK = ITEMS.register("lead_ore_chunk", ItemBase::new);
	 
	public static final RegistryObject<Item> NICKEL_ORE_CHUNK = ITEMS.register("nickel_ore_chunk", ItemBase::new);
	
	public static final RegistryObject<Item> NITER_ORE_CHUNK = ITEMS.register("niter_ore_chunk", ItemBase::new);
	 
	public static final RegistryObject<Item> OSMIUM_ORE_CHUNK = ITEMS.register("osmium_ore_chunk", ItemBase::new);
	
	public static final RegistryObject<Item> QUARTZ_ORE_CHUNK = ITEMS.register("quartz_ore_chunk", ItemBase::new);
	 
	public static final RegistryObject<Item> REDSTONE_ORE_CHUNK = ITEMS.register("redstone_ore_chunk", ItemBase::new);
	
	public static final RegistryObject<Item> SILVER_ORE_CHUNK = ITEMS.register("silver_ore_chunk", ItemBase::new);
	
	public static final RegistryObject<Item> SULFUR_ORE_CHUNK = ITEMS.register("sulfur_ore_chunk", ItemBase::new);
	 
	public static final RegistryObject<Item> TIN_ORE_CHUNK = ITEMS.register("tin_ore_chunk", ItemBase::new);
	 
	public static final RegistryObject<Item> TITANIUM_ORE_CHUNK = ITEMS.register("titanium_ore_chunk", ItemBase::new);
	 
	public static final RegistryObject<Item> ZINC_ORE_CHUNK = ITEMS.register("zinc_ore_chunk", ItemBase::new);
	 
	public static final RegistryObject<Item> ROCK = ITEMS.register("rock", ItemBase::new);
	
	public static final RegistryObject<Item> NETHERROCK = ITEMS.register("netherrock", ItemBase::new);
	 
	public static final RegistryObject<Item> IRON_DUST = ITEMS.register("iron_dust", ItemBase::new);
	 
	public static final RegistryObject<Item> GOLD_DUST = ITEMS.register("gold_dust", ItemBase::new);
	 
	public static final RegistryObject<Item> QUARTZ_DUST = ITEMS.register("quartz_dust", ItemBase::new);
	
	public static final RegistryObject<Item> QUARTZ_SHARD = ITEMS.register("quartz_shard", ItemBase::new);
	 
	public static final RegistryObject<Item> DIAMOND_DUST = ITEMS.register("diamond_dust", ItemBase::new);
	 
	public static final RegistryObject<Item> DIAMOND_NUGGET = ITEMS.register("diamond_nugget", ItemBase::new);
	 
	public static final RegistryObject<Item> EMERALD_DUST = ITEMS.register("emerald_dust", ItemBase::new);
	 
	public static final RegistryObject<Item> EMERALD_NUGGET = ITEMS.register("emerald_nugget", ItemBase::new);
	 
	public static final RegistryObject<Item> NITER = ITEMS.register("niter", ItemBase::new);
	 
	public static final RegistryObject<Item> SULFUR_DUST = ITEMS.register("sulfur_dust", ItemBase::new);
	 
	public static final RegistryObject<Item> SMALL_FINE_SAND = ITEMS.register("small_fine_sand", ItemBase::new);
	 
	public static final RegistryObject<Item> SMALL_SAND = ITEMS.register("small_sand", ItemBase::new);
	
	public static final RegistryObject<Item> WOOD_CRUSHBOWL = ITEMS.register("wood_crushbowl", WoodCrushbowl::new);
	
	public static final RegistryObject<Item> GRAPHITE_CRUSHBOWL = ITEMS.register("graphite_crushbowl", GraphiteCrushbowl::new);
	
	public static final RegistryObject<Item> STONE_CRUSHBOWL = ITEMS.register("stone_crushbowl", StoneCrushbowl::new);
	
	public static final RegistryObject<Item> IRON_CRUSHBOWL = ITEMS.register("iron_crushbowl", IronCrushbowl::new);
	
	public static final RegistryObject<Item> GOLD_CRUSHBOWL = ITEMS.register("gold_crushbowl", GoldCrushbowl::new);
	
	public static final RegistryObject<Item> DIAMOND_CRUSHBOWL = ITEMS.register("diamond_crushbowl", DiamondCrushbowl::new);
	
	/*
	 * DEPRECATED UNTIL FURTHER NOTICE!!!
	 * 
	public static final RegistryObject<Item> WOOD_HAMMER = ITEMS.register("wood_hammer", WoodHammer::new);
	
	public static final RegistryObject<Item> GRAPHITE_HAMMER = ITEMS.register("graphite_hammer", GraphiteHammer::new);
	
	public static final RegistryObject<Item> STONE_HAMMER = ITEMS.register("stone_hammer", StoneHammer::new);
	
	public static final RegistryObject<Item> IRON_HAMMER = ITEMS.register("iron_hammer", IronHammer::new);
	
	public static final RegistryObject<Item> GOLD_HAMMER = ITEMS.register("gold_hammer", GoldHammer::new);
	 
	public static final RegistryObject<Item> DIAMOND_HAMMER = ITEMS.register("diamond_hammer", DiamondHammer::new);
	*/
	
	//Block Items    ----    public static final RegistryObject<Item> NAME_ITEM = ITEMS.register("name", () -> new BlockItemClass(NAME.get()));
	
	public static final RegistryObject<Item> ALUMINUM_BLOCK_ITEM = ITEMS.register("aluminum_block", () -> new BlockItemBase(ALUMINUM_BLOCK.get()));
	
	public static final RegistryObject<Item> ALUMINUM_ORE_ITEM = ITEMS.register("aluminum_ore", () -> new BlockItemBase(ALUMINUM_ORE.get()));

	public static final RegistryObject<Item> BRASS_BLOCK_ITEM = ITEMS.register("brass_block", () -> new BlockItemBase(BRASS_BLOCK.get()));
	
	public static final RegistryObject<Item> BRONZE_BLOCK_ITEM = ITEMS.register("bronze_block", () -> new BlockItemBase(BRONZE_BLOCK.get()));
	
	public static final RegistryObject<Item> COBALT_BLOCK_ITEM = ITEMS.register("cobalt_block", () -> new BlockItemBase(COBALT_BLOCK.get()));
	
	public static final RegistryObject<Item> COBALT_ORE_ITEM = ITEMS.register("cobalt_ore", () -> new BlockItemBase(COBALT_ORE.get()));
	
	public static final RegistryObject<Item> COPPER_BLOCK_ITEM = ITEMS.register("copper_block", () -> new BlockItemBase(COPPER_BLOCK.get()));
	
	public static final RegistryObject<Item> COPPER_ORE_ITEM = ITEMS.register("copper_ore", () -> new BlockItemBase(COPPER_ORE.get()));
	
	public static final RegistryObject<Item> FINE_SAND_ITEM = ITEMS.register("fine_sand", () -> new BlockItemBase(FINE_SAND.get()));
	
	public static final RegistryObject<Item> GRAPHITE_BLOCK_ITEM = ITEMS.register("graphite_block", () -> new BlockItemBase(GRAPHITE_BLOCK.get()));
	
	public static final RegistryObject<Item> GUNPOWDER_BLOCK_ITEM = ITEMS.register("gunpowder_block", () -> new BlockItemBase(GUNPOWDER_BLOCK.get()));
	
	public static final RegistryObject<Item> IRIDIUM_BLOCK_ITEM = ITEMS.register("iridium_block", () -> new BlockItemBase(IRIDIUM_BLOCK.get()));
	
	public static final RegistryObject<Item> IRIDIUM_ORE_ITEM = ITEMS.register("iridium_ore", () -> new BlockItemBase(IRIDIUM_ORE.get()));
	
	public static final RegistryObject<Item> LEAD_BLOCK_ITEM = ITEMS.register("lead_block", () -> new BlockItemBase(LEAD_BLOCK.get()));
	
	public static final RegistryObject<Item> LEAD_ORE_ITEM = ITEMS.register("lead_ore", () -> new BlockItemBase(LEAD_ORE.get()));
	
	public static final RegistryObject<Item> NICKEL_BLOCK_ITEM = ITEMS.register("nickel_block", () -> new BlockItemBase(NICKEL_BLOCK.get()));
	
	public static final RegistryObject<Item> NICKEL_ORE_ITEM = ITEMS.register("nickel_ore", () -> new BlockItemBase(NICKEL_ORE.get()));
	
	public static final RegistryObject<Item> NITER_BLOCK_ITEM = ITEMS.register("niter_block", () -> new BlockItemBase(NITER_BLOCK.get()));
	
	public static final RegistryObject<Item> NITER_ORE_ITEM = ITEMS.register("niter_ore", () -> new BlockItemBase(NITER_ORE.get()));
	
	public static final RegistryObject<Item> OSMIUM_BLOCK_ITEM = ITEMS.register("osmium_block", () -> new BlockItemBase(OSMIUM_BLOCK.get()));
	
	public static final RegistryObject<Item> OSMIUM_ORE_ITEM = ITEMS.register("osmium_ore", () -> new BlockItemBase(OSMIUM_ORE.get()));
	
	public static final RegistryObject<Item> PURE_SILICON_BLOCK_ITEM = ITEMS.register("pure_silicon_block", () -> new BlockItemBase(PURE_SILICON_BLOCK.get()));
	
	public static final RegistryObject<Item> RAW_SILICON_BLOCK_ITEM = ITEMS.register("raw_silicon_block", () -> new BlockItemBase(RAW_SILICON_BLOCK.get()));
	
	public static final RegistryObject<Item> SILVER_BLOCK_ITEM = ITEMS.register("silver_block", () -> new BlockItemBase(SILVER_BLOCK.get()));
	
	public static final RegistryObject<Item> SILVER_ORE_ITEM = ITEMS.register("silver_ore", () -> new BlockItemBase(SILVER_ORE.get()));
	
	public static final RegistryObject<Item> STEEL_BLOCK_ITEM = ITEMS.register("steel_block", () -> new BlockItemBase(STEEL_BLOCK.get()));
	
	public static final RegistryObject<Item> SULFUR_BLOCK_ITEM = ITEMS.register("sulfur_block", () -> new BlockItemBase(SULFUR_BLOCK.get()));
	
	public static final RegistryObject<Item> SULFUR_ORE_ITEM = ITEMS.register("sulfur_ore", () -> new BlockItemBase(SULFUR_ORE.get()));
	
	public static final RegistryObject<Item> TIN_BLOCK_ITEM = ITEMS.register("tin_block", () -> new BlockItemBase(TIN_BLOCK.get()));
	
	public static final RegistryObject<Item> TIN_ORE_ITEM = ITEMS.register("tin_ore", () -> new BlockItemBase(TIN_ORE.get()));
	
	public static final RegistryObject<Item> TITANIUM_BLOCK_ITEM = ITEMS.register("titanium_block", () -> new BlockItemBase(TITANIUM_BLOCK.get()));
	
	public static final RegistryObject<Item> TITANIUM_ORE_ITEM = ITEMS.register("titanium_ore", () -> new BlockItemBase(TITANIUM_ORE.get()));
	
	public static final RegistryObject<Item> ZINC_BLOCK_ITEM = ITEMS.register("zinc_block", () -> new BlockItemBase(ZINC_BLOCK.get()));
	
	public static final RegistryObject<Item> ZINC_ORE_ITEM = ITEMS.register("zinc_ore", () -> new BlockItemBase(ZINC_ORE.get()));
	
	
}