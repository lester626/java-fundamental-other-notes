package com.example.springbootthymeleaf.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderForm {
    private String productName;

    @Min(value = 5, message = "amount has to be at least 5")
    private Integer amount;
}