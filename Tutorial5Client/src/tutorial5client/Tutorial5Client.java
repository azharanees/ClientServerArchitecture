/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial5client;

/**
 *
 * @author Azhar
 */
public class Tutorial5Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Tutorial5Client t = new Tutorial5Client();
        t.executeTest();
        
        // TODO code application logic here
    }
    
    public void executeTest(){
        System.out.println("[Client] - Executing Connection Test");
        
        if(isConnected()){
                    System.out.println("[Client] - Server is Connected, test can continue...");

        }else{
                                System.out.println("[Client] - Server is NOT Connected, test has failed...");

        }
    }
     
    public static Boolean isConnected(){
    tutorial5client.SimpleWebService_Service service = new tutorial5client.SimpleWebService_Service();
        tutorial5client.SimpleWebService port = service.getSimpleWebServicePort();
        return port.isConnected();

    }
    
}
