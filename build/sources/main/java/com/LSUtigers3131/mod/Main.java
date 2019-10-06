package com.LSUtigers3131.mod;

import com.LSUtigers3131.mod.Reference;
import com.LSUtigers3131.mod.items.ModItems;
import com.LSUtigers3131.mod.proxy.CommonProxy;
import com.LSUtigers3131.mod.tabs.Daniel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class Main {

	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMONPROXY)
	public static CommonProxy proxy;
	
	public static final CreativeTabs daniel = new Daniel("daniel");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		GameRegistry.addSmelting(Items.COOKED_BEEF, new ItemStack(ModItems.THICK_STEAK), 1.0F);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
}
