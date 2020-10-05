package com.example.restfulwebservice.helloworld;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//lombok -> setter, getter 등을 자동 생성 해줌
@Data
@AllArgsConstructor // 생성자를 자동 생성
@NoArgsConstructor
public class HelloWorldBean {
    private String message;
}
