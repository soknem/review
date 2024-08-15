package com.example.review.feature.user;

import com.example.review.feature.user.dto.UserRequest;
import com.example.review.feature.user.dto.UserResponse;
import com.example.review.feature.user.dto.UserUpdateRequest;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserService {

    void createUser(UserRequest userRequest);

    Page<UserResponse> getAllUsers(int pageNumber, int pageSize);

    UserResponse getUserByEmail(String email);

    void deleteByEmail(String email);

    UserResponse updateByEmail(String email, UserUpdateRequest userUpdateRequest);

}
