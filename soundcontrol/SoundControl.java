package com.toblexson.soundcontrol;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;

import com.toblexson.soundcontrol.block.BlockSilentOre;
import com.toblexson.soundcontrol.block.SCBlocks;
import com.toblexson.soundcontrol.item.ItemSilentCrystal;
import com.toblexson.soundcontrol.item.SCItems;
import com.toblexson.soundcontrol.lib.SCInfo;
import com.toblexson.soundcontrol.proxies.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * SoundControl
 * 
 * @author toblexson
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */

@Mod(modid = SCInfo.MODID, version = SCInfo.VERSION)
public class SoundControl {
	
 	@Instance(SCInfo.MODID)
    public static SoundControl instance;
 	    
 	@SidedProxy(clientSide = SCInfo.CLIENTPROXYLOCATION, serverSide = SCInfo.COMMONPROXYLOCATION)
 	public static CommonProxy proxy;
	
 	//Blocks
    public static Block SilentOre;
    //Items
    public static Item SilentCrystal;
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {}
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
		
//		MinecraftForge.EVENT_BUS.register(new ItemSilentCrystal());
    	
    	proxy.registerTileEntities();
    	
    	SilentOre = new BlockSilentOre();
		
		SilentCrystal = new ItemSilentCrystal();
		
		SCBlocks.InitBlocks();
		SCItems.InitItems();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {}
}
