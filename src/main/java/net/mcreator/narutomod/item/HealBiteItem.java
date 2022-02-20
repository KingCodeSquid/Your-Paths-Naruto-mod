
package net.mcreator.narutomod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.narutomod.itemgroup.NarutoModItemGroup;
import net.mcreator.narutomod.NarutoModModElements;

@NarutoModModElements.ModElement.Tag
public class HealBiteItem extends NarutoModModElements.ModElement {
	@ObjectHolder("naruto_mod:heal_bite")
	public static final Item block = null;

	public HealBiteItem(NarutoModModElements instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(NarutoModItemGroup.tab).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("heal_bite");
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
