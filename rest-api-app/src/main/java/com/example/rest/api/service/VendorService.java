package com.example.rest.api.service;

import com.example.rest.api.model.VendorDTO;
import com.example.rest.api.model.VendorListDTO;

/**
 * @author martsiomchyk
 */

public interface VendorService {

    VendorDTO getVendorById(Long id);

    VendorListDTO getAllVendors();

    VendorDTO createNewVendor(VendorDTO vendorDTO);

    VendorDTO saveVendorByDTO(Long id, VendorDTO vendorDTO);

    VendorDTO patchVendor(Long id, VendorDTO vendorDTO);

    void deleteVendorById(Long id);
}
