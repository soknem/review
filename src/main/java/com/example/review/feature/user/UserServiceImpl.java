package com.example.review.feature.user;

import com.example.review.domain.User;
import com.example.review.feature.user.dto.UserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Override
    public void createUser(UserRequest userRequest) {

        User user = new User();

        user.setName(userRequest.name());

        user.setAge(userRequest.age());

        user.setEmail(userRequest.email());

        userRepository.save(user);
    }
}
