package com.sample.networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class HostInfoProvider {

    public String getHostIp() throws UnknownHostException {
        return InetAddress.getLocalHost().getHostAddress();
    }

    public String getHostName() throws UnknownHostException {
        return InetAddress.getLocalHost().getHostName();
    }
}

