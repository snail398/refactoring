package com.team.sarafanka.sarafun_refactoring.transfer_layer;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.team.sarafanka.sarafun_refactoring.Constants;
import com.team.sarafanka.sarafun_refactoring.dto.AccountDTO;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;

import io.reactivex.Observable;


public class  NetworkImpl implements DataTransfer {



    //GET-запрос с помощью Spring
    @Override
    public AccountDTO getDataAccount(String requestString){
        RestTemplate template = new RestTemplate();
        ParameterizedTypeReference<AccountDTO> typeRef = new ParameterizedTypeReference<AccountDTO>() {};
        ResponseEntity<AccountDTO> responseEntity = template.exchange(Constants.URL.HOST+requestString, HttpMethod.GET,null,typeRef);
        return responseEntity.getBody();
    }

    public List<Integer> getListOfInteger(String requestString){
        RestTemplate template = new RestTemplate();
        ParameterizedTypeReference<List<Integer>> typeRef = new ParameterizedTypeReference<List<Integer>>() {};
        ResponseEntity<List<Integer>> responseEntity = template.exchange(Constants.URL.HOST+requestString, HttpMethod.GET,null,typeRef);
        return responseEntity.getBody();
    }
}
