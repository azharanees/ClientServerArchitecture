/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial;

/**
 *
 * @author Azhar
 */
public class MyClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           MyClient m = new MyClient();

        // TODO code application logic here
        m.executeTest();
    }
    
    private void executeTest(){
        
        System.out.println("[Client] - Test has started...");
        
        if(testConnection()==0){
                    System.out.println("[Client] - Connected to the server");

        }else{
                                System.out.println("[Client] - Could not connect to the server");

        }
        System.out.println("[Client] - Test completed");

        
        
    }

    private static Integer addPerson(tutorial.Person person) {
        tutorial.TestWebService_Service service = new tutorial.TestWebService_Service();
        tutorial.TestWebService port = service.getTestWebServicePort();
        return port.addPerson(person);
    }

    private static Integer addString(java.lang.String str) {
        tutorial.TestWebService_Service service = new tutorial.TestWebService_Service();
        tutorial.TestWebService port = service.getTestWebServicePort();
        return port.addString(str);
    }

    private static String findShortestAmongStrings() {
        tutorial.TestWebService_Service service = new tutorial.TestWebService_Service();
        tutorial.TestWebService port = service.getTestWebServicePort();
        return port.findShortestAmongStrings();
    }

    private static String findShortestBetween(java.lang.String a, java.lang.String b) {
        tutorial.TestWebService_Service service = new tutorial.TestWebService_Service();
        tutorial.TestWebService port = service.getTestWebServicePort();
        return port.findShortestBetween(a, b);
    }

    private static String findShortestBetweenWithException(java.lang.String a, java.lang.String b) throws Exception_Exception {
        tutorial.TestWebService_Service service = new tutorial.TestWebService_Service();
        tutorial.TestWebService port = service.getTestWebServicePort();
        return port.findShortestBetweenWithException(a, b);
    }

    private static Integer testConnection() {
        tutorial.TestWebService_Service service = new tutorial.TestWebService_Service();
        tutorial.TestWebService port = service.getTestWebServicePort();
        return port.testConnection();
    }
    
}
