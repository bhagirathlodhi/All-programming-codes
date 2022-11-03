package com.practice;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	public static void main(String[] args) {
     List<Integer>empId = new ArrayList<Integer>();
     empId.add(10);
     empId.add(12);
     empId.add(13);
     empId.add(14);
     empId.add(15);
//     System.out.println("before = "+empId.size());
//     
//     empId.add(16);
//     System.out.println("After = "+empId.size());
//     
//     
//     System.out.println(empId.isEmpty());
     
     List<Integer>empId2 = new ArrayList<Integer>();
     empId2.add(56430);
     empId2.add(2340);
     empId2.addAll(empId);
     
    // System.out.println(empId2.remove());
     
//     for (Integer i : empId2) {
//		System.out.println(i);
//	}
     
	}

}
