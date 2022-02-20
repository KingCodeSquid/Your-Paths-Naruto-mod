
package net.mcreator.narutomod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.narutomod.itemgroup.NarutoModItemGroup;
import net.mcreator.narutomod.NarutoModModElements;

@NarutoModModElements.ModElement.Tag
public class AdamantineChainsItem extends NarutoModModElements.ModElement {
	@ObjectHolder("naruto_mod:adamantine_chains")
	public static final Item block = null;

	public AdamantineChainsItem(NarutoModModElements instance) {
		super(instance, 26);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(NarutoModItemGroup.tab).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("adamantine_chains");
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
