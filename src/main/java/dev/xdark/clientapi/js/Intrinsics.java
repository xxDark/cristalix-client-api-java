package dev.xdark.clientapi.js;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.clientapi.util.IntToIntFunction;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import jdk.nashorn.internal.runtime.ScriptObject;
import jdk.nashorn.internal.runtime.arrays.ArrayData;
import jdk.nashorn.internal.runtime.arrays.IntArrayData;
import jdk.nashorn.internal.runtime.arrays.NumberArrayData;
import jdk.nashorn.internal.runtime.arrays.ObjectArrayData;

@SidedApi(Side.SERVER)
public final class Intrinsics {

  private Intrinsics() { }

  public void iterateArray(ScriptObject o, Consumer consumer) {
    ArrayData data = o.getArray();
    int len = (int) data.length();
    while (len-- > 0) {
      consumer.accept(data.getObject(len));
    }
  }

  public void iterateIntArray(ScriptObject o, IntConsumer consumer) {
    ArrayData data = o.getArray();
    int len = (int) data.length();
    while (len-- > 0) {
      consumer.accept(data.getInt(len));
    }
  }

  public void iterateDoubleArray(ScriptObject o, DoubleConsumer consumer) {
    ArrayData data = o.getArray();
    int len = (int) data.length();
    while (len-- > 0) {
      consumer.accept(data.getDouble(len));
    }
  }

  public void fillArrayAll(ScriptObject o, Object with) {
    ArrayData data = o.getArray();
    int len = (int) data.length();
    while (len-- > 0) {
      data = data.set(len, with, false);
    }
    o.setArray(data);
  }

  public void fillIntArrayAll(ScriptObject o, int with) {
    ArrayData data = o.getArray();
    int len = (int) data.length();
    while (len-- > 0) {
      data = data.set(len, with, false);
    }
    o.setArray(data);
  }

  public void fillDoubleArrayAll(ScriptObject o, double with) {
    ArrayData data = o.getArray();
    int len = (int) data.length();
    while (len-- > 0) {
      data = data.set(len, with, false);
    }
    o.setArray(data);
  }


  public void fillArray(ScriptObject o, int from, int to, Object with) {
    ArrayData data = o.getArray();
    while (from < to) {
      data = data.set(from++, with, false);
    }
    o.setArray(data);
  }

  public void fillIntArray(ScriptObject o, int from, int to, int with) {
    ArrayData data = o.getArray();
    while (from < to) {
      data = data.set(from++, with, false);
    }
    o.setArray(data);
  }

  public void fillDoubleArray(ScriptObject o, int from, int to, double with) {
    ArrayData data = o.getArray();
    while (from < to) {
      data = data.set(from++, with, false);
    }
    o.setArray(data);
  }

  public void fillArrayIndexed(ScriptObject o, IntFunction function) {
    ArrayData data = o.getArray();
    int len = (int) data.length();
    while (len-- > 0) {
      data = data.set(len, function.apply(len), false);
    }
    o.setArray(data);
  }

  public void fillIntArrayIndexed(ScriptObject o, IntToIntFunction function) {
    ArrayData data = o.getArray();
    int len = (int) data.length();
    while (len-- > 0) {
      data = data.set(len, function.applyAsInt(len), false);
    }
    o.setArray(data);
  }

  public void fillDoubleArrayIndexed(ScriptObject o, IntToDoubleFunction function) {
    ArrayData data = o.getArray();
    int len = (int) data.length();
    while (len-- > 0) {
      data = data.set(len, function.applyAsDouble(len), false);
    }
    o.setArray(data);
  }

  public void pushUpto(ScriptObject o, int to, IntFunction function) {
    if (to == 0) {
      return;
    }
    ArrayData newData = o.getArray().ensure(to);
    while (to-- > 0) {
      newData = newData.set(to, function.apply(to), false);
    }
    o.setArray(newData);
  }

  public void pushUptoInt(ScriptObject o, int to, IntToIntFunction function) {
    if (to == 0) {
      return;
    }
    ArrayData newData = o.getArray().ensure(to);
    while (to-- > 0) {
      newData = newData.set(to, function.applyAsInt(to), false);
    }
    o.setArray(newData);
  }

  public void pushUptoDouble(ScriptObject o, int to, IntToDoubleFunction function) {
    if (to == 0) {
      return;
    }
    ArrayData newData = o.getArray().ensure(to);
    while (to-- > 0) {
      newData = newData.set(to, function.applyAsDouble(to), false);
    }
    o.setArray(newData);
  }

  public int indexOf(ScriptObject o, Object element) {
    ArrayData array = o.getArray();
    int j = (int) array.length();
    while (j-- > 0) {
      if (element == array.getObject(j)) {
        return j;
      }
    }
    return -1;
  }

  public int indexOfInt(ScriptObject o, int element) {
    ArrayData array = o.getArray();
    int j = (int) array.length();
    while (j-- > 0) {
      if (element == array.getInt(j)) {
        return j;
      }
    }
    return -1;
  }

  public int indexOfDouble(ScriptObject o, double element) {
    ArrayData array = o.getArray();
    int j = (int) array.length();
    while (j-- > 0) {
      if (element == array.getDouble(j)) {
        return j;
      }
    }
    return -1;
  }

  public void arraycopy(ScriptObject src, int srcPos,
      ScriptObject dest, int destPos,
      int length) {
    java.lang.System.arraycopy(((ObjectArrayData) src.getArray()).getArray(), srcPos,
        ((ObjectArrayData) dest.getArray()).getArray(), destPos, length);
  }

  public void arraycopyInt(ScriptObject src, int srcPos,
      ScriptObject dest, int destPos,
      int length) {
    java.lang.System.arraycopy(((IntArrayData) src.getArray()).getArray(), srcPos,
        ((IntArrayData) dest.getArray()).getArray(), destPos, length);
  }

  public void arraycopyDouble(ScriptObject src, int srcPos,
      ScriptObject dest, int destPos,
      int length) {
    java.lang.System.arraycopy(((NumberArrayData) src.getArray()).getArray(), srcPos,
        ((NumberArrayData) dest.getArray()).getArray(), destPos, length);
  }
}
