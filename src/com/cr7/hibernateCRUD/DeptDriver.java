package com.cr7.hibernateCRUD;


public class DeptDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeptImpl deptImpl = new DeptImpl();
		Dept dept = new Dept();
		dept.setDeptNo(97);
		dept.setDname("CR7");
		dept.setLoc("Portugal");
		deptImpl.saveDepartment(dept);
	}

}
