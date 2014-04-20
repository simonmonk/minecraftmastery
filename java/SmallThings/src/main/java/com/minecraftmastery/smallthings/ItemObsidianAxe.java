package com.minecraftmastery.smallthings;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ItemObsidianAxe extends ItemAxe{
	
	public static final String ITEM_NAME = "obsidianaxe";

	protected ItemObsidianAxe(ToolMaterial material) {
		super(material);
		setCreativeTab(CreativeTabs.tabTools);
		setUnlocalizedName(ITEM_NAME);
	}
	
	public void registerIcons(IIconRegister reg) {
		itemIcon = reg.registerIcon(SmallThingsMod.MODID + ":" + ITEM_NAME);
		}

}
