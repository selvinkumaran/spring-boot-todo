package com.spring.springboottodo.request;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TodoRequest {
    private int id;
    private String item;
    private int user_Id;
}
