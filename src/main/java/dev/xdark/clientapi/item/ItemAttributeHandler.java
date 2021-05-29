package dev.xdark.clientapi.item;

import com.google.common.collect.Multimap;
import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.attribute.AttributeModifier;
import dev.xdark.clientapi.inventory.EntityEquipmentSlot;

@SidedApi(Side.SERVER)
public interface ItemAttributeHandler {

  Multimap<String, AttributeModifier> getAttributes(Item item, EntityEquipmentSlot slot);
}
