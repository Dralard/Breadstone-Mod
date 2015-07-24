package com.Red.worldgen;

import com.Red.main.ingame.breadore;

import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * @author Dralard
 *
 */

public class WorldGen {
	public static void mainRegistry(){
		initializeWorldGen();
		
	}

	public static void initializeWorldGen(){
		registerWorldGen(new WorldOreGen(),1);
}
	
	public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProbability){
		GameRegistry.registerWorldGenerator(worldGenClass, weightedProbability);
	}
}
