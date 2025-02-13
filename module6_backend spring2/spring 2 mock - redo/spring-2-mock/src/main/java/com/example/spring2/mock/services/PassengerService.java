package com.example.spring2.mock.services;

import com.example.spring2.mock.models.Passenger;
import com.example.spring2.mock.repositories.PassengerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PassengerService {

    private final PassengerRepository passengerRepository;

    public Passenger addPassenger(Passenger passenger) {

        return passengerRepository.save(passenger);
    }

    public Integer getNumberOfFemalesBtnAgeXAndYAtGivenDestination(Integer ageX, Integer ageY, String destination) {
        List<Passenger> femalePassengers = passengerRepository.findByGender("female");

        int totalOfFemales = 0;
        for (Passenger passenger: femalePassengers) {
            if (passenger.getAge() == ageX && passenger.getAge() <= ageY && passenger.getTrain().getDestination().equals(destination)) {
                totalOfFemales++;
            }
        }

        return totalOfFemales;
    }
}
