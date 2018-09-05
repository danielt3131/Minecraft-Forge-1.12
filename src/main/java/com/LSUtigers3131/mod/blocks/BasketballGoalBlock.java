package com.LSUtigers3131.mod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BasketballGoalBlock extends BlockBase {

	public BasketballGoalBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setLightLevel(0.5F);
		setLightOpacity(6);
		setHardness(5.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 3);
	}

}
