package com.starfishsparkle.myfirstmod;


import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = MyFirstMod.MODID, version = MyFirstMod.VERSION)
public class MyFirstMod
{
    public static final String MODID = "My Sparkly Mod";
    public static final String VERSION = "0.3";
    public static final String ITEM_NAME = "Best Item. Not!";
    
    @Metadata
    public static ModMetadata meta;
    
    public static Block myFirstBlock;
    public static Item myFirstItem; 
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	// blockode
    	myFirstBlock = new MyFirstBlock()
    		.setBlockName("My First Block")
    		.setCreativeTab(CreativeTabs.tabBlock);
    	GameRegistry.registerBlock(myFirstBlock, "My First Block");
    	
    	// Itemkode 
    	myFirstItem = new Item()
    		.setUnlocalizedName(ITEM_NAME)
    		.setCreativeTab(CreativeTabs.tabMisc);
    	GameRegistry.registerItem(myFirstItem, ITEM_NAME);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }
}