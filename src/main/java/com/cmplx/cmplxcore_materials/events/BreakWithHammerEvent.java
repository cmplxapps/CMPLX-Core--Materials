package com.cmplx.cmplxcore_materials.events;

import com.cmplx.cmplxcore_materials.CMPLXCoreMaterials;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = CMPLXCoreMaterials.MOD_ID, bus = Bus.FORGE, value = Dist.CLIENT)
public class BreakWithHammerEvent {
	
	@SubscribeEvent
	public static void hammerBreakEvent(BlockEvent.HarvestDropsEvent theEvent) {
		
		/* DEPRECATED UNTIL FURTHER NOTICE!!!
		 * 
		 * 
		 * 
		PlayerEntity miner = theEvent.getHarvester();
		ItemStack heldItem = miner.getHeldItemMainhand();
		Block theBlock = theEvent.getState().getBlock().getBlock();

		boolean holdingWoodHammer = (heldItem == new ItemStack(RegistryHandler.WOOD_HAMMER.get()));
		boolean holdingGraphiteHammer = (heldItem == new ItemStack(RegistryHandler.GRAPHITE_HAMMER.get()));
		boolean holdingStoneHammer = (heldItem == new ItemStack(RegistryHandler.WOOD_HAMMER.get()));
		boolean holdingIronHammer = (heldItem == new ItemStack(RegistryHandler.IRON_HAMMER.get()));
		boolean holdingGoldHammer = (heldItem == new ItemStack(RegistryHandler.GOLD_HAMMER.get()));
		boolean holdingDiamondHammer = (heldItem == new ItemStack(RegistryHandler.DIAMOND_HAMMER.get()));

		if (holdingWoodHammer || holdingGraphiteHammer || holdingStoneHammer || holdingIronHammer || holdingGoldHammer || holdingDiamondHammer) {
			if ((theBlock == Blocks.COBBLESTONE || theEvent.getState().getBlock() == Blocks.STONE) && !theEvent.isSilkTouching()) {
				theEvent.getDrops().add(new ItemStack(RegistryHandler.ROCK.get()));
				theEvent.getDrops().add(new ItemStack(RegistryHandler.ROCK.get()));
				theEvent.getDrops().remove(new ItemStack(Items.COBBLESTONE));
			} else if (theBlock == Blocks.NETHERRACK && !theEvent.isSilkTouching()) {
				theEvent.getDrops().add(new ItemStack(RegistryHandler.NETHERROCK.get()));
				theEvent.getDrops().add(new ItemStack(RegistryHandler.NETHERROCK.get()));
				theEvent.getDrops().remove(new ItemStack(Items.NETHERRACK));
			} else if (theBlock == Blocks.IRON_ORE && !theEvent.isSilkTouching()) {
				theEvent.getDrops().add(new ItemStack(RegistryHandler.IRON_ORE_CHUNK.get()));
				theEvent.getDrops().add(new ItemStack(RegistryHandler.IRON_ORE_CHUNK.get()));
				theEvent.getDrops().remove(new ItemStack(Items.IRON_ORE));
			} else if (theBlock == Blocks.GOLD_ORE && !theEvent.isSilkTouching()) {
				theEvent.getDrops().add(new ItemStack(RegistryHandler.GOLD_ORE_CHUNK.get()));
				theEvent.getDrops().add(new ItemStack(RegistryHandler.GOLD_ORE_CHUNK.get()));
				theEvent.getDrops().remove(new ItemStack(Items.GOLD_ORE));
			} else if (theBlock == Blocks.REDSTONE_ORE && !theEvent.isSilkTouching()) {
				theEvent.getDrops().add(new ItemStack(RegistryHandler.REDSTONE_ORE_CHUNK.get()));
				theEvent.getDrops().add(new ItemStack(RegistryHandler.REDSTONE_ORE_CHUNK.get()));
				theEvent.getDrops().remove(new ItemStack(Items.REDSTONE));
			} else if (theBlock == Blocks.LAPIS_ORE && !theEvent.isSilkTouching()) {
				theEvent.getDrops().add(new ItemStack(RegistryHandler.LAPIS_ORE_CHUNK.get()));
				theEvent.getDrops().add(new ItemStack(RegistryHandler.LAPIS_ORE_CHUNK.get()));
				theEvent.getDrops().remove(new ItemStack(Items.LAPIS_LAZULI));
			} else if (theBlock == Blocks.COAL_ORE && !theEvent.isSilkTouching()) {
				theEvent.getDrops().add(new ItemStack(RegistryHandler.COAL_ORE_CHUNK.get()));
				theEvent.getDrops().add(new ItemStack(RegistryHandler.COAL_ORE_CHUNK.get()));
				theEvent.getDrops().remove(new ItemStack(Items.COAL));
			} else if (theBlock == Blocks.NETHER_QUARTZ_ORE && !theEvent.isSilkTouching()) {
				theEvent.getDrops().add(new ItemStack(RegistryHandler.QUARTZ_ORE_CHUNK.get()));
				theEvent.getDrops().add(new ItemStack(RegistryHandler.QUARTZ_ORE_CHUNK.get()));
				theEvent.getDrops().remove(new ItemStack(Items.QUARTZ));
			} else if (theBlock == RegistryHandler.ALUMINUM_ORE.get() && !theEvent.isSilkTouching()) {
				theEvent.getDrops().add(new ItemStack(RegistryHandler.ALUMINUM_ORE_CHUNK.get()));
				theEvent.getDrops().add(new ItemStack(RegistryHandler.ALUMINUM_ORE_CHUNK.get()));
				theEvent.getDrops().remove(new ItemStack(RegistryHandler.ALUMINUM_ORE.get()));
			} else if (theBlock == RegistryHandler.CINNABAR_ORE.get() && !theEvent.isSilkTouching()) {
				theEvent.getDrops().add(new ItemStack(RegistryHandler.CINNABAR_ORE_CHUNK.get()));
				theEvent.getDrops().add(new ItemStack(RegistryHandler.CINNABAR_ORE_CHUNK.get()));
				theEvent.getDrops().remove(new ItemStack(RegistryHandler.CINNABAR_ORE.get()));
			} else if (theBlock == RegistryHandler.COBALT_ORE.get() && !theEvent.isSilkTouching()) {
				theEvent.getDrops().add(new ItemStack(RegistryHandler.COBALT_ORE_CHUNK.get()));
				theEvent.getDrops().add(new ItemStack(RegistryHandler.COBALT_ORE_CHUNK.get()));
				theEvent.getDrops().remove(new ItemStack(RegistryHandler.COBALT_ORE.get()));
			} else if (theBlock == RegistryHandler.COPPER_ORE.get() && !theEvent.isSilkTouching()) {
				theEvent.getDrops().add(new ItemStack(RegistryHandler.COPPER_ORE_CHUNK.get()));
				theEvent.getDrops().add(new ItemStack(RegistryHandler.COPPER_ORE_CHUNK.get()));
				theEvent.getDrops().remove(new ItemStack(RegistryHandler.COPPER_ORE.get()));
			} else if (theBlock == RegistryHandler.IRIDIUM_ORE.get() && !theEvent.isSilkTouching()) {
				theEvent.getDrops().add(new ItemStack(RegistryHandler.IRIDIUM_ORE_CHUNK.get()));
				theEvent.getDrops().add(new ItemStack(RegistryHandler.IRIDIUM_ORE_CHUNK.get()));
				theEvent.getDrops().remove(new ItemStack(RegistryHandler.IRIDIUM_ORE.get()));
			} else if (theBlock == RegistryHandler.LEAD_ORE.get() && !theEvent.isSilkTouching()) {
				theEvent.getDrops().add(new ItemStack(RegistryHandler.LEAD_ORE_CHUNK.get()));
				theEvent.getDrops().add(new ItemStack(RegistryHandler.LEAD_ORE_CHUNK.get()));
				theEvent.getDrops().remove(new ItemStack(RegistryHandler.LEAD_ORE.get()));
			} else if (theBlock == RegistryHandler.NICKEL_ORE.get() && !theEvent.isSilkTouching()) {
				theEvent.getDrops().add(new ItemStack(RegistryHandler.NICKEL_ORE_CHUNK.get()));
				theEvent.getDrops().add(new ItemStack(RegistryHandler.NICKEL_ORE_CHUNK.get()));
				theEvent.getDrops().remove(new ItemStack(RegistryHandler.NICKEL_ORE.get()));
			} else if (theBlock == RegistryHandler.NITER_ORE.get() && !theEvent.isSilkTouching()) {
				theEvent.getDrops().add(new ItemStack(RegistryHandler.NITER_ORE_CHUNK.get()));
				theEvent.getDrops().add(new ItemStack(RegistryHandler.NITER_ORE_CHUNK.get()));
				theEvent.getDrops().remove(new ItemStack(RegistryHandler.NITER_ORE.get()));
			} else if (theBlock == RegistryHandler.OSMIUM_ORE.get() && !theEvent.isSilkTouching()) {
				theEvent.getDrops().add(new ItemStack(RegistryHandler.OSMIUM_ORE_CHUNK.get()));
				theEvent.getDrops().add(new ItemStack(RegistryHandler.OSMIUM_ORE_CHUNK.get()));
				theEvent.getDrops().remove(new ItemStack(RegistryHandler.OSMIUM_ORE.get()));
			} else if (theBlock == RegistryHandler.OSMIUM_ORE.get() && !theEvent.isSilkTouching()) {
				theEvent.getDrops().add(new ItemStack(RegistryHandler.OSMIUM_ORE_CHUNK.get()));
				theEvent.getDrops().add(new ItemStack(RegistryHandler.OSMIUM_ORE_CHUNK.get()));
				theEvent.getDrops().remove(new ItemStack(RegistryHandler.OSMIUM_ORE.get()));
			} else if (theBlock == RegistryHandler.SILVER_ORE.get() && !theEvent.isSilkTouching()) {
				theEvent.getDrops().add(new ItemStack(RegistryHandler.SILVER_ORE_CHUNK.get()));
				theEvent.getDrops().add(new ItemStack(RegistryHandler.SILVER_ORE_CHUNK.get()));
				theEvent.getDrops().remove(new ItemStack(RegistryHandler.SILVER_ORE.get()));
			} else if (theBlock == RegistryHandler.SULFUR_ORE.get() && !theEvent.isSilkTouching()) {
				theEvent.getDrops().add(new ItemStack(RegistryHandler.SULFUR_ORE_CHUNK.get()));
				theEvent.getDrops().add(new ItemStack(RegistryHandler.SULFUR_ORE_CHUNK.get()));
				theEvent.getDrops().remove(new ItemStack(RegistryHandler.SULFUR_ORE.get()));
			} else if (theBlock == RegistryHandler.TIN_ORE.get() && !theEvent.isSilkTouching()) {
				theEvent.getDrops().add(new ItemStack(RegistryHandler.TIN_ORE_CHUNK.get()));
				theEvent.getDrops().add(new ItemStack(RegistryHandler.TIN_ORE_CHUNK.get()));
				theEvent.getDrops().remove(new ItemStack(RegistryHandler.TIN_ORE.get()));
			} else if (theBlock == RegistryHandler.TITANIUM_ORE.get() && !theEvent.isSilkTouching()) {
				theEvent.getDrops().add(new ItemStack(RegistryHandler.TITANIUM_ORE_CHUNK.get()));
				theEvent.getDrops().add(new ItemStack(RegistryHandler.TITANIUM_ORE_CHUNK.get()));
				theEvent.getDrops().remove(new ItemStack(RegistryHandler.TITANIUM_ORE.get()));
			} else if (theBlock == RegistryHandler.ZINC_ORE.get() && !theEvent.isSilkTouching()) {
				theEvent.getDrops().add(new ItemStack(RegistryHandler.ZINC_ORE_CHUNK.get()));
				theEvent.getDrops().add(new ItemStack(RegistryHandler.ZINC_ORE_CHUNK.get()));
				theEvent.getDrops().remove(new ItemStack(RegistryHandler.ZINC_ORE.get()));
			}
		}
		*/
	}
}