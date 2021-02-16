package com.cmplx.cmplxcore_materials.blocks;

import com.cmplx.cmplxcore_materials.CMPLXCoreMaterials;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem
{

	public BlockItemBase(Block block) 
	{
		
		super(block, new Item.Properties().group(CMPLXCoreMaterials.CMPLXCORE_MATERIALS_TAB));
		
		
		
		
		
	}
	
	
	
	
	
}
