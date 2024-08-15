package com.example.review.feature.user;

import com.example.review.domain.User;
import com.example.review.feature.user.dto.UserRequest;
import com.example.review.feature.user.dto.UserResponse;
import com.example.review.feature.user.dto.UserUpdateRequest;
import com.example.review.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final UserMapper userMapper;

    @Override
    public void createUser(UserRequest userRequest) {

        User user = userMapper.fromRequest(userRequest);

        userRepository.save(user);
    }

    @Override
    public Page<UserResponse> getAllUsers(int pageNumber,int pageSize) {

        //create pagination with current pageNumber and pageSize of pageNumber
        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize);

        Page<User> users = userRepository.findAll(pageRequest);

        return users.map(user -> {
            return userMapper.toResponse(user);
        });
    }

    @Override
    public UserResponse getUserByEmail(String email) {

        User user = userRepository.findByEmail(email);

        return  userMapper.toResponse(user);

    }

    @Override
    public void deleteByEmail(String email) {

        User user = userRepository.findByEmail(email);

        userRepository.delete(user);
    }

    @Override
    public UserResponse updateByEmail(String email, UserUpdateRequest userUpdateRequest) {

        User user = userRepository.findByEmail(email);

        userMapper.updateUserFromRequest(user,userUpdateRequest);

        userRepository.save(user);

        return userMapper.toResponse(user);

    }
}
