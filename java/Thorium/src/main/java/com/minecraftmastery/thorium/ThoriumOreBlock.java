package com.minecraftmastery.thorium;

import java.util.ArrayList;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class ThoriumOreBlock extends Block {
	
	public static final String BLOCK_NAME = "thoriumoreblock";
	
	public ThoriumOreBlock() {
	    super(Material.rock);
	    setCreativeTab(CreativeTabs.tabBlock);
	    setBlockName(BLOCK_NAME);
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister reg) {
		blockIcon = reg.registerIcon(Thorium.MODID + ":" + BLOCK_NAME);
	}

	@Override
	public int quantityDropped(Random random) {
		return 1;
	}

	@Override
	public boolean canHarvestBlock(EntityPlayer player, int meta) {
		return true;
	}



	

	
	
	
}
