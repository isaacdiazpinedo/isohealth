package com.isobar.isohealth.models;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonSerialize(include = Inclusion.NON_NULL)
public class NewSleepMeasurement {
	String timestamp; // The time at which the measurement was taken (e.g., "Sat, 1 Jan 2011 00:00:00")
	
	//	One of the following values: total_sleep, rem, deep, light, times_woken, awake, zq	
	Double total_sleep; // The value of the measured quantity
	Double rem; // The value of the measured quantity
	Double deep; // The value of the measured quantity
	Double light; // The value of the measured quantity
	Double times_woken; // The value of the measured quantity
	Double awake; // The value of the measured quantity
	Double zq; // The value of the measured quantity

	Boolean post_to_twitter; // Whether to post this measurement to Twitter (optional; if omitted, the user's default setting will be used)
	Boolean post_to_facebook; // Whether to post this measurement to Facebook (optional; if omitted, the user's default setting will be used)
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public Double getTotal_sleep() {
		return total_sleep;
	}
	public void setTotal_sleep(Double total_sleep) {
		this.total_sleep = total_sleep;
	}
	public Double getRem() {
		return rem;
	}
	public void setRem(Double rem) {
		this.rem = rem;
	}
	public Double getDeep() {
		return deep;
	}
	public void setDeep(Double deep) {
		this.deep = deep;
	}
	public Double getLight() {
		return light;
	}
	public void setLight(Double light) {
		this.light = light;
	}
	public Double getTimes_woken() {
		return times_woken;
	}
	public void setTimes_woken(Double times_woken) {
		this.times_woken = times_woken;
	}
	public Double getAwake() {
		return awake;
	}
	public void setAwake(Double awake) {
		this.awake = awake;
	}
	public Double getZq() {
		return zq;
	}
	public void setZq(Double zq) {
		this.zq = zq;
	}
	public Boolean getPost_to_twitter() {
		return post_to_twitter;
	}
	public void setPost_to_twitter(Boolean post_to_twitter) {
		this.post_to_twitter = post_to_twitter;
	}
	public Boolean getPost_to_facebook() {
		return post_to_facebook;
	}
	public void setPost_to_facebook(Boolean post_to_facebook) {
		this.post_to_facebook = post_to_facebook;
	}
	public NewSleepMeasurement(String timestamp, Double total_sleep,
			Double rem, Double deep, Double light, Double times_woken,
			Double awake, Double zq, Boolean post_to_twitter,
			Boolean post_to_facebook) {
		super();
		this.timestamp = timestamp;
		this.total_sleep = total_sleep;
		this.rem = rem;
		this.deep = deep;
		this.light = light;
		this.times_woken = times_woken;
		this.awake = awake;
		this.zq = zq;
		this.post_to_twitter = post_to_twitter;
		this.post_to_facebook = post_to_facebook;
	}
	public NewSleepMeasurement() {
		super();
	}
	@Override
	public String toString() {
		return "NewSleepMeasurement [timestamp=" + timestamp + ", total_sleep="
				+ total_sleep + ", rem=" + rem + ", deep=" + deep + ", light="
				+ light + ", times_woken=" + times_woken + ", awake=" + awake
				+ ", zq=" + zq + ", post_to_twitter=" + post_to_twitter
				+ ", post_to_facebook=" + post_to_facebook + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((awake == null) ? 0 : awake.hashCode());
		result = prime * result + ((deep == null) ? 0 : deep.hashCode());
		result = prime * result + ((light == null) ? 0 : light.hashCode());
		result = prime
				* result
				+ ((post_to_facebook == null) ? 0 : post_to_facebook.hashCode());
		result = prime * result
				+ ((post_to_twitter == null) ? 0 : post_to_twitter.hashCode());
		result = prime * result + ((rem == null) ? 0 : rem.hashCode());
		result = prime * result
				+ ((times_woken == null) ? 0 : times_woken.hashCode());
		result = prime * result
				+ ((timestamp == null) ? 0 : timestamp.hashCode());
		result = prime * result
				+ ((total_sleep == null) ? 0 : total_sleep.hashCode());
		result = prime * result + ((zq == null) ? 0 : zq.hashCode());
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
		NewSleepMeasurement other = (NewSleepMeasurement) obj;
		if (awake == null) {
			if (other.awake != null)
				return false;
		} else if (!awake.equals(other.awake))
			return false;
		if (deep == null) {
			if (other.deep != null)
				return false;
		} else if (!deep.equals(other.deep))
			return false;
		if (light == null) {
			if (other.light != null)
				return false;
		} else if (!light.equals(other.light))
			return false;
		if (post_to_facebook == null) {
			if (other.post_to_facebook != null)
				return false;
		} else if (!post_to_facebook.equals(other.post_to_facebook))
			return false;
		if (post_to_twitter == null) {
			if (other.post_to_twitter != null)
				return false;
		} else if (!post_to_twitter.equals(other.post_to_twitter))
			return false;
		if (rem == null) {
			if (other.rem != null)
				return false;
		} else if (!rem.equals(other.rem))
			return false;
		if (times_woken == null) {
			if (other.times_woken != null)
				return false;
		} else if (!times_woken.equals(other.times_woken))
			return false;
		if (timestamp == null) {
			if (other.timestamp != null)
				return false;
		} else if (!timestamp.equals(other.timestamp))
			return false;
		if (total_sleep == null) {
			if (other.total_sleep != null)
				return false;
		} else if (!total_sleep.equals(other.total_sleep))
			return false;
		if (zq == null) {
			if (other.zq != null)
				return false;
		} else if (!zq.equals(other.zq))
			return false;
		return true;
	}
}
