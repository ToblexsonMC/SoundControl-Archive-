package com.toblexson.soundcontrol.block;

import com.toblexson.soundcontrol.SoundControl;
import com.toblexson.soundcontrol.lib.SCInfo;
import com.toblexson.soundcontrol.tileentities.TileEntitySilentOre;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundCategory;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * SoundControl
 * 
 * @author toblexson
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */

public class BlockSilentOre extends BlockContainer {

	public BlockSilentOre() {
		super(Material.rock);
		setBlockName(SCBlockInfo.SILENT_ORE_NAME);
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(3.0F);
		setStepSound(soundTypePiston);
		setBlockTextureName(SCBlockInfo.SILENT_ORE_TEXTURE);
		setHarvestLevel("pickaxe", 2);
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntitySilentOre();
	}
	
	
	
	@Override
	public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int metadata) {
//		if (world.getTileEntity(x, y, z) instanceof TileEntitySilentOre) {
//		TileEntitySilentOre ore = (TileEntitySilentOre)world.getTileEntity(x, y, z);
//		System.out.println("starting sound again");
		Minecraft.getMinecraft().getSoundHandler().setSoundLevel(SoundCategory.MASTER, (float)1);
//		}
	}
}