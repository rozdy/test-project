package com.rozdy.epidemy.bus;

import com.rozdy.epidemy.logic.player.Player;

/**
 * Created by hex on 8/31/2015 in the name of the Emperor!
 */
public class PlayerLoseEvent {
    private Player player;

    public PlayerLoseEvent(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }
}
