package net.cmplx.cmplxcore_materials.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class MetalBlockGold extends Block
{

	public MetalBlockGold()
	{
		
		super(Block.Properties.create(Material.IRON).hardnessAndResistance(6.0f, 6.0f).sound(SoundType.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE));
		
		
		
		
		
	}
	
	
	
	
	
}
