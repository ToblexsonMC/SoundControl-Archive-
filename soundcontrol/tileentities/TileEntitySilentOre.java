package com.toblexson.soundcontrol.tileentities;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundCategory;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import com.toblexson.soundcontrol.utils.SCBoundingBox;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileEntitySilentOre extends TileEntity {
	
	private int counter = 0;
	
	private SCBoundingBox area;
	
	private List<EntityPlayer> players;
	
	
	
	@Override
	public void updateEntity() {
		if(counter == 200) {
			// check for player within 5 block radius
			if(area == null) {
				area = new SCBoundingBox(xCoord - 5, yCoord - 5, zCoord - 5, xCoord + 5, yCoord + 5, zCoord + 5);
			}
			if(players == null) {
				System.out.println(area.maxX + " " + area.maxY + " " + area.maxZ + " " + area.minX + " " + area.minY + " " + area.minZ + " ");
			}
			players = worldObj.getEntitiesWithinAABB(EntityPlayer.class, area);	
			
			// mute their minecraft
			for(int a = 0; a < players.size(); a++) {
				MuteMinecraft(players.get(a));
			}
			counter = 0;
		} else {
			counter++;
		}
	}
	
	@SideOnly(Side.CLIENT)
	private void MuteMinecraft(EntityPlayer player) {
		if(player == Minecraft.getMinecraft().thePlayer) {
//			Minecraft.getMinecraft().getSoundHandler().pauseSounds();
//			Minecraft.getMinecraft().getSoundHandler().stopSounds();
			Minecraft.getMinecraft().getSoundHandler().setSoundLevel(SoundCategory.MASTER, (float)0);
		}
		int count = 0;
		if(count == 200) {
//			Minecraft.getMinecraft().getSoundHandler().resumeSounds();
			Minecraft.getMinecraft().getSoundHandler().setSoundLevel(SoundCategory.MASTER, (float)1);
		}
	}
	
//	@SideOnly(Side.CLIENT)
//	public void UnmuteMinecraft(EntityPlayer player) {
//		if(player == Minecraft.getMinecraft().thePlayer) {
//			Minecraft.getMinecraft().getSoundHandler().resumeSounds();
//		}
//	}
}
