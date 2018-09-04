package test.mail;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class DelMessage {
	public static void main( String[] args ) throws ClientProtocolException, IOException, URISyntaxException
    {
            HttpClient client = HttpClientBuilder.create().build();
            URIBuilder builder = new URIBuilder("http://www.appsmail.ru/platform/api?method=friends.getOnline");
            builder.setParameter("app_id", "761606")
            .setParameter("session_key", "09803fcdaf99ff7945fec7cac867c6a5")        
            .setParameter("sig", "f1131b76bc111089cade988e3fe1c000");
            HttpGet request = new HttpGet(builder.build());
            HttpResponse response = client.execute(request);
            System.out.println(EntityUtils.toString(response.getEntity()));
    }

}
