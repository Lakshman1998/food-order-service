package com.foodorder.order.services;


import com.google.common.collect.ImmutableMap;
import io.vavr.control.Either;
import io.vavr.control.Try;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class OrderService {

    public Either<Throwable, Map<String, String>> testOrders() {
        return Try.of(() -> (Map<String, String>) ImmutableMap.of("status", "success"))
                .toEither();
    }
}
