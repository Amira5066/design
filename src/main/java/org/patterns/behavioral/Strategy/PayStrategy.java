package org.patterns.behavioral.Strategy;
public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
