package DesignPatterns.prototypeDP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NetworkConnections implements Cloneable {
    private String ip;
    private List<String> domains = new ArrayList<>();
    public List<String> getDomains() {
        return domains;
    }
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public NetworkConnections(){
        System.out.println("Creating object of NetworkConnections Class");
    }

    public void loadData() throws InterruptedException {
        domains.add("www.m.com");
        domains.add("www.p.com");
        domains.add("www.h.com");
        System.out.println("Loading Data");
        Thread.sleep(5000);
    }

    @Override
    public String toString() {
        return "NetworkConnections{" +
                "ip='" + ip + '\'' +
                ", domains=" + domains +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        NetworkConnections networkConnections = new NetworkConnections();
        networkConnections.setIp(this.getIp());
        for(String s:this.getDomains()){
            networkConnections.getDomains().add(s);
        }

        return networkConnections;
    }
}
