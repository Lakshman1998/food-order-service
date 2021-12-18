package com.foodorder.order.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class Response {
    public <T> ResponseEntity<T> success(T success) {
        return ResponseEntity.ok().body(success);
    }

    public ResponseEntity<String> error(Throwable t) {
        return ResponseEntity.internalServerError().body(t.getMessage());
    }
}
