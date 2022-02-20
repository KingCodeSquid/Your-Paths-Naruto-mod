package net.mcreator.narutomod.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.narutomod.item.WindNatureItem;
import net.mcreator.narutomod.item.WaterNatureItem;
import net.mcreator.narutomod.item.LightningNatureItem;
import net.mcreator.narutomod.item.FireNatureItem;
import net.mcreator.narutomod.item.EarthNatureItem;
import net.mcreator.narutomod.NarutoModMod;

import java.util.Map;

public class ChakraPaperRightClickedInAirProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NarutoModMod.LOGGER.warn("Failed to load dependency entity for procedure ChakraPaperRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (Math.random() >= 0.5) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(WaterNatureItem.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		} else if (Math.random() >= 0.51) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(EarthNatureItem.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		} else if (Math.random() >= 0.52) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(FireNatureItem.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		} else if (Math.random() >= 0.53) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(LightningNatureItem.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		} else if (Math.random() >= 0.54) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(WindNatureItem.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
	}
}
