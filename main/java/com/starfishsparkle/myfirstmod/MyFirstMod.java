package com.starfishsparkle.myfirstmod;


import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
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
    public static final String VERSION = "0.1";
    
    @Metadata
    public static ModMetadata meta;
    
    public static Block myFirstBlock;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	myFirstBlock = new MyFirstBlock()
    		.setBlockName("My First Block")
    		.setCreativeTab(CreativeTabs.tabBlock);
    	GameRegistry.registerBlock(myFirstBlock, "My First Block");
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }
}