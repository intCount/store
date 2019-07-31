package com.intCount.Store.common.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "commandlines", schema = "intcount", catalog = "")
public class CommandlinesEntity {
    private int quantity;

    @Basic
    @Column(name = "quantity")
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommandlinesEntity that = (CommandlinesEntity) o;

        if (quantity != that.quantity) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return quantity;
    }
}
