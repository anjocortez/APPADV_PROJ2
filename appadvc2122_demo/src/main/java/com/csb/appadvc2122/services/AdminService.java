package com.csb.appadvc2122.services;

import com.csb.appadvc2122.dto.AdminDTO;

import java.util.List;

public interface AdminService {

    List<AdminDTO> list();

    void add(AdminDTO admin);

    AdminDTO get(Long id);

    void update(AdminDTO updatedAdmin);

    void delete(Long id);
}