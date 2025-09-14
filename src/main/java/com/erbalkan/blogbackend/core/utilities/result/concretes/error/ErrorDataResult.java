package com.erbalkan.blogbackend.core.utilities.result.concretes.error;

import com.erbalkan.blogbackend.core.utilities.result.concretes.DataResult;

public class ErrorDataResult<T> extends DataResult<T> {

    public ErrorDataResult(T data) {
        super(data, false);
    }
    public ErrorDataResult(T data, String message){
        super(data,false,message);
    }

}
