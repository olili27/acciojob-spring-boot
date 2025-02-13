package com.example.spring2.mock.repositories;

import com.example.spring2.mock.models.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TrainRepository extends JpaRepository<Train, Integer> {
    List<Train> findBySourceAndDestinationAndDate(String source, String destination, LocalDate date);

}
