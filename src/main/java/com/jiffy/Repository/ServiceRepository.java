package com.jiffy.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jiffy.entity.ServiceEntity;

public interface ServiceRepository extends JpaRepository<ServiceEntity, Long> {

}
