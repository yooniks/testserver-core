package xyz.yooniks.testserver.config;

import java.io.File;
import java.util.Collections;
import java.util.List;

public class Settings extends Config {

  @Ignore
  public static final Settings IMP = new Settings();


  @Comment({
      "TestServer Core - simple plugin for managing simple things on test-server",
      "Made by yooniks, discord: yooniks#0289"
  })

  @Create
  public MESSAGES MESSAGES;

  public void reload(File file) {
    load(file);
    save(file);
  }

  @Comment("Do not use '\\ n', use %nl%")
  public static class MESSAGES {

    public String JOIN_MESSAGE_ALL = "&f{PLAYER} &7has joined!";
    public String QUIT_MESSAGE_ALL = "&f{PLAYER} &7has left!";

    public String JOIN_MESSAGE_PV = "%nl%%nl%%nl%&7Welcome on our test server, &f{PLAYER}%nl%&7Resources that are on server and you can test:%nl%&bAegis &7- Bungee fork (antibot + anticrash)%nl%&bSpigotGuard &7- spigot plugin, anticrash%nl%&bCerberus &7- spigot plugin, anticheat%nl%&7Our discord server: &fhttps://discord.gg/AmvcUfn";

    public String CHAT_FORMAT = "{PREFIX}{PLAYER}&8: {SUFFIX}{MESSAGE}";
  }


}