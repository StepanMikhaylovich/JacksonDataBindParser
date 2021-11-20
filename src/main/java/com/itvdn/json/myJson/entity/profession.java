package com.itvdn.json.myJson.entity;

public class profession {

    private String military;
    private String expierence;

    public profession() {
    }

    public profession(String military, String expierence) {
        this.military = military;
        this.expierence = expierence;
    }

    public String getMilitary() {
        return military;
    }

    public void setMilitary(String military) {
        this.military = military;
    }

    public String getExpierence() {
        return expierence;
    }

    public void setExpierence(String expierence) {
        this.expierence = expierence;
    }

    @Override
    public String toString() {
        return "profession{" +
                "military='" + military + '\'' +
                ", expierence='" + expierence + '\'' +
                '}';
    }
}
