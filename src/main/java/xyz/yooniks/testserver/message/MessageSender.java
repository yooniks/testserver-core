package xyz.yooniks.testserver.message;

import org.bukkit.entity.Player;
import xyz.yooniks.testserver.config.Settings;

public class MessageSender {

  public String welcomeMessage(Player player) {
    return MessageBuilder.newBuilder(Settings.IMP.MESSAGES.JOIN_MESSAGE_PV)
        .withField("{PLAYER}", player.getName())
        .withField("%nl%", "\n")
        .coloured().toString();
  }

  public String joinedMessage(Player player) {
    return MessageBuilder.newBuilder(Settings.IMP.MESSAGES.JOIN_MESSAGE_ALL)
        .withField("{PLAYER}", player.getName())
        .withField("%nl%", "\n")
        .coloured().toString();
  }

  public String leftMessage(Player player) {
    return MessageBuilder.newBuilder(Settings.IMP.MESSAGES.QUIT_MESSAGE_ALL)
        .withField("{PLAYER}", player.getName())
        .withField("%nl%", "\n")
        .coloured().toString();
  }

}
