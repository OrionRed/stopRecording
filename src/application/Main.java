package application;

import java.net.URISyntaxException;
import io.obswebsocket.community.client.OBSRemoteController;

public class Main {

	public static void main(String[] args) throws URISyntaxException, InterruptedException {
		// TODO Auto-generated method stub
		System.out.println( "Howdy" );
		   OBSRemoteController obsRemoteController;
		   obsRemoteController = OBSRemoteController.builder()
			        .autoConnect(false)                       // Do not connect automatically
			        .host("127.0.0.1")                        // Set the host
			        .port(4455)                               // Set the port
			        .password("W1Bl17LOO3x9JLlW")             // Set the password
			        .lifecycle()                              // Add some lifecycle callbacks
			       // .onReady(this::onReady)                   // Add onReady callback
			        .and()                                    // Build the LifecycleListenerBuilder
			        //.registerEventListener(StudioModeStateChangedEvent.class,
			         //   this::onStudioModeStateChanged)       // Register a StudioModeStateChangedEvent
			        .build();                                 // Build the OBSRemoteController
		   obsRemoteController.connect();
		   //obsRemoteController.startRecord(0);
		   obsRemoteController.stopRecord(0);
		   obsRemoteController.disconnect();
		   obsRemoteController.stop();
	}

}
