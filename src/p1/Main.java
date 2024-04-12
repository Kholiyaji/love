package p1;

import p2.dpackage;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends SameClass {
 public int a=10;
 private int b=10;
 protected int c=10;
 int d=10;
    public static void main(String[] args) {
   Main obj=new Main();
   Nonsubclass non=new Nonsubclass();
   obj.display();
   System.out.println(obj.a+" "+obj.b);
   System.out.println(non.k);
   dpackage dp=new dpackage();
   // private method from different package dp.privatediff();
        SameClass sc=new SameClass();
       //protected class sc.show();
   dp.diff();
    }
}