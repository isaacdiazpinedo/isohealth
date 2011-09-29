package com.isobar.isohealth.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.codehaus.jackson.map.ObjectMapper;

import com.isobar.isohealth.GraphConstants;
import com.isobar.isohealth.models.PersonalRecord;
import com.isobar.isohealth.models.User;

public class PersonalRecordService {
	public static PersonalRecord getPersonalRecord(String code) throws Exception {
		User user = UserService.getUser(code);
		ObjectMapper mapper = new ObjectMapper(); 
		String url = GraphConstants.REST_URL + user.getRecords();
		HttpURLConnection conn  = (HttpURLConnection) new URL(url).openConnection();
		conn.setRequestProperty("Authorization", "Bearer " + code);
		conn.setRequestProperty("Accept", GraphConstants.MEDIA_RECORDS);

		if (conn.getResponseCode() != 200) {
			throw new IOException(conn.getResponseMessage());
		}

		BufferedReader rd = new BufferedReader(new InputStreamReader(
				conn.getInputStream()));
		String line = "";
		while ((line = rd.readLine()) != null) {
            System.out.println(line);
        }
		PersonalRecord personalRecord = mapper.readValue(rd, PersonalRecord.class);
		conn.disconnect();
		return personalRecord;
	}
}
