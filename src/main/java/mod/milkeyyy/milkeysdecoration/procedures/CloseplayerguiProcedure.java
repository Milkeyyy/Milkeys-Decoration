package mod.milkeyyy.milkeysdecoration.procedures;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import mod.milkeyyy.milkeysdecoration.MilkeysdecorationModElements;
import mod.milkeyyy.milkeysdecoration.MilkeysdecorationMod;

import java.util.Map;

@MilkeysdecorationModElements.ModElement.Tag
public class CloseplayerguiProcedure extends MilkeysdecorationModElements.ModElement {
	public CloseplayerguiProcedure(MilkeysdecorationModElements instance) {
		super(instance, 186);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MilkeysdecorationMod.LOGGER.warn("Failed to load dependency entity for procedure Closeplayergui!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).closeScreen();
	}
}
