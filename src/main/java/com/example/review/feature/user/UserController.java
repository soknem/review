package com.example.review.feature.user;

import com.example.review.feature.user.dto.UserRequest;
import com.example.review.feature.user.dto.UserResponse;
import com.example.review.feature.user.dto.UserUpdateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    @PostMapping("")
    void createUser(@RequestBody UserRequest userRequest) {
        userService.createUser(userRequest);
    }

    @GetMapping("")
    Page<UserResponse> getUser(

            @RequestParam int pageSize,
            @RequestParam int pageNumber
    ) {

        return userService.getAllUsers(pageNumber, pageSize);
    }

    @GetMapping("/{email}")
    UserResponse getUserByEmail(@PathVariable String email) {

        return userService.getUserByEmail(email);
    }

    @DeleteMapping("/{email}")
    void deleteUser(@PathVariable String email) {

        userService.deleteByEmail(email);
    }


    @PatchMapping("/{email}")
    UserResponse updateUserByEmail(@PathVariable String email, @RequestBody UserUpdateRequest userUpdateRequest) {

        return userService.updateByEmail(email, userUpdateRequest);
    }

}
//controller get request from client[5]

//dto[2]

//service implement logic[3]

//repository use for interaction with database[4]

//model (domain) use for create table in database[1]