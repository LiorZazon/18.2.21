package com.company;

public class TriangleWith90 extends Triangle{

    public TriangleWith90(double m_a, double m_b, double m_c) {
        super(m_a, m_b, m_c, m_a);
    }

    @Override
    public double getArea () {
        return m_a * m_b / 2.0;
    }
}
