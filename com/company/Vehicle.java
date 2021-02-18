package com.company;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Vehicle {

    protected String m_model;
    protected float m_price;
    protected String m_id_number;
    private @Getter @Setter float m_size;
    String m_garage_name;


    public Vehicle(String m_model, float m_price, String m_id_number, float m_size, String m_garage_name) {
        this.m_model = m_model;
        this.m_price = m_price;
        this.m_id_number = m_id_number;
        this.m_size = m_size;
        this.m_garage_name = m_garage_name;
    }

    // function:

    public void carGo() {
        System.out.println(String.format("the car size is %f", m_size));
    }
}
