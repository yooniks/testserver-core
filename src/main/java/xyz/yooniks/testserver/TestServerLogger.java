package xyz.yooniks.testserver;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestServerLogger {

  private static final Logger LOGGER = TestServerCorePlugin.getPlugin(TestServerCorePlugin.class).getLogger();

  public static void log(Level level, String message, Object... params) {
    LOGGER.log(level, message, params);
  }

  public static void exception(String message, Exception ex) {
    LOGGER.log(Level.WARNING, message, ex);
  }


}
