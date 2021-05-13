
package mod.milkeyyy.milkeysdecoration.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import mod.milkeyyy.milkeysdecoration.item.WipiconItem;
import mod.milkeyyy.milkeysdecoration.MilkeysdecorationModElements;

@MilkeysdecorationModElements.ModElement.Tag
public class WiptabItemGroup extends MilkeysdecorationModElements.ModElement {
	public WiptabItemGroup(MilkeysdecorationModElements instance) {
		super(instance, 197);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabwiptab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(WipiconItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
