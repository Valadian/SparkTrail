package com.dsh105.sparktrail.trail.type;

import com.dsh105.sparktrail.trail.Effect;
import com.dsh105.sparktrail.trail.EffectHolder;
import com.dsh105.sparktrail.trail.ParticleType;
import org.bukkit.Location;
import org.bukkit.entity.Player;


public class Ender extends Effect {

    public Ender(EffectHolder effectHolder) {
        super(effectHolder, ParticleType.ENDER);
    }

    @Override
    public boolean play() {
        boolean shouldPlay = super.play();
        if (shouldPlay) {
            for (Location l : this.displayType.getLocations(this.getHolder().getEffectPlayLocation())) {
                this.getWorld().playEffect(new Location(l.getWorld(), l.getX(), l.getY(), l.getZ()), org.bukkit.Effect.ENDER_SIGNAL, 0);
            }
        }
        return shouldPlay;
    }

    public void playDemo(Player p) {
        p.playEffect(p.getLocation(), org.bukkit.Effect.ENDER_SIGNAL, 0);
    }
}