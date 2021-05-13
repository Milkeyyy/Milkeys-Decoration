
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
public class ColorblockguiGuiWindow extends ContainerScreen<ColorblockguiGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	public ColorblockguiGuiWindow(ColorblockguiGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
	}
	private static final ResourceLocation texture = new ResourceLocation("milkeysdecoration:textures/colorblockgui.png");
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
		this.addButton(new Button(this.guiLeft + 5, this.guiTop + 44, 40, 20, new StringTextComponent("White"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new ColorblockguiGui.ButtonPressedMessage(0, x, y, z));
				ColorblockguiGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 5, this.guiTop + 64, 40, 20, new StringTextComponent("Orange"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new ColorblockguiGui.ButtonPressedMessage(1, x, y, z));
				ColorblockguiGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 5, this.guiTop + 84, 40, 20, new StringTextComponent("Magenta"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new ColorblockguiGui.ButtonPressedMessage(2, x, y, z));
				ColorblockguiGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 5, this.guiTop + 104, 40, 20, new StringTextComponent("L Blue"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new ColorblockguiGui.ButtonPressedMessage(3, x, y, z));
				ColorblockguiGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 45, this.guiTop + 44, 40, 20, new StringTextComponent("Yellow"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new ColorblockguiGui.ButtonPressedMessage(4, x, y, z));
				ColorblockguiGui.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 45, this.guiTop + 84, 40, 20, new StringTextComponent("Pink"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new ColorblockguiGui.ButtonPressedMessage(5, x, y, z));
				ColorblockguiGui.handleButtonAction(entity, 5, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 45, this.guiTop + 104, 40, 20, new StringTextComponent("Gray"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new ColorblockguiGui.ButtonPressedMessage(6, x, y, z));
				ColorblockguiGui.handleButtonAction(entity, 6, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 90, this.guiTop + 44, 40, 20, new StringTextComponent("L Gray"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new ColorblockguiGui.ButtonPressedMessage(7, x, y, z));
				ColorblockguiGui.handleButtonAction(entity, 7, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 90, this.guiTop + 64, 40, 20, new StringTextComponent("Cyan"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new ColorblockguiGui.ButtonPressedMessage(8, x, y, z));
				ColorblockguiGui.handleButtonAction(entity, 8, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 90, this.guiTop + 84, 40, 20, new StringTextComponent("Purple"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new ColorblockguiGui.ButtonPressedMessage(9, x, y, z));
				ColorblockguiGui.handleButtonAction(entity, 9, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 90, this.guiTop + 104, 40, 20, new StringTextComponent("Blue"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new ColorblockguiGui.ButtonPressedMessage(10, x, y, z));
				ColorblockguiGui.handleButtonAction(entity, 10, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 130, this.guiTop + 44, 40, 20, new StringTextComponent("Brown"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new ColorblockguiGui.ButtonPressedMessage(11, x, y, z));
				ColorblockguiGui.handleButtonAction(entity, 11, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 130, this.guiTop + 64, 40, 20, new StringTextComponent("Green"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new ColorblockguiGui.ButtonPressedMessage(12, x, y, z));
				ColorblockguiGui.handleButtonAction(entity, 12, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 130, this.guiTop + 84, 40, 20, new StringTextComponent("Red"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new ColorblockguiGui.ButtonPressedMessage(13, x, y, z));
				ColorblockguiGui.handleButtonAction(entity, 13, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 130, this.guiTop + 104, 40, 20, new StringTextComponent("Black"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new ColorblockguiGui.ButtonPressedMessage(14, x, y, z));
				ColorblockguiGui.handleButtonAction(entity, 14, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 45, this.guiTop + 64, 40, 20, new StringTextComponent("Lime"), e -> {
			if (true) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new ColorblockguiGui.ButtonPressedMessage(15, x, y, z));
				ColorblockguiGui.handleButtonAction(entity, 15, x, y, z);
			}
		}));
	}
}
