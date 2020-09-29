package com.petersen.songr;

public class Emotion {
    String feeling;
    boolean causesCrying;
    String personFeelingIt;
    int level;
    String reason;

    public Emotion(String feeling, boolean causesCrying, String personFeelingIt, int level, String reason) {
        this.feeling = feeling;
        this.causesCrying = causesCrying;
        this.personFeelingIt = personFeelingIt;
        this.level = level;
        this.reason = reason;
    }

    public String getFeeling() {
        return feeling;
    }

    public void setFeeling(String feeling) {
        this.feeling = feeling;
    }

    public boolean isCausesCrying() {
        return causesCrying;
    }

    public void setCausesCrying(boolean causesCrying) {
        this.causesCrying = causesCrying;
    }

    public String getPersonFeelingIt() {
        return personFeelingIt;
    }

    public void setPersonFeelingIt(String personFeelingIt) {
        this.personFeelingIt = personFeelingIt;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
