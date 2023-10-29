package net.floodlightcontroller.MACTracker;

import org.restlet.Context;
import org.restlet.Restlet;
import org.restlet.routing.Router;


import net.floodlightcontroller.restserver.RestletRoutable;


public class MACTrackerWebRoutable implements RestletRoutable {


    @Override
    public Restlet getRestlet(Context context) {
        Router router = new Router(context);
        router.attach("/all/json",MACTrackerResource.class);
        return router;
    }


    @Override
    public String basePath() {
        // TODO Auto-generated method stub
        return "/wm/mactracker";
    }


}
