
package net.mcreator.kubernetesmod.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.kubernetesmod.itemgroup.KubernetesTabItemGroup;
import net.mcreator.kubernetesmod.KubernetesModModElements;

@KubernetesModModElements.ModElement.Tag
public class ConfigMapItem extends KubernetesModModElements.ModElement {
	@ObjectHolder("kubernetes_mod:config_map")
	public static final Item block = null;
	public ConfigMapItem(KubernetesModModElements instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(KubernetesTabItemGroup.tab).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("config_map");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
