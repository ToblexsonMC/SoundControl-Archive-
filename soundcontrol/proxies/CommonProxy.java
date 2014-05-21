package com.toblexson.soundcontrol.proxies;

import com.toblexson.soundcontrol.tileentities.SCTileEntityInfo;
import com.toblexson.soundcontrol.tileentities.TileEntitySilentOre;

import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {

	public void registerTileEntities() {
		
		GameRegistry.registerTileEntity(TileEntitySilentOre.class, SCTileEntityInfo.TE_SILENT_ORE_ID);
	}
}
