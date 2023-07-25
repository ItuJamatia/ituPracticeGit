package com.jiffy.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jiffy.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

	Optional<Address> findByAddress(String address);
}
