package mod.milkeyyy.milkeysdecoration.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.state.Property;
import net.minecraft.block.BlockState;

import mod.milkeyyy.milkeysdecoration.block.Streetlight_onBlock;
import mod.milkeyyy.milkeysdecoration.MilkeysdecorationModElements;
import mod.milkeyyy.milkeysdecoration.MilkeysdecorationMod;

import java.util.Map;

@MilkeysdecorationModElements.ModElement.Tag
public class StreetlightRedstoneOnProcedure extends MilkeysdecorationModElements.ModElement {
	public StreetlightRedstoneOnProcedure(MilkeysdecorationModElements instance) {
		super(instance, 195);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MilkeysdecorationMod.LOGGER.warn("Failed to load dependency x for procedure StreetlightRedstoneOn!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MilkeysdecorationMod.LOGGER.warn("Failed to load dependency y for procedure StreetlightRedstoneOn!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MilkeysdecorationMod.LOGGER.warn("Failed to load dependency z for procedure StreetlightRedstoneOn!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MilkeysdecorationMod.LOGGER.warn("Failed to load dependency world for procedure StreetlightRedstoneOn!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		{
			BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
			BlockState _bs = Streetlight_onBlock.block.getDefaultState();
			BlockState _bso = world.getBlockState(_bp);
			for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
				Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
				if (_property != null && _bs.get(_property) != null)
					try {
						_bs = _bs.with(_property, (Comparable) entry.getValue());
					} catch (Exception e) {
					}
			}
			world.setBlockState(_bp, _bs, 3);
		}
	}
}
