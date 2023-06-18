package com.example.WeeklyTest;

import org.springframework.stereotype.Component;

@Component
public class Car {

    private String company;
    private int number ;
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", number=" + number +
                '}';
    }
}
