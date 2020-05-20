package com.chryseis.securities.web.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: SecuritiesApi
 * Inside the package - com.chryseis.securities.web.api
 * Created Date: 5/20/2020
 * Created Time: 2:31 PM
 **/
@Tag(name = "investor-securities", description = "The chryseis investor securities API")
public interface SecuritiesApi {

    @Operation(
            summary = "Find Security Detail",
            description = "Find the security detail by security symbol",
//            tags = {
//                    "product"
//            },
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Successful Operation",
                            content = {
                                    @Content(
                                            schema = @Schema(implementation = String.class)
                                    )
                            }
                    )
            }
    )
    @GetMapping(value = "/securities/{tickerSymbol}",produces = {"application/json"})
    ResponseEntity<String> getSecurtityDetail(@PathVariable  String tickerSymbol);
}
