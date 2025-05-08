package com.jasperLe.mapper;

import com.jasperLe.dto.request.RoleRequest;
import com.jasperLe.dto.response.RoleResponse;
import com.jasperLe.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);
}