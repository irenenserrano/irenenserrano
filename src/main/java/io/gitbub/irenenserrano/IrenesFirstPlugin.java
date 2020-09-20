package io.gitbub.irenenserrano;

import org.bukkit.plugin.java.JavaPlugin;

public final class IrenesFirstPlugin extends JavaPlugin{
  @Override
  public void onEnable() {
    getLogger().info("IrenesFirstPlugin.onEnable has been invoked!");
  }

  @Override
  public void onDisable() {
    getLogger().info("IrenesFirstPlugin.onDisable has been invoked!");
  }
}
