# Публичный API клиента Cristalix
**Ограничения**:  
~~Запрещен InvokeDynamic~~   
Запрещена рефлексия  

**Создание модов**:  
Каждый мод должен содержать в корне архива файл **mod.properties**,  
содержащий следующие:
```Properties
main=path.to.EntryPoint
author=Автор мода
name=Название мода
version=Версия мода
```

**Hello World**:
```Java
package dev.xdark.testmod;

import dev.xdark.clientapi.ClientApi;
import dev.xdark.clientapi.entry.ModMain;
import dev.xdark.clientapi.event.Listener;
import dev.xdark.clientapi.event.network.ServerConnect;
import dev.xdark.clientapi.text.Text;
import dev.xdark.clientapi.text.TextFormatting;

public final class HelloMod implements ModMain, Listener {

  @Override
  public void load(ClientApi api) {
  	ServerConnect.BUS.register(this, e -> {
  	  api.chat().printChatMessage(Text.of("Hello, World!", TextFormatting.GOLD));
  	}, 100);
  }

  @Override
  public void unload() {
  }
}

```