package com.example.productupdate.service.Impl;

import com.example.productupdate.model.HostProduct;
import com.example.productupdate.repository.IHostProductRepository;
import com.example.productupdate.service.IHostProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HostProductServiceImpl implements IHostProductService {
    @Autowired
    private IHostProductRepository hostProductRepository;

    @Override
    public List<HostProduct> selectALl() {
        return hostProductRepository.findAll();
    }
}
