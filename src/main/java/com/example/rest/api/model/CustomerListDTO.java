package com.example.rest.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author martsiomchyk
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerListDTO {
    List<CustomerDTO> customers;
}
