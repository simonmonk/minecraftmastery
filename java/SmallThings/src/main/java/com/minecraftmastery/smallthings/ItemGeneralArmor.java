package com.minecraftmastery.smallthings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemGeneralArmor extends ItemArmor {
	
	
	public ItemGeneralArmor(ArmorMaterial material, int p1, int location) {
		super(material, p1, location);
		setCreativeTab(CreativeTabs.tabCombat);
	}

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
    	Item i = stack.getItem();
    	if(i == SmallThingsMod.obsidianHelmet
    			|| i == SmallThingsMod.obsidianChestplate
    			|| i == SmallThingsMod.obsidianBoots) {
    		return SmallThingsMod.MODID + ":textures/armor/obsidianArmor_1.png";
        } else if(i == SmallThingsMod.obsidianLeggings) {
        	return SmallThingsMod.MODID + ":textures/armor/obsidianArmor_2.png";
        }
        return null;
    }
}
