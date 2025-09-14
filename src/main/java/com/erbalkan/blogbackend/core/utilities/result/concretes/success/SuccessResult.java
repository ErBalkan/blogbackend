package com.erbalkan.blogbackend.core.utilities.result.concretes.success;

import com.erbalkan.blogbackend.core.utilities.result.concretes.Result;

public class SuccessResult extends Result {

    public SuccessResult() {
        super(true);
    }

    public SuccessResult(String message){
        super(true,message);
    }

}
