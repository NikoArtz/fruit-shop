package com.example.rest.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author martsiomchyk
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VendorDTO {
    @NotBlank
    @Size(min = 1, max = 255)
    private String name;
    private String vendorUrl;

}