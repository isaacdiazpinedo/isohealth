package com.isobar.isohealth.models;

import java.util.Arrays;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonSerialize(include = Inclusion.NON_NULL)
public class DiabetesMeasurement {
	private String uri; // The URI for this measurement	N
	private Integer userID; // The unique ID for the user	N
	private String timestamp; // The time at which the measurement was taken (e.g., "Sat, 1 Jan 2011 00:00:00")	N
	
	// One of the following values: fasting_plasma_glucose_test, random_plasma_glucose_test, oral_glucose_tolerance_test, hemoglobin_a1c, insulin, c_peptide, triglyceride
	private Double fasting_plasma_glucose_test; // The value of the measured quantity	Y
	private Double random_plasma_glucose_test; // The value of the measured quantity	Y
	private Double oral_glucose_tolerance_test; // The value of the measured quantity	Y
	private Double hemoglobin_a1c; // The value of the measured quantity	Y
	private Double insulin; // The value of the measured quantity	Y
	private Double c_peptide; // The value of the measured quantity	Y
	private Double triglyceride; // The value of the measured quantity	Y
	
	private String previous; // The URI of the previous diabetes measurement in chronological order for the user (omitted for the first diabetes measurement)	N
	private String next; // The URI of the next diabetes measurement in chronological order for the user (omitted for the most recent diabetes measurement)	N
	private String nearest_fitness_activity; // The URI of the fitness activity closest in time to this activity for the user (omitted if no fitness activities have been recorded)	N
	private String[] nearest_teammate_fitness_activities; // The URIs of the fitness activities closest in time to this activity for each street teammate (empty if no fitness activities have been recorded)	N
	private String nearest_strength_training_activity; // The URI of the strength training activity closest in time to this activity for the user (omitted if no strength training activities have been recorded)	N
	private String[] nearest_teammate_strength_training_activities; // The URIs of the strength training activities closest in time to this activity for each street teammate (empty if no strength training activities have been recorded)	N
	private String nearest_background_activity; // The URI of the background activity closest in time to this activity for the user (omitted if no background activities have been recorded)	N
	private String[] nearest_teammate_background_activities; // The URIs of the background activities closest in time to this activity for each street teammate (empty if no background activities have been recorded)	N
	private String nearest_sleep; // The URI of the sleep measurements closest in time to this activity for the user (omitted if no sleep measurements have been taken)	N
	private String[] nearest_teammate_sleep; // The URIs of the sleep measurements closest in time to this activity for each street teammate (empty if no sleep measurements have been taken)	N
	private String nearest_nutrition; // The URI of the nutrition measurement closest in time to this activity for the user (omitted if no nutrition measurements have been token)	N
	private String[] nearest_teammate_nutrition; // The URIs of the nutrition measurement closest in time to this activity for each street teammate (empty if no nutrition measurements have been token)	N
	private String nearest_weight; // The URI of the weight measurement closest in time to this activity for the user (omitted if no weight measurements have been token)	N
	private String[] nearest_teammate_weight; // The URIs of the weight measurements closest in time to this activity for each street teammate (empty if no weight measurements have been token)	N
	private String nearest_general_measurement; // The URI of the general measurement measurement closest in time to this activity for the user (omitted if no general measurements have been token)	N
	private String[] nearest_teammate_general_measurements; // The URIs of the general measurements closest in time to this activity for each street teammate (empty if no general measurements have been token)	N
	private String nearest_diabetes; // The URI of the diabetes measurement closest in time to this activity for the user (omitted if no diabetes measurements have been token)	N
	private String[] nearest_teammate_diabetes; // The URIs of the diabetes measurements closest in time to this activity for each street teammate (empty if no diabetes measurements have been token)	N
	
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public Double getFasting_plasma_glucose_test() {
		return fasting_plasma_glucose_test;
	}
	public void setFasting_plasma_glucose_test(Double fasting_plasma_glucose_test) {
		this.fasting_plasma_glucose_test = fasting_plasma_glucose_test;
	}
	public Double getRandom_plasma_glucose_test() {
		return random_plasma_glucose_test;
	}
	public void setRandom_plasma_glucose_test(Double random_plasma_glucose_test) {
		this.random_plasma_glucose_test = random_plasma_glucose_test;
	}
	public Double getOral_glucose_tolerance_test() {
		return oral_glucose_tolerance_test;
	}
	public void setOral_glucose_tolerance_test(Double oral_glucose_tolerance_test) {
		this.oral_glucose_tolerance_test = oral_glucose_tolerance_test;
	}
	public Double getHemoglobin_a1c() {
		return hemoglobin_a1c;
	}
	public void setHemoglobin_a1c(Double hemoglobin_a1c) {
		this.hemoglobin_a1c = hemoglobin_a1c;
	}
	public Double getInsulin() {
		return insulin;
	}
	public void setInsulin(Double insulin) {
		this.insulin = insulin;
	}
	public Double getC_peptide() {
		return c_peptide;
	}
	public void setC_peptide(Double c_peptide) {
		this.c_peptide = c_peptide;
	}
	public Double getTriglyceride() {
		return triglyceride;
	}

