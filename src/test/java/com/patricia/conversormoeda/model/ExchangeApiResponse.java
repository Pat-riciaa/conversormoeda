package com.patricia.conversormoeda.model;

import java.util.Map;

public class ExchangeApiResponse {
    private boolean success;
    private Map<String, Object> query;
    private Map<String, Object> info;
    private double result;

    public boolean isSuccess() { return success; }
    public void setSuccess(boolean success) { this.success = success; }

    public Map<String, Object> getQuery() { return query; }
    public void setQuery(Map<String, Object> query) { this.query = query; }

    public Map<String, Object> getInfo() { return info; }
    public void setInfo(Map<String, Object> info) { this.info = info; }

    public double getResult() { return result; }
    public void setResult(double result) { this.result = result; }
}

