package com.toblexson.soundcontrol.item;

import com.toblexson.soundcontrol.SoundControl;
import com.toblexson.soundcontrol.lib.SCInfo;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * SoundControl
 * 
 * @author toblexson
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */

public class SCItems {

	private static void Register(Item item) {
	
		GameRegistry.registerItem(item, SCInfo.MODID + "_" + item.getUnlocalizedName().substring(5));
	}
	
	public static void InitItems() {
		
		Register(SoundControl.SilentCrystal);
	}
	
}
