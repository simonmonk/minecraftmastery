package com.minecraftmastery.smallthings;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class ItemCookedBone extends ItemFood {
	
	public static final String ITEM_NAME = "cookedbone";
	
	public ItemCookedBone(int p1, float p2, boolean p3) {
		super(p1, p2, p3);
		setPotionEffect(Potion.damageBoost.id, 5, 0, 1.0F);
		setCreativeTab(CreativeTabs.tabMaterials);
		setUnlocalizedName(ITEM_NAME);
	}
	
	public void registerIcons(IIconRegister reg) {
		itemIcon = reg.registerIcon(SmallThingsMod.MODID + ":" + ITEM_NAME);
	}


}
