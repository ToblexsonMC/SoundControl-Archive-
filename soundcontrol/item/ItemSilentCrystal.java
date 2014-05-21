package com.toblexson.soundcontrol.item;

import com.google.common.eventbus.Subscribe;

import cpw.mods.fml.common.network.NetworkRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;
import net.minecraftforge.event.ServerChatEvent;

/**
 * SoundControl
 * 
 * @author toblexson
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */

public class ItemSilentCrystal extends Item {
	
	private EntityPlayer player;
	
	public ItemSilentCrystal() {
		setUnlocalizedName(SCItemInfo.SILENT_CRYSTAL_NAME);
		setCreativeTab(CreativeTabs.tabMaterials);
		setTextureName(SCItemInfo.SILENT_CRYSTAL_TEXTURE);
		
	}
	
//	@Subscribe
//	public void ChatEvent(ServerChatEvent event) {
//		String message = /*event.message*/ "testing";
//		String username = event.username;
//		EntityPlayerMP MPplayer = event.player;
//		ChatComponentTranslation component = event.component;
//		
//		System.out.println("testing");
//		
//		if((EntityPlayerMP)player != MPplayer) {
//		}
//	}
	
	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int par4, boolean par5) {
//		System.out.println("running");
		player = (EntityPlayer)entity;
//		ServerChatEvent
	}
}

