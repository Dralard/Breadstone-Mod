package com.Red.main.ingame;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author Dralard
 *
 */

public class sbread extends ItemFood{

	public sbread(int amount, float saturation, boolean isWolfFood) {
		super(5, 0.6f, isWolfFood);
		this.setUnlocalizedName("sbread");
		this.setCreativeTab(CreativeTabs.tabFood);
		// Food Properties for Bread Item
	}
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List tooltip, boolean advanced)
    {
        tooltip.add("Are you sure this bread is edible?");
    }
 }
	
