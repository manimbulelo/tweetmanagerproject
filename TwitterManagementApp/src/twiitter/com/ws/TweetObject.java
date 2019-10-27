package twiitter.com.ws;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TweetObject {

	private int tweetID;
	private String TweetBody;
	private Date timespam;
	
	public TweetObject(int tweetID, String tweetBody, Date i) {
		super();
		this.tweetID = tweetID;
		TweetBody = tweetBody;
		this.timespam = i;
	}

	public int getTweetID() {
		return tweetID;
	}
	public void setTweetID(int tweetID) {
		this.tweetID = tweetID;
	}
	public String getTweetBody() {
		return TweetBody;
	}
	public void setTweetBody(String tweetBody) {
		TweetBody = tweetBody;
	}
	public Date getTimespam() {
		return timespam;
	}
	public void setTimespam(Date timespam) {
		this.timespam = timespam;
	}
}
