package com.starfishsparkle.myfirstmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class GodlyOre extends Block {
	// soccer team
	public GodlyOre(int id, Material material) {
		super(material);
		// TOODOO Autuh-gen'rated constructah stubby
		
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setCreativeTab(MyFirstMod.randomTab);
	}
	
	@Override
	public void registerBlockIcons(IIconRegister mrMoo) {
		this.blockIcon = mrMoo.registerIcon(this.getTextureName());
	}

}
