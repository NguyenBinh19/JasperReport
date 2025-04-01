package com.peter.Peter.mapper;

import com.peter.Peter.dto.request.UserCreationRequest;
import com.peter.Peter.dto.request.UserUpdateRequest;
import com.peter.Peter.dto.response.UserResponse;
import com.peter.Peter.entity.User;
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