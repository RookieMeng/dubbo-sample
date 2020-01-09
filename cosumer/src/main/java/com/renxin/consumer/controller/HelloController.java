package com.renxin.consumer.controller;

import com.renxin.dubbo.model.SignData;
import com.renxin.dubbo.model.SignValidateRes;
import com.renxin.dubbo.service.HelloService;
import com.renxin.dubbo.service.SignValidateProvider;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @Reference
    private HelloService helloService;

    @Reference
    private SignValidateProvider signValidateProvider;


    @GetMapping("/hello")
    public String getName(String name) {
        return helloService.getName(name);
    }

    @GetMapping("/test")
    public String test() {
        SignData signData = new SignData();
        signData.setAs("dd");
        signData.setCp("ll");
        signData.setMac("ff");
        signData.setTimestamp(System.currentTimeMillis());
        SignValidateRes signValidateRes = signValidateProvider.GetSignResult(signData);
        System.out.println(signValidateRes);
        return signValidateRes.toString();
    }

}
