package com.starfishsparkle.myfirstmod;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = MyFirstMod.MODID, name="sparkly", version = MyFirstMod.VERSION)
public class MyFirstMod
{
    public static final String MODID = "My Sparkly Mod";
    public static final String VERSION = "0.3";
    public static final String ITEM_NAME = "Best Item Not";
    
    @Metadata
    public static ModMetadata meta;
    
    //blocky
    public static Block myFirstBlock;
    public static Block godlyOre;
    
    //item–wha?
    public static Item myFirstItem;
    
    public static CreativeTabs randomTab = new CreativeTabs("pink + black") {

		@Override
		public Item getTabIconItem() {
			
			return Items.baked_potato;
		}
    	
    };
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	// blockode
    	myFirstBlock = new MyFirstBlock()
    		.setBlockName("My First Block")
    		.setCreativeTab(CreativeTabs.tabBlock)
    		.setCreativeTab(randomTab)
    		.setBlockTextureName("myfirstmod:stripey");
    	GameRegistry.registerBlock(myFirstBlock, "My First  Block");
    	
    	godlyOre = new GodlyOre(16, Material.glass)
    		.setHardness(1.0F)
    		.setBlockName("Godly Ore")
    		.setBlockTextureName("myfirstmod:purple_ore");
    	GameRegistry.registerBlock(godlyOre, "Godly Ore");
    	
    	// Itemkode 
    	myFirstItem = new Item()
    		.setUnlocalizedName(ITEM_NAME)
    		.setCreativeTab(CreativeTabs.tabMisc)
    		.setCreativeTab(randomTab)
    		.setTextureName("myfirstmod:pinkies_trident_of_parties");
    	GameRegistry.registerItem(myFirstItem, ITEM_NAME);
    	
    	//recikode
    	GameRegistry.addRecipe(new ItemStack(Items.saddle), new Object[]
    			{
    		"pop",
    		"pee",
    		"poo",
    		'p', myFirstBlock,
    		'o', Blocks.diamond_block,
    		'e', Items.leather
    			});
    	GameRegistry.addRecipe(new ItemStack(myFirstBlock), new Object[]
    			{
    		"pop",
    		"pee",
    		"poo",
    		'p', Items.redstone,
    		'o', Blocks.acacia_stairs,
    		'e', Items.writable_book
    			});
    	
    	//smeltkode
    	GameRegistry.addSmelting(Items.redstone, new ItemStack(Items.repeater, 1), 20.0F);
    }
    
    
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
        MinecraftForge.EVENT_BUS.register(new ExplodingMinecarts());
    }
}