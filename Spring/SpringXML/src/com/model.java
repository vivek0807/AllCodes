package com;
import java.util.*;
public class model {
    private String pramA;
    private int paramB;
    private Map <String, String> paramC=new HashMap<>();

    public String getPramA() {
        return pramA;
    }

    public void setPramA(String pramA) {
        this.pramA = pramA;
    }

    public int getParamB() {
        return paramB;
    }

    public void setParamB(int paramB) {
        this.paramB = paramB;
    }

    public Map<String, String> getParamC() {
        return paramC;
    }

    public void setParamC(Map<String, String> paramC) {
        this.paramC = paramC;
    }
}
