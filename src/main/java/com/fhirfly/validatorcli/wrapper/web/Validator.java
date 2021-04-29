package com.fhirfly.validatorcli.wrapper.web;

public class Validator {

  private String ig;
  private String fhirVersion;
  private String fileName;
  

  public long getIG() {
    return ig;
  }

  public void setIG(String ig) {
    this.ig = ig;
  }

  public String getfhirVersion() {
    return fhirVersion;
  }

  public void setfhirVersion(String fhirVersion) {
    this.fhirVersion = fhirVersion;
  }

  public String getfileName() {
    return fileName;
  }

  public void setfileName(String fileName) {
    this.fileName = fileName;
  }

}