package org.account.com.model;

public class ObjectModel {
    private String jzmc;
    //    供压
    private String ywgy;
    private String ywhy;
    private String ewgy;
    private String ewhy;
    //    供温
    private String ywgw;
    private String ywhw;
    private String ewgw;
    private String ewhw;

    public String getJzmc() {
        return jzmc;
    }

    public void setJzmc(String jzmc) {
        this.jzmc = jzmc;
    }

    public String getYwgy() {
        return ywgy;
    }

    public void setYwgy(String ywgy) {
        this.ywgy = ywgy;
    }

    public String getYwhy() {
        return ywhy;
    }

    public void setYwhy(String ywhy) {
        this.ywhy = ywhy;
    }

    public String getEwgy() {
        return ewgy;
    }

    public void setEwgy(String ewgy) {
        this.ewgy = ewgy;
    }

    public String getEwhy() {
        return ewhy;
    }

    public void setEwhy(String ewhy) {
        this.ewhy = ewhy;
    }

    public String getYwgw() {
        return ywgw;
    }

    public void setYwgw(String ywgw) {
        this.ywgw = ywgw;
    }

    public String getYwhw() {
        return ywhw;
    }

    public void setYwhw(String ywhw) {
        this.ywhw = ywhw;
    }

    public String getEwgw() {
        return ewgw;
    }

    public void setEwgw(String ewgw) {
        this.ewgw = ewgw;
    }

    public String getEwhw() {
        return ewhw;
    }

    public void setEwhw(String ewhw) {
        this.ewhw = ewhw;
    }

    public ObjectModel() {
        super();
    }

    public ObjectModel(String jzmc, String ywgy, String ywhy, String ewgy, String ewhy, String ywgw, String ywhw, String ewgw, String ewhw) {
        this.jzmc = jzmc;
        this.ywgy = ywgy;
        this.ywhy = ywhy;
        this.ewgy = ewgy;
        this.ewhy = ewhy;
        this.ywgw = ywgw;
        this.ywhw = ywhw;
        this.ewgw = ewgw;
        this.ewhw = ewhw;
    }

    @Override
    public String toString() {
        return "ObjectModel{" +
                "jzmc='" + jzmc + '\'' +
                ", ywgy='" + ywgy + '\'' +
                ", ywhy='" + ywhy + '\'' +
                ", ewgy='" + ewgy + '\'' +
                ", ewhy='" + ewhy + '\'' +
                ", ywgw='" + ywgw + '\'' +
                ", ywhw='" + ywhw + '\'' +
                ", ewgw='" + ewgw + '\'' +
                ", ewhw='" + ewhw + '\'' +
                '}';
    }
}
