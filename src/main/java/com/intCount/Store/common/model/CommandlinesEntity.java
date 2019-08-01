package com.intCount.Store.common.model;

import javax.persistence.*;

@Entity
@Table(name = "commandlines", schema = "intcount", catalog = "")
public class CommandlinesEntity {
    private int idItems;
    private Integer idCommands;
    private Integer quantity;

    @Id
    @Column(name = "idItems")
    public int getIdItems() {
        return idItems;
    }

    public void setIdItems(int idItems) {
        this.idItems = idItems;
    }

    @Basic
    @Column(name = "idCommands")
    public Integer getIdCommands() {
        return idCommands;
    }

    public void setIdCommands(Integer idCommands) {
        this.idCommands = idCommands;
    }

    @Basic
    @Column(name = "quantity")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommandlinesEntity that = (CommandlinesEntity) o;

        if (idItems != that.idItems) return false;
        if (idCommands != null ? !idCommands.equals(that.idCommands) : that.idCommands != null) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idItems;
        result = 31 * result + (idCommands != null ? idCommands.hashCode() : 0);
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        return result;
    }
}
