package com.LSUtigers3131.mod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BasketballBlock extends BlockBase {

	public BasketballBlock(String name, Material material) 
	{
		super(name, material);
		
		setBlockUnbreakable();
		setHarvestLevel("shovel", 3);
		setSoundType(SoundType.ANVIL);
	}

}
