package com.example.spring2.mock.services;

import com.example.spring2.mock.models.Train;
import com.example.spring2.mock.repositories.TrainRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TrainService {

    private final TrainRepository trainRepository;

    public Train addTrain(Train train) {
        return trainRepository.save(train);
    }

    public Integer getNumberOfPassengersFromXToYOnGivenDate(String source, String destination, LocalDate date) {
        List<Train> trains = trainRepository.findBySourceAndDestinationAndDate(source, destination, date);

        int numberOFPassengers = 0;

        if (trains != null){
                for (Train train : trains) {
                    numberOFPassengers += train.getPassengers().size();
                }
            }

        return numberOFPassengers;
    }
}
