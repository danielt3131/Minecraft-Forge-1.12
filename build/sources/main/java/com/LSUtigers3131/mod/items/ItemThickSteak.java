package com.LSUtigers3131.mod.items;

import com.LSUtigers3131.mod.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ItemThickSteak extends ItemFood implements IHasModel{
	
	public ItemThickSteak() {
		super(12, 1.0F, true);
		setUnlocalizedName("thicksteak");
		setRegistryName("thicksteak");
		setCreativeTab(Main.daniel);
			
		ModItems.ITEMS.add(this);
		}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
