
package mod.milkeyyy.milkeysdecoration.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import mod.milkeyyy.milkeysdecoration.itemgroup.AlphabetblocktabItemGroup;
import mod.milkeyyy.milkeysdecoration.MilkeysdecorationModElements;

import java.util.List;
import java.util.Collections;

@MilkeysdecorationModElements.ModElement.Tag
public class Colorblock15Block extends MilkeysdecorationModElements.ModElement {
	@ObjectHolder("milkeysdecoration:colorblock15")
	public static final Block block = null;
	public Colorblock15Block(MilkeysdecorationModElements instance) {
		super(instance, 71);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(AlphabetblocktabItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0));
			setRegistryName("colorblock15");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(ColorblockBlock.block, (int) (1)));
		}
	}
}
