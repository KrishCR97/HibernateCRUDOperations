package com.cr7.hibernateCRUD;

public class Dept {
private int deptNo;
private String Dname;
private String loc;
/**
 * @return the deptNo
 */
public int getDeptNo() {
	return deptNo;
}
/**
 * @param deptNo the deptNo to set
 */
public void setDeptNo(int deptNo) {
	this.deptNo = deptNo;
}
/**
 * @return the dname
 */
public String getDname() {
	return Dname;
}
/**
 * @param dname the dname to set
 */
public void setDname(String dname) {
	Dname = dname;
}
/**
 * @return the loc
 */
public String getLoc() {
	return loc;
}
/**
 * @param loc the loc to set
 */
public void setLoc(String loc) {
	this.loc = loc;
}
public String toString() {
	return "Object of Dept";
}
}
