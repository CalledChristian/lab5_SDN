package net.floodlightcontroller.MACTracker;

import java.util.Set;


import net.floodlightcontroller.core.module.IFloodlightService;


public interface MACTrackerService extends IFloodlightService {
    public Set<Long> getMacAddress();
}
