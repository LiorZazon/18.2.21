package com.company;

import lombok.ToString;

@ToString
public class Triangle {

    protected double m_a;
    protected double m_b;
    protected double m_c;
    protected double m_h;

    public Triangle(double m_a, double m_b, double m_c, double m_h) {
        this.m_a = m_a;
        this.m_b = m_b;
        this.m_c = m_c;
        this.m_h = m_h;
    }

    public double getArea () {
        return m_c * m_h / 2.0;

    }
    public double getHekef () {
        return m_a + m_b + m_c;
    }

}
