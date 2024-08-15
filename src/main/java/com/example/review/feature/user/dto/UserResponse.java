package com.example.review.feature.user.dto;

import lombok.Builder;

@Builder
public record UserResponse(

        String name,
        String email,
        Integer age
) {
}
