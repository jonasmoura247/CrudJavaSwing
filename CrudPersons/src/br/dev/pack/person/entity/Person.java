package br.dev.pack.person.entity;

public class Person {

    private String name;
    private String phone;
    private String sex;
    private String street;
    private String district;
    private String city;

    public Person(String name, String phone, String sex, String street, String city, String district) {
        this.name = name;
        this.phone = phone;
        this.sex = sex;
        this.street = street;
        this.city = city;
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

}
