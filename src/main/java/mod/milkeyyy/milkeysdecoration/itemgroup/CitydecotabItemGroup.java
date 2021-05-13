
package mod.milkeyyy.milkeysdecoration.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import mod.milkeyyy.milkeysdecoration.block.Road_block_04Block;
import mod.milkeyyy.milkeysdecoration.MilkeysdecorationModElements;

@MilkeysdecorationModElements.ModElement.Tag
public class CitydecotabItemGroup extends MilkeysdecorationModElements.ModElement {
	public CitydecotabItemGroup(MilkeysdecorationModElements instance) {
		super(instance, 182);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabcitydecotab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Road_block_04Block.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
