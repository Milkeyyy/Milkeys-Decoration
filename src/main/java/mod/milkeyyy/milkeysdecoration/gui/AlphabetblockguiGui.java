
package mod.milkeyyy.milkeysdecoration.gui;

import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.network.IContainerFactory;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.gui.ScreenManager;

import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguicommaRProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiZeroblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiZblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiYblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiXblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiWblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiVblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiUblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiTwoblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiThreeblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiTblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiSpaceblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiSixblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiSevenblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiSblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiRblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiQuestionblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiQblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiPeriodRProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiPeriodLProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiPblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiParenthesis2_2RProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiParenthesis2_2LProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiParenthesis2_1RProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiParenthesis2_1LProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiParenthesis1_2RProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiParenthesis1_2LProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiParenthesis1_1RProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiParenthesis1_1Procedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiOneblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiOblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiNineblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiNblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiMblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiLblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiKblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiJblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiIblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiHyphenblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiHblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiGblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiFourblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiFiveblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiFblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiExclamationblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiEqualblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiEightblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiEblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiDblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiCblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiBblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockguiAblockProcedure;
import mod.milkeyyy.milkeysdecoration.procedures.AlphabetblockcommaLProcedure;
import mod.milkeyyy.milkeysdecoration.MilkeysdecorationModElements;
import mod.milkeyyy.milkeysdecoration.MilkeysdecorationMod;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

@MilkeysdecorationModElements.ModElement.Tag
public class AlphabetblockguiGui extends MilkeysdecorationModElements.ModElement {
	public static HashMap guistate = new HashMap();
	private static ContainerType<GuiContainerMod> containerType = null;
	public AlphabetblockguiGui(MilkeysdecorationModElements instance) {
		super(instance, 106);
		elements.addNetworkMessage(ButtonPressedMessage.class, ButtonPressedMessage::buffer, ButtonPressedMessage::new,
				ButtonPressedMessage::handler);
		elements.addNetworkMessage(GUISlotChangedMessage.class, GUISlotChangedMessage::buffer, GUISlotChangedMessage::new,
				GUISlotChangedMessage::handler);
		containerType = new ContainerType<>(new GuiContainerModFactory());
		FMLJavaModLoadingContext.get().getModEventBus().register(new ContainerRegisterHandler());
	}
	private static class ContainerRegisterHandler {
		@SubscribeEvent
		public void registerContainer(RegistryEvent.Register<ContainerType<?>> event) {
			event.getRegistry().register(containerType.setRegistryName("alphabetblockgui"));
		}
	}
	@OnlyIn(Dist.CLIENT)
	public void initElements() {
		DeferredWorkQueue.runLater(() -> ScreenManager.registerFactory(containerType, AlphabetblockguiGuiWindow::new));
	}
	public static class GuiContainerModFactory implements IContainerFactory {
		public GuiContainerMod create(int id, PlayerInventory inv, PacketBuffer extraData) {
			return new GuiContainerMod(id, inv, extraData);
		}
	}

