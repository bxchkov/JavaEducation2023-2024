package com.spingboot.SpringBoot.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.spingboot.SpringBoot.model.Response;

import java.awt.geom.RectangularShape;

@Service
@Qualifier("ModifyUid")
public class ModifyUid implements MyModifyService{
    @Override
    public Response modify(Response response){

        response.setUid("New Uid");

        return response;
    }
}
