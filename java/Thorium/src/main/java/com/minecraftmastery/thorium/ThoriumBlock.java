package com.minecraftmastery.thorium;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class ThoriumBlock extends Block {
	
	public static final String BLOCK_NAME = "thoriumblock";

	public ThoriumBlock() {
		super(Material.rock);
		setCreativeTab(CreativeTabs.tabBlock);
		setLightLevel(1.0f);
		setBlockName(BLOCK_NAME);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister reg) {
		blockIcon = reg.registerIcon(Thorium.MODID + ":" + BLOCK_NAME);
	}
	
	
}
