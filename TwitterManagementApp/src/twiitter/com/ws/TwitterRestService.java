package twiitter.com.ws;

import java.util.Date;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
@ApplicationPath("/")
public class TwitterRestService extends Application {

	@GET
	@Path("/")
	public String getTweet() {
		return "Message Successfully Returned...";	
	}

	@GET
	@Path("/")
	public Response getEchoMsg(@QueryParam("message") String tweet) {
		return Response.ok("Your last tweet was :" + tweet).build();
	}
	
	@GET
	@Path("/")
	@Produces({MediaType.APPLICATION_JSON , MediaType.APPLICATION_XML})
	public TweetObject getTweetObject() {
		Date date = new Date();
		return new TweetObject(1,"Test",date);
	}
}
