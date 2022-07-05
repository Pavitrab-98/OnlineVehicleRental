package com.cg.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Booking;
import com.cg.service.BookingService;

@RestController
	public class BookingController {
	
		@Autowired
		private BookingService bookingservice;
		
		@PostMapping("/addbooking")
		public Booking addBooking(@RequestBody  Booking b) {
			return bookingservice.addBooking(b);
		}
		
		
		@PutMapping("/updateByDate/{id}/{date}")
		public Booking updateBookingDate(@PathVariable ("id") int bookingId,@PathVariable("date") LocalDate bookingDate) {
			return bookingservice.updateBookingDate(bookingId, bookingDate);
			
		}


		@PutMapping("/updateByTillDate/{id}/{date}")
		public Booking updateBookingTillDate(@PathVariable ("id") int bookingId,@PathVariable("date") LocalDate bookedTillDate) {
			return bookingservice.updateBookingDate(bookingId, bookedTillDate);
			
		}

		@PutMapping("/updateDistance/{id}/{distance}")
		public Booking updatedistance(@PathVariable ("id") int bookingId,@PathVariable("distance") double distance) {
			return bookingservice.updatedistance(bookingId, distance);
			
		}

		@PutMapping("/updateCost/{id}/{cost}")
		public Booking updatecost(@PathVariable ("id") int bookingId,@PathVariable("cost") double totalcost) {
			return bookingservice.updatecost(bookingId, totalcost);
			
		}
		
	    @DeleteMapping("/CancelBooking/{id}")
	    public String cancelBooking(@PathVariable ("id") int bookingId) {
	          return "Booking cancelled Successfylly";
	    }
	    
	    @GetMapping("/viewBooking/{id}")
	    public Booking viewBooking(@PathVariable ("id") int bookingId) {
	    	return bookingservice.viewBooking(bookingId);
	    }
	    
	    @GetMapping("/viewAllBooking")
	    public List<Booking> viewAllBooking() {
	    	return bookingservice.viewAllBookings();
	    }
	    
	    
	    @GetMapping("/viewAllBookingByDate/{date}")
	    public List<Booking> viewAllBookingByDate(@PathVariable ("date")LocalDate bookingDate) {
	    	return bookingservice.viewAllBookingByDate(bookingDate);
	    }
	    
	    
	    
	 }


