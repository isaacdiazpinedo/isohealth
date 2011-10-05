package com.isobar.isohealth.wrappers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.codehaus.jackson.map.ObjectMapper;

import com.isobar.isohealth.GraphConstants;
import com.isobar.isohealth.models.NewSleepMeasurement;
import com.isobar.isohealth.models.SleepMeasurement;
import com.isobar.isohealth.models.SleepMeasurementFeed;
import com.isobar.isohealth.models.User;

public class SleepMeasurementWrapper {
	
	private String authToken;
	
	public SleepMeasurementWrapper(String authToken) {
		super();
		this.authToken = authToken;
	}

	public SleepMeasurementFeed getSleepMeasurementFeed() throws Exception {
		User user = new UserWrapper(authToken).getUser();
		ObjectMapper mapper = new ObjectMapper(); 
		String url = GraphConstants.REST_URL + user.getSleep();
		HttpURLConnection conn  = (HttpURLConnection) new URL(url).openConnection();
		conn.setRequestProperty("Accept", GraphConstants.MEDIA_SLEEP_MEASUREMENT_FEED);
		conn.setRequestProperty("Authorization", "Bearer " + authToken);

		if (conn.getResponseCode() != 200) {
			throw new IOException(conn.getResponseMessage());
		}

		BufferedReader rd = new BufferedReader(new InputStreamReader(
				conn.getInputStream()));
		SleepMeasurementFeed sleepMeasurementFeed = mapper.readValue(rd, SleepMeasurementFeed.class);
		conn.disconnect();
		return sleepMeasurementFeed;
	}

	public SleepMeasurement getSleepMeasurement(String url) throws Exception {
		ObjectMapper mapper = new ObjectMapper(); 
		url = GraphConstants.REST_URL + url;
		HttpURLConnection conn  = (HttpURLConnection) new URL(url).openConnection();
		conn.setRequestProperty("Accept", GraphConstants.MEDIA_SLEEP_MEASUREMENT);
		conn.setRequestProperty("Authorization", "Bearer " + authToken);

		if (conn.getResponseCode() != 200) {
			throw new IOException(conn.getResponseMessage());
		}

		BufferedReader rd = new BufferedReader(new InputStreamReader(
				conn.getInputStream()));
		SleepMeasurement sleepMeasurement = mapper.readValue(rd, SleepMeasurement.class);
		conn.disconnect();
		return sleepMeasurement;
	}	

	public SleepMeasurement updateSleepMeasurement(SleepMeasurement sleepMeasurement) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		String url = GraphConstants.REST_URL + sleepMeasurement.getUri();
		HttpURLConnection conn = (HttpURLConnection) new URL(url)
				.openConnection();
		conn.setRequestMethod("PUT");
		conn.setRequestProperty("Content-Type",
				GraphConstants.MEDIA_SLEEP_MEASUREMENT);
		conn.setRequestProperty("Authorization", "Bearer " + authToken);
		conn.setRequestProperty("Content-Length", "nnn");
		conn.setUseCaches(false);
		conn.setDoInput(true);
		conn.setDoOutput(true);

		mapper.writeValue(conn.getOutputStream(), sleepMeasurement);
		
		if (conn.getResponseCode() != 200) {
			throw new IOException(conn.getResponseMessage());
		}

		BufferedReader rd = new BufferedReader(new InputStreamReader(
				conn.getInputStream()));
		sleepMeasurement = mapper.readValue(rd, SleepMeasurement.class);
		conn.disconnect();
		return sleepMeasurement;
	}
	
	public void createSleepMeasurement(
			NewSleepMeasurement sleepMeasurement) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		User user = new UserWrapper(authToken).getUser();
		String url = GraphConstants.REST_URL
				+ user.getSleep();
		HttpURLConnection conn = (HttpURLConnection) new URL(url)
				.openConnection();
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-Type",
				GraphConstants.MEDIA_NEW_SLEEP_MEASUREMENT);
		conn.setRequestProperty("Authorization", "Bearer " + authToken);
		conn.setRequestProperty("Content-Length", "nnn");
		conn.setUseCaches(false);
		conn.setDoInput(true);
		conn.setDoOutput(true);

		mapper.writeValue(conn.getOutputStream(), sleepMeasurement);
		
		if (conn.getResponseCode() != 201) {
			throw new IOException(conn.getResponseMessage());
		}
		conn.disconnect();
	}
}