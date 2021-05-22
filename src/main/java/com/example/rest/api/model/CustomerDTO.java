package com.example.rest.api.model;

import lombok.Data;

/**
 * @author martsiomchyk
 */
@Data
public class CustomerDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String customerUrl;
}
