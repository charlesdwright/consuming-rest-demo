package com.spring.consumingrestdemo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
    public Quote(){}
/*
// local case ex: {"id":6,"content":"Hello, World!"}
//"http://localhost:8081/greeting"
    private int id;
    private String content;

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    @Override
    public String toString() {
        return "Quote:{" + "id= " + id + ", content= '" + content + '\'' + '}';
    }
*/

//tutorial case
//"https://quoters.apps.pcfone.io/api/random"

    private String type;
    private Value value;

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public Value getValue() { return value; }
    public void setValue(Value value) { this.value = value; }

    @Override
    public String toString() {
        return "Quote:{" + "type='" + type + '\'' +". value=" + value + '}';
    }

}
