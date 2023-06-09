package com.example.practice_restApis.model;


import javax.persistence.*;

@Entity
@Table(name = "SalesMan")
public class SalesMan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long sales_id;

    @Column(name = "name")
    private String name;

    @Column(name = "city")
    private String city;

    public long getSales_id() {
        return sales_id;
    }

    @Override
    public String toString() {
        return "SalesMan{" +
                "sales_id=" + sales_id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", commission=" + commission +
                '}';
    }

    public void setSales_id(long sales_id) {
        this.sales_id = sales_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }

    @Column(name = "commission")
    private Double commission;

}
