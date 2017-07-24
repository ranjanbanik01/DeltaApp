package com.cognizant.deltaapp.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class RequestInfo {
    @Element
    private String applicationversion;
    @Element
    private String channel;
    @Element
    private String devicename;
    @Element
    private String osname;
    @Element
    private String osversion;
    @Element
    private String transactionid;
    @Element
    private String build;
    @Element
    private String appid;
    @Element
    private String channelid;
    @Element
    private String pageid;
    @Element
    private String devicetype;

    public RequestInfo(String applicationversion, String channel, String devicename, String osname, String osversion, String transactionid, String build, String appid, String channelid, String pageid, String devicetype) {
        this.applicationversion = applicationversion;
        this.channel = channel;
        this.devicename = devicename;
        this.osname = osname;
        this.osversion = osversion;
        this.transactionid = transactionid;
        this.build = build;
        this.appid = appid;
        this.channelid = channelid;
        this.pageid = pageid;
        this.devicetype = devicetype;
    }

    public String getApplicationversion() {
        return applicationversion;
    }

    public void setApplicationversion(String applicationversion) {
        this.applicationversion = applicationversion;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getDevicename() {
        return devicename;
    }

    public void setDevicename(String devicename) {
        this.devicename = devicename;
    }

    public String getOsname() {
        return osname;
    }

    public void setOsname(String osname) {
        this.osname = osname;
    }

    public String getOsversion() {
        return osversion;
    }

    public void setOsversion(String osversion) {
        this.osversion = osversion;
    }

    public String getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid;
    }

    public String getPageid() {
        return pageid;
    }

    public void setPageid(String pageid) {
        this.pageid = pageid;
    }

    public String getDevicetype() {
        return devicetype;
    }

    public void setDevicetype(String devicetype) {
        this.devicetype = devicetype;
    }
}
