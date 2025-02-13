package com.example.spring2.mock.controllers;

import com.example.spring2.mock.models.Passenger;
import com.example.spring2.mock.services.PassengerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/passenger")
@RequiredArgsConstructor
public class PassengerController {
    private final PassengerService passengerService;

    @PostMapping("/add")
    public ResponseEntity<Passenger> addPassenger(@RequestBody Passenger passenger) {
        return new ResponseEntity<>(passengerService.addPassenger(passenger), HttpStatus.CREATED);
    }

    @GetMapping("/get-number-of-females-btn-age-x-y-at-destination-c")
    public ResponseEntity<Integer> getNumberOfFemalesBtnAgeXAndYAtGivenDestination(@RequestParam Integer ageX, @RequestParam Integer ageY, @RequestParam String destination) {
        return ResponseEntity.ok().body(passengerService.getNumberOfFemalesBtnAgeXAndYAtGivenDestination(ageX, ageY, destination));
    }
}
