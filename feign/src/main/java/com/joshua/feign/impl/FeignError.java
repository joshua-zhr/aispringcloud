package com.joshua.feign.impl;

import com.joshua.entity.Student;
import com.joshua.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeignError implements FeignProviderClient {
    public Collection<Student> findAll() {
        return null;
    }

    public String index() {
        return "服务器维护中!";
    }
}
