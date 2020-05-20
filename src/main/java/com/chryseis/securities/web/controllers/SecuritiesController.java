package com.chryseis.securities.web.controllers;

import com.chryseis.securities.web.api.SecuritiesApi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: SecuritiesController
 * Inside the package - com.chryseis.securities.web.controllers
 * Created Date: 5/20/2020
 * Created Time: 2:35 PM
 **/
@RestController
public class SecuritiesController implements SecuritiesApi {

    @Override
    public ResponseEntity<String> getSecurtityDetail(String tickerSymbol) {
        return new ResponseEntity("Hello this is security", HttpStatus.OK);
    }
}
