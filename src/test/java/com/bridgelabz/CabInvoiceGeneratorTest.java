package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {
    @Test
    public void givenUserId_shouldReturnInvoiceSummary() {
        try {
            String userId = "me.shadab@gmail.com";
            Ride[] rides = { new Ride(2.0, 5), new Ride(0.1, 1) };
            CabInvoiceGenerator.addRides(userId, rides);
            InvoiceSummary summary;

            summary = CabInvoiceGenerator.calculateFare(rides, "normal");

            InvoiceSummary invoiceSummary = CabInvoiceGenerator.getInvoiceSummary(userId);
            Assert.assertEquals(invoiceSummary, summary);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        }
    }
}