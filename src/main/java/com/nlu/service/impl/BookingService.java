package com.nlu.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nlu.entity.BookingEntity;
import com.nlu.entity.CustomerEntity;
import com.nlu.payload.request.BookingInfoRequest;
import com.nlu.repository.BookingRepository;
import com.nlu.repository.CustomerRepository;
import com.nlu.repository.RoomRepository;
import com.nlu.service.IBookingService;

@Service
public class BookingService implements IBookingService {

	@Autowired
	private BookingRepository bookingRepository;

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private RoomRepository roomRepository;

	@Override
	public BookingEntity save(BookingInfoRequest bookingInfoRequest) {
		BookingEntity booking;

		try {
			booking = new BookingEntity();
			
			CustomerEntity customer = new CustomerEntity();
			customer.setFullname(bookingInfoRequest.getFullname());
			customer.setEmail(bookingInfoRequest.getEmail());
			customer = customerRepository.save(customer);

			booking.setCustomer(customer);
			booking.setStatus(1);
			booking.setCode("BOOKING" + customer.getId());
			booking.setBookdate(new Date(System.currentTimeMillis()));
			booking.setStartdate(bookingInfoRequest.getStartDate());
			booking.setEnddate(bookingInfoRequest.getEndDate());
			booking.setNotes(bookingInfoRequest.getNotes() == null ? "" : bookingInfoRequest.getNotes());
			
			booking.setRoom(roomRepository.findById(bookingInfoRequest.getRoomId()));

			booking = bookingRepository.save(booking);
		} catch (Exception e) {
			booking = null;
		}

		return booking;
	}

}
