/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mockupprototypea;

/**
 *
 * @author pierang
 */
public class DummyClient 
{
    DummyServer server  =   new DummyServer();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        DummyClient client  =   new DummyClient();
        client.executeTest();
    }

    private void executeTest() 
    {
        System.out.println("[CLIENT] - Starting Test...");
        /*
        Checking if server is connected
        */
        if(server.isConnected())
        {
            System.out.println("[CLIENT] - Server is connected, test can continue...");

            /*
            Find the shortest string between the two arguments
            */
            if(server.findShortestBetween("Short", "Very very long") == "Short")
                System.out.println("[CLIENT] - findShortestBetween gave a correct result");
            else
                System.out.println("[CLIENT] - findShortestBetween gave a WRONG result");
                
            /*
                Add a series of strings to an ArrayList<String> in the server
            */
            server.addString("String");
            server.addString("Another String");
            server.addString("Yet Another String");
            server.addString("One more String");
            server.addString("Last String");
            /*
            Find the shortest string among the list of strings on the server
            */
            if(server.findShortestAmongAllStrings().equals("String"))
                System.out.println("[CLIENT] - findShortestAmongAllStrings gave a correct result");
            else    
                System.out.println("[CLIENT] - findShortestAmongAllStrings gave a WRONG result");


            /*
            Find the shortest string between the two arguments with Exception
            */            
            try {
                if(server.findShortestBetweenWithException("Short", "Very very long") == "Short")
                    System.out.println("[CLIENT] - findShortestBetween gave a correct result");
                else
                    System.out.println("[CLIENT] - findShortestBetween gave a WRONG result");
            } catch (Exception ex) {
                    System.out.println("[CLIENT] - [ERROR] - YOU SHOULD NOT SEE THIS EXCEPTION ! ");
            }

            try {
                if(server.findShortestBetweenWithException(null, "Very very long") == "Short")
                    System.out.println("[CLIENT] - findShortestBetween gave a correct result");
                else
                    System.out.println("[CLIENT] - findShortestBetween gave a WRONG result");
            } catch (Exception ex) {
                    System.out.println("[CLIENT] - [CORRECT] - YOU SHOULD SEE THIS EXCEPTION ! ");
            }

            try {
                if(server.findShortestBetweenWithException("Short", null) == "Short")
                    System.out.println("[CLIENT] - findShortestBetween gave a correct result");
                else
                    System.out.println("[CLIENT] - findShortestBetween gave a WRONG result");
            } catch (Exception ex) {
                    System.out.println("[CLIENT] - [CORRECT] - YOU SHOULD SEE THIS EXCEPTION ! ");
            }

            try {
                if(server.findShortestBetweenWithException(null, null) == "Short")
                    System.out.println("[CLIENT] - findShortestBetween gave a correct result");
                else
                    System.out.println("[CLIENT] - findShortestBetween gave a WRONG result");
            } catch (Exception ex) {
                    System.out.println("[CLIENT] - [CORRECT] - YOU SHOULD SEE THIS EXCEPTION ! ");
            }


            /*
            Find the shortest between name and surname
            */            
            Person p = new Person();
            p.name      =   "Bob";
            p.surname   =   "VeryLongSurname";
            if(server.findShortestBetweenNameAndSurname(p) == "Bob")
                    System.out.println("[CLIENT] - findShortestBetweenNameAndSurname gave a correct result");
            else
                    System.out.println("[CLIENT] - findShortestBetweenNameAndSurname gave a correct result");
        }
        else
        {
            System.out.println("[CLIENT] - Server is connected, test CANNOT continue...");
        }
    }
}
