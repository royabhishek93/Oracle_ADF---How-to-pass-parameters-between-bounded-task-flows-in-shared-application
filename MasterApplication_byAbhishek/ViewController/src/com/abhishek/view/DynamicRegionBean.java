package com.abhishek.view;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;

import oracle.adf.controller.TaskFlowId;

public class DynamicRegionBean implements Serializable {
    private String taskFlowId = "/WEB-INF/task-flow-1.xml#task-flow-1";
    private Map<String, Object> parameterMap = new HashMap<String, Object>();
    String srt = "Default First App";


    private void setParameterVal() {
        parameterMap.put("Parameter1", srt);

    }

    public DynamicRegionBean() {
        setParameterVal();
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public void setDynamicTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }

    public String taskflow1() {
        srt = "Call Application 1";
        setParameterVal();
        setDynamicTaskFlowId("/WEB-INF/task-flow-1.xml#task-flow-1");
        return null;
    }

    public String taskflow2() {
        srt = "Call Application 2";
        setParameterVal();
        setDynamicTaskFlowId("/WEB-INF/task-flow-2.xml#task-flow-2");
        return null;
    }

    public void setParameterMap(Map parameterMap) {
        this.parameterMap = parameterMap;
    }

    public Map getParameterMap() {
        return parameterMap;
    }
}
