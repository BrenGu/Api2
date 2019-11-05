package com.example.api2.model;

import java.util.ArrayList;

public class Resultados {
    private int count;
    private String next;
    private String previous;
    private ArrayList<Resultado> results = new ArrayList<Resultado>();

    public Resultados(int count, String next, String previous, ArrayList<Resultado> results) {
        this.count = count;
        this.next = next;
        this.previous = previous;
        this.results = results;
    }

    public Resultados() {
    }

    public int getCount() {
        return count;
    }

    public String getNext() {
        return next;
    }

    public String getPrevious() {
        return previous;
    }

    public ArrayList<Resultado> getResults() {
        return results;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public void setResults(ArrayList<Resultado> results) {
        this.results = results;
    }
}
