package com.example.medication.activity;

public class Medication {
    private String nameMedication;
    private Integer quantity;
    private String time;

    public Medication() {
    }

    public Medication(String nameMedication, Integer quantity, String time) {
        this.nameMedication = nameMedication;
        this.quantity = quantity;
        this.time = time;
    }

    public String getNameMedication() {
        return nameMedication;
    }

    public void setNameMedication(String nameMedication) {
        this.nameMedication = nameMedication;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
