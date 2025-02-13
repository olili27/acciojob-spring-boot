package com.example.spring2.mock.services;

import com.example.spring2.mock.models.FoodOrder;
import com.example.spring2.mock.repositories.FoodOrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodOrderService {

    private final FoodOrderRepository foodOrderRepository;

    public Integer getTotalPriceOfOrdersOnGivenDateOnTrain(LocalDate date, Integer trainId) {
        List<FoodOrder> foodOrders = foodOrderRepository.findByDate(date);

        int totalPrice = 0;

        if(foodOrders != null){
            for (FoodOrder order : foodOrders) {
                if (order.getTrain().getTrainId() == trainId) {
                    totalPrice += order.getPrice();
                }
            }
        }

        return totalPrice;
    }
}