	public void setTriglyceride(Double triglyceride) {
		this.triglyceride = triglyceride;
	}

	public String getPrevious() {
		return previous;
	}

	public void setPrevious(String previous) {
		this.previous = previous;
	}

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}

	public String getNearest_fitness_activity() {
		return nearest_fitness_activity;
	}

	public void setNearest_fitness_activity(String nearest_fitness_activity) {
		this.nearest_fitness_activity = nearest_fitness_activity;
	}

	public String[] getNearest_teammate_fitness_activities() {
		return nearest_teammate_fitness_activities;
	}

	public void setNearest_teammate_fitness_activities(
			String[] nearest_teammate_fitness_activities) {
		this.nearest_teammate_fitness_activities = nearest_teammate_fitness_activities;
	}

	public String getNearest_strength_training_activity() {
		return nearest_strength_training_activity;
	}

	public void setNearest_strength_training_activity(
			String nearest_strength_training_activity) {
		this.nearest_strength_training_activity = nearest_strength_training_activity;
	}

	public String[] getNearest_teammate_strength_training_activities() {
		return nearest_teammate_strength_training_activities;
	}

	public void setNearest_teammate_strength_training_activities(
			String[] nearest_teammate_strength_training_activities) {
		this.nearest_teammate_strength_training_activities = nearest_teammate_strength_training_activities;
	}

	public String getNearest_background_activity() {
		return nearest_background_activity;
	}

	public void setNearest_background_activity(String nearest_background_activity) {
		this.nearest_background_activity = nearest_background_activity;
	}

	public String[] getNearest_teammate_background_activities() {
		return nearest_teammate_background_activities;
	}

	public void setNearest_teammate_background_activities(
			String[] nearest_teammate_background_activities) {
		this.nearest_teammate_background_activities = nearest_teammate_background_activities;
	}

	public String getNearest_sleep() {
		return nearest_sleep;
	}

	public void setNearest_sleep(String nearest_sleep) {
		this.nearest_sleep = nearest_sleep;
	}

	public String[] getNearest_teammate_sleep() {
		return nearest_teammate_sleep;
	}

	public void setNearest_teammate_sleep(String[] nearest_teammate_sleep) {
		this.nearest_teammate_sleep = nearest_teammate_sleep;
	}

	public String getNearest_nutrition() {
		return nearest_nutrition;
	}

	public void setNearest_nutrition(String nearest_nutrition) {
		this.nearest_nutrition = nearest_nutrition;
	}

	public String[] getNearest_teammate_nutrition() {
		return nearest_teammate_nutrition;
	}

	public void setNearest_teammate_nutrition(String[] nearest_teammate_nutrition) {
		this.nearest_teammate_nutrition = nearest_teammate_nutrition;
	}

	public String getNearest_weight() {
		return nearest_weight;
	}

	public void setNearest_weight(String nearest_weight) {
		this.nearest_weight = nearest_weight;
	}

	public String[] getNearest_teammate_weight() {
		return nearest_teammate_weight;
	}

	public void setNearest_teammate_weight(String[] nearest_teammate_weight) {
		this.nearest_teammate_weight = nearest_teammate_weight;
	}

	public String getNearest_general_measurement() {
		return nearest_general_measurement;
	}

	public void setNearest_general_measurement(String nearest_general_measurement) {
		this.nearest_general_measurement = nearest_general_measurement;
	}

	public String[] getNearest_teammate_general_measurements() {
		return nearest_teammate_general_measurements;
	}

	public void setNearest_teammate_general_measurements(
			String[] nearest_teammate_general_measurements) {
		this.nearest_teammate_general_measurements = nearest_teammate_general_measurements;
	}

	public String getNearest_diabetes() {
		return nearest_diabetes;
	}

	public void setNearest_diabetes(String nearest_diabetes) {
		this.nearest_diabetes = nearest_diabetes;
	}

	public String[] getNearest_teammate_diabetes() {
		return nearest_teammate_diabetes;
	}

	public void setNearest_teammate_diabetes(String[] nearest_teammate_diabetes) {
		this.nearest_teammate_diabetes = nearest_teammate_diabetes;
	}

	public DiabetesMeasurement(String uri, Integer userID, String timestamp,
			Double fasting_plasma_glucose_test,
			Double random_plasma_glucose_test,
			Double oral_glucose_tolerance_test, Double hemoglobin_a1c,
			Double insulin, Double c_peptide, Double triglyceride,
			String previous, String next, String nearest_fitness_activity,
			String[] nearest_teammate_fitness_activities,
			String nearest_strength_training_activity,
			String[] nearest_teammate_strength_training_activities,
			String nearest_background_activity,
			String[] nearest_teammate_background_activities,
			String nearest_sleep, String[] nearest_teammate_sleep,
			String nearest_nutrition, String[] nearest_teammate_nutrition,
			String nearest_weight, String[] nearest_teammate_weight,
			String nearest_general_measurement,
			String[] nearest_teammate_general_measurements,
			String nearest_diabetes, String[] nearest_teammate_diabetes) {
		super();
		this.uri = uri;
		this.userID = userID;
		this.timestamp = timestamp;
		this.fasting_plasma_glucose_test = fasting_plasma_glucose_test;
		this.random_plasma_glucose_test = random_plasma_glucose_test;
		this.oral_glucose_tolerance_test = oral_glucose_tolerance_test;
		this.hemoglobin_a1c = hemoglobin_a1c;
		this.insulin = insulin;
		this.c_peptide = c_peptide;
		this.triglyceride = triglyceride;
		this.previous = previous;
		this.next = next;
		this.nearest_fitness_activity = nearest_fitness_activity;
		this.nearest_teammate_fitness_activities = nearest_teammate_fitness_activities;
		this.nearest_strength_training_activity = nearest_strength_training_activity;
		this.nearest_teammate_strength_training_activities = nearest_teammate_strength_training_activities;
		this.nearest_background_activity = nearest_background_activity;
		this.nearest_teammate_background_activities = nearest_teammate_background_activities;
		this.nearest_sleep = nearest_sleep;
		this.nearest_teammate_sleep = nearest_teammate_sleep;
		this.nearest_nutrition = nearest_nutrition;
		this.nearest_teammate_nutrition = nearest_teammate_nutrition;
		this.nearest_weight = nearest_weight;
		this.nearest_teammate_weight = nearest_teammate_weight;
		this.nearest_general_measurement = nearest_general_measurement;
		this.nearest_teammate_general_measurements = nearest_teammate_general_measurements;
		this.nearest_diabetes = nearest_diabetes;
		this.nearest_teammate_diabetes = nearest_teammate_diabetes;
	}

	public DiabetesMeasurement() {
		super();
	}
	@Override
	public String toString() {
		return "DiabetesMeasurement [uri="
				+ uri
				+ ", userID="
				+ userID
				+ ", timestamp="
				+ timestamp
				+ ", fasting_plasma_glucose_test="
				+ fasting_plasma_glucose_test
				+ ", random_plasma_glucose_test="
				+ random_plasma_glucose_test
				+ ", oral_glucose_tolerance_test="
				+ oral_glucose_tolerance_test
				+ ", hemoglobin_a1c="
				+ hemoglobin_a1c
				+ ", insulin="
				+ insulin
				+ ", c_peptide="
				+ c_peptide
				+ ", triglyceride="
				+ triglyceride
				+ ", previous="
				+ previous
				+ ", next="
				+ next
				+ ", nearest_fitness_activity="
				+ nearest_fitness_activity
				+ ", nearest_teammate_fitness_activities="
				+ Arrays.toString(nearest_teammate_fitness_activities)
				+ ", nearest_strength_training_activity="
				+ nearest_strength_training_activity
				+ ", nearest_teammate_strength_training_activities="
				+ Arrays.toString(nearest_teammate_strength_training_activities)
				+ ", nearest_background_activity="
				+ nearest_background_activity
				+ ", nearest_teammate_background_activities="
				+ Arrays.toString(nearest_teammate_background_activities)
				+ ", nearest_sleep=" + nearest_sleep
				+ ", nearest_teammate_sleep="
				+ Arrays.toString(nearest_teammate_sleep)
				+ ", nearest_nutrition=" + nearest_nutrition
				+ ", nearest_teammate_nutrition="
				+ Arrays.toString(nearest_teammate_nutrition)
				+ ", nearest_weight=" + nearest_weight
				+ ", nearest_teammate_weight="
				+ Arrays.toString(nearest_teammate_weight)
				+ ", nearest_general_measurement="
				+ nearest_general_measurement
				+ ", nearest_teammate_general_measurements="
				+ Arrays.toString(nearest_teammate_general_measurements)
				+ ", nearest_diabetes=" + nearest_diabetes
				+ ", nearest_teammate_diabetes="
				+ Arrays.toString(nearest_teammate_diabetes) + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((c_peptide == null) ? 0 : c_peptide.hashCode());
		result = prime
				* result
				+ ((fasting_plasma_glucose_test == null) ? 0
						: fasting_plasma_glucose_test.hashCode());
		result = prime * result
				+ ((hemoglobin_a1c == null) ? 0 : hemoglobin_a1c.hashCode());
		result = prime * result + ((insulin == null) ? 0 : insulin.hashCode());
		result = prime
				* result
				+ ((nearest_background_activity == null) ? 0
						: nearest_background_activity.hashCode());
		result = prime
				* result
				+ ((nearest_diabetes == null) ? 0 : nearest_diabetes.hashCode());
		result = prime
				* result
				+ ((nearest_fitness_activity == null) ? 0
						: nearest_fitness_activity.hashCode());
		result = prime
				* result
				+ ((nearest_general_measurement == null) ? 0
						: nearest_general_measurement.hashCode());
		result = prime
				* result
				+ ((nearest_nutrition == null) ? 0 : nearest_nutrition
						.hashCode());
		result = prime * result
				+ ((nearest_sleep == null) ? 0 : nearest_sleep.hashCode());
		result = prime
				* result
				+ ((nearest_strength_training_activity == null) ? 0
						: nearest_strength_training_activity.hashCode());
		result = prime * result
				+ Arrays.hashCode(nearest_teammate_background_activities);
		result = prime * result + Arrays.hashCode(nearest_teammate_diabetes);
		result = prime * result
				+ Arrays.hashCode(nearest_teammate_fitness_activities);
		result = prime * result
				+ Arrays.hashCode(nearest_teammate_general_measurements);
		result = prime * result + Arrays.hashCode(nearest_teammate_nutrition);
		result = prime * result + Arrays.hashCode(nearest_teammate_sleep);
		result = prime
				* result
				+ Arrays.hashCode(nearest_teammate_strength_training_activities);
		result = prime * result + Arrays.hashCode(nearest_teammate_weight);
		result = prime * result
				+ ((nearest_weight == null) ? 0 : nearest_weight.hashCode());
		result = prime * result + ((next == null) ? 0 : next.hashCode());
		result = prime
				* result
				+ ((oral_glucose_tolerance_test == null) ? 0
						: oral_glucose_tolerance_test.hashCode());
		result = prime * result
				+ ((previous == null) ? 0 : previous.hashCode());
		result = prime
				* result
				+ ((random_plasma_glucose_test == null) ? 0
						: random_plasma_glucose_test.hashCode());
		result = prime * result
				+ ((timestamp == null) ? 0 : timestamp.hashCode());
		result = prime * result
				+ ((triglyceride == null) ? 0 : triglyceride.hashCode());
		result = prime * result + ((uri == null) ? 0 : uri.hashCode());
		result = prime * result + ((userID == null) ? 0 : userID.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DiabetesMeasurement other = (DiabetesMeasurement) obj;
		if (c_peptide == null) {
			if (other.c_peptide != null)
				return false;
		} else if (!c_peptide.equals(other.c_peptide))
			return false;
		if (fasting_plasma_glucose_test == null) {
			if (other.fasting_plasma_glucose_test != null)
				return false;
		} else if (!fasting_plasma_glucose_test
				.equals(other.fasting_plasma_glucose_test))
			return false;
		if (hemoglobin_a1c == null) {
			if (other.hemoglobin_a1c != null)
				return false;
		} else if (!hemoglobin_a1c.equals(other.hemoglobin_a1c))
			return false;
		if (insulin == null) {
			if (other.insulin != null)
				return false;
		} else if (!insulin.equals(other.insulin))
			return false;
		if (nearest_background_activity == null) {
			if (other.nearest_background_activity != null)
				return false;
		} else if (!nearest_background_activity
				.equals(other.nearest_background_activity))
			return false;
		if (nearest_diabetes == null) {
			if (other.nearest_diabetes != null)
				return false;
		} else if (!nearest_diabetes.equals(other.nearest_diabetes))
			return false;
		if (nearest_fitness_activity == null) {
			if (other.nearest_fitness_activity != null)
				return false;
		} else if (!nearest_fitness_activity
				.equals(other.nearest_fitness_activity))
			return false;
		if (nearest_general_measurement == null) {
			if (other.nearest_general_measurement != null)
				return false;
		} else if (!nearest_general_measurement
				.equals(other.nearest_general_measurement))
			return false;
		if (nearest_nutrition == null) {
			if (other.nearest_nutrition != null)
				return false;
		} else if (!nearest_nutrition.equals(other.nearest_nutrition))
			return false;
		if (nearest_sleep == null) {
			if (other.nearest_sleep != null)
				return false;
		} else if (!nearest_sleep.equals(other.nearest_sleep))
			return false;
		if (nearest_strength_training_activity == null) {
			if (other.nearest_strength_training_activity != null)
				return false;
		} else if (!nearest_strength_training_activity
				.equals(other.nearest_strength_training_activity))
			return false;
		if (!Arrays.equals(nearest_teammate_background_activities,
				other.nearest_teammate_background_activities))
			return false;
		if (!Arrays.equals(nearest_teammate_diabetes,
				other.nearest_teammate_diabetes))
			return false;
		if (!Arrays.equals(nearest_teammate_fitness_activities,
				other.nearest_teammate_fitness_activities))
			return false;
		if (!Arrays.equals(nearest_teammate_general_measurements,
				other.nearest_teammate_general_measurements))
			return false;
		if (!Arrays.equals(nearest_teammate_nutrition,
				other.nearest_teammate_nutrition))
			return false;
		if (!Arrays
				.equals(nearest_teammate_sleep, other.nearest_teammate_sleep))
			return false;
		if (!Arrays.equals(nearest_teammate_strength_training_activities,
				other.nearest_teammate_strength_training_activities))
			return false;
		if (!Arrays.equals(nearest_teammate_weight,
				other.nearest_teammate_weight))
			return false;
		if (nearest_weight == null) {
			if (other.nearest_weight != null)
				return false;
		} else if (!nearest_weight.equals(other.nearest_weight))
			return false;
		if (next == null) {
			if (other.next != null)
				return false;
		} else if (!next.equals(other.next))
			return false;
		if (oral_glucose_tolerance_test == null) {
			if (other.oral_glucose_tolerance_test != null)
				return false;
		} else if (!oral_glucose_tolerance_test
				.equals(other.oral_glucose_tolerance_test))
			return false;
		if (previous == null) {
			if (other.previous != null)
				return false;
		} else if (!previous.equals(other.previous))
			return false;
		if (random_plasma_glucose_test == null) {
			if (other.random_plasma_glucose_test != null)
				return false;
		} else if (!random_plasma_glucose_test
				.equals(other.random_plasma_glucose_test))
			return false;
		if (timestamp == null) {
			if (other.timestamp != null)
				return false;
		} else if (!timestamp.equals(other.timestamp))
			return false;
		if (triglyceride == null) {
			if (other.triglyceride != null)
				return false;
		} else if (!triglyceride.equals(other.triglyceride))
			return false;
		if (uri == null) {
			if (other.uri != null)
				return false;
		} else if (!uri.equals(other.uri))
			return false;
		if (userID == null) {
			if (other.userID != null)
				return false;
		} else if (!userID.equals(other.userID))
			return false;
		return true;
	}
}