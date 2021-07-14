package com.example.restfulwebservice.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@AllArgsConstructor
@JsonIgnoreProperties(value = {"password", "ssn"}) // 두 필드는 숨김 처리
public class User {
    private Integer id;

    @Size(min=2, message="Name은 2글자 이상 입력해 주세요.")
    private String name;
    @Past
    private Date joinDate;

    // @JsonIgnore // 개별 필드에 대해 숨김 처리
    private String password; // 외부에 노출 하고 싶지 않은 데이터 (jackson 사용)
    // @JsonIgnore
    private String ssn;      // 외부에 노출 하고 싶지 않은 데이터 (jackson 사용)
}
