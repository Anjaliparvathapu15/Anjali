package com.langfundamental;

public class Amount {
	String Itemname="vivo";
	int Price=1000;
	int quantity=2;
	double totalcost;
	double discount=10;
	double discountamount;
	void totalamount() {
		totalcost=Price*quantity;
		System.out.println(totalcost);
	}
	void Discount() {
		discountamount=totalcost*(discount/100);
		totalcost=totalcost-discount;
		System.out.println(totalcost);
		System.out.println(discount);
		
	}
	public static void main(String[] args) {
		Amount t1=new Amount();
		t1.totalamount();
		t1.Discount();
     
	}

}
