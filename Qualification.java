package com.example.demo.model;

public class Qualification {
	private String qualification;
	private int finalPercentage;
	private int interviewScore;
	private int technicalScore;
	private int communicationScore;
	
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getFinalPercentage() {
		return finalPercentage;
	}
	public void setFinalPercentage(int finalPercentage) {
		this.finalPercentage = finalPercentage;
	}
	public int getInterviewScore() {
		return interviewScore;
	}
	public void setInterviewScore(int interviewScore) {
		this.interviewScore = interviewScore;
	}
	public int getCommunicationScore() {
		return communicationScore;
	}
	public void setCommunicationScore(int communicationScore) {
		this.communicationScore = communicationScore;
	}
	public int getTechnicalScore() {
		return technicalScore;
	}
	public void setTechnicalScore(int technicalScore) {
		this.technicalScore = technicalScore;
	}
	@Override
	public String toString() {
		return "Qualification [qualification=" + qualification + ", finalPercentage=" + finalPercentage
				+ ", interviewScore=" + interviewScore +", technicalScore=" + technicalScore + " ,communicationScore=" + communicationScore
				+"]";
	}
	
	

}
