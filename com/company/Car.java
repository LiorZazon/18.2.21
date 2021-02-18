package com.company;

import lombok.Getter;

public class Car extends Vehicle {

    private @Getter int m_number_of_seats;

    public Car(String m_model, float m_price, String m_id_number, float m_size, String m_garage_name, int m_number_of_seats)
    {
        super(m_model, m_price, m_id_number, m_size, m_garage_name);
        this.m_number_of_seats = m_number_of_seats;
    }
}
