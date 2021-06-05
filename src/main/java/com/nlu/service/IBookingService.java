package com.nlu.service;

import com.nlu.entity.BookingEntity;
import com.nlu.payload.request.BookingInfoRequest;

public interface IBookingService {
	BookingEntity save(BookingInfoRequest bookingInfoRequest);
}
