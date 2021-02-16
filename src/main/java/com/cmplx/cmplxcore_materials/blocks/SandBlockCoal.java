package com.cmplx.cmplxcore_materials.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class SandBlockCoal extends Block
{
	
	public SandBlockCoal() 
	{
		
		super(Block.Properties.create(Material.SAND).hardnessAndResistance(2.0f, 0.5f).sound(SoundType.SAND).harvestLevel(0).harvestTool(ToolType.SHOVEL));
		
		
		
		
		
	}
	
	
	
	
	
}
