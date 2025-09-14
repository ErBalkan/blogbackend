package com.erbalkan.blogbackend.core.utilities.result.concretes.error;

import com.erbalkan.blogbackend.core.utilities.result.concretes.Result;

public class ErrorResult extends Result{

    public ErrorResult(){
        super(false);
    }
    public ErrorResult(String message){
        super(false,message);
    }
}
