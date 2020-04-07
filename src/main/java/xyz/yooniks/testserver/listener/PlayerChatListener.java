package xyz.yooniks.testserver.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import xyz.yooniks.testserver.message.ChatHandler;

public class PlayerChatListener implements Listener {

  private final ChatHandler chatHandler = new ChatHandler();

  @EventHandler
  public void onChat(AsyncPlayerChatEvent event) {
    event.setFormat(this.chatHandler.coolFormat(event));
  }

}