	public static class GuiContainerMod extends Container implements Supplier<Map<Integer, Slot>> {
		World world;
		PlayerEntity entity;
		int x, y, z;
		private IItemHandler internal;
		private Map<Integer, Slot> customSlots = new HashMap<>();
		private boolean bound = false;
		public GuiContainerMod(int id, PlayerInventory inv, PacketBuffer extraData) {
			super(containerType, id);
			this.entity = inv.player;
			this.world = inv.player.world;
			this.internal = new ItemStackHandler(0);
			BlockPos pos = null;
			if (extraData != null) {
				pos = extraData.readBlockPos();
				this.x = pos.getX();
				this.y = pos.getY();
				this.z = pos.getZ();
			}
			if (pos != null) {
				if (extraData.readableBytes() == 1) { // bound to item
					byte hand = extraData.readByte();
					ItemStack itemstack;
					if (hand == 0)
						itemstack = this.entity.getHeldItemMainhand();
					else
						itemstack = this.entity.getHeldItemOffhand();
					itemstack.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
				} else if (extraData.readableBytes() > 1) {
					extraData.readByte(); // drop padding
					Entity entity = world.getEntityByID(extraData.readVarInt());
					if (entity != null)
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							this.internal = capability;
							this.bound = true;
						});
				} else { // might be bound to block
					TileEntity ent = inv.player != null ? inv.player.world.getTileEntity(pos) : null;
					if (ent != null) {
						ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							this.internal = capability;
							this.bound = true;
						});
					}
				}
			}
			int si;
			int sj;
			for (si = 0; si < 3; ++si)
				for (sj = 0; sj < 9; ++sj)
					this.addSlot(new Slot(inv, sj + (si + 1) * 9, 12 + 8 + sj * 18, 0 + 84 + si * 18));
			for (si = 0; si < 9; ++si)
				this.addSlot(new Slot(inv, si, 12 + 8 + si * 18, 0 + 142));
		}

		public Map<Integer, Slot> get() {
			return customSlots;
		}

		@Override
		public boolean canInteractWith(PlayerEntity player) {
			return true;
		}

		@Override
		public ItemStack transferStackInSlot(PlayerEntity playerIn, int index) {
			ItemStack itemstack = ItemStack.EMPTY;
			Slot slot = (Slot) this.inventorySlots.get(index);
			if (slot != null && slot.getHasStack()) {
				ItemStack itemstack1 = slot.getStack();
				itemstack = itemstack1.copy();
				if (index < 0) {
					if (!this.mergeItemStack(itemstack1, 0, this.inventorySlots.size(), true)) {
						return ItemStack.EMPTY;
					}
					slot.onSlotChange(itemstack1, itemstack);
				} else if (!this.mergeItemStack(itemstack1, 0, 0, false)) {
					if (index < 0 + 27) {
						if (!this.mergeItemStack(itemstack1, 0 + 27, this.inventorySlots.size(), true)) {
							return ItemStack.EMPTY;
						}
					} else {
						if (!this.mergeItemStack(itemstack1, 0, 0 + 27, false)) {
							return ItemStack.EMPTY;
						}
					}
					return ItemStack.EMPTY;
				}
				if (itemstack1.getCount() == 0) {
					slot.putStack(ItemStack.EMPTY);
				} else {
					slot.onSlotChanged();
				}
				if (itemstack1.getCount() == itemstack.getCount()) {
					return ItemStack.EMPTY;
				}
				slot.onTake(playerIn, itemstack1);
			}
			return itemstack;
		}

		@Override /**
					 * Merges provided ItemStack with the first avaliable one in the
					 * container/player inventor between minIndex (included) and maxIndex
					 * (excluded). Args : stack, minIndex, maxIndex, negativDirection. /!\ the
					 * Container implementation do not check if the item is valid for the slot
					 */
		protected boolean mergeItemStack(ItemStack stack, int startIndex, int endIndex, boolean reverseDirection) {
			boolean flag = false;
			int i = startIndex;
			if (reverseDirection) {
				i = endIndex - 1;
			}
			if (stack.isStackable()) {
				while (!stack.isEmpty()) {
					if (reverseDirection) {
						if (i < startIndex) {
							break;
						}
					} else if (i >= endIndex) {
						break;
					}
					Slot slot = this.inventorySlots.get(i);
					ItemStack itemstack = slot.getStack();
					if (slot.isItemValid(itemstack) && !itemstack.isEmpty() && areItemsAndTagsEqual(stack, itemstack)) {
						int j = itemstack.getCount() + stack.getCount();
						int maxSize = Math.min(slot.getSlotStackLimit(), stack.getMaxStackSize());
						if (j <= maxSize) {
							stack.setCount(0);
							itemstack.setCount(j);
							slot.putStack(itemstack);
							flag = true;
						} else if (itemstack.getCount() < maxSize) {
							stack.shrink(maxSize - itemstack.getCount());
							itemstack.setCount(maxSize);
							slot.putStack(itemstack);
							flag = true;
						}
					}
					if (reverseDirection) {
						--i;
					} else {
						++i;
					}
				}
			}
			if (!stack.isEmpty()) {
				if (reverseDirection) {
					i = endIndex - 1;
				} else {
					i = startIndex;
				}
				while (true) {
					if (reverseDirection) {
						if (i < startIndex) {
							break;
						}
					} else if (i >= endIndex) {
						break;
					}
					Slot slot1 = this.inventorySlots.get(i);
					ItemStack itemstack1 = slot1.getStack();
					if (itemstack1.isEmpty() && slot1.isItemValid(stack)) {
						if (stack.getCount() > slot1.getSlotStackLimit()) {
							slot1.putStack(stack.split(slot1.getSlotStackLimit()));
						} else {
							slot1.putStack(stack.split(stack.getCount()));
						}
						slot1.onSlotChanged();
						flag = true;
						break;
					}
					if (reverseDirection) {
						--i;
					} else {
						++i;
					}
				}
			}
			return flag;
		}

		@Override
		public void onContainerClosed(PlayerEntity playerIn) {
			super.onContainerClosed(playerIn);
			if (!bound && (playerIn instanceof ServerPlayerEntity)) {
				if (!playerIn.isAlive() || playerIn instanceof ServerPlayerEntity && ((ServerPlayerEntity) playerIn).hasDisconnected()) {
					for (int j = 0; j < internal.getSlots(); ++j) {
						playerIn.dropItem(internal.extractItem(j, internal.getStackInSlot(j).getCount(), false), false);
					}
				} else {
					for (int i = 0; i < internal.getSlots(); ++i) {
						playerIn.inventory.placeItemBackInInventory(playerIn.world,
								internal.extractItem(i, internal.getStackInSlot(i).getCount(), false));
					}
				}
			}
		}

		private void slotChanged(int slotid, int ctype, int meta) {
			if (this.world != null && this.world.isRemote()) {
				MilkeysdecorationMod.PACKET_HANDLER.sendToServer(new GUISlotChangedMessage(slotid, x, y, z, ctype, meta));
				handleSlotAction(entity, slotid, ctype, meta, x, y, z);
			}
		}
	}

	public static class ButtonPressedMessage {
		int buttonID, x, y, z;
		public ButtonPressedMessage(PacketBuffer buffer) {
			this.buttonID = buffer.readInt();
			this.x = buffer.readInt();
			this.y = buffer.readInt();
			this.z = buffer.readInt();
		}

		public ButtonPressedMessage(int buttonID, int x, int y, int z) {
			this.buttonID = buttonID;
			this.x = x;
			this.y = y;
			this.z = z;
		}

		public static void buffer(ButtonPressedMessage message, PacketBuffer buffer) {
			buffer.writeInt(message.buttonID);
			buffer.writeInt(message.x);
			buffer.writeInt(message.y);
			buffer.writeInt(message.z);
		}

		public static void handler(ButtonPressedMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				PlayerEntity entity = context.getSender();
				int buttonID = message.buttonID;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleButtonAction(entity, buttonID, x, y, z);
			});
			context.setPacketHandled(true);
		}
	}

	public static class GUISlotChangedMessage {
		int slotID, x, y, z, changeType, meta;
		public GUISlotChangedMessage(int slotID, int x, int y, int z, int changeType, int meta) {
			this.slotID = slotID;
			this.x = x;
			this.y = y;
			this.z = z;
			this.changeType = changeType;
			this.meta = meta;
		}

		public GUISlotChangedMessage(PacketBuffer buffer) {
			this.slotID = buffer.readInt();
			this.x = buffer.readInt();
			this.y = buffer.readInt();
			this.z = buffer.readInt();
			this.changeType = buffer.readInt();
			this.meta = buffer.readInt();
		}

		public static void buffer(GUISlotChangedMessage message, PacketBuffer buffer) {
			buffer.writeInt(message.slotID);
			buffer.writeInt(message.x);
			buffer.writeInt(message.y);
			buffer.writeInt(message.z);
			buffer.writeInt(message.changeType);
			buffer.writeInt(message.meta);
		}

		public static void handler(GUISlotChangedMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				PlayerEntity entity = context.getSender();
				int slotID = message.slotID;
				int changeType = message.changeType;
				int meta = message.meta;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleSlotAction(entity, slotID, changeType, meta, x, y, z);
			});
			context.setPacketHandled(true);
		}
	}
	static void handleButtonAction(PlayerEntity entity, int buttonID, int x, int y, int z) {
		World world = entity.world;
		// security measure to prevent arbitrary chunk generation
		if (!world.isBlockLoaded(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiAblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 1) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiBblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 2) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiCblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 3) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiDblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 4) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiEblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 5) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiFblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 6) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiGblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 7) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiHblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 8) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiIblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 9) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiJblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 10) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiKblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 11) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiLblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 12) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiMblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 13) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiNblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 14) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiOblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 15) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiPblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 16) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiQblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 17) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiRblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 18) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiSblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 19) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiTblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 20) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiUblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 21) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiVblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 22) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiWblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 23) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiXblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 24) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiYblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 25) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiZblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 26) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiPeriodLProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 27) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiPeriodRProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 28) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiOneblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 29) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiTwoblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 30) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiThreeblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 31) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiFourblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 32) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiFiveblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 33) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiSixblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 34) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiSevenblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 35) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiEightblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 36) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiNineblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 37) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiHyphenblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 38) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiSpaceblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 39) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiExclamationblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 40) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiQuestionblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 41) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiEqualblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 42) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiZeroblockProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 43) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiParenthesis1_1Procedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 44) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiParenthesis1_1RProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 45) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiParenthesis1_2LProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 46) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiParenthesis1_2RProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 47) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiParenthesis2_1LProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 48) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiParenthesis2_1RProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 49) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiParenthesis2_2LProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 50) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguiParenthesis2_2RProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 51) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockcommaLProcedure.executeProcedure($_dependencies);
			}
		}
		if (buttonID == 52) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				AlphabetblockguicommaRProcedure.executeProcedure($_dependencies);
			}
		}
	}

	private static void handleSlotAction(PlayerEntity entity, int slotID, int changeType, int meta, int x, int y, int z) {
		World world = entity.world;
		// security measure to prevent arbitrary chunk generation
		if (!world.isBlockLoaded(new BlockPos(x, y, z)))
			return;
	}
}
