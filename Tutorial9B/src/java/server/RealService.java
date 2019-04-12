/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Azhar
 */

@WebService(serviceName = "RealService")
public class RealService {
List<String> strings = new ArrayList<>();
List<Double> numbers = new ArrayList<>();
List<MyPoint3D> myPoints = new ArrayList<>();

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "isConnected")
    public String isConnected() {
        System.out.println("[SERVER] - testConnection");
        return "OK";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findShortestBetween")
    public String findShortestBetween(@WebParam(name = "a") String a, @WebParam(name = "b") String b) {
        //TODO write your implementation code here:
                        System.out.println("[SERVER] - findShortestBetween("+a+","+b+")");

        if(a.length()<b.length()){
            return a;
        }else{
            return b;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findShortestAmongAllStrings")
    public String findShortestAmongAllStrings() {
        
                        System.out.println("[SERVER] - finding ShortestIn "+ strings);

        //TODO write your implementation code here:
        String min = strings.get(0);
for(String a: strings){
    if(a.length()<min.length()){
        min = a;
    }
}
return min;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addTwoNumbers")
    public java.lang.Double addTwoNumbers(@WebParam(name = "d") Double d, @WebParam(name = "d0") Double d0) {
        //TODO write your implementation code here:
                                System.out.println("[SERVER] - Adding  "+d+" and" + d0);

       return d+d0;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addTwoNumbersWithException")
    public Double addTwoNumbersWithException(@WebParam(name = "d") Double d, @WebParam(name = "d0") Double d0) throws Exception {
        //TODO write your implementation code here:
                                        System.out.println("[SERVER] - Adding  "+d+" and" + d0 );

if(d==null || d0==0){
    throw new Exception();
}
return d+d0;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findShortestBetweenWithException")
    public String findShortestBetweenWithException(@WebParam(name = "a") String a, @WebParam(name = "b") String b) throws Exception {
        //TODO write your implementation code here:
                                System.out.println("[SERVER] - findShortestBetweenWithException("+a+","+b+")");

        if(a==null||b==null){
            throw new Exception();
        }
        if(a.length()<b.length()){
            return a;
        }else {
            return b;
        }
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addString")
    public String addString(@WebParam(name = "first_String") String first_String) {
        //TODO write your implementation code here:
                                System.out.println("[SERVER] - adding string ("+first_String+" to "+strings);

          strings.add(first_String);
          return "DONE";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addNumber")
    public String addNumber(@WebParam(name = "d") Double d) {
      System.out.println("[SERVER] - adding double ("+d+" to "+numbers);

        //TODO write your implementation code here:
        numbers.add(d);
        return "DONE";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "averageOfAllNumbers")
    public Double averageOfAllNumbers() {
              System.out.println("[SERVER] - finding average");

        //TODO write your implementation code here:
        double average = 0;
        for(Double d: numbers){
            average +=d.doubleValue();
        }
        return (average/numbers.size());
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addMyPoint3D")
    public String addMyPoint3D(@WebParam(name = "myPoint3D") MyPoint3D myPoint3D) {
                      System.out.println("[SERVER] - adding MyPoint3D into " + myPoints);

        //TODO write your implementation code here:
        myPoints.add(myPoint3D);
        
        return "DONE";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findPointWithHighestZ")
    public MyPoint3D findPointWithHighestZ() {
    System.out.println("[SERVER] - adding MyPoint3D into " + myPoints);
        //TODO write your implementation code here:
        MyPoint3D maxZ = myPoints.get(0);
        for(MyPoint3D point:myPoints){
            if(point.getZ()>maxZ.getZ()){
                maxZ = point;
            }
        }
        return maxZ;
    }
       
    
    
    
    
}
