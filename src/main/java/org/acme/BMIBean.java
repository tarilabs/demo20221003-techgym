package org.acme;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BMIBean {
    
    public double bmi(double height, double mass) {
        return mass / Math.pow( height , 2);
    }
}
