package com.ogcg.proxy;

import java.util.List;
import java.util.Vector;

public class UruProxyInternet implements Internet {

	private Internet internet = new RealInternet();
    private static List<String> bannedSites;
     
    static
    {
        bannedSites = new Vector<String>();
        bannedSites.add("youtube.com");
        bannedSites.add("facebook.com");
        bannedSites.add("OdioAOscar.blogspot.com");
        bannedSites.add("quetal.net");
    }
     
    @Override
    public void connectTo(String serverhost) throws Exception
    {
        if(bannedSites.contains(serverhost.toLowerCase()))
        {
            throw new Exception("Access Denied");
        }
         
        internet.connectTo(serverhost);
    }

}
