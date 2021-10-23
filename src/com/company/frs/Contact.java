package com.company.frs;

public class Contact {
    private String contactName;
    private String contactPhone;
    private String contactEmail;

    public String getContactDetails() {
        return contactName + ", " + contactPhone + ", " + contactEmail;
    }
}
