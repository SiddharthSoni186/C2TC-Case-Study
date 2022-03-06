package com.tns.entry;

import com.tns.application.*;

public class EntryPoint {
 public static void main(String[] args) 
 { //The value are Assigning
  GSShopFactory gsfact= new  GSShopFactory();
  
  gsfact.getNewPrimeAccount(33, "Siddharth", 1000, true);
  gsfact.getNewNormalAccount(66, "Sidd", 5000, 70);
  
 // Instantiating GSPrimeAcc
  
  GSPrimeAcc gsprime=new GSPrimeAcc(0, null, 0, false);
  gsprime.getAccNm();
  gsprime.getAccNo();
  gsprime.getCharges();
  
      // executing bookproduct method
       gsprime.bookProduct(1000);
       
  //executing tostring method
       gsprime.toString();
  
  
 // Instantiating GSNormalAcc 
  
  GSNormalAcc gsnormal=new GSNormalAcc();
  
  gsnormal.getAccNm();
  gsnormal.getAccNo();
  gsnormal.getDeliveryCharge();
  gsnormal.getCharges();
  
  // executing bookproduct method
      gsnormal.bookProduct(5000);
      
      //executing the tostring method
      gsnormal.toString();
 
  
 }
}
