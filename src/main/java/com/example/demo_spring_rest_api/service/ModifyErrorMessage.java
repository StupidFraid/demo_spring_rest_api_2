package com.example.demo_spring_rest_api.service;

import com.example.demo_spring_rest_api.model.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ResourceBundle;

@Service
@RequiredArgsConstructor
@Qualifier("ModifyErrorMessage")
public class ModifyErrorMessage implements MyModifyService{
    @Override
    public Response modify(Response response){
        response.setErrorMessage("Что-то сломалось");

        return response;
    }
}
