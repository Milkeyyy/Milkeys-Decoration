
package mod.milkeyyy.milkeysdecoration.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import mod.milkeyyy.milkeysdecoration.MilkeysdecorationMod;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class AlphabetblockguiGuiWindow extends ContainerScreen<AlphabetblockguiGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	public AlphabetblockguiGuiWindow(AlphabetblockguiGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 200;
		this.ySize = 166;
	}
	private static final ResourceLocation texture = new ResourceLocation("milkeysdecoration:textures/alphabetblockgui.png");
	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
		this.addButton(new Button(this.guiLeft + 27, this.guiTop + 65, 10, 20, new StringTextComponent("A"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(0, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 72, this.guiTop + 83, 10, 20, new StringTextComponent("B"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(1, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 52, this.guiTop + 83, 10, 20, new StringTextComponent("C"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(2, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 47, this.guiTop + 65, 10, 20, new StringTextComponent("D"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(3, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 42, this.guiTop + 47, 10, 20, new StringTextComponent("E"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(4, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 57, this.guiTop + 65, 10, 20, new StringTextComponent("F"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(5, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 5, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 67, this.guiTop + 65, 10, 20, new StringTextComponent("G"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(6, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 6, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 77, this.guiTop + 65, 10, 20, new StringTextComponent("H"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(7, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 7, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 92, this.guiTop + 47, 10, 20, new StringTextComponent("I"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(8, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 8, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 87, this.guiTop + 65, 10, 20, new StringTextComponent("J"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(9, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 9, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 97, this.guiTop + 65, 10, 20, new StringTextComponent("K"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(10, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 10, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 107, this.guiTop + 65, 10, 20, new StringTextComponent("L"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(11, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 11, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 92, this.guiTop + 83, 10, 20, new StringTextComponent("M"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(12, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 12, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 82, this.guiTop + 83, 10, 20, new StringTextComponent("N"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(13, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 13, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 102, this.guiTop + 47, 10, 20, new StringTextComponent("O"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(14, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 14, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 112, this.guiTop + 47, 10, 20, new StringTextComponent("P"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(15, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 15, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 22, this.guiTop + 47, 10, 20, new StringTextComponent("Q"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(16, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 16, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 52, this.guiTop + 47, 10, 20, new StringTextComponent("R"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(17, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 17, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 37, this.guiTop + 65, 10, 20, new StringTextComponent("S"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(18, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 18, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 62, this.guiTop + 47, 10, 20, new StringTextComponent("T"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(19, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 19, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 82, this.guiTop + 47, 10, 20, new StringTextComponent("U"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(20, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 20, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 62, this.guiTop + 83, 10, 20, new StringTextComponent("V"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(21, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 21, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 32, this.guiTop + 47, 10, 20, new StringTextComponent("W"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(22, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 22, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 42, this.guiTop + 83, 10, 20, new StringTextComponent("X"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(23, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 23, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 72, this.guiTop + 47, 10, 20, new StringTextComponent("Y"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(24, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 24, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 32, this.guiTop + 83, 10, 20, new StringTextComponent("Z"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(25, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 25, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 112, this.guiTop + 107, 10, 20, new StringTextComponent(". "), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(26, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 26, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 122, this.guiTop + 107, 10, 20, new StringTextComponent(" ."), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(27, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 27, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 17, this.guiTop + 29, 10, 20, new StringTextComponent("1"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(28, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 28, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 27, this.guiTop + 29, 10, 20, new StringTextComponent("2"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(29, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 29, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 37, this.guiTop + 29, 10, 20, new StringTextComponent("3"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(30, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 30, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 47, this.guiTop + 29, 10, 20, new StringTextComponent("4"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(31, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 31, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 57, this.guiTop + 29, 10, 20, new StringTextComponent("5"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(32, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 32, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 67, this.guiTop + 29, 10, 20, new StringTextComponent("6"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(33, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 33, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 77, this.guiTop + 29, 10, 20, new StringTextComponent("7"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(34, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 34, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 87, this.guiTop + 29, 10, 20, new StringTextComponent("8"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(35, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 35, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 97, this.guiTop + 29, 10, 20, new StringTextComponent("9"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(36, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 36, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 172, this.guiTop + 107, 10, 20, new StringTextComponent("-"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(37, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 37, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 37, this.guiTop + 105, 60, 20, new StringTextComponent("      "), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(38, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 38, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 152, this.guiTop + 107, 10, 20, new StringTextComponent("!"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(39, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 39, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 162, this.guiTop + 107, 10, 20, new StringTextComponent("?"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(40, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 40, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 182, this.guiTop + 107, 10, 20, new StringTextComponent("="), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(41, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 41, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 107, this.guiTop + 29, 10, 20, new StringTextComponent("0"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(42, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 42, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 112, this.guiTop + 125, 10, 20, new StringTextComponent("( "), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(43, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 43, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 132, this.guiTop + 125, 10, 20, new StringTextComponent(" ("), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(44, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 44, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 142, this.guiTop + 125, 10, 20, new StringTextComponent(") "), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(45, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 45, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 122, this.guiTop + 125, 10, 20, new StringTextComponent(" )"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(46, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 46, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 152, this.guiTop + 125, 10, 20, new StringTextComponent("[ "), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(47, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 47, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 172, this.guiTop + 125, 10, 20, new StringTextComponent(" ["), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(48, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 48, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 182, this.guiTop + 125, 10, 20, new StringTextComponent("] "), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(49, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 49, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 162, this.guiTop + 125, 10, 20, new StringTextComponent(" ]"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(50, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 50, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 132, this.guiTop + 107, 10, 20, new StringTextComponent(", "), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(51, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 51, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 142, this.guiTop + 107, 10, 20, new StringTextComponent(" ,"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new AlphabetblockguiGui.ButtonPressedMessage(52, x, y, z));
				AlphabetblockguiGui.handleButtonAction(entity, 52, x, y, z);
			}
		}));
	}
}
