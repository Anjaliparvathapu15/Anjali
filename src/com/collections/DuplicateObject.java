package com.collections;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
class Customer{
	int cid;
	String cname;
	Customer(int cid,String cname){
		this.cid=cid;
		this.cname=cname;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(cid,cname);
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(!(obj instanceof Customer)) {
			return false;
		}
		Customer other=(Customer)obj;
		return cid==other.cid && Objects.equals(other.cname, cname);
	}
}
public class DuplicateObject {

	public static void main(String[] args) {
		Customer c1=new Customer(101,"Anjali");
		Customer c2=new Customer(101,"Anjali");
		Customer c3=new Customer(102,"Teja");
		Customer c4=new Customer(103,"Vinay");
		Set<Customer>set=new LinkedHashSet<>();
		set.add(c1);
		set.add(c2);
		set.add(c3);
		set.add(c4);
		for(Customer c:set) {
		System.out.println(c);
		}

	}

}
