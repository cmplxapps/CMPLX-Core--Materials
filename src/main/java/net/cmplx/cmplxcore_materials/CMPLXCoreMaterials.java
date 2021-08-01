package net.cmplx.cmplxcore_materials;

import net.cmplx.cmplxcore_materials.util.RegistryHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("cmplxcore_materials")
public class CMPLXCoreMaterials {
	
	@SuppressWarnings("unused")
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "cmplxcore_materials";
    
    public CMPLXCoreMaterials() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        RegistryHandler.init();
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    private void setup(final FMLCommonSetupEvent event) {}
    
    private void doClientStuff(final FMLClientSetupEvent event) {}
    
    public static final ItemGroup CMPLXCORE_MATERIALS_TAB = new ItemGroup("cmplxcore_materials") {
    	@Override public ItemStack createIcon() {return new ItemStack(RegistryHandler.TIN_INGOT.get());}
    	
    	public void fill(NonNullList<ItemStack> items) {
    		for(Item item : new Item[] {
    						RegistryHandler.ALUMINUM_ORE_ITEM.get(),
    						RegistryHandler.COBALT_ORE_ITEM.get(),
    						RegistryHandler.COPPER_ORE_ITEM.get(),
    						RegistryHandler.IRIDIUM_ORE_ITEM.get(),
    						RegistryHandler.LEAD_ORE_ITEM.get(),
    						RegistryHandler.NICKEL_ORE_ITEM.get(),
    						RegistryHandler.NITER_ORE_ITEM.get(),
    						RegistryHandler.OSMIUM_ORE_ITEM.get(),
    						RegistryHandler.SILVER_ORE_ITEM.get(),
    						RegistryHandler.SULFUR_ORE_ITEM.get(),
    						RegistryHandler.TIN_ORE_ITEM.get(),
    						RegistryHandler.TITANIUM_ORE_ITEM.get(),
    						RegistryHandler.ZINC_ORE_ITEM.get(),
    						RegistryHandler.ALUMINUM_INGOT.get(),
    						RegistryHandler.COBALT_INGOT.get(),
    						RegistryHandler.COPPER_INGOT.get(),
    						RegistryHandler.GRAPHITE_INGOT.get(),
    						RegistryHandler.IRIDIUM_INGOT.get(),
    						RegistryHandler.LEAD_INGOT.get(),
    						RegistryHandler.NICKEL_INGOT.get(),
    						RegistryHandler.OSMIUM_INGOT.get(),
    						RegistryHandler.PURE_SILICON_INGOT.get(),
    						RegistryHandler.RAW_SILICON_INGOT.get(),
    						RegistryHandler.SILVER_INGOT.get(),
    						RegistryHandler.TIN_INGOT.get(),
    						RegistryHandler.TITANIUM_INGOT.get(),
    						RegistryHandler.ZINC_INGOT.get(),
    						RegistryHandler.BRASS_INGOT.get(),
    						RegistryHandler.BRONZE_INGOT.get(),
    						RegistryHandler.STEEL_INGOT.get(),
    						RegistryHandler.OBSIDIAN_INGOT.get(),
    						RegistryHandler.ALUMINUM_NUGGET.get(),
    						RegistryHandler.BRASS_NUGGET.get(),
    						RegistryHandler.BRONZE_NUGGET.get(),
    						RegistryHandler.COBALT_NUGGET.get(),
    						RegistryHandler.COPPER_NUGGET.get(),
    						RegistryHandler.GRAPHITE_CHUNK.get(),
    						RegistryHandler.IRIDIUM_NUGGET.get(),
    						RegistryHandler.LEAD_NUGGET.get(),
    						RegistryHandler.NICKEL_NUGGET.get(),
    						RegistryHandler.OSMIUM_NUGGET.get(),
    						RegistryHandler.PURE_SILICON_NUGGET.get(),
    						RegistryHandler.RAW_SILICON_NUGGET.get(),
    						RegistryHandler.SILVER_NUGGET.get(),
    						RegistryHandler.STEEL_NUGGET.get(),
    						RegistryHandler.TIN_NUGGET.get(),
    						RegistryHandler.TITANIUM_NUGGET.get(),
    						RegistryHandler.ZINC_NUGGET.get(),
    						RegistryHandler.QUARTZ_SHARD.get(),
    						RegistryHandler.DIAMOND_NUGGET.get(),
    						RegistryHandler.EMERALD_NUGGET.get(),
    						RegistryHandler.OBSIDIAN_NUGGET.get(),
    						RegistryHandler.ALUMINUM_ORE_CHUNK.get(),
    						RegistryHandler.CINNABAR_ORE_CHUNK.get(),
    						RegistryHandler.COAL_ORE_CHUNK.get(),
    						RegistryHandler.COBALT_ORE_CHUNK.get(),
    						RegistryHandler.COPPER_ORE_CHUNK.get(),
    						RegistryHandler.DIAMOND_ORE_CHUNK.get(),
    						RegistryHandler.EMERALD_ORE_CHUNK.get(),
    						RegistryHandler.GOLD_ORE_CHUNK.get(),
    						RegistryHandler.IRIDIUM_ORE_CHUNK.get(),
    						RegistryHandler.IRON_ORE_CHUNK.get(),
    						RegistryHandler.LAPIS_ORE_CHUNK.get(),
    						RegistryHandler.QUARTZ_ORE_CHUNK.get(),
    						RegistryHandler.NICKEL_ORE_CHUNK.get(),
    						RegistryHandler.OSMIUM_ORE_CHUNK.get(),
    						RegistryHandler.REDSTONE_ORE_CHUNK.get(),
    						RegistryHandler.SILVER_ORE_CHUNK.get(),
    						RegistryHandler.SULFUR_ORE_CHUNK.get(),
    						RegistryHandler.TIN_ORE_CHUNK.get(),
    						RegistryHandler.TITANIUM_ORE_CHUNK.get(),
    						RegistryHandler.ZINC_ORE_CHUNK.get(),
    						RegistryHandler.ROCK.get(),
    						RegistryHandler.NETHERROCK.get(),
    						RegistryHandler.PURE_SILICON_MESH.get(),
    						RegistryHandler.RAW_SILICON_MESH.get(),
    						RegistryHandler.ALUMINUM_DUST.get(),
    						RegistryHandler.BRASS_DUST.get(),
    						RegistryHandler.BRONZE_DUST.get(),
    						RegistryHandler.COBALT_DUST.get(),
    						RegistryHandler.COPPER_DUST.get(),
    						RegistryHandler.CARBON_DUST.get(),
    						RegistryHandler.IRIDIUM_DUST.get(),
    						RegistryHandler.LEAD_DUST.get(),
    						RegistryHandler.NICKEL_DUST.get(),
    						RegistryHandler.OSMIUM_DUST.get(),
    						RegistryHandler.PURE_SILICON_FLAKES.get(),
    						RegistryHandler.RAW_SILICON_FLAKES.get(),
    						RegistryHandler.SILVER_DUST.get(),
    						RegistryHandler.STEEL_DUST.get(),
    						RegistryHandler.TIN_DUST.get(),
    						RegistryHandler.TITANIUM_DUST.get(),
    						RegistryHandler.ZINC_DUST.get(),
    						RegistryHandler.IRON_DUST.get(),
    						RegistryHandler.GOLD_DUST.get(),
    						RegistryHandler.QUARTZ_DUST.get(),
    						RegistryHandler.DIAMOND_DUST.get(),
    						RegistryHandler.EMERALD_DUST.get(),
    						RegistryHandler.OBSIDIAN_DUST.get(),
    						RegistryHandler.WEAK_GUNPOWDER_BLOCK_ITEM.get(),
    						RegistryHandler.GUNPOWDER_BLOCK_ITEM.get(),
    						RegistryHandler.NITER_BLOCK_ITEM.get(),
    						RegistryHandler.SULFUR_BLOCK_ITEM.get(),
    						RegistryHandler.FINE_SAND_ITEM.get(),
    						RegistryHandler.SMALL_SAND.get(),
    						RegistryHandler.SMALL_FINE_SAND.get(),
    						RegistryHandler.PURE_GLASS_BLOCK_ITEM.get(),
    						RegistryHandler.WEAK_GUNPOWDER.get(),
    						RegistryHandler.NITER.get(),
    						RegistryHandler.SULFUR_DUST.get(),
    						RegistryHandler.OBSIDIAN_FLAKES.get(),
    						RegistryHandler.MERCURY.get(),
    						RegistryHandler.WOOD_CRUSHBOWL.get(),
    						RegistryHandler.GRAPHITE_CRUSHBOWL.get(),
    						RegistryHandler.STONE_CRUSHBOWL.get(),
    						RegistryHandler.IRON_CRUSHBOWL.get(),
    						RegistryHandler.GOLD_CRUSHBOWL.get(),
    						RegistryHandler.DIAMOND_CRUSHBOWL.get(),
    						RegistryHandler.ALUMINUM_BLOCK_ITEM.get(),
    						RegistryHandler.BRASS_BLOCK_ITEM.get(),
    						RegistryHandler.BRONZE_BLOCK_ITEM.get(),
    						RegistryHandler.COBALT_BLOCK_ITEM.get(),
    						RegistryHandler.COPPER_BLOCK_ITEM.get(),
    						RegistryHandler.GRAPHITE_BLOCK_ITEM.get(),
    						RegistryHandler.IRIDIUM_BLOCK_ITEM.get(),
    						RegistryHandler.LEAD_BLOCK_ITEM.get(),
    						RegistryHandler.NICKEL_BLOCK_ITEM.get(),
    						RegistryHandler.OSMIUM_BLOCK_ITEM.get(),
    						RegistryHandler.PURE_SILICON_BLOCK_ITEM.get(),
    						RegistryHandler.RAW_SILICON_BLOCK_ITEM.get(),
    						RegistryHandler.SILVER_BLOCK_ITEM.get(),
    						RegistryHandler.STEEL_BLOCK_ITEM.get(),
    						RegistryHandler.TIN_BLOCK_ITEM.get(),
    						RegistryHandler.TITANIUM_BLOCK_ITEM.get(),
    						RegistryHandler.ZINC_BLOCK_ITEM.get() }) {
    			item.fillItemGroup(this, items); }}};
}
