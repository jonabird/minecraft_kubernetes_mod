
package net.mcreator.kubernetesmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.kubernetesmod.item.KubernetesIconItem;
import net.mcreator.kubernetesmod.KubernetesModModElements;

@KubernetesModModElements.ModElement.Tag
public class KubernetesTabItemGroup extends KubernetesModModElements.ModElement {
	public KubernetesTabItemGroup(KubernetesModModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabkubernetes_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(KubernetesIconItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
