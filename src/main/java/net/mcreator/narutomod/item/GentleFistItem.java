
package net.mcreator.narutomod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.BlockState;

import net.mcreator.narutomod.procedures.GentleFistRightClickedInAirProcedure;
import net.mcreator.narutomod.itemgroup.NarutoModItemGroup;
import net.mcreator.narutomod.NarutoModModElements;

import java.util.Collections;

@NarutoModModElements.ModElement.Tag
public class GentleFistItem extends NarutoModModElements.ModElement {
	@ObjectHolder("naruto_mod:gentle_fist")
	public static final Item block = null;

	public GentleFistItem(NarutoModModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(NarutoModItemGroup.tab).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("gentle_fist");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 1;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity entity, Hand hand) {
			ActionResult<ItemStack> ar = super.onItemRightClick(world, entity, hand);
			ItemStack itemstack = ar.getResult();
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();

			GentleFistRightClickedInAirProcedure.executeProcedure(Collections.EMPTY_MAP);
			return ar;
		}
	}
}
