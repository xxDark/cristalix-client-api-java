package dev.xdark.clientapi.logging;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import org.apache.logging.log4j.core.Appender;

@SidedApi(Side.SERVER)
public interface LoggingManagement {

    void addAppender(Appender appender);

    void removeAppender(Appender appender);
}
