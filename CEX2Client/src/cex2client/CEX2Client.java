/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cex2client;

/**
 *
 * @author Azhar
 */
public class CEX2Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
CEX2Client c = new CEX2Client();
c.execute();    }

    private static Integer isConnected() {
        cex2client.CEX2WebService_Service service = new cex2client.CEX2WebService_Service();
        cex2client.CEX2WebService port = service.getCEX2WebServicePort();
        return port.isConnected();
    }
    public void execute(){
  if (isConnected().equals(0)) {
            System.out.println("[DummyClient] The server is connected, the test can proceed...");
  }
}
}
