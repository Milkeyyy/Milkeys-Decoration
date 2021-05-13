
package mod.milkeyyy.milkeysdecoration.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import mod.milkeyyy.milkeysdecoration.MilkeysdecorationModElements;

@MilkeysdecorationModElements.ModElement.Tag
public class WipiconItem extends MilkeysdecorationModElements.ModElement {
	@ObjectHolder("milkeysdecoration:wip_icon")
	public static final Item block = null;
	public WipiconItem(MilkeysdecorationModElements instance) {
		super(instance, 196);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(null).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("wip_icon");
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
