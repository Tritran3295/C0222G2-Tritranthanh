package com.productvalidate.service;

import com.productvalidate.model.HostProduct;

import java.util.List;

public interface IHostProductService {
    List<HostProduct> selectAll();
}
