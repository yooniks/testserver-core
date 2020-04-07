package xyz.yooniks.testserver.message;

import org.apache.commons.lang.StringUtils;
import org.bukkit.ChatColor;

public class MessageBuilder {

  private String text;

  public MessageBuilder(String text) {
    this.text = text;
  }

  public static MessageBuilder newBuilder(String text) {
    return new MessageBuilder(text);
  }

  public MessageBuilder withField(String field, String value) {
    this.text = StringUtils.replace(this.text, field, value);
    return this;
  }

  public MessageBuilder coloured() {
    this.text = ChatColor.translateAlternateColorCodes('&', text);
    return this;
  }

  @Override
  public String toString() {
    return this.text;
  }

}
