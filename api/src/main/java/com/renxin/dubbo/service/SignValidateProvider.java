package com.renxin.dubbo.service;

import com.renxin.dubbo.model.SignData;
import com.renxin.dubbo.model.SignValidateRes;

public interface SignValidateProvider {
   SignValidateRes GetSignResult (SignData signData);
}
