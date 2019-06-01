package com.sample.networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class HostInfoProvider {

    public InetAddress getHostIp(String hostName) throws UnknownHostException
    {
        return InetAddress.getByName(hostName.toLowerCase());
    }
}
