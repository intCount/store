package com.intCount.Store.common.model;

import javax.persistence.*;

@Entity
@Table(name = "commands", schema = "intcount", catalog = "")
public class CommandsEntity {
    private int id;
    private String name;
    private int customersByIdCustomer;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "customersByIdCustomer")
    public int getCustomersByIdCustomer() {
        return customersByIdCustomer;
    }

    public void setCustomersByIdCustomer(int customersByIdCustomer) {
        this.customersByIdCustomer = customersByIdCustomer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommandsEntity that = (CommandsEntity) o;

        if (id != that.id) return false;
        if (customersByIdCustomer != that.customersByIdCustomer) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + customersByIdCustomer;
        return result;
    }
}
