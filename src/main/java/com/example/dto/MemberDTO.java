package com.example.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.annotations.Insert;

import java.util.Date;

@Getter
@Setter
@ToString
public class MemberDTO {
    private Integer id;
    private String memberId;
    private String password;
    private String nickName;
    private boolean isAdmin;
    private Date createTime;
    private boolean isWithDraw;
    private Status status;
    private Date updateTime;


    public enum Status {
        DEFAULT, ADMIN, DELETED
    }
}