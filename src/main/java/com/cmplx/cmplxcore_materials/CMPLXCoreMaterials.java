package com.cmplx.cmplxcore_materials;

import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cmplx.cmplxcore_materials.util.RegistryHandler;

@Mod("cmplxcore_materials")
public class CMPLXCoreMaterials {
	
	@SuppressWarnings("unused")
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "cmplxcore_materials";
    @SuppressWarnings({ "rawtypes", "unused" })
	
    
    private final RegistryObject[] ITEM_LIST = {
			RegistryHandler.ALUMINUM_INGOT, RegistryHandler.ALUMINUM_DUST, RegistryHandler.ALUMINUM_NUGGET, RegistryHandler.BRASS_INGOT,
			RegistryHandler.BRASS_DUST, RegistryHandler.BRASS_NUGGET, RegistryHandler.BRONZE_INGOT, RegistryHandler.BRONZE_DUST,
			RegistryHandler.BRONZE_NUGGET, RegistryHandler.COBALT_INGOT, RegistryHandler.COBALT_DUST, RegistryHandler.COBALT_NUGGET,
			RegistryHandler.COPPER_INGOT, RegistryHandler.COPPER_DUST, RegistryHandler.COPPER_NUGGET, RegistryHandler.GRAPHITE_INGOT,
			RegistryHandler.CARBON_DUST, RegistryHandler.GRAPHITE_CHUNK, RegistryHandler.IRIDIUM_INGOT, RegistryHandler.IRIDIUM_DUST,
			RegistryHandler.IRIDIUM_NUGGET, RegistryHandler.LEAD_INGOT, RegistryHandler.LEAD_DUST, RegistryHandler.LEAD_NUGGET,
			RegistryHandler.MERCURY, RegistryHandler.NICKEL_INGOT,RegistryHandler.NICKEL_DUST, RegistryHandler.NICKEL_NUGGET,
			RegistryHandler.OSMIUM_INGOT, RegistryHandler.OSMIUM_DUST, RegistryHandler.OSMIUM_NUGGET, RegistryHandler.PURE_SILICON_INGOT,
			RegistryHandler.PURE_SILICON_FLAKES, RegistryHandler.PURE_SILICON_MESH, RegistryHandler.PURE_SILICON_NUGGET, RegistryHandler.RAW_SILICON_INGOT,
			RegistryHandler.RAW_SILICON_FLAKES, RegistryHandler.RAW_SILICON_MESH, RegistryHandler.RAW_SILICON_NUGGET, RegistryHandler.SILVER_INGOT,
			RegistryHandler.SILVER_DUST, RegistryHandler.SILVER_NUGGET, RegistryHandler.STEEL_INGOT, RegistryHandler.STEEL_DUST,
			RegistryHandler.STEEL_NUGGET, RegistryHandler.TIN_INGOT, RegistryHandler.TIN_DUST, RegistryHandler.TIN_NUGGET,
			RegistryHandler.TITANIUM_INGOT, RegistryHandler.TITANIUM_DUST, RegistryHandler.TITANIUM_NUGGET, RegistryHandler.ZINC_INGOT,
			RegistryHandler.ZINC_DUST, RegistryHandler.ZINC_NUGGET, RegistryHandler.OBSIDIAN_INGOT, RegistryHandler.OBSIDIAN_DUST,
			RegistryHandler.OBSIDIAN_FLAKES, RegistryHandler.OBSIDIAN_NUGGET, RegistryHandler.ALUMINUM_ORE_CHUNK, RegistryHandler.CINNABAR_ORE_CHUNK,
			RegistryHandler.COAL_ORE_CHUNK, RegistryHandler.COBALT_ORE_CHUNK, RegistryHandler.COPPER_ORE_CHUNK, RegistryHandler.DIAMOND_ORE_CHUNK,
			RegistryHandler.EMERALD_ORE_CHUNK, RegistryHandler.GOLD_ORE_CHUNK, RegistryHandler.IRIDIUM_ORE_CHUNK, RegistryHandler.IRON_ORE_CHUNK,
			RegistryHandler.LAPIS_ORE_CHUNK, RegistryHandler.QUARTZ_ORE_CHUNK, RegistryHandler.NICKEL_ORE_CHUNK, RegistryHandler.OSMIUM_ORE_CHUNK,
			RegistryHandler.REDSTONE_ORE_CHUNK,
			RegistryHandler.SILVER_ORE_CHUNK, RegistryHandler.SULFUR_ORE_CHUNK, RegistryHandler.TIN_ORE_CHUNK, RegistryHandler.TITANIUM_ORE_CHUNK,
			RegistryHandler.ZINC_ORE_CHUNK, RegistryHandler.ROCK, RegistryHandler.NETHERROCK, RegistryHandler.IRON_DUST, RegistryHandler.GOLD_DUST,
			RegistryHandler.QUARTZ_DUST, RegistryHandler.QUARTZ_SHARD, RegistryHandler.DIAMOND_DUST, RegistryHandler.DIAMOND_NUGGET,
			RegistryHandler.EMERALD_DUST, RegistryHandler.EMERALD_NUGGET, RegistryHandler.NITER, RegistryHandler.SULFUR_DUST,
			RegistryHandler.SMALL_FINE_SAND, RegistryHandler.SMALL_SAND, RegistryHandler.WOOD_CRUSHBOWL, RegistryHandler.GRAPHITE_CRUSHBOWL,
			RegistryHandler.STONE_CRUSHBOWL, RegistryHandler.IRON_CRUSHBOWL, RegistryHandler.GOLD_CRUSHBOWL, RegistryHandler.DIAMOND_CRUSHBOWL,
			//RegistryHandler.WOOD_HAMMER, RegistryHandler.GRAPHITE_HAMMER, RegistryHandler.STONE_HAMMER, RegistryHandler.IRON_HAMMER,
			/*RegistryHandler.GOLD_HAMMER, RegistryHandler.DIAMOND_HAMMER, */RegistryHandler.ALUMINUM_BLOCK_ITEM, RegistryHandler.ALUMINUM_ORE_ITEM,
			RegistryHandler.BRASS_BLOCK_ITEM, RegistryHandler.BRONZE_BLOCK_ITEM, RegistryHandler.COBALT_BLOCK_ITEM, RegistryHandler.COBALT_ORE_ITEM,
			RegistryHandler.COPPER_BLOCK_ITEM, RegistryHandler.COPPER_ORE_ITEM, RegistryHandler.FINE_SAND_ITEM, RegistryHandler.GRAPHITE_BLOCK_ITEM,
			RegistryHandler.GUNPOWDER_BLOCK_ITEM, RegistryHandler.IRIDIUM_BLOCK_ITEM, RegistryHandler.IRIDIUM_ORE_ITEM, RegistryHandler.LEAD_BLOCK_ITEM,
			RegistryHandler.LEAD_ORE_ITEM, RegistryHandler.NICKEL_BLOCK_ITEM, RegistryHandler.NICKEL_ORE_ITEM, RegistryHandler.NITER_BLOCK_ITEM,
			RegistryHandler.NITER_ORE_ITEM, RegistryHandler.OSMIUM_BLOCK_ITEM, RegistryHandler.OSMIUM_ORE_ITEM, RegistryHandler.PURE_SILICON_BLOCK_ITEM,
			RegistryHandler.RAW_SILICON_BLOCK_ITEM, RegistryHandler.SILVER_BLOCK_ITEM, RegistryHandler.SILVER_ORE_ITEM, RegistryHandler.STEEL_BLOCK_ITEM,
			RegistryHandler.SULFUR_BLOCK_ITEM, RegistryHandler.SULFUR_ORE_ITEM, RegistryHandler.TIN_BLOCK_ITEM, RegistryHandler.TIN_ORE_ITEM,
			RegistryHandler.TITANIUM_BLOCK_ITEM, RegistryHandler.TITANIUM_ORE_ITEM, RegistryHandler.ZINC_BLOCK_ITEM, RegistryHandler.ZINC_ORE_ITEM
	};

    public CMPLXCoreMaterials() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        RegistryHandler.init();
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {}
    
    private void doClientStuff(final FMLClientSetupEvent event) {}
    
    public static final CmplxCoreMaterialsTab CMPLXCORE_MATERIALS_TAB = new CmplxCoreMaterialsTab("cmplxcore_materials") {
    	@Override
    	public ItemStack createIcon() {
    		return new ItemStack(RegistryHandler.TIN_INGOT.get());
    		}};
}