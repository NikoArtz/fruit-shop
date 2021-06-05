package com.example.rest.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author martsiomchyk
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VendorDTO {
    private String name;
    private String vendorUrl;

}