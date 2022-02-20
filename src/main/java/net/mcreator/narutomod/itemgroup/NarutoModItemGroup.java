
package net.mcreator.narutomod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.narutomod.item.ShurikenItem;
import net.mcreator.narutomod.NarutoModModElements;

@NarutoModModElements.ModElement.Tag
public class NarutoModItemGroup extends NarutoModModElements.ModElement {
	public NarutoModItemGroup(NarutoModModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabnaruto_mod") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ShurikenItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
