package net.cmplx.cmplxcore_materials.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class MetalOreIron extends Block
{

	public MetalOreIron()
	{
		
		super(Block.Properties.create(Material.IRON).hardnessAndResistance(3.0f, 6.0f).sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE));
		
		
		
		
		
	}
	
	
	
	
	
}
