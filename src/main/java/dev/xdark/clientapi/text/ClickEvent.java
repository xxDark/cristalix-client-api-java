package dev.xdark.clientapi.text;

import static dev.xdark.clientapi.util.SideEffects.objectValue;

import java.util.Objects;

public final class ClickEvent {

  private final Action action;
  private final String value;

  public ClickEvent(Action action, String value) {
    this.action = action;
    this.value = value;
  }

  public Action getAction() {
    return action;
  }

  public String getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof ClickEvent)) {
      return false;
    }

    ClickEvent that = (ClickEvent) o;

    return action == that.action && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    int result = action != null ? action.hashCode() : 0;
    result = 31 * result + (value != null ? value.hashCode() : 0);
    return result;
  }

  public interface Action {

    Action OPEN_URL = objectValue(),
        OPEN_FILE = objectValue(),
        RUN_COMMAND = objectValue(),
        SUGGEST_COMMAND = objectValue(),
        CHANGE_PAGE = objectValue();
  }
}
