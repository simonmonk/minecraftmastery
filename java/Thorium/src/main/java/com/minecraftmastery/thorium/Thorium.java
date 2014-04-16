package com.minecraftmastery.thorium;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Thorium.MODID, version = Thorium.VERSION)
public class Thorium {
    public static final String MODID = "thorium";
    public static final String VERSION = "1.0";
    
    public static Block thoriumOreBlock;
    public static Block thoriumBlock;
    public static ThoriumWorldGenerator thoriumWG = new ThoriumWorldGenerator();
    
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
        thoriumOreBlock = new ThoriumOreBlock();
        thoriumBlock = new ThoriumBlock();

        GameRegistry.registerBlock(thoriumOreBlock, ThoriumOreBlock.BLOCK_NAME);
        GameRegistry.registerBlock(thoriumBlock, ThoriumBlock.BLOCK_NAME);
        GameRegistry.registerWorldGenerator(thoriumWG, 0);
        
        addRecipes();
    }

	private void addRecipes() {
		ItemStack thoriumStack = new ItemStack(thoriumBlock, 1);
		ItemStack thoriumOreStack = new ItemStack(thoriumOreBlock, 1);
		Object[] params = new Object[] {
				"ooo",
				"ooo",
				"ooo",
				'o', thoriumOreStack};
		GameRegistry.addShapedRecipe(thoriumStack, params);
	}
}
