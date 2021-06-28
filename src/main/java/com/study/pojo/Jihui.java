package com.study.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Jihui {
    private int jid;
    private String laiy;
    private String kname;
    private Integer jil;
    private String gaiy;
    private String lxr;
    private String phone;
    private String mains;
    private String cjr;
    private Timestamp ctime;

    @Override
    public String toString() {
        return "Jihui{" +
                "jid=" + jid +
                ", laiy='" + laiy + '\'' +
                ", kname='" + kname + '\'' +
                ", jil=" + jil +
                ", gaiy='" + gaiy + '\'' +
                ", lxr='" + lxr + '\'' +
                ", phone='" + phone + '\'' +
                ", mains='" + mains + '\'' +
                ", cjr='" + cjr + '\'' +
                ", ctime=" + ctime +
                '}';
    }

    @Id
    @Column(name = "jid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getJid() {
        return jid;
    }

    public void setJid(int jid) {
        this.jid = jid;
    }

    @Basic
    @Column(name = "laiy")
    public String getLaiy() {
        return laiy;
    }

    public void setLaiy(String laiy) {
        this.laiy = laiy;
    }

    @Basic
    @Column(name = "kname")
    public String getKname() {
        return kname;
    }

    public void setKname(String kname) {
        this.kname = kname;
    }

    @Basic
    @Column(name = "jil")
    public Integer getJil() {
        return jil;
    }

    public void setJil(Integer jil) {
        this.jil = jil;
    }

    @Basic
    @Column(name = "gaiy")
    public String getGaiy() {
        return gaiy;
    }

    public void setGaiy(String gaiy) {
        this.gaiy = gaiy;
    }

    @Basic
    @Column(name = "lxr")
    public String getLxr() {
        return lxr;
    }

    public void setLxr(String lxr) {
        this.lxr = lxr;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "mains")
    public String getMains() {
        return mains;
    }

    public void setMains(String mains) {
        this.mains = mains;
    }

    @Basic
    @Column(name = "cjr")
    public String getCjr() {
        return cjr;
    }

    public void setCjr(String cjr) {
        this.cjr = cjr;
    }

    @Basic
    @Column(name = "ctime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Timestamp getCtime() {
        return ctime;
    }

    public void setCtime(Timestamp ctime) {
        this.ctime = ctime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jihui jihui = (Jihui) o;
        return jid == jihui.jid && Objects.equals(laiy, jihui.laiy) && Objects.equals(kname, jihui.kname) && Objects.equals(jil, jihui.jil) && Objects.equals(gaiy, jihui.gaiy) && Objects.equals(lxr, jihui.lxr) && Objects.equals(phone, jihui.phone) && Objects.equals(mains, jihui.mains) && Objects.equals(cjr, jihui.cjr) && Objects.equals(ctime, jihui.ctime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jid, laiy, kname, jil, gaiy, lxr, phone, mains, cjr, ctime);
    }
}
