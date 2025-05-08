package com.jasperLe.mapper;

import com.jasperLe.dto.request.UserCreationRequest;
import com.jasperLe.dto.request.UserUpdateRequest;
import com.jasperLe.dto.response.UserResponse;
import com.jasperLe.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

    UserResponse toUserResponse(User user);

    @Mapping(target = "roles", ignore = true)
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}