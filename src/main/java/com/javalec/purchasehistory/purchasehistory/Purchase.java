package com.javalec.purchasehistory.purchasehistory;

import javax.persistence.*;
import java.time.ZonedDateTime;
import javax.persistence.Id;

@Entity
@Table(name = "purchases")
public class Purchase {
    private ZonedDateTime orderDate;

    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private String orderId;

    private String title;
    private String category;
    private String asinIsbn;
    private int unspscCode;
/*    private String website;
    private String releaseDate;
    private String condition;
    private String seller;
    private String sellerCredentials;
    private String listPricePerUnit;
    private String purchase_price_per_unit;
    private int quantity;
    private String payment_instrument_type;
    private String purchase_order_number;
    private String po_line_number;
    private String ordering_customer_email;
    private String shipment_date;
    private String shipping_address_name;
    private String shipping_address_street_1;
    private String shipping_address_street_2;
    private String shipping_address_city;
    private String shipping_address_state;
    private String shipping_address_zip;
    private String order_status;
    private String carrier_name_tracking_number;
    private String item_subtotal;
    private String item_subtotal_tax;
    private String item_total;
    private String buyer_name;
    private String currency;*/

    public Purchase(){
    }


    /*
    String website, String releaseDate, String condition, String seller,
                     String sellerCredentials, String listPricePerUnit, String purchase_price_per_unit,
                     int quantity, String payment_instrument_type, String purchase_order_number, String po_line_number,
                     String ordering_customer_email, String shipment_date, String shipping_address_name,
                     String shipping_address_street_1, String shipping_address_street_2, String shipping_address_city,
                     String shipping_address_state, String shipping_address_zip, String order_status,
                     String carrier_name_tracking_number, String item_subtotal, String item_subtotal_tax,
                     String item_total, String buyer_name, String currency
     */
    public Purchase(ZonedDateTime orderDate, String orderId, String title, String category, String asinIsbn,
                    int unspscCode) {
        this.orderDate = orderDate;
        this.orderId = orderId;
        this.title = title;
        this.category = category;
        this.asinIsbn = asinIsbn;
        this.unspscCode = unspscCode;
        /*this.website = website;
        this.releaseDate = releaseDate;
        this.condition = condition;
        this.seller = seller;
        this.sellerCredentials = sellerCredentials;
        this.listPricePerUnit = listPricePerUnit;
        this.purchase_price_per_unit = purchase_price_per_unit;
        this.quantity = quantity;
        this.payment_instrument_type = payment_instrument_type;
        this.purchase_order_number = purchase_order_number;
        this.po_line_number = po_line_number;
        this.ordering_customer_email = ordering_customer_email;
        this.shipment_date = shipment_date;
        this.shipping_address_name = shipping_address_name;
        this.shipping_address_street_1 = shipping_address_street_1;
        this.shipping_address_street_2 = shipping_address_street_2;
        this.shipping_address_city = shipping_address_city;
        this.shipping_address_state = shipping_address_state;
        this.shipping_address_zip = shipping_address_zip;
        this.order_status = order_status;
        this.carrier_name_tracking_number = carrier_name_tracking_number;
        this.item_subtotal = item_subtotal;
        this.item_subtotal_tax = item_subtotal_tax;
        this.item_total = item_total;
        this.buyer_name = buyer_name;
        this.currency = currency;*/
    }


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAsinIsbn() {
        return asinIsbn;
    }

    public void setAsinIsbn(String asinIsbn) {
        this.asinIsbn = asinIsbn;
    }

    public int getUnspscCode() {
        return unspscCode;
    }

    public void setUnspscCode(int unspscCode) {
        this.unspscCode = unspscCode;
    }

    public ZonedDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(ZonedDateTime orderDate) {
        this.orderDate = orderDate;
    }

    /*public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getSellerCredentials() {
        return sellerCredentials;
    }

    public void setSellerCredentials(String sellerCredentials) {
        this.sellerCredentials = sellerCredentials;
    }

    public String getListPricePerUnit() {
        return listPricePerUnit;
    }

    public void setListPricePerUnit(String listPricePerUnit) {
        this.listPricePerUnit = listPricePerUnit;
    }

    public String getPurchase_price_per_unit() {
        return purchase_price_per_unit;
    }

    public void setPurchase_price_per_unit(String purchase_price_per_unit) {
        this.purchase_price_per_unit = purchase_price_per_unit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPayment_instrument_type() {
        return payment_instrument_type;
    }

    public void setPayment_instrument_type(String payment_instrument_type) {
        this.payment_instrument_type = payment_instrument_type;
    }

    public String getPurchase_order_number() {
        return purchase_order_number;
    }

    public void setPurchase_order_number(String purchase_order_number) {
        this.purchase_order_number = purchase_order_number;
    }

    public String getPo_line_number() {
        return po_line_number;
    }

    public void setPo_line_number(String po_line_number) {
        this.po_line_number = po_line_number;
    }

    public String getOrdering_customer_email() {
        return ordering_customer_email;
    }

    public void setOrdering_customer_email(String ordering_customer_email) {
        this.ordering_customer_email = ordering_customer_email;
    }

    public String getShipment_date() {
        return shipment_date;
    }

    public void setShipment_date(String shipment_date) {
        this.shipment_date = shipment_date;
    }

    public String getShipping_address_name() {
        return shipping_address_name;
    }

    public void setShipping_address_name(String shipping_address_name) {
        this.shipping_address_name = shipping_address_name;
    }

    public String getShipping_address_street_1() {
        return shipping_address_street_1;
    }

    public void setShipping_address_street_1(String shipping_address_street_1) {
        this.shipping_address_street_1 = shipping_address_street_1;
    }

    public String getShipping_address_street_2() {
        return shipping_address_street_2;
    }

    public void setShipping_address_street_2(String shipping_address_street_2) {
        this.shipping_address_street_2 = shipping_address_street_2;
    }

    public String getShipping_address_city() {
        return shipping_address_city;
    }

    public void setShipping_address_city(String shipping_address_city) {
        this.shipping_address_city = shipping_address_city;
    }

    public String getShipping_address_state() {
        return shipping_address_state;
    }

    public void setShipping_address_state(String shipping_address_state) {
        this.shipping_address_state = shipping_address_state;
    }

    public String getShipping_address_zip() {
        return shipping_address_zip;
    }

    public void setShipping_address_zip(String shipping_address_zip) {
        this.shipping_address_zip = shipping_address_zip;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    public String getCarrier_name_tracking_number() {
        return carrier_name_tracking_number;
    }

    public void setCarrier_name_tracking_number(String carrier_name_tracking_number) {
        this.carrier_name_tracking_number = carrier_name_tracking_number;
    }

    public String getItem_subtotal() {
        return item_subtotal;
    }

    public void setItem_subtotal(String item_subtotal) {
        this.item_subtotal = item_subtotal;
    }

    public String getItem_subtotal_tax() {
        return item_subtotal_tax;
    }

    public void setItem_subtotal_tax(String item_subtotal_tax) {
        this.item_subtotal_tax = item_subtotal_tax;
    }

    public String getItem_total() {
        return item_total;
    }

    public void setItem_total(String item_total) {
        this.item_total = item_total;
    }

    public String getBuyer_name() {
        return buyer_name;
    }

    public void setBuyer_name(String buyer_name) {
        this.buyer_name = buyer_name;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }*/
}
