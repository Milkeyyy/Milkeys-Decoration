
package mod.milkeyyy.milkeysdecoration.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import mod.milkeyyy.milkeysdecoration.item.AlphabetlogoItem;
import mod.milkeyyy.milkeysdecoration.MilkeysdecorationModElements;

@MilkeysdecorationModElements.ModElement.Tag
public class AlphabetblocktabItemGroup extends MilkeysdecorationModElements.ModElement {
	public AlphabetblocktabItemGroup(MilkeysdecorationModElements instance) {
		super(instance, 104);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabalphabetblocktab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(AlphabetlogoItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
