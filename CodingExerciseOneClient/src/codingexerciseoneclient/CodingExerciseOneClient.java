/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingexerciseoneclient;

/**
 *
 * @author Azhar
 */
public class CodingExerciseOneClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CodingExerciseOneClient c = new CodingExerciseOneClient();
        c.executeTest();
        // TODO code application logic here
    }
    
    public void executeTest(){
        System.out.println("[Client] - Test Starting ....");
        codingexerciseoneclient.TestWebService_Service service = new codingexerciseoneclient.TestWebService_Service();
        codingexerciseoneclient.TestWebService port = service.getTestWebServicePort();
        if(port.testConnection()){
           System.out.println("[Client] - Server has returned " + port.sendMessage("Hello !"));
        }else{
                       
           System.out.println("[Client] - Server is not reachable");

        }
                System.out.println("[Client] - Test Complete");

               
    }
    
}
