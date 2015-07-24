package com.Red.main.ingame;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

/**
 * @author Dralard
 *
 */

public class breadore extends Block{

	public breadore(Material materialIn) {
		super(materialIn);
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(3f);
		
		
	}
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return RedItems.sbread;
    }

    public int quantityDropped(Random random)
    {
        return 1 + random.nextInt(4);
    }
    {
    	this.setCreativeTab(CreativeTabs.tabBlock);
    }
    
}
    
    	