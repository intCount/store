package com.intCount.Store.web.entities;

import javax.persistence.*;

@Entity
@Table(name="items")
public class Items {
    private int itemsId;
    private String itemsName;
    private double itemsPrice;

    @Id
    @Column(name = "items_id")
    public int getItemsId() {
        return itemsId;
    }

    public void setItemsId(int itemsId) {
        this.itemsId = itemsId;
    }

    @Basic
    @Column(name = "items_name")
    public String getItemsName() {
        return itemsName;
    }

    public void setItemsName(String itemsName) {
        this.itemsName = itemsName;
    }

    @Basic
    @Column(name = "items_price")
    public double getItemsPrice() {
        return itemsPrice;
    }

    public void setItemsPrice(double itemsPrice) {
        this.itemsPrice = itemsPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Items items = (Items) o;

        if (itemsId != items.itemsId) return false;
        if (Double.compare(items.itemsPrice, itemsPrice) != 0) return false;
        if (itemsName != null ? !itemsName.equals(items.itemsName) : items.itemsName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = itemsId;
        result = 31 * result + (itemsName != null ? itemsName.hashCode() : 0);
        temp = Double.doubleToLongBits(itemsPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
