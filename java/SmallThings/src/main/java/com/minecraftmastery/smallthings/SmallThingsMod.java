package com.minecraftmastery.smallthings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


@Mod(modid = SmallThingsMod.MODID, version = SmallThingsMod.VERSION)
public class SmallThingsMod {

    public static final String MODID = "smallthings";
    public static final String VERSION = "1.0";
    
    public static ToolMaterial toolObsidian = EnumHelper.addToolMaterial("OBSIDIAN", 3, 2561, 7.5F, 4.0F, 10);
    public static ArmorMaterial armorObsidian = EnumHelper.addArmorMaterial("OBSIDIAN", 33, new int[]{3, 8, 6, 3}, 10);
	
	
	public static Item cookedBone;
	public static Item obsidianAxe;
	public static Item hardenedDiamond;
	public static Item obsidianHelmet;
	public static Item obsidianChestplate;
	public static Item obsidianLeggings;
	public static Item obsidianBoots;
//	public static Item treatedRope;
//	public static Item untreatedRope;
	

	@EventHandler
	public void load(FMLInitializationEvent event) {
		
		
		cookedBone = new ItemCookedBone(8, 0.8F, true);
		GameRegistry.registerItem(cookedBone, ItemCookedBone.ITEM_NAME);
		
		hardenedDiamond = new ItemHardenedDiamond();
		GameRegistry.registerItem(hardenedDiamond, ItemHardenedDiamond.ITEM_NAME);
		
		obsidianAxe = new ItemObsidianAxe(toolObsidian);
		GameRegistry.registerItem(obsidianAxe, ItemObsidianAxe.ITEM_NAME);
		
		obsidianHelmet = new ItemObsidianHelmet(armorObsidian, 0, 0);
		GameRegistry.registerItem(obsidianHelmet, ItemObsidianHelmet.ITEM_NAME); 
		
		obsidianChestplate = new ItemObsidianChestplate(armorObsidian, 0, 1);
		GameRegistry.registerItem(obsidianChestplate, ItemObsidianChestplate.ITEM_NAME); 
		
		obsidianLeggings = new ItemObsidianLeggings(armorObsidian, 0, 2);
		GameRegistry.registerItem(obsidianLeggings, ItemObsidianLeggings.ITEM_NAME); 
		
		obsidianBoots = new ItemObsidianBoots(armorObsidian, 0, 3);
		GameRegistry.registerItem(obsidianBoots, ItemObsidianBoots.ITEM_NAME); 
		
		SmallThingsModRecipes.addRecipes();
	}
}
