package com.Red.main;

import com.Red.main.ingame.RedBlocks;
import com.Red.main.ingame.RedItems;
import com.Red.main.proxy.CommonProxy;
import com.Red.worldgen.WorldGen;
import com.Red.worldgen.WorldOreGen;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = strings.MOD_ID, name = strings.MOD_NAME, version = strings.VERSION)
public class MainRegistry {
	
	/**
	 * @author Dralard
	 *
	 */
	
	@SidedProxy(clientSide = strings.CLIENT_PROXY_CLASS, serverSide = strings.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		RedBlocks.init();
		RedBlocks.register();
		RedItems.init();
		RedItems.register();
		WorldGen.mainRegistry();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		GameRegistry.registerWorldGenerator(new WorldOreGen(),1);
		GameRegistry.addSmelting(RedBlocks.breadore, new ItemStack(RedItems.sbread, 2), 0.35F);
		proxy.registerRenders();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
			
}
