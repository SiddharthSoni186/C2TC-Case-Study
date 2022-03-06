package com.tns.application;
import com.tns.framework.NormalAcc;
public class GSNormalAcc extends NormalAcc 
{
	private static float deliveryCharges;
	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm,charges, deliveryCharges);
		
	}

	public GSNormalAcc()
	{
	  super(accNo, accNm,charges, deliveryCharges);
	}
public void bookProduct(float charges)

	{
	System.out.println("Dear Normal USer,Your charges are: "+charges+" with Delivery Charges is:"+ deliveryCharges);

	}
@override
public String toString() {  return "GSNormalAcc [deliveryCharge=" + getDeliveryCharge() + ", toString()=" + super.toString() + ", getClass()="    + getClass() + ", hashCode()=" + hashCode() + "]"; }

}
