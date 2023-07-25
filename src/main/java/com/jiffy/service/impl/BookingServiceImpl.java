package com.jiffy.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiffy.Repository.ServiceRepository;
import com.jiffy.entity.ServiceEntity;
import com.jiffy.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private ServiceRepository serviceRepo;

//	@Override
//    public List<ServiceEntity> getAvailableServices() {
//        return serviceRepo.findAll();
//    }

//    @Override
//    public void bookService(BookingRequest bookingRequest) {
        // Perform the booking process here
        // You can access the selected service and other details from the bookingRequest object
        // Implement your business logic for booking the service
//    }
}
