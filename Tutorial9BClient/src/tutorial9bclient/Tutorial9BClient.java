/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial9bclient;

/**
 *
 * @author Azhar
 */
public class Tutorial9BClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tutorial9BClient myClient = new Tutorial9BClient();
        myClient.executeTest();
    }
    
     private void executeTest() {
        System.out.println("[CLIENT] - Starting Test...");
        /*
         Checking if server is connected
         */
        
        if (isConnected().equals("OK")) {
            System.out.println("[CLIENT] - Server is connected, test can continue...");

            /*
             Add two numbers
             */
            if (addTwoNumbers(1.0, 2.0) == 3.0) {
                System.out.println("[CLIENT] - addTwoNumbers gave a correct result");
            } else {
                System.out.println("[CLIENT] - addTwoNumbers gave a WRONG result");
            }

            /*
             Add a series of Doubles to an ArrayList<Double> in the server
             */
            addNumber(1.0);
            addNumber(-0.5);
            addNumber(12.3);
            addNumber(14.2);
            addNumber(99.9);
            /*
             Calculate the average among the list of Doubles on the server
             */
            if (averageOfAllNumbers().equals(25.38)) {
                System.out.println("[CLIENT] - averageOfAllNumbers gave a correct result");
            } else {
                System.out.println("[CLIENT] - averageOfAllNumbers gave a WRONG result");
            }


            /*
             Add two numbers with Exception
             */
            try {
                if (addTwoNumbersWithException(1.0, 2.0) == 3.0) {
                    System.out.println("[CLIENT] - addTwoNumbers gave a correct result");
                } else {
                    System.out.println("[CLIENT] - addTwoNumbers gave a WRONG result");
                }
            } catch (java.lang.Exception ex) {
                System.out.println("[CLIENT] - [ERROR] - YOU SHOULD NOT SEE THIS EXCEPTION ! ");
            }

            try {
                if (addTwoNumbersWithException(null, 2.0) == 3.0) {
                    System.out.println("[CLIENT] - addTwoNumbers gave a correct result");
                } else {
                    System.out.println("[CLIENT] - addTwoNumbers gave a WRONG result");
                }
            } catch (java.lang.Exception ex) {
                System.out.println("[CLIENT] - [CORRECT] - YOU SHOULD SEE THIS EXCEPTION ! ");
            }

            try {
                if (addTwoNumbers(1.0, null) == 3.0) {
                    System.out.println("[CLIENT] - addTwoNumbers gave a correct result");
                } else {
                    System.out.println("[CLIENT] - addTwoNumbers gave a WRONG result");
                }
            } catch (java.lang.Exception ex) {
                System.out.println("[CLIENT] - [CORRECT] - YOU SHOULD SEE THIS EXCEPTION ! ");
            }

            try {
                if (addTwoNumbers(null, null) == 3.0) {
                    System.out.println("[CLIENT] - addTwoNumbers gave a correct result");
                } else {
                    System.out.println("[CLIENT] - addTwoNumbers gave a WRONG result");
                }
            } catch (java.lang.Exception ex) {
                System.out.println("[CLIENT] - [CORRECT] - YOU SHOULD SEE THIS EXCEPTION ! ");
            }


            /*
             Instantiate a series of MyPoint3D and add them to an ArrayList<MyPoint3D> in the  
             */
            MyPoint3D   p1  =   new MyPoint3D();
            p1.setX(1.0);
            p1.setY(2.1);
            p1.setZ(3.2);
            addMyPoint3D(p1);
            MyPoint3D   p2  =   new MyPoint3D();
            p2.setX(3.0);
            p2.setY(9.1);
            p2.setZ(12.2);
            addMyPoint3D(p2);
            MyPoint3D   p3  =   new MyPoint3D();
            p3.setX(14.0);
            p3.setY(21.2);
            p3.setZ(32.1);            
            addMyPoint3D(p3);

            /*
            Find the point with the highest z-coordinate
             */
            if (findPointWithHighestZ().getZ() == 32.1) {
                System.out.println("[CLIENT] - findPointWithHighestZ gave a correct result");
            } else {
                System.out.println("[CLIENT] - findPointWithHighestZ gave a WRONG result");
            }
        } else {
            System.out.println("[CLIENT] - Server is connected, test CANNOT continue...");
        }
    }

    private static String addMyPoint3D(tutorial9bclient.MyPoint3D myPoint3D) {
        tutorial9bclient.RealService_Service service = new tutorial9bclient.RealService_Service();
        tutorial9bclient.RealService port = service.getRealServicePort();
        return port.addMyPoint3D(myPoint3D);
    }

    private static String addNumber(java.lang.Double d) {
        tutorial9bclient.RealService_Service service = new tutorial9bclient.RealService_Service();
        tutorial9bclient.RealService port = service.getRealServicePort();
        return port.addNumber(d);
    }

    private static String addString(java.lang.String firstString) {
        tutorial9bclient.RealService_Service service = new tutorial9bclient.RealService_Service();
        tutorial9bclient.RealService port = service.getRealServicePort();
        return port.addString(firstString);
    }

    private static Double addTwoNumbers(java.lang.Double d, java.lang.Double d0) {
        tutorial9bclient.RealService_Service service = new tutorial9bclient.RealService_Service();
        tutorial9bclient.RealService port = service.getRealServicePort();
        return port.addTwoNumbers(d, d0);
    }

    private static Double addTwoNumbersWithException(java.lang.Double d, java.lang.Double d0) throws Exception_Exception {
        tutorial9bclient.RealService_Service service = new tutorial9bclient.RealService_Service();
        tutorial9bclient.RealService port = service.getRealServicePort();
        return port.addTwoNumbersWithException(d, d0);
    }

    private static Double averageOfAllNumbers() {
        tutorial9bclient.RealService_Service service = new tutorial9bclient.RealService_Service();
        tutorial9bclient.RealService port = service.getRealServicePort();
        return port.averageOfAllNumbers();
    }

    private static MyPoint3D findPointWithHighestZ() {
        tutorial9bclient.RealService_Service service = new tutorial9bclient.RealService_Service();
        tutorial9bclient.RealService port = service.getRealServicePort();
        return port.findPointWithHighestZ();
    }

    private static String findShortestAmongAllStrings() {
        tutorial9bclient.RealService_Service service = new tutorial9bclient.RealService_Service();
        tutorial9bclient.RealService port = service.getRealServicePort();
        return port.findShortestAmongAllStrings();
    }

    private static String findShortestBetweenWithException(java.lang.String a, java.lang.String b) throws Exception_Exception {
        tutorial9bclient.RealService_Service service = new tutorial9bclient.RealService_Service();
        tutorial9bclient.RealService port = service.getRealServicePort();
        return port.findShortestBetweenWithException(a, b);
    }

    private static String findShortestBetween(java.lang.String a, java.lang.String b) {
        tutorial9bclient.RealService_Service service = new tutorial9bclient.RealService_Service();
        tutorial9bclient.RealService port = service.getRealServicePort();
        return port.findShortestBetween(a, b);
    }

    private static String isConnected() {
        tutorial9bclient.RealService_Service service = new tutorial9bclient.RealService_Service();
        tutorial9bclient.RealService port = service.getRealServicePort();
        return port.isConnected();
    }
    
}
