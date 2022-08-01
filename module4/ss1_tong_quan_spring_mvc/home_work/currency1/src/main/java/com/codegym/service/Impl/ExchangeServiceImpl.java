package com.codegym.service.Impl;

import com.codegym.service.ExchangeService;
import org.springframework.stereotype.Service;

@Service
public class ExchangeServiceImpl implements ExchangeService {

    @Override
    public int exchange(int usd, int rate) {
        return usd * rate ;
    }
}
