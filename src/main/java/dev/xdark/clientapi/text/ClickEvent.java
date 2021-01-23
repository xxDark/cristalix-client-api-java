package dev.xdark.clientapi.text;

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

  public enum Action {

    OPEN_URL,
    OPEN_FILE,
    RUN_COMMAND,
    SUGGEST_COMMAND,
    CHANGE_PAGE,
  }
}
