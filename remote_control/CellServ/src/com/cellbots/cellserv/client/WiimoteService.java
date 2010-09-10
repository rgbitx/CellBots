package com.cellbots.cellserv.client;

import com.google.gwt.user.client.rpc.RemoteService;

//Add this to the "imports"
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
 
// Add this above the interface declaration
@RemoteServiceRelativePath("wiimote")
 


public interface WiimoteService extends RemoteService
{
//Add this inside the SimpleService interface
  public int handleButtonDown(int buttonid);
  public int handleButtonUp(int buttonid);
  

}
