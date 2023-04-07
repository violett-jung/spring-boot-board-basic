package com.study.board.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //jpa가 Board테이블과 관련된 내용이구나 읽을 수 있음
@Data //lombok - getter,setter 등 만들어줌
public class Board {

    @Id //=pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) //mysql,mariadb에서 사용하는 전략
    private Integer id;
    private String title;
    private String content;
}
