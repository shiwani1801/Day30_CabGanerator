package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {
    @Test
    public void calculateFareOfOneRide() {
        CabInvoiceGenerator obj = new CabInvoiceGenerator();
        double test = obj.calculateFare(10, 15);
        Assert.assertEquals(115.0, test, 0.0);
    }
}