package com.driver;

class A{
    String meth(){
        return "Invoking method from class A";
    }
}

class B extends A{
    String meth(){
        return "Method is overridden in Extendend class B";
    }
}
public class Main {
  public static void main(String[]args){
      A b1= new B();
      b1.meth();
       B b2 = new B();
       b2.meth();
  }
}