package com.wangfengbabe.learning_spring.model;

import java.util.Date;

/**
 * Created by wangfeng on 12/06/2017.
 */
public class Spittle {

  private Long id;
  private String message;
  private Date time;
  private double latitude;
  private double longitude;

  public Spittle(String message, Date time) {
    this.message = message;
    this.time = time;
  }

  public Spittle(String message, Date time, double latitude, double longitude) {
    this.message = message;
    this.time = time;
    this.latitude = latitude;
    this.longitude = longitude;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Spittle spittle = (Spittle) o;

    if (Double.compare(spittle.latitude, latitude) != 0) {
      return false;
    }
    if (Double.compare(spittle.longitude, longitude) != 0) {
      return false;
    }
    if (id != null ? !id.equals(spittle.id) : spittle.id != null) {
      return false;
    }
    if (message != null ? !message.equals(spittle.message)
        : spittle.message != null) {
      return false;
    }
    return time != null ? time.equals(spittle.time) : spittle.time == null;
  }

  @Override
  public int hashCode() {
    int result;
    long temp;
    result = id != null ? id.hashCode() : 0;
    result = 31 * result + (message != null ? message.hashCode() : 0);
    result = 31 * result + (time != null ? time.hashCode() : 0);
    temp = Double.doubleToLongBits(latitude);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(longitude);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    return result;
  }

  public Long getId() {

    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Date getTime() {
    return time;
  }

  public void setTime(Date time) {
    this.time = time;
  }

  public double getLatitude() {
    return latitude;
  }

  public void setLatitude(double latitude) {
    this.latitude = latitude;
  }

  public double getLongitude() {
    return longitude;
  }

  public void setLongitude(double longitude) {
    this.longitude = longitude;
  }
}
