/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingexercisetwoclient;

/**
 *
 * @author Azhar
 */
public class CodingExerciseTwoClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CodingExerciseTwoClient c = new CodingExerciseTwoClient();
        c.executeTask(3);
        // TODO code application logic here
    }

    private void executeTask(int id) {
        codingexercisetwoclient.TestWebService_Service service = new codingexercisetwoclient.TestWebService_Service();
        codingexercisetwoclient.TestWebService port = service.getTestWebServicePort();
        System.out.println("[Client] - Test is Starting......");
        if(port.isConnected()){
                    System.out.println("[Client] - Test is recieved : " + port.sendMessage("Test001")+ " From client - " + port.sendId(id));

        }else{
                  System.out.println("[Client] - Connection coudn't be made ");

        }
               
                       System.out.println("[Client] - Test Completed");

    }
    
    
    
}
