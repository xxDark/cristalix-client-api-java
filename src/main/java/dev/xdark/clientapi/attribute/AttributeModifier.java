package dev.xdark.clientapi.attribute;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.CompileStub;

import java.util.UUID;

@SidedApi(Side.SERVER)
public interface AttributeModifier {

  UUID getId();

  String getName();

  int getOperation();

  double getAmount();

  @SidedApi(Side.SERVER)
  interface Builder {

    static Builder builder() {
      throw CompileStub.create();
    }

    Builder id(UUID id);

    Builder name(String name);

    Builder operation(int operation);

    Builder amount(double amount);

    AttributeModifier build();
  }
}
