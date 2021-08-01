package net.cmplx.cmplxcore_materials.events;

import net.cmplx.cmplxcore_materials.CMPLXCoreMaterials;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = CMPLXCoreMaterials.MOD_ID, bus = Bus.FORGE, value = Dist.DEDICATED_SERVER)
public class EventHandler {
	
	/*
	@SubscribeEvent
	public static void hammerBreakEvent(BlockEvent.HarvestDropsEvent event) {
		PlayerEntity miner = event.getHarvester();
		ItemStack held_item = miner.getHeldItemMainhand();
		Block block = event.getState().getBlock().getBlock();

		boolean holdingWoodHammer = (held_item == new ItemStack(RegistryHandler.WOOD_HAMMER.get()));
		boolean holdingGraphiteHammer = (held_item == new ItemStack(RegistryHandler.GRAPHITE_HAMMER.get()));
		boolean holdingStoneHammer = (held_item == new ItemStack(RegistryHandler.WOOD_HAMMER.get()));
		boolean holdingIronHammer = (held_item == new ItemStack(RegistryHandler.IRON_HAMMER.get()));
		boolean holdingGoldHammer = (held_item == new ItemStack(RegistryHandler.GOLD_HAMMER.get()));
		boolean holdingDiamondHammer = (held_item == new ItemStack(RegistryHandler.DIAMOND_HAMMER.get()));

		if (holdingWoodHammer || holdingGraphiteHammer || holdingStoneHammer || holdingIronHammer || holdingGoldHammer || holdingDiamondHammer) {
			if ((block == Blocks.COBBLESTONE || event.getState().getBlock() == Blocks.STONE) && !event.isSilkTouching()) {
				event.getDrops().add(new ItemStack(RegistryHandler.ROCK.get()));
				event.getDrops().add(new ItemStack(RegistryHandler.ROCK.get()));
				event.getDrops().remove(new ItemStack(Items.COBBLESTONE));
			} else if (block == Blocks.NETHERRACK && !event.isSilkTouching()) {
				event.getDrops().add(new ItemStack(RegistryHandler.NETHERROCK.get()));
				event.getDrops().add(new ItemStack(RegistryHandler.NETHERROCK.get()));
				event.getDrops().remove(new ItemStack(Items.NETHERRACK));
			} else if (block == Blocks.IRON_ORE && !event.isSilkTouching()) {
				event.getDrops().add(new ItemStack(RegistryHandler.IRON_ORE_CHUNK.get()));
				event.getDrops().add(new ItemStack(RegistryHandler.IRON_ORE_CHUNK.get()));
				event.getDrops().remove(new ItemStack(Items.IRON_ORE));
			} else if (block == Blocks.GOLD_ORE && !event.isSilkTouching()) {
				event.getDrops().add(new ItemStack(RegistryHandler.GOLD_ORE_CHUNK.get()));
				event.getDrops().add(new ItemStack(RegistryHandler.GOLD_ORE_CHUNK.get()));
				event.getDrops().remove(new ItemStack(Items.GOLD_ORE));
			} else if (block == Blocks.REDSTONE_ORE && !event.isSilkTouching()) {
				event.getDrops().add(new ItemStack(RegistryHandler.REDSTONE_ORE_CHUNK.get()));
				event.getDrops().add(new ItemStack(RegistryHandler.REDSTONE_ORE_CHUNK.get()));
				event.getDrops().remove(new ItemStack(Items.REDSTONE));
			} else if (block == Blocks.LAPIS_ORE && !event.isSilkTouching()) {
				event.getDrops().add(new ItemStack(RegistryHandler.LAPIS_ORE_CHUNK.get()));
				event.getDrops().add(new ItemStack(RegistryHandler.LAPIS_ORE_CHUNK.get()));
				event.getDrops().remove(new ItemStack(Items.LAPIS_LAZULI));
			} else if (block == Blocks.COAL_ORE && !event.isSilkTouching()) {
				event.getDrops().add(new ItemStack(RegistryHandler.COAL_ORE_CHUNK.get()));
				event.getDrops().add(new ItemStack(RegistryHandler.COAL_ORE_CHUNK.get()));
				event.getDrops().remove(new ItemStack(Items.COAL));
			} else if (block == Blocks.NETHER_QUARTZ_ORE && !event.isSilkTouching()) {
				event.getDrops().add(new ItemStack(RegistryHandler.QUARTZ_ORE_CHUNK.get()));
				event.getDrops().add(new ItemStack(RegistryHandler.QUARTZ_ORE_CHUNK.get()));
				event.getDrops().remove(new ItemStack(Items.QUARTZ));
			} else if (block == RegistryHandler.ALUMINUM_ORE.get() && !event.isSilkTouching()) {
				event.getDrops().add(new ItemStack(RegistryHandler.ALUMINUM_ORE_CHUNK.get()));
				event.getDrops().add(new ItemStack(RegistryHandler.ALUMINUM_ORE_CHUNK.get()));
				event.getDrops().remove(new ItemStack(RegistryHandler.ALUMINUM_ORE.get()));
			} else if (block == RegistryHandler.CINNABAR_ORE.get() && !event.isSilkTouching()) {
				event.getDrops().add(new ItemStack(RegistryHandler.CINNABAR_ORE_CHUNK.get()));
				event.getDrops().add(new ItemStack(RegistryHandler.CINNABAR_ORE_CHUNK.get()));
				event.getDrops().remove(new ItemStack(RegistryHandler.CINNABAR_ORE.get()));
			} else if (block == RegistryHandler.COBALT_ORE.get() && !event.isSilkTouching()) {
				event.getDrops().add(new ItemStack(RegistryHandler.COBALT_ORE_CHUNK.get()));
				event.getDrops().add(new ItemStack(RegistryHandler.COBALT_ORE_CHUNK.get()));
				event.getDrops().remove(new ItemStack(RegistryHandler.COBALT_ORE.get()));
			} else if (block == RegistryHandler.COPPER_ORE.get() && !event.isSilkTouching()) {
				event.getDrops().add(new ItemStack(RegistryHandler.COPPER_ORE_CHUNK.get()));
				event.getDrops().add(new ItemStack(RegistryHandler.COPPER_ORE_CHUNK.get()));
				event.getDrops().remove(new ItemStack(RegistryHandler.COPPER_ORE.get()));
			} else if (block == RegistryHandler.IRIDIUM_ORE.get() && !event.isSilkTouching()) {
				event.getDrops().add(new ItemStack(RegistryHandler.IRIDIUM_ORE_CHUNK.get()));
				event.getDrops().add(new ItemStack(RegistryHandler.IRIDIUM_ORE_CHUNK.get()));
				event.getDrops().remove(new ItemStack(RegistryHandler.IRIDIUM_ORE.get()));
			} else if (block == RegistryHandler.LEAD_ORE.get() && !event.isSilkTouching()) {
				event.getDrops().add(new ItemStack(RegistryHandler.LEAD_ORE_CHUNK.get()));
				event.getDrops().add(new ItemStack(RegistryHandler.LEAD_ORE_CHUNK.get()));
				event.getDrops().remove(new ItemStack(RegistryHandler.LEAD_ORE.get()));
			} else if (block == RegistryHandler.NICKEL_ORE.get() && !event.isSilkTouching()) {
				event.getDrops().add(new ItemStack(RegistryHandler.NICKEL_ORE_CHUNK.get()));
				event.getDrops().add(new ItemStack(RegistryHandler.NICKEL_ORE_CHUNK.get()));
				event.getDrops().remove(new ItemStack(RegistryHandler.NICKEL_ORE.get()));
			} else if (block == RegistryHandler.NITER_ORE.get() && !event.isSilkTouching()) {
				event.getDrops().add(new ItemStack(RegistryHandler.NITER_ORE_CHUNK.get()));
				event.getDrops().add(new ItemStack(RegistryHandler.NITER_ORE_CHUNK.get()));
				event.getDrops().remove(new ItemStack(RegistryHandler.NITER_ORE.get()));
			} else if (block == RegistryHandler.OSMIUM_ORE.get() && !event.isSilkTouching()) {
				event.getDrops().add(new ItemStack(RegistryHandler.OSMIUM_ORE_CHUNK.get()));
				event.getDrops().add(new ItemStack(RegistryHandler.OSMIUM_ORE_CHUNK.get()));
				event.getDrops().remove(new ItemStack(RegistryHandler.OSMIUM_ORE.get()));
			} else if (block == RegistryHandler.OSMIUM_ORE.get() && !event.isSilkTouching()) {
				event.getDrops().add(new ItemStack(RegistryHandler.OSMIUM_ORE_CHUNK.get()));
				event.getDrops().add(new ItemStack(RegistryHandler.OSMIUM_ORE_CHUNK.get()));
				event.getDrops().remove(new ItemStack(RegistryHandler.OSMIUM_ORE.get()));
			} else if (block == RegistryHandler.SILVER_ORE.get() && !event.isSilkTouching()) {
				event.getDrops().add(new ItemStack(RegistryHandler.SILVER_ORE_CHUNK.get()));
				event.getDrops().add(new ItemStack(RegistryHandler.SILVER_ORE_CHUNK.get()));
				event.getDrops().remove(new ItemStack(RegistryHandler.SILVER_ORE.get()));
			} else if (block == RegistryHandler.SULFUR_ORE.get() && !event.isSilkTouching()) {
				event.getDrops().add(new ItemStack(RegistryHandler.SULFUR_ORE_CHUNK.get()));
				event.getDrops().add(new ItemStack(RegistryHandler.SULFUR_ORE_CHUNK.get()));
				event.getDrops().remove(new ItemStack(RegistryHandler.SULFUR_ORE.get()));
			} else if (block == RegistryHandler.TIN_ORE.get() && !event.isSilkTouching()) {
				event.getDrops().add(new ItemStack(RegistryHandler.TIN_ORE_CHUNK.get()));
				event.getDrops().add(new ItemStack(RegistryHandler.TIN_ORE_CHUNK.get()));
				event.getDrops().remove(new ItemStack(RegistryHandler.TIN_ORE.get()));
			} else if (block == RegistryHandler.TITANIUM_ORE.get() && !event.isSilkTouching()) {
				event.getDrops().add(new ItemStack(RegistryHandler.TITANIUM_ORE_CHUNK.get()));
				event.getDrops().add(new ItemStack(RegistryHandler.TITANIUM_ORE_CHUNK.get()));
				event.getDrops().remove(new ItemStack(RegistryHandler.TITANIUM_ORE.get()));
			} else if (block == RegistryHandler.ZINC_ORE.get() && !event.isSilkTouching()) {
				event.getDrops().add(new ItemStack(RegistryHandler.ZINC_ORE_CHUNK.get()));
				event.getDrops().add(new ItemStack(RegistryHandler.ZINC_ORE_CHUNK.get()));
				event.getDrops().remove(new ItemStack(RegistryHandler.ZINC_ORE.get()));
			}
		}
	}*/
}