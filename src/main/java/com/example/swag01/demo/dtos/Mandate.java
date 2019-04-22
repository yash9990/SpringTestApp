package com.example.swag01.demo.dtos;


public class Mandate {

    private String DAccno;
    private String CAccno;
    private boolean noti;
    private long mid;

    public String getDAccno() {
        return DAccno;
    }

    public void setDAccno(String DAccno) {
        this.DAccno = DAccno;
    }

    public String getCAccno() {
        return CAccno;
    }

    public void setCAccno(String CAccno) {
        this.CAccno = CAccno;
    }

    public boolean isNoti() {
        return noti;
    }

    public void setNoti(boolean noti) {
        this.noti = noti;
    }

    public long getMid() {
        return mid;
    }

    public void setMid(long mid) {
        this.mid = mid;
    }

    @Override
    public String toString() {
        return "Mandate{" +
                "DAccno='" + DAccno + '\'' +
                ", CAccno='" + CAccno + '\'' +
                ", mid=" + mid +
                '}';
    }
}

