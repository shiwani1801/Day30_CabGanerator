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
    @Test
    public void MonthFareTest() {
        CabInvoiceGenerator obj = new CabInvoiceGenerator();
        Ride[] rides = { new Ride(1, 23), new Ride(1, 2) };
        double monthfare = obj.calculateFare(rides);
        Assert.assertEquals(45.0, monthfare, 0.0);

    }
}