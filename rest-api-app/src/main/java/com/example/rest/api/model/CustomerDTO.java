package com.example.rest.api.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author martsiomchyk
 */
@Data
public class CustomerDTO {
    private Long id;
    @ApiModelProperty(value = "This is first name", required = true)
    private String firstName;
    private String lastName;
    private String customerUrl;
}
