package com.cr7.hibernateCRUD;

public interface IDept {
public abstract void saveDepartment(final Dept department);
public abstract void getCustomers(final int deptId);
}
