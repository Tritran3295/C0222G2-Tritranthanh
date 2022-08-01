package com.dictionary.service.Impl;

import com.dictionary.service.IDictionaryService;
import org.springframework.stereotype.Service;

@Service
public class DictionaryServiceImpl implements IDictionaryService {

    @Override
    public String findDictionary(String eng) {
        String vietnam = "";
        switch (eng) {
            case "hello":
                vietnam += "xin chào";
                break;
            case "chicken":
                vietnam += "con gà tài";
                break;
            case "dog":
                vietnam += "gâu gâu";
                break;
            default:
                vietnam += " nhập vào đi bạn ơi";
                break;
        }
        return vietnam;
    }
}
