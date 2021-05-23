package com.example.rest.api.repository;

import com.example.rest.api.domain.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author martsiomchyk
 */

public interface VendorRepository extends JpaRepository<Vendor, Long> {
}
