package org.example.data;

import java.util.ArrayList;
import java.util.List;

public class Voucherify {
    private final Campaign couponCampaign;
    private final Campaign loyaltyCampaign;
    private final Customer customer;
    private final List<Product> products;
    private final Order order;

    private Voucherify() {
        couponCampaign = new Campaign();
        loyaltyCampaign = new Campaign();
        customer = new Customer();
        products = new ArrayList<>();
        order = new Order();
    }

    private static class SingletonHolder {
        private static final Voucherify INSTANCE = new Voucherify();
    }

    public static Voucherify getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public Campaign getCouponCampaign() {
        return couponCampaign;
    }

    public Campaign getLoyaltyCampaign() {
        return loyaltyCampaign;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Order getOrder() {
        return order;
    }
}