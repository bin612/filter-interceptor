package com.example.filter.dto;

import lombok.*;

@Data // getter, setter, tostring 까지 만들어주는 어노테이션
@NoArgsConstructor // 기본생성자를 뜻 함
@AllArgsConstructor // 전체 생성자
public class User {
    private String name;
    private int age;
}
