package com.example.review.mapper;

import com.example.review.domain.User;
import com.example.review.feature.user.dto.UserRequest;
import com.example.review.feature.user.dto.UserResponse;
import com.example.review.feature.user.dto.UserUpdateRequest;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User fromRequest(UserRequest request);

    UserResponse toResponse(User user);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateUserFromRequest(@MappingTarget User user, UserUpdateRequest userUpdateRequest);


}
