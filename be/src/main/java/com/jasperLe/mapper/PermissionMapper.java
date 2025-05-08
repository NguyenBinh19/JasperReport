package com.jasperLe.mapper;

import com.jasperLe.dto.request.PermissionRequest;
import com.jasperLe.dto.response.PermissionResponse;
import com.jasperLe.entity.Permission;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);
}