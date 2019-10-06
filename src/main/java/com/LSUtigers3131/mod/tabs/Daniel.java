package com.LSUtigers3131.mod.tabs;

import com.LSUtigers3131.mod.items.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class Daniel extends CreativeTabs{

	public Daniel(String label) {
		super("daniel");
		
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.RUBY);
	}

}
