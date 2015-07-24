package com.Red.main.proxy;

import com.Red.main.ingame.RedBlocks;
import com.Red.main.ingame.RedItems;

/**
 * @author Dralard
 *
 */

public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenders() {
		 RedBlocks.registerRenders();
		 RedItems.registerRenders();
 }

}
