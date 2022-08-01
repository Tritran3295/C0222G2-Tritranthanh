package com.productvalidate.service.Impl;

import com.productvalidate.model.HostProduct;
import com.productvalidate.repository.IHostProductRepository;
import com.productvalidate.service.IHostProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HostProductServiceImpl implements IHostProductService {
    @Autowired
    private IHostProductRepository hostProductRepository;

    @Override
    public List<HostProduct> selectAll() {
        return hostProductRepository.findAll();
    }
}
