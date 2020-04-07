package xyz.yooniks.testserver.message;

import org.bukkit.entity.Player;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import xyz.yooniks.testserver.config.Settings;

public class ChatHandler {

  public String coolFormat(AsyncPlayerChatEvent event) {
    final Player player = event.getPlayer();
    return MessageBuilder.newBuilder(Settings.IMP.MESSAGES.CHAT_FORMAT)
        .withField("{PLAYER}", "%1$s")
        .withField("{PREFIX}", this.prefix(player))
        .withField("{SUFFIX}", player.isOp() ? "&e " : "&f ")
        .withField("{MESSAGE}", "%2$s")
        .coloured().toString();
  }

  private String prefix(Player player) {
    if (player.getName().equals("JavaInteger")) {
      return "&c[aegis bypass = 25566 port attack xD] ";
    }
    return player.isOnline() ? "&c " : "&7 ";
  }

}
