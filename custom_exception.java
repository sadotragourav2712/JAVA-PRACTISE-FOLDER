// class hello extends Exception{
//     int a;
//     hello(int a){
//         this.a=a;
//     }
//     public String toString(){
//         return "hello ("+a+")";
//     }
// }
// public class custom_exception {public static void main(String[]args){
//     int a=10;
//     int b=-5;
//     int z=a*b;
//     try{
//     if(z<0){
//         throw new hello(z);
//     }
// }
// catch(hello e){
//     System.out.println("caught exception");
// }
// }
// }

import java.util.*;
public class custom_exception{
    public static void main(String[]args){
        int a=10;try{
            if(a<18){
                throw new Exception("Not valid");
            }
        }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
