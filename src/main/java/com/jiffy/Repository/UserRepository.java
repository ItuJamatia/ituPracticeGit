package com.jiffy.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jiffy.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
}
