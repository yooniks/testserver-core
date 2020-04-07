package xyz.yooniks.testserver;

import java.io.File;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.yooniks.testserver.config.Settings;
import xyz.yooniks.testserver.listener.PlayerChatListener;
import xyz.yooniks.testserver.listener.PlayerJoinQuitListener;

public final class TestServerCorePlugin extends JavaPlugin {

  @Override
  public void onEnable() {
    this.getDataFolder().mkdirs();
    Settings.IMP.reload(new File(this.getDataFolder(), "testserver.yml"));

    final PluginManager pluginManager = this.getServer().getPluginManager();
    pluginManager.registerEvents(new PlayerChatListener(), this);
    pluginManager.registerEvents(new PlayerJoinQuitListener(), this);
  }

}
