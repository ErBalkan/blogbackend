package com.erbalkan.blogbackend.core.utilities.result.concretes.success;

import com.erbalkan.blogbackend.core.utilities.result.concretes.DataResult;

public class SuccessDataResult<T> extends DataResult<T> {

    public SuccessDataResult(T data) {
        super(data, true);
    }
    public SuccessDataResult(T data, String message){
        super(data,true,message);
    }

}
