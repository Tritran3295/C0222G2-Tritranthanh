package com.codegym.service.Impl;

import com.codegym.service.ICurrencyService;
import org.springframework.stereotype.Service;

@Service
public class CurrencyServiceImpl implements ICurrencyService {
    @Override
    public int exchange(int usd, int rate) {
        return usd * rate;
    }
}
