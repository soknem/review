package com.example.review.feature.user.dto;

import lombok.Builder;

@Builder
public record UserRequest(

        String name,
        String email,
        Integer age
) {
}
