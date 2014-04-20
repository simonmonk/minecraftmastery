package com.minecraftmastery.smallthings;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.GameRegistry;

public class SmallThingsModRecipes extends SmallThingsMod{
	
	public static void addRecipes() {
		
		GameRegistry.addSmelting(Items.bone, new ItemStack(cookedBone, 1), 0.2F);

		GameRegistry.addRecipe(new ItemStack(obsidianAxe), 
				new Object[] {"HH ", 
			                  "HS ", 
			                  " S ", 
			                  'H', hardenedDiamond, 'S', Items.stick});
		

		GameRegistry.addRecipe(new ItemStack(obsidianHelmet), 
				new Object[] {"HHH", 
			                  "H H", 
			                  'H', hardenedDiamond});
		
		GameRegistry.addRecipe(new ItemStack(obsidianChestplate), 
				new Object[] {"H H", 
			                  "HHH", 
			                  "HHH", 
			                  'H', hardenedDiamond});
		
		GameRegistry.addRecipe(new ItemStack(obsidianLeggings), 
				new Object[] {"HHH", 
			                  "H H", 
			                  "H H", 
			                  'H', hardenedDiamond});
		
		GameRegistry.addRecipe(new ItemStack(obsidianBoots), 
				new Object[] {"H H", 
			                  "H H", 
			                  'H', hardenedDiamond});
		
		}

}
