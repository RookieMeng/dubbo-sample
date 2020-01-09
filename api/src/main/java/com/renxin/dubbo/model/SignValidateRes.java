package com.renxin.dubbo.model;

public class SignValidateRes {
    private boolean Result;
    private String Reason;

    public boolean isResult() {
        return Result;
    }

    public void setResult(boolean result) {
        Result = result;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String reason) {
        Reason = reason;
    }

    @Override
    public String toString() {
        return "SignValidateRes{" +
                "Result=" + Result +
                ", Reason='" + Reason + '\'' +
                '}';
    }
}
