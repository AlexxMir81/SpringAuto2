package com.example.springauto2.models;

public enum TransmissionType {
    AUTO("Automatic"),
    MANUAL("Manual");

    private final String value;

    TransmissionType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
