package com.starfishsparkle.myfirstmod;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraftforge.event.entity.minecart.MinecartCollisionEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ExplodingMinecarts {
	
	@SubscribeEvent
	public void explode(MinecartCollisionEvent event) {
		EntityMinecart minecart = event.minecart;
		minecart.worldObj.createExplosion(
				minecart, 
				minecart.posX,
				minecart.posY,
				minecart.posZ,
				2,
				false);
	}

}
