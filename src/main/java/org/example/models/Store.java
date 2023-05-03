package org.example.models;

import lombok.*;

import java.beans.ConstructorProperties;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor()
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Store {
    protected HashMap<Customer, Car> sales;
    protected ArrayList<Car> car_models;
    protected Map<Car, Float> car_catalog;
    protected ArrayList<Customer> customers_list;

    public void add_customer(Customer c) {
        this.customers_list.add(c);
    }

    public void remove_customer(Customer c) {
        this.customers_list.remove(c);
    }

    public void add_car_model(Car c) {
        this.car_models.add(c);
    }

    public void remove_car_model(Car c) {
        this.car_models.remove(c);
    }

    public void add_car_to_catalog(Car c, Float price) {
        this.car_catalog.put(c, price);
    }

    public void remove_car_from_catalog(Car c) {
        this.car_catalog.remove(c);
    }

    public void update_car_from_catalog(Car c, Float price) {
        this.car_catalog.put(c, price);
    }

    public Float get_car_price_from_catalog(Car c) {
        return this.car_catalog.get(c);
    }

    public void sell_car_to_customer(Car c, Customer k) {
        this.sales.put(k, c);
    }

}
