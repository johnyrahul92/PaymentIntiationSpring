package com.gbk.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gbk.beans.requests.PaymentInitiationActivateBeneficiaryRequest;
import com.gbk.beans.requests.PaymentInitiationBeneficiaryRequest;
import com.gbk.beans.requests.PaymentInitiationVerifyBeneficiaryRequest;
import com.gbk.beans.response.PaymentInitiationActivateBeneficiaryResponse;
import com.gbk.beans.response.PaymentInitiationBeneficiaryResponse;
import com.gbk.beans.response.PaymentInitiationVerifyBeneficiaryResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("/v1/payment-initiation")
@Api(value = "paymentInitiation")
@CrossOrigin
public class PaymentInitiationController {

    @Produce
    private ProducerTemplate camelTemplate;

    @PostMapping("/activate-beneficiary")
    @Consumes("Application/json")
    @Produces("Application/json")
    @ApiOperation(value = "To activate beneficiary", response = PaymentInitiationActivateBeneficiaryResponse.class)
    public PaymentInitiationActivateBeneficiaryResponse activateBeneficiary(@RequestBody PaymentInitiationActivateBeneficiaryRequest activateBeneficiaryRequest, @RequestHeader Map<String, Object> headers) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        //Calling apache service by sending requestBody as a string
        Object referenceData =  camelTemplate.requestBodyAndHeaders("direct:activateBeneficiary", mapper.writeValueAsString(activateBeneficiaryRequest), headers);

        //Converting the return body from xml to response POJO class
        return mapper.readValue(referenceData.toString(), PaymentInitiationActivateBeneficiaryResponse.class);
    }

    @PostMapping("/beneficiary")
    @Consumes("Application/json")
    @Produces("Application/json")
    @ApiOperation(value = "To add beneficiary in IVR Local System once it is created in OLB", response = PaymentInitiationBeneficiaryResponse.class)
    public PaymentInitiationBeneficiaryResponse beneficiary(@RequestBody PaymentInitiationBeneficiaryRequest beneficiaryRequest) {

        PaymentInitiationBeneficiaryResponse paymentInitiationBeneficiaryResponse = new PaymentInitiationBeneficiaryResponse();

        paymentInitiationBeneficiaryResponse.setStatusCode("0");
        paymentInitiationBeneficiaryResponse.setStatusDescription("SUCCESS");
        paymentInitiationBeneficiaryResponse.setReferenceNo("000001");

        return paymentInitiationBeneficiaryResponse;
    }

    @PostMapping("/verify-beneficiary")
    @Consumes("Application/json")
    @Produces("Application/json")
    @ApiOperation(value = "To verify Beneficiary", response = PaymentInitiationVerifyBeneficiaryResponse.class)
    public PaymentInitiationVerifyBeneficiaryResponse verifyBeneficiary(@RequestBody PaymentInitiationVerifyBeneficiaryRequest verifyBeneficiaryRequest) {

        PaymentInitiationVerifyBeneficiaryResponse paymentInitiationVerifyBeneficiaryResponse = new PaymentInitiationVerifyBeneficiaryResponse();

        paymentInitiationVerifyBeneficiaryResponse.setStatusCode("0");
        paymentInitiationVerifyBeneficiaryResponse.setStatusDescription("SUCCESS");
        paymentInitiationVerifyBeneficiaryResponse.setReferenceNo("000002");
        paymentInitiationVerifyBeneficiaryResponse.setHolderName("GBK");
        paymentInitiationVerifyBeneficiaryResponse.setCurrency("KWD");

        return paymentInitiationVerifyBeneficiaryResponse;
    }
}
