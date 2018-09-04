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

public class HT_27_mails {

	public static void main(String[] args) throws ClientProtocolException, IOException, URISyntaxException {
		HttpClient client = HttpClientBuilder.create().build();
		URIBuilder builder = new URIBuilder("http://www.appsmail.ru/platform/api?method=mail.getUnreadCount");
		builder.setParameter("app_id", "761606")
		.setParameter("session_key", "4bc349d6ec7ddff418919a0ad1be42c0")
		.setParameter("sig", "b9abca3224c960e54c48d1ecdbe60e37");
		HttpGet request = new HttpGet(builder.build());
		HttpResponse response = client.execute(request);
		System.out.println(EntityUtils.toString(response.getEntity()));
	}
}
//http://www.appsmail.ru/platform/api?method=mail.getUnreadCount&
//app_id=123456&session_key=551fd0e4779e35859dfccd03397dc8a0&
//sig=95a393ed7639184a52f7a17b6771a925