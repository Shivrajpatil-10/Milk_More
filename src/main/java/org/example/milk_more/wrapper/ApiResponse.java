package org.example.milk_more.wrapper;

public class ApiResponse<T> {
    private String name;
    private T data;

    public ApiResponse(){

    }

    public ApiResponse(String name, T data) {
        this.name = name;
        this.data = data;
    }

    public String getname() {
        return name;
    }

    public T getData() {
        return data;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setData(T data) {
        this.data = data;
    }
}
