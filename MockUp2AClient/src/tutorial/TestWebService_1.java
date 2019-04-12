
package tutorial;

import tutorial.*;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TestWebService", targetNamespace = "http://server/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TestWebService_1 {


    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findShortestBetween", targetNamespace = "http://server/", className = "tutorial.FindShortestBetween")
    @ResponseWrapper(localName = "findShortestBetweenResponse", targetNamespace = "http://server/", className = "tutorial.FindShortestBetweenResponse")
    @Action(input = "http://server/TestWebService/findShortestBetweenRequest", output = "http://server/TestWebService/findShortestBetweenResponse")
    public String findShortestBetween(
        @WebParam(name = "a", targetNamespace = "")
        String a,
        @WebParam(name = "b", targetNamespace = "")
        String b);

    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns java.lang.String
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findShortestBetweenWithException", targetNamespace = "http://server/", className = "tutorial.FindShortestBetweenWithException")
    @ResponseWrapper(localName = "findShortestBetweenWithExceptionResponse", targetNamespace = "http://server/", className = "tutorial.FindShortestBetweenWithExceptionResponse")
    @Action(input = "http://server/TestWebService/findShortestBetweenWithExceptionRequest", output = "http://server/TestWebService/findShortestBetweenWithExceptionResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://server/TestWebService/findShortestBetweenWithException/Fault/Exception")
    })
    public String findShortestBetweenWithException(
        @WebParam(name = "a", targetNamespace = "")
        String a,
        @WebParam(name = "b", targetNamespace = "")
        String b)
        throws Exception_Exception
    ;

    /**
     * 
     * @param str
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addString", targetNamespace = "http://server/", className = "tutorial.AddString")
    @ResponseWrapper(localName = "addStringResponse", targetNamespace = "http://server/", className = "tutorial.AddStringResponse")
    @Action(input = "http://server/TestWebService/addStringRequest", output = "http://server/TestWebService/addStringResponse")
    public Integer addString(
        @WebParam(name = "str", targetNamespace = "")
        String str);

    /**
     * 
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "testConnection", targetNamespace = "http://server/", className = "tutorial.TestConnection")
    @ResponseWrapper(localName = "testConnectionResponse", targetNamespace = "http://server/", className = "tutorial.TestConnectionResponse")
    @Action(input = "http://server/TestWebService/testConnectionRequest", output = "http://server/TestWebService/testConnectionResponse")
    public Integer testConnection();

    /**
     * 
     * @param person
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addPerson", targetNamespace = "http://server/", className = "tutorial.AddPerson")
    @ResponseWrapper(localName = "addPersonResponse", targetNamespace = "http://server/", className = "tutorial.AddPersonResponse")
    @Action(input = "http://server/TestWebService/addPersonRequest", output = "http://server/TestWebService/addPersonResponse")
    public Integer addPerson(
        @WebParam(name = "person", targetNamespace = "")
        Person person);

    /**
     * 
     * @return
     *     returns tutorial.Person
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findPersonWithLongestName", targetNamespace = "http://server/", className = "tutorial.FindPersonWithLongestName")
    @ResponseWrapper(localName = "findPersonWithLongestNameResponse", targetNamespace = "http://server/", className = "tutorial.FindPersonWithLongestNameResponse")
    @Action(input = "http://server/TestWebService/findPersonWithLongestNameRequest", output = "http://server/TestWebService/findPersonWithLongestNameResponse")
    public Person findPersonWithLongestName();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findShortestAmongStrings", targetNamespace = "http://server/", className = "tutorial.FindShortestAmongStrings")
    @ResponseWrapper(localName = "findShortestAmongStringsResponse", targetNamespace = "http://server/", className = "tutorial.FindShortestAmongStringsResponse")
    @Action(input = "http://server/TestWebService/findShortestAmongStringsRequest", output = "http://server/TestWebService/findShortestAmongStringsResponse")
    public String findShortestAmongStrings();

}
