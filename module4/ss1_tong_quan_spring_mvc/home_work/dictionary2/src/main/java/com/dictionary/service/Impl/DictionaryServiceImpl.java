package com.dictionary.service.Impl;

import com.dictionary.service.IDictionaryService;
import org.springframework.stereotype.Service;

@Service
public class DictionaryServiceImpl implements IDictionaryService {



    @Override
    public String translate(String eng) {
        String vietNam = "";
        switch (eng){
            case "hello":
                vietNam = "xin chào";
                break;
            case "dog":
                vietNam = "chó";
                break;
            default:
                vietNam = "xin nhập vào";
                break;
        }
        return vietNam;
    }
}
