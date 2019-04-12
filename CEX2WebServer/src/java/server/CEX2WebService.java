/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 *
 * @author Azhar
 */
@WebService(serviceName = "CEX2WebService")
public class CEX2WebService {

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
    @WebMethod(operationName = "addNameToServer")
    public String addNameToServer(@WebParam(name = "name") String name) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addStudentToServer")
    public String addStudentToServer(@WebParam(name = "s") server.Student s) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findLongestNameInServer")
    public String findLongestNameInServer() {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findStudentWithHighestGrade")
    public server.Student findStudentWithHighestGrade() {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getStringLength")
    public Integer getStringLength(@WebParam(name = "test") String test) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
  

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getStringLengthWithException")
    public Integer getStringLengthWithException(@WebParam(name = "test") String test) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "isConnected")
    public Integer isConnected() {
        System.out.println("[Server] Connection Test");
        return 0;
    }
}
