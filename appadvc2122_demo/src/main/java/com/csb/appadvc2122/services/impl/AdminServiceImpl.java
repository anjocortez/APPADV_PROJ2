package com.csb.appadvc2122.services.impl;

import com.csb.appadvc2122.dto.AdminDTO;
import com.csb.appadvc2122.model.Admin;
import com.csb.appadvc2122.repository.AdminRepository;
import com.csb.appadvc2122.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminRepository adminRepository;

    @Override
    public List<AdminDTO> list() {
        return StreamSupport.stream(adminRepository.findAll().spliterator(), false)
                .map(AdminDTO::new)
                .collect(Collectors.toList());
    }

    @Override
    public void add(AdminDTO adminDTO) {
        adminRepository.save(new Admin(adminDTO));
    }


    @Override
    public AdminDTO get(Long id) {
        return new AdminDTO(adminRepository.findById(id).get());
    }

    @Override
    public void update(AdminDTO updatedUser) {
        adminRepository.save(new Admin(updatedUser));
    }

    @Override
    public void delete(Long id) { adminRepository.deleteById(id); }

}