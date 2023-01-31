package br.dev.pack.person.entity;

public class Person {

    private String name;
    private String phone;
    private String sex;
    private String mother;
    private String father;
    private String dateB;
    private String conv;
    private String cep;
    private String street;
    private String district;
    private String city;
    

    public Person(String name, String phone, String sex, String mother, String father, String dateB, String conv, String cep, String street, String city, String district) {
        this.name = name;
        this.phone = phone;
        this.sex = sex;
        this.mother = mother;
        this.father = father;
        this.dateB = dateB;
        this.conv = conv;
        this.cep = cep;
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

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getFather() {
        return father;
    }

    public String getDateB() {
        return dateB;
    }

    public void setDateB(String dateB) {
        this.dateB = dateB;
    }

    public String getConv() {
        return conv;
    }

    public void setConv(String conv) {
        this.conv = conv;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setFather(String father) {
        this.father = father;
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
