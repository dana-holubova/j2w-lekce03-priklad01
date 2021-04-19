package cz.czechitas.java2webapps.lekce3.entity;

public class Address {
//    fieldy
private String street;
private String postalCode;
private String locality;

//prázdný konstruktor
    public Address() {
    }

    //    konstruktor s parametry pro nastavení všech fieldů

    public Address(String street, String postalCode, String locality) {
        this.street = street;
        this.postalCode = postalCode;
        this.locality = locality;
    }

//    gettry a settry (alt + insert -> getter and setter

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }
}
