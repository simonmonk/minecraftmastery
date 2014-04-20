package com.minecraftmastery.smallthings;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;



public class ItemObsidianBoots extends ItemGeneralArmor{
	
	public static final String ITEM_NAME = "obsidianboots";

	public ItemObsidianBoots(ArmorMaterial material, int p1, int location) {
		super(material, p1, location);
		setUnlocalizedName(ITEM_NAME);
	}
	
	public void registerIcons(IIconRegister reg)
    {
        itemIcon = reg.registerIcon(SmallThingsMod.MODID + ":" + ITEM_NAME);
    }
	

}
