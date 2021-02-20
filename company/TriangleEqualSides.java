package com.company;

public class TriangleEqualSides extends Triangle {

    public TriangleEqualSides(double m_a, double m_c, double m_h) {
        super(m_a, m_a, m_c, m_h);
    }
    @Override
    public double getHekef() {
        return m_a * 2 + m_c;

    }
}
