package com.peter.Peter.mapper;

import com.peter.Peter.dto.request.RoleRequest;
import com.peter.Peter.dto.response.RoleResponse;
import com.peter.Peter.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);
}