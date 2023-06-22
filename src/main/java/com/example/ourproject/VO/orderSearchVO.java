package com.example.ourproject.VO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
public class orderSearchVO {
    private String id;
    private int no;
    private Timestamp orderDate;
}
