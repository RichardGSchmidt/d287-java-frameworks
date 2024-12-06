package com.example.demo.domain;

import com.example.demo.validators.ValidDeletePart;
import com.example.demo.validators.ValidInventory;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 *
 *
 *
 *
 */
@Entity
@ValidDeletePart
@ValidInventory
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="part_type",discriminatorType = DiscriminatorType.INTEGER)
@Table(name="Parts")
public abstract class Part implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String name;
    @Min(value = 0, message = "Price value must be positive")
    double price;
    @Min(value = 0, message = "Inventory value must be positive")
    int inv;
    //declaration of new minimum and maximum inventory values in accordance with Task G
    @Min(value = 0, message = "Minimum inventory value must be positive")
    int minInv = 0;
    @Min(value = 0, message = "Maximum value must be positive")
    int maxInv = Integer.MAX_VALUE;


    @ManyToMany
    @JoinTable(name="product_part", joinColumns = @JoinColumn(name="part_id"),
            inverseJoinColumns=@JoinColumn(name="product_id"))
    Set<Product> products= new HashSet<>();

    public Part() {
    }

    public Part(String name, double price, int inv) {
        this.name = name;
        this.price = price;
        this.inv = inv;
    }

    public Part(long id, String name, double price, int inv) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.inv = inv;
    }

    //new constructor that includes min and max inv
    public Part(long id, String name, double price, int inv, int minInv, int maxInv) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.inv = inv;
        this.minInv = minInv;
        this.maxInv = maxInv;
    }


    public long getId() {
        return id;
    }

    //get and set functions for min and max inventory in accordance with Task G
    public int getMinInv() { return minInv; }
    public void setMinInv(int minInv) { this.minInv = minInv; }

    public int getMaxInv() { return maxInv; }
    public void setMaxInv(int maxInv) { this.maxInv = maxInv; }

    //inventory validation function checks to ensure that inventory is between min and max values.
    public boolean invGreaterMax(){ return ( (inv > maxInv)); }
    public boolean invLessMin(){ return ( (inv < minInv)); }
    //further check to ensure that min value is less than or equal to max value
    public boolean isMaxInvValid(){ return (maxInv >= minInv); }


    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getInv() {
        return inv;
    }

    public void setInv(int inv) {
        this.inv = inv;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public String toString(){
        return this.name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Part part = (Part) o;

        return id == part.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
