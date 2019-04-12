/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Azhar
 */
@WebService(serviceName = "MockUpPrototypeService")
public class MockUpPrototypeService {
    ArrayList<String>   strings  =   new ArrayList<String>();

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
    public Boolean isConnected() {
        //TODO write your implementation code here:
        return true;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findShortestBetween")
    public String findShortestBetween(@WebParam(name = "string1") String string1, @WebParam(name = "string2") String string2) {
        String answer= null;
        if(string1.length()<string2.length()){
            answer=string1;
        }else{
            answer=string2;
        }
      return answer;  
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findShortestBetweenWithException")
    public String findShortestBetweenWithException(@WebParam(name = "a") String a, @WebParam(name = "b") String b) throws Exception {
        String answer= "";
        if(a==null){
            throw new Exception();
        }
        if(b==null){
           throw new Exception();

        }
        
        if(a.length()<b.length()){
            answer=a;
        }else{
            answer=b;
        }
      return answer; 
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addString")
    public String addString(@WebParam(name = "first_String") String first_String) {
        //TODO write your implementation code here:
        strings.add(first_String);
        return "DONE";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findShortestAmongAllStrings")
    public String findShortestAmongAllStrings() {
        //TODO write your implementation code here:
        String shortest = strings.get(0);
        for(int i = 0; i<strings.size()-1;i++){
            if(strings.get(i).length()<shortest.length()){
                shortest = strings.get(i);
            }
        }
        
        return shortest;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findShortestBetweenNameAndSurname")
    public String findShortestBetweenNameAndSurname(@WebParam(name = "person") Person person) {
       String shortest = "";
        if(person.name.length()<person.surname.length()){
            shortest = person.name;
        }else{
            shortest = person.surname;
        }
        return shortest;
    }
    
    
    
    
}
