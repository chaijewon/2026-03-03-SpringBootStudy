package com.sist.web.entity;
import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
/*
 *   1. DQL => SELECT => 검색 : 메소드 규칙 
 *             findByName(String name) => eq
 *              WHERE name=?
 *   2. DML => INSERT / UPDATE / DELETE
 *               |        |        |
 *               ----------      -------
 *                  | save       | delete
 */
@Entity
@Table(name="EMP")
@Getter
@Setter
public class Emp {
  @Id  // primary key 설정 
  private int empno;
  private String ename;
  private String job;
  private Integer mgr; // column안에 null값이 있는 경우 
  private Date hiredate;
  private int sal;
  private Integer comm;
  
  @ManyToOne
  @JoinColumn(name="deptno")
  private Dept dept;
}
