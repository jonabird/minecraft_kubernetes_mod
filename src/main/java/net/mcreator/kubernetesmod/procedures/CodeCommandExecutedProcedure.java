package net.mcreator.kubernetesmod.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.kubernetesmod.item.FileItem;
import net.mcreator.kubernetesmod.KubernetesModMod;

import java.util.Map;

public class CodeCommandExecutedProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				KubernetesModMod.LOGGER.warn("Failed to load dependency entity for procedure CodeCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((Math.random() == 0)) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(FileItem.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
	}
}
