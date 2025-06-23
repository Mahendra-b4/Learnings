package DesignPatterns.prototypeDP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        NetworkConnections networkConnections1 = new NetworkConnections();
        networkConnections1.setIp("123.45.89.0");
//        List<String> domains = new ArrayList<>(Arrays.asList("www.m.com", "www.p.com", "www.h.com"));
//        networkConnections1.setDomains(domains);
        networkConnections1.loadData();

        NetworkConnections networkConnections2 = (NetworkConnections) networkConnections1.clone();

        NetworkConnections networkConnections3 = (NetworkConnections) networkConnections1.clone();

        System.out.println(networkConnections1);
        networkConnections1.getDomains().remove(2);
        System.out.println(networkConnections1);
        System.out.println(networkConnections2);
        System.out.println(networkConnections3);

    }
}
