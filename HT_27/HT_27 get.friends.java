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


public class App 
{
	public static void main( String[] args ) throws ClientProtocolException, IOException, URISyntaxException
    {
            HttpClient client = HttpClientBuilder.create().build();
            URIBuilder builder = new URIBuilder("http://www.appsmail.ru/platform/api?method=friends.get");
            builder.setParameter("app_id", "761606")
            .setParameter("session_key", "51b2dd60fd24df221313c26e077776e9")        
            .setParameter("sig", "8eeea6e8f26f63a01bad8b022dcc41e6");
        //    .setParameter("uid", "12826667034100498388")
          //  .setParameter("message", "xxx");
            HttpGet request = new HttpGet(builder.build());
            HttpResponse response = client.execute(request);
            System.out.println(EntityUtils.toString(response.getEntity()));
    }

}
