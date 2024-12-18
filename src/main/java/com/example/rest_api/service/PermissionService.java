package com.example.rest_api.service;

import com.example.rest_api.database.model.PermissionEntity;
import com.example.rest_api.database.repository.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PermissionService {
    private final PermissionRepository permissionRepository;

    @Autowired
    public PermissionService(PermissionRepository permissionRepository) {
        this.permissionRepository = permissionRepository;
    }

    public void save(PermissionEntity permissionEntity) {
        this.permissionRepository.save(permissionEntity);
    }
}
