package world.bentobox.greenhouses.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

import world.bentobox.bentobox.api.events.island.IslandEvent.IslandDeleteEvent;
import world.bentobox.greenhouses.Greenhouses;

/**
 * @author tastybento
 *
 */
public class IslandChangeEvents implements Listener {

    private Greenhouses addon;

    /**
     * @param addon
     */
    public IslandChangeEvents(Greenhouses addon) {
        this.addon = addon;
    }

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled=true)
    public void onIslandDeleteEvent(IslandDeleteEvent e) {
        addon.getManager().removeGreenhouses(e.getIsland());
    }
}
