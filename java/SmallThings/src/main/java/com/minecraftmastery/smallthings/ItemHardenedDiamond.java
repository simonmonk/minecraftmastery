package com.minecraftmastery.smallthings;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;

public class ItemHardenedDiamond extends Item{
	
	public static final String ITEM_NAME = "hardeneddiamond";
	
	protected ItemHardenedDiamond() {
		super();
		setCreativeTab(CreativeTabs.tabMaterials);
		setUnlocalizedName(ITEM_NAME);
	}
	
	public void registerIcons(IIconRegister reg) {
		itemIcon = reg.registerIcon(SmallThingsMod.MODID + ":" + ITEM_NAME);
	}

}