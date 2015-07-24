package com.Red.main.ingame;

import com.Red.main.strings;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * @author Dralard
 *
 */

public class RedItems {
	
	public static Item sbread;
	
	
	public static void init() {
		sbread = new sbread(5, 0.6f, false);
	}
	
	public static void register() 
	{
		GameRegistry.registerItem(sbread, sbread.getUnlocalizedName().substring(5)); //tile.sbread
	}
	
	public static void registerRenders()
	{
		registerRender(sbread);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(strings.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
