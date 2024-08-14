package com.example.review.feature.user;

import com.example.review.feature.user.dto.UserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    @PostMapping("")
    //[POST] /api/v1/users
    void createUser(@RequestBody UserRequest userRequest){
        userService.createUser(userRequest);
    }

    @GetMapping("")
        //[GET] /api/v1/users
    void getUser(@RequestBody UserRequest userRequest){

    }

}
//controller get request from client[5]

//dto[2]

//service implement logic[3]

//repository use for interaction with database[4]

//model (domain) use for create table in database[1]