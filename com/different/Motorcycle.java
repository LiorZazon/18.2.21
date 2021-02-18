package com.different;

import lombok.ToString;

import com.company.Vehicle;
import lombok.Getter;

public class Motorcycle extends Vehicle {

    private @Getter float m_hand_break_size;

    public Motorcycle(String m_model, float m_price, String m_id_number, float m_size, String m_garage_name, float m_hand_break_size) {
        super(m_model, m_price, m_id_number, m_size, m_garage_name);
        this.m_hand_break_size = m_hand_break_size;
    }
}
