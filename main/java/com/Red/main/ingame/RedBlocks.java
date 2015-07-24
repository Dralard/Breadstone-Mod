package com.Red.main.ingame;

import com.Red.main.strings;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * @author Dralard
 *
 */

public class RedBlocks {
	
	public static Block breadore;
	
	public static void init()
	{
		breadore = new breadore(Material.rock).setUnlocalizedName("breadore");
		
	}
	
	public static void  register()
	{
		GameRegistry.registerBlock(breadore, breadore.getUnlocalizedName().substring(5)); //tile.breadore
	}
	
	public static void registerRenders()
	{
		registerRender(breadore);
	}
	
		public static void registerRender(Block block)
	{
			Item item = Item.getItemFromBlock(block);
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(strings.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
