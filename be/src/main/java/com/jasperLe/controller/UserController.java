//package com.peter.Peter.controller;
//
//import java.util.List;
//
//import com.peter.Peter.dto.request.ApiResponse;
//import com.peter.Peter.dto.request.UserCreationRequest;
//import com.peter.Peter.dto.request.UserUpdateRequest;
//import com.peter.Peter.dto.response.UserResponse;
//import com.peter.Peter.service.UserService;
//import jakarta.validation.Valid;
//import org.springframework.web.bind.annotation.*;
//import lombok.AccessLevel;
//import lombok.RequiredArgsConstructor;
//import lombok.experimental.FieldDefaults;
//import lombok.extern.slf4j.Slf4j;
//
//@RestController
//@RequestMapping("/users")
//@RequiredArgsConstructor
//@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
//@Slf4j
//public class UserController {
//    UserService userService;
//
//    @PostMapping
//    ApiResponse<UserResponse> createUser(@RequestBody @Valid UserCreationRequest request) {
//        return ApiResponse.<UserResponse>builder()
//                .result(userService.createUser(request))
//                .build();
//    }
//
//    @GetMapping
//    ApiResponse<List<UserResponse>> getUsers() {
//        return ApiResponse.<List<UserResponse>>builder()
//                .result(userService.getUsers())
//                .build();
//    }
//
//    @GetMapping("/{userId}")
//    ApiResponse<UserResponse> getUser(@PathVariable("userId") String userId) {
//        return ApiResponse.<UserResponse>builder()
//                .result(userService.getUser(userId))
//                .build();
//    }
//
//    @GetMapping("/my-info")
//    ApiResponse<UserResponse> getMyInfo() {
//        return ApiResponse.<UserResponse>builder()
//                .result(userService.getMyInfo())
//                .build();
//    }
//
//    @DeleteMapping("/{userId}")
//    ApiResponse<String> deleteUser(@PathVariable String userId) {
//        userService.deleteUser(userId);
//        return ApiResponse.<String>builder().result("User has been deleted").build();
//    }
//
//    @PutMapping("/{userId}")
//    ApiResponse<UserResponse> updateUser(@PathVariable String userId, @RequestBody UserUpdateRequest request) {
//        return ApiResponse.<UserResponse>builder()
//                .result(userService.updateUser(userId, request))
//                .build();
//    }
//}