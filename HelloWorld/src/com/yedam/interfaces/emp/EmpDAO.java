package com.yedam.interfaces.emp;

import java.util.ArrayList;
import java.util.List;

/*
 * 등록, 수정, 삭제, 조회
 */
public interface EmpDAO {
	
	List<Employee> empList = new ArrayList<Employee>(); //저장공간
	
	//등록
	public boolean registerEmp(Employee emp);
	//수정
	public boolean modifyEmp(Employee emp);
	//삭제
	public boolean removeEmp(int empNo);
	//조회
	public List<Employee> search(Employee emp);
}
