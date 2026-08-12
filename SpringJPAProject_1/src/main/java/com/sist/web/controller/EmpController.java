package com.sist.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;
import com.sist.web.entity.*;
import com.sist.web.repository.*;
import com.sist.web.entity.QEmp;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
@Controller
@RequiredArgsConstructor
public class EmpController {
   private final EmpMethodRepository eDao;
   private final EmpJpqlRepository eDao2;
   private final EntityManager em;
   private final EmpQueryRepository eDao3;
   
   @GetMapping("/emp")
   public void emp_method()
   {
	   //Emp emp=eDao.findByEmpno(7788);
	   //List<Emp> list=eDao.findByEnameStartsWith("A");
	   //List<Emp> list=eDao.findByEnameEndsWith("N");
	   //List<Emp> list=eDao.findByEnameContains("K");
	   //List<Emp> list=eDao.findByOrderBySalDesc();
	   //List<Emp> list=eDao.findByJobAndSalGreaterThan("SALESMAN", 1000);
	   //List<Emp> list=eDao.findByDeptDnameContains("운");
	   //List<Emp> list=eDao2.empListData();
	   //List<Emp> list=eDao2.empEnameFind("SCOTT");
	   // => Service안에서 코딩 
	   /*String jpql="SELECT e FROM Emp e "
			      +"ORDER BY e.sal DESC";
	   List<Emp> list=em.createQuery(jpql,Emp.class)
			          .setMaxResults(3)
			          .getResultList();*/
		/*
		 * String jpql="SELECT DISTINCT e.job FROM Emp e"; List<String>
		 * list=em.createQuery(jpql,String.class) .getResultList(); for(String job:list)
		 * { System.out.println(emp.getEmpno()+" " +emp.getEname()+" " +emp.getJob()+" "
		 * +emp.getHiredate()+" " +emp.getSal()); System.out.println(job); }
		 */
	   /*Emp e=eDao3.findByEmpno(7788);
	   System.out.println(e.getEmpno()+" " +
	                      e.getEname()+" " +
			              e.getJob()+" "+
				          e.getHiredate()+" " +
			              e.getSal());	   */
	   List<Integer> list=eDao3.findDistinctSal();
	   System.out.println(list);
   }
}
