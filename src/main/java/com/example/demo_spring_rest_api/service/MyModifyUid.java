package com.example.demo_spring_rest_api.service;

import com.example.demo_spring_rest_api.model.Response;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("ModifyUid")
public class MyModifyUid implements MyModifyService{
    @Override
    public Response modify(Response response){
        response.setUid("New uid");
        return response;
    }
}
