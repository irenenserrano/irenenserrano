package io.gitbub.irenenserrano;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class IrenesFirstPlugin extends JavaPlugin implements Listener{
  @Override
  public void onEnable() {
    getLogger().info("IrenesFirstPlugin.onEnable has been invoked!");
  }

  @Override
  public void onDisable() {
    getLogger().info("IrenesFirstPlugin.onDisable has been invoked!");
  }
  /*
   * Returns a message indicating what mob entity is attacking which player
   *
   * @param event EntityDamageByEntityEvent
   */
  @EventHandler
  public void attackIdentification(EntityDamageByEntityEvent event) {
    //create entities that will represent the player and the attacker
    Player player = (Player) event.getEntity();
    Player attacker = (Player) event.getDamager();

    //if the player is being attacked then generate a message stating so
    if (event.getEntity() instanceof Player && event.getDamager() instanceof Player)
    {
      //broadcast a message
      Bukkit.broadcastMessage(player + " is being attacked by "+ attacker);
    }
  }
}
