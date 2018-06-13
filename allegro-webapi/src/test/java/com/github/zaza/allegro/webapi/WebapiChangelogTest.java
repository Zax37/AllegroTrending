package com.github.zaza.allegro.webapi;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Test;

import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.FeedException;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;

public class WebapiChangelogTest {

	@Test
	public void noChangelogEntryAfterSourceGenerated() throws Exception {
		assertTrue("New changelog entry has been published. Regenerate sources.",
				lastTimeSourcesGenerated().after(latestChangelogEntryPublished()));
	}

	private Date lastTimeSourcesGenerated() throws ParseException {
		return new SimpleDateFormat("yyyy-MM-dd").parse("2017-11-03");
	}

	private Date latestChangelogEntryPublished() throws IllegalArgumentException, IOException, FeedException {
		return fetchFeed("https://allegro.pl/rss.php/webapi?all=0").getEntries().iterator().next().getPublishedDate();
	}

	private SyndFeed fetchFeed(String url) throws IllegalArgumentException, IOException, FeedException {
		try (CloseableHttpClient client = HttpClients.createMinimal()) {
			HttpUriRequest request = new HttpGet(url);
			try (CloseableHttpResponse response = client.execute(request);
					InputStream stream = response.getEntity().getContent()) {
				return new SyndFeedInput().build(new XmlReader(stream));
			}
		}
	}
}
