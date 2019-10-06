package com.LSUtigers3131.mod.blocks;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	
	// Basic Block do public static final Block yourblock = new BlockBase("yourblock", Material.IRON);
	// Complex Block do public static final Block yourblock = new YourBlock Class();
	public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
	public static final Block LIGHT_BLOCK = new LightBlock("light_block", Material.IRON);
	public static final Block BASKETBALL_GOAL_BLOCK = new BasketballGoalBlock("basketball_goal_block", Material.IRON);
	public static final Block BASKETBALL_BLOCK = new BasketballBlock("basketball_block", Material.IRON);
}
