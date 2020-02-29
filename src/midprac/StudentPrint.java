/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midprac;


/**
 *
 * @author HONEY Sanotra
 * java programming
 */
public class StudentPrint 
{
    public static void main(String[] args) 
    {
          MidPrac[] stu=new MidPrac[2]; // array of objects
          MidPrac s1=new MidPrac(); //obj 1
          s1.setName("Honey Sanotra");
          s1.setId(1122);
          stu[0]=s1; // assigining objects to array of objects
          MidPrac s2=new MidPrac();
          s2.setName("JAVA"); // obj 2
          s2.setId(1123);
          stu[1]=s2; // assigining objects to array of objects
           
          // printing results
          for(int i=0;i<stu.length;i++)
          {
              System.out.println(stu[i].getName()+" "+stu[i].getId());
          }       
    }
}
