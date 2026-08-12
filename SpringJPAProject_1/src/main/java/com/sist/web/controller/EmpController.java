package com.sist.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;
import com.sist.web.entity.*;
import com.sist.web.repository.*;

import lombok.RequiredArgsConstructor;
@Controller
@RequiredArgsConstructor
public class EmpController {
   private final EmpMethodRepository eDao;
   
   @GetMapping("/emp")
   public void emp_method()
   {
	   //Emp emp=eDao.findByEmpno(7788);
	   //List<Emp> list=eDao.findByEnameStartsWith("A");
	   //List<Emp> list=eDao.findByEnameEndsWith("N");
	   List<Emp> list=eDao.findByEnameContains("K");
	   for(Emp emp:list)
	   {
	   System.out.println(emp.getEmpno()+" "
			   +emp.getEname()+" "
			   +emp.getJob()+" "
			   +emp.getHiredate()+" "
			   +emp.getSal());
	   }
   }
}
