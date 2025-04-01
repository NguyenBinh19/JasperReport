package com.peter.Peter.mapper;

import com.peter.Peter.dto.request.PermissionRequest;
import com.peter.Peter.dto.response.PermissionResponse;
import com.peter.Peter.entity.Permission;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);
}