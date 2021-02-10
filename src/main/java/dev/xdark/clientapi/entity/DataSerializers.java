package dev.xdark.clientapi.entity;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

import com.google.common.base.Optional;
import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.block.BlockState;
import dev.xdark.clientapi.item.ItemStack;
import dev.xdark.clientapi.math.BlockPos;
import dev.xdark.clientapi.math.Rotations;
import dev.xdark.clientapi.nbt.NBTTagCompound;
import dev.xdark.clientapi.text.Text;
import dev.xdark.clientapi.util.EnumFacing;
import java.util.UUID;

@SidedApi(Side.SERVER)
public interface DataSerializers {

  DataSerializer<Byte> BYTE = objectValue();
  DataSerializer<Integer> VARINT = objectValue();
  DataSerializer<Float> FLOAT = objectValue();
  DataSerializer<String> STRING = objectValue();
  DataSerializer<Text> TEXT = objectValue();
  DataSerializer<ItemStack> ITEM_STACK = objectValue();
  DataSerializer<Optional<BlockState>> OPTIONAL_BLOCK_STATE = objectValue();
  DataSerializer<Boolean> BOOLEAN = objectValue();
  DataSerializer<Rotations> ROTATIONS = objectValue();
  DataSerializer<BlockPos> BLOCK_POS = objectValue();
  DataSerializer<Optional<BlockPos>> OPTIONAL_BLOCK_POS = objectValue();
  DataSerializer<EnumFacing> FACING = objectValue();
  DataSerializer<Optional<UUID>> OPTIONAL_UNIQUE_ID = objectValue();
  DataSerializer<NBTTagCompound> COMPOUND_TAG = objectValue();

  void register(DataSerializer<?> serializer, int id);

  DataSerializer<?> getSerializer(int id);

  int getId(DataSerializer<?>serializer);
}
