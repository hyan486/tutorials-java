package com.java.circular.solution3;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Customer {
    private int id;
    private String name;
    private Order order;
}