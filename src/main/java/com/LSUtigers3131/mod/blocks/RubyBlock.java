package com.LSUtigers3131.mod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RubyBlock extends BlockBase
{

	public RubyBlock(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setLightLevel(0.0F);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
	}

}
