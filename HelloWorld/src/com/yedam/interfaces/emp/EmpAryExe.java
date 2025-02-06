package com.yedam.interfaces.emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/*
 * 배열활용
 */
public class EmpAryExe implements EmpDAO {

	Employee[] employees = new Employee[10]; // 저장

	@Override
	public boolean registerEmp(Employee emp) {
		for (int i = 0; i < employees.length; i++) {
			// 빈공간에 추가
			if (employees[i] == null) {
				employees[i] = emp;
				return true; // 정상등록
			}
		}
		return false; // 등록실패
	}

	@Override
	public boolean modifyEmp(Employee emp) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for (int i = 0; i < empList.size(); i++) {
			// 사원번호 비교
			if (employees[i] != null && employees[i].getEmpNo() == emp.getEmpNo()) {
				// 연락처값이 ""이 아닐 때 변경
				if (!emp.getTelNo().equals("")) {
					employees[i].setTelNo(emp.getTelNo());
				}
				try {
					// 값을 변경 안하려고 엔터("")일 경우 1900-01-01
					if (emp.getHireDate().equals(sdf.parse("1900-01-01"))) {
						employees[i].setHireDate(emp.getHireDate());
					}
				} catch (ParseException e) {
					e.printStackTrace();
				}
				// 급여변경을 안하려고 엔터만 입력했을때에는 급여변경 안함
				if (emp.getSalary() != 0) {
					employees[i].setSalary(emp.getSalary());
				}
				return true; // 정상수정
			}
		}
		return false; // 수정못함
	}

	@Override
	public boolean removeEmp(int empNo) {
		for (int i = 0; i < employees.length; i++) {
			// index 사용
			if (employees[i] != null && employees[i].getEmpNo() == empNo) {
				employees[i] = null;
				return true; // 정상삭제
			}
		}
		return false; // 삭제못함
	}

	@Override
	public Employee[] search(Employee emp) {
		// sal 보다 급여가 많은
		Employee[] result = new Employee[10];
		int idx = 0;

		/*
		 * for (int i = 0; i < empList.size(); i++) { if (empList.get(i).getSalary() >=
		 * emp.getSalary()) { result[idx] = empList.get(i); idx++; // 0부터 1씩 증가되도록 } }
		 */
		String name = emp.getEmpName();
		for (int i = 0; i < employees.length; i++) {
			// index 사용
			if (employees[i] != null && employees[i].getEmpName().indexOf(emp.getEmpName()) > -1) {
				result[idx] = employees[i];
				idx++; // 0부터 1씩 증가되도록
			}
			

		}
		return result;
	}
}
