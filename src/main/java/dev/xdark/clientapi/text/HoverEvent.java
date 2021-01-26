package dev.xdark.clientapi.text;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

import java.util.Objects;

public final class HoverEvent {

  private final Action action;
  private final Text value;

  public HoverEvent(Action action, Text value) {
    this.action = action;
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof HoverEvent)) {
      return false;
    }

    HoverEvent that = (HoverEvent) o;

    return action == that.action && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    int result = action != null ? action.hashCode() : 0;
    result = 31 * result + (value != null ? value.hashCode() : 0);
    return result;
  }

  public interface Action {

    Action SHOW_TEXT = objectValue(),
        SHOW_ITEM = objectValue(),
        SHOW_ENTITY = objectValue();
  }
}
