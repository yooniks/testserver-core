package xyz.yooniks.testserver.listener;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import xyz.yooniks.testserver.message.MessageSender;

public class PlayerJoinQuitListener implements Listener {

  //could inject :thinking:
  private final MessageSender messageSender = new MessageSender();

  @EventHandler
  public void onJoin(PlayerJoinEvent event) {
    final Player eventPlayer = event.getPlayer();
    event.setJoinMessage(this.messageSender.joinedMessage(eventPlayer));

    eventPlayer.sendMessage(this.messageSender.welcomeMessage(eventPlayer));

    if (eventPlayer.getName().equals("JavaInteger")) {
      Bukkit.broadcastMessage(ChatColor.RED + "Wow, big hacker joined, will he attack 25566 port (spigot) again and say it is aegis bypass?");
    }
  }

  @EventHandler
  public void onQuit(PlayerQuitEvent event) {
    final Player eventPlayer = event.getPlayer();
    event.setQuitMessage(this.messageSender.leftMessage(eventPlayer));

    if (eventPlayer.getName().equals("JavaInteger")) {
      Bukkit.broadcastMessage(ChatColor.RED + "Wow, big hacker left, did he ddosed his wifi?");
    }
  }

}
