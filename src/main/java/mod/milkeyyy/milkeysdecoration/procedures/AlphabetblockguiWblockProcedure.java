package mod.milkeyyy.milkeysdecoration.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import mod.milkeyyy.milkeysdecoration.block.WBlockBlock;
import mod.milkeyyy.milkeysdecoration.MilkeysdecorationModElements;
import mod.milkeyyy.milkeysdecoration.MilkeysdecorationMod;

import java.util.Map;

@MilkeysdecorationModElements.ModElement.Tag
public class AlphabetblockguiWblockProcedure extends MilkeysdecorationModElements.ModElement {
	public AlphabetblockguiWblockProcedure(MilkeysdecorationModElements instance) {
		super(instance, 129);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MilkeysdecorationMod.LOGGER.warn("Failed to load dependency entity for procedure AlphabetblockguiWblock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				MilkeysdecorationMod.LOGGER.warn("Failed to load dependency x for procedure AlphabetblockguiWblock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				MilkeysdecorationMod.LOGGER.warn("Failed to load dependency y for procedure AlphabetblockguiWblock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				MilkeysdecorationMod.LOGGER.warn("Failed to load dependency z for procedure AlphabetblockguiWblock!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				MilkeysdecorationMod.LOGGER.warn("Failed to load dependency world for procedure AlphabetblockguiWblock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), WBlockBlock.block.getDefaultState(), 3);
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).closeScreen();
	}
}
