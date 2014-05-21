package com.toblexson.soundcontrol.block;

import net.minecraft.block.Block;

import com.toblexson.soundcontrol.SoundControl;
import com.toblexson.soundcontrol.lib.SCInfo;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * SoundControl
 * 
 * @author toblexson
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */

public class SCBlocks {

	private static void Register(Block block) {
		
		GameRegistry.registerBlock(block, SCInfo.MODID + "_" + block.getUnlocalizedName().substring(5));
	}
	
	public static void InitBlocks() {
		
		Register(SoundControl.SilentOre); 
	}
}
