package com.study.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Orderformm {
    private int orid;
    private String orname;
    private String orphone;
    private String orpszt;
    private String orzhf;
    private String orzt;
    private Date ordata;

    @Id
    @Column(name = "orid")
    public int getOrid() {
        return orid;
    }

    public void setOrid(int orid) {
        this.orid = orid;
    }

    @Basic
    @Column(name = "orname")
    public String getOrname() {
        return orname;
    }

    public void setOrname(String orname) {
        this.orname = orname;
    }

    @Basic
    @Column(name = "orphone")
    public String getOrphone() {
        return orphone;
    }

    public void setOrphone(String orphone) {
        this.orphone = orphone;
    }

    @Basic
    @Column(name = "orpszt")
    public String getOrpszt() {
        return orpszt;
    }

    public void setOrpszt(String orpszt) {
        this.orpszt = orpszt;
    }

    @Basic
    @Column(name = "orzhf")
    public String getOrzhf() {
        return orzhf;
    }

    public void setOrzhf(String orzhf) {
        this.orzhf = orzhf;
    }

    @Basic
    @Column(name = "orzt")
    public String getOrzt() {
        return orzt;
    }

    public void setOrzt(String orzt) {
        this.orzt = orzt;
    }

    @Basic
    @Column(name = "ordata")
    public Date getOrdata() {
        return ordata;
    }

    public void setOrdata(Date ordata) {
        this.ordata = ordata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orderformm that = (Orderformm) o;
        return orid == that.orid && Objects.equals(orname, that.orname) && Objects.equals(orphone, that.orphone) && Objects.equals(orpszt, that.orpszt) && Objects.equals(orzhf, that.orzhf) && Objects.equals(orzt, that.orzt) && Objects.equals(ordata, that.ordata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orid, orname, orphone, orpszt, orzhf, orzt, ordata);
    }
}
