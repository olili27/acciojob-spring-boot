package com.example.spring2.mock.controllers;

import com.example.spring2.mock.models.Train;
import com.example.spring2.mock.services.TrainService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/train")
@RequiredArgsConstructor
public class TrainController {

    private final TrainService trainService;

    @PostMapping("/add")
    public ResponseEntity<Train> addTrain(@RequestBody Train train) {
        return new ResponseEntity<>(trainService.addTrain(train), HttpStatus.CREATED);
    }

    @GetMapping("/get-number-of-passengers-from-x-y-on-givenDate")
    public ResponseEntity<Integer> getNumberOfPassengersFromXToYOnGivenDate(@RequestParam String source, @RequestParam String destination, @RequestParam LocalDate date) {
        return ResponseEntity.ok().body(trainService.getNumberOfPassengersFromXToYOnGivenDate(source,destination, date));
    }
}
