package com.kvlt.cloud.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * User
 *
 * @author KVLT
 * @date 2017-11-26.
 */
public class User implements Serializable {

    private Long id;

    private String username;

    private String name;

    private Short age;

    private BigDecimal balance;

    public User() {}

    public User(Long id, String username) {
        this.id = id;
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
