package com.minecraftmastery.smallthings;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;



public class ItemObsidianLeggings extends ItemGeneralArmor{
	
	public static final String ITEM_NAME = "obsidianleggings";

	public ItemObsidianLeggings(ArmorMaterial material, int p1, int p2) {
		super(material, p1, p2);
		setUnlocalizedName(ITEM_NAME);
	}
	
	public void registerIcons(IIconRegister reg)
    {
        itemIcon = reg.registerIcon(SmallThingsMod.MODID + ":" + ITEM_NAME);
    }
	

}
