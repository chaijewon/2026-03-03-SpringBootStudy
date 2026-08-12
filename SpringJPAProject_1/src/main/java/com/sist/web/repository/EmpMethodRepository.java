package com.sist.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sist.web.entity.Emp;
import java.util.*;
public interface EmpMethodRepository 
extends JpaRepository<Emp, Integer>{
   // findBy => WHERE 
   // 1. 상세보기 => empno 검색 
   // WHERE empno=?
   Emp findByEmpno(int empno);
   // 2. ename 검색 
   List<Emp> findByEname(String ename);
   // WHERE ename=?  ==> equals
   // 3. LIKE  => A%  %A%  %A
   List<Emp> findByEnameStartsWith(String ename);
   // WHERE ename Like '?%' => index가 적용 
   List<Emp> findByEnameEndsWith(String ename);
   // WHERE ename Like '%?'
   List<Emp> findByEnameContains(String ename);
   // WHERE ename Like '%?%'
   // 4. 비교 
   // 이상 GreaterThan / 이하 LessThan
   // WHERE sal>3000   sal>=3000 sal<2000 sal<=2000
   List<Emp> findBySalGreaterThanEqual(int sal);
   // WHERE sal>=?
   List<Emp> findBySalLessThanEqual(int sal);
   // Between => ? ?
   List<Emp> findBySalBetween(int min,int max);
   // WHERE sal BETWEEN ? AND ?
   // AND => JOB / SAL
   List<Emp> findByJobAndSalGreaterThan(String job,int sal);
   // WHERE job=? AND sal>?
   // OR 
   List<Emp> findByJobOrEname(String job,String ename);
   // WHERE job=? OR ename=?
   // 부서명으로 emp 검색 
   List<Emp> findByDeptDname(String dname);
   List<Emp> findByDeptLoc(String loc);
   // 부서명 Like
   List<Emp> findByDeptDnameContains(String loc);
   // 정렬
   List<Emp> findByOrderBySalDesc();
   // ORDER BY sal DESC
   // Top-N
   List<Emp> findTop3ByOrderBySalDesc();
   // WHERE rownum<=3 ORDER BY sal DESC 
   // 중복 제거 
   List<Emp> findDistinctByJob(String job);
   // Not NULL / null
   List<Emp> findByCommIsNull();
   // WHERE comm ISNULL
   List<Emp> findByCommIsNotNull();
   // WHERE conn ISNOTNULL
   // in
   List<Emp> findByDeptDeptnoIn(List<Integer> deptnos);
   // List<Integer> list=List.of(10,20,30)
   // not
   List<Emp> findByJobNot(String job);
   // WHERE NOT job=?
   // 메소드 규칙 
}
