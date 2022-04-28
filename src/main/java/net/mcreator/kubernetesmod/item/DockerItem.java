
package net.mcreator.kubernetesmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.kubernetesmod.itemgroup.KubernetesTabItemGroup;
import net.mcreator.kubernetesmod.KubernetesModModElements;

@KubernetesModModElements.ModElement.Tag
public class DockerItem extends KubernetesModModElements.ModElement {
	@ObjectHolder("kubernetes_mod:docker")
	public static final Item block = null;
	public DockerItem(KubernetesModModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(KubernetesTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("docker");
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
	}
}
