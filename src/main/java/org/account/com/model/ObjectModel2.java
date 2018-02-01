package org.account.com.model;

/**
 * 热源资料
 */
public class ObjectModel2 {
    private String jzmc;
    //    供压
    private String ywgy;
    private String ywhy;
    //    供温
    private String ywgw;
    private String ywhw;

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


    public ObjectModel2() {
        super();
    }

    public ObjectModel2(String jzmc, String ywgy, String ywhy, String ywgw, String ywhw) {
        this.jzmc = jzmc;
        this.ywgy = ywgy;
        this.ywhy = ywhy;
        this.ywgw = ywgw;
        this.ywhw = ywhw;
    }

    @Override
    public String toString() {
        return "ObjectModel{" +
                "jzmc='" + jzmc + '\'' +
                ", ywgy='" + ywgy + '\'' +
                ", ywhy='" + ywhy + '\'' +
                ", ywgw='" + ywgw + '\'' +
                ", ywhw='" + ywhw + '\'' +
                '}';
    }
}
