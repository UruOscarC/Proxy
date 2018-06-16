package com.ogcg.proxy;

public class Main {

	public static void main(String[] args) {
		Internet internet = new UruProxyInternet();
        try
        {
            internet.connectTo("wikipedia.org");
            internet.connectTo("youtube.com");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
	}

}
