/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial8aclient;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Azhar
 */
public class Tutorial8AClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       testConnection();
       
       System.out.println("[Client] - Invoking findMinBetween Function with args 2.3,4.2" );
       if(findMinimumBetween(2.3,4.2)==2.3){
         System.out.println("[Client] - (findMinimumBetween) Correct results" );
       }else{
         System.out.println("[Client] - (findMinimumBetween) Incorrect results " );
       }
              System.out.println("[Client] - Testing addSample method" );
              
       addSample(2.0);
       addSample(3.0);
       addSample(4.0);
       addSample(5.0);
            System.out.println("[Client] - Testing findMinimumAmoungSamples method" );

       
       if(findMinimumAmongSamples()==2.0){
             System.out.println("[Client] - (findMinimumAmoungSamples) Correct results" );

       }else{
             System.out.println("[Client] - (findMinimumAmoungSamples) Incorrect results" );
   
       }
       
       testFMBWE();
       testFMC();
        // TODO code application logic here
    }

    private static void testFMBWE() {
           
        try {
            System.out.println("[Client] - Invoking findMinimumBetweenWithException Function with args 2.3,4.2" );
            if(findMinimumBetweenWithException(2.3,4.2)==2.3){
                System.out.println("[Client] - (findMinimumBetweenWithException) Correct results" );
            }else{
                System.out.println("[Client] - (findMinimumBetweenWithException) Incorrect results " );
            }} catch (Exception_Exception ex) {
                System.out.println("[Client] - ERROR !!! (findMinimumBetweenWithException) you shouldn't see this exception" );
        }
        
  System.out.println("[Client] - Invoking findMinimumBetweenWithException Function with args 2.3,null" );

         try {
            if(findMinimumBetweenWithException(2.3,null)==2.3){
                System.out.println("[Client] - (findMinimumBetweenWithException) Correct results" );
            }else{
                System.out.println("[Client] - (findMinimumBetweenWithException) Incorrect results " );
            }} catch (Exception_Exception ex) {
                System.out.println("[Client] - (findMinimumBetweenWithException) you should see this exception" );
        }
          System.out.println("[Client] - Invoking findMinimumBetweenWithException Function with args nulll,null" );
        try {
            if(findMinimumBetweenWithException(null,null)==2.3){
                System.out.println("[Client] - (findMinimumBetweenWithException) Correct results" );
            }else{
                System.out.println("[Client] - (findMinimumBetweenWithException) Incorrect results " );
            }} catch (Exception_Exception ex) {
                System.out.println("[Client] - (findMinimumBetweenWithException) you should see this exception" );
        }
        
    }
    
    private static void testFMC(){
        Point2D p1 = new Point2D();
        p1.x = 3.0;
        p1.y = 4.0;
          System.out.println("[Client] - Invoking findMinimumCordinate Function with args p.x = 3.0 and p.y = 4.0" );

        if(findMinimumCoordinate(p1)==3.0){
          System.out.println("[Client] - (findMinimumCoordinate) Correct results" );
        }else{
                      System.out.println("[Client] - (findMinimumCoordinate) Incorrect results" );

        }
        
    }

    private static void testConnection() {
        tutorial8aclient.TestWebService_Service service = new tutorial8aclient.TestWebService_Service();
        tutorial8aclient.TestWebService port = service.getTestWebServicePort();
                                          System.out.println("[Client] - Test is Starting");

        if(port.testConnection().equalsIgnoreCase("OK")){
           System.out.println("[Client] - Server Connection status OK");
           
        }else{
            
           System.out.println("[Client] - Server Connection Error : Could not connect");

        }
                                                     System.out.println("[Client] - Test Completed ");

        
    }

    private static Double findMinimumBetween(java.lang.Double a, java.lang.Double b) {
        tutorial8aclient.TestWebService_Service service = new tutorial8aclient.TestWebService_Service();
        tutorial8aclient.TestWebService port = service.getTestWebServicePort();
        return port.findMinimumBetween(a, b);
    }

    private static String addSample(java.lang.Double sample) {
        tutorial8aclient.TestWebService_Service service = new tutorial8aclient.TestWebService_Service();
        tutorial8aclient.TestWebService port = service.getTestWebServicePort();
        return port.addSample(sample);
    }

    private static Double findMinimumAmongSamples() {
        tutorial8aclient.TestWebService_Service service = new tutorial8aclient.TestWebService_Service();
        tutorial8aclient.TestWebService port = service.getTestWebServicePort();
        return port.findMinimumAmongSamples();
    }

    private static Double findMinimumBetweenWithException(java.lang.Double a, java.lang.Double parameter1) throws Exception_Exception {
        tutorial8aclient.TestWebService_Service service = new tutorial8aclient.TestWebService_Service();
        tutorial8aclient.TestWebService port = service.getTestWebServicePort();
        return port.findMinimumBetweenWithException(a, parameter1);
    }

    private static Double findMinimumCoordinate(tutorial8aclient.Point2D point) {
        tutorial8aclient.TestWebService_Service service = new tutorial8aclient.TestWebService_Service();
        tutorial8aclient.TestWebService port = service.getTestWebServicePort();
        return port.findMinimumCoordinate(point);
    }
    
    
    
    
}
