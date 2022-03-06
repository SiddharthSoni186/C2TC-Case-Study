package com.tns.framework;

public class ShopAcc {
	
	protected static int accNo;
	protected static String accNm;
	protected static float charges;
	
	
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		ShopAcc.accNo = accNo;
	}
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		ShopAcc.accNm = accNm;
	}
	public float getCharges() {
		return charges;
	}
	public void setCharges(float charges) {
		ShopAcc.charges = charges;
	}
	
	
	
	public ShopAcc(int accNo, String accNm, float charges) 
	{
        super();
		ShopAcc.accNo = accNo;
		this.setAccNm(accNm);
		ShopAcc.charges = charges;
	}
	public void bookProduct(float charges)
	{
		System.out.println("Product booked and charges are:"+charges);
	}
	public void items(float charges)
	{
		System.out.println("Items are delivered with charges :"+charges);
	}
	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + getAccNm() + ", charges=" + charges + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}