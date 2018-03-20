package com.example.sanjum.currencyexchange.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by sanjum on 3/15/2018.
 */

public class Result {

    @SerializedName("guid")
    @Expose
    public String guid;
    @SerializedName("index")
    @Expose
    public Integer index;
    @SerializedName("favoriteFruit")
    @Expose
    public String favoriteFruit;
    @SerializedName("latitude")
    @Expose
    public Float latitude;
    @SerializedName("company")
    @Expose
    public String company;
    @SerializedName("email")
    @Expose
    public String email;
    @SerializedName("picture")
    @Expose
    public String picture;
    @SerializedName("tags")
    @Expose
    public List<String> tags = null;
    @SerializedName("registered")
    @Expose
    public String registered;
    @SerializedName("eyeColor")
    @Expose
    public String eyeColor;
    @SerializedName("phone")
    @Expose
    public String phone;
    @SerializedName("address")
    @Expose
    public String address;
    @SerializedName("friends")
    @Expose
    public List<Friend> friends = null;
    @SerializedName("isActive")
    @Expose
    public Boolean isActive;
    @SerializedName("about")
    @Expose
    public String about;
    @SerializedName("balance")
    @Expose
    public String balance;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("gender")
    @Expose
    public String gender;
    @SerializedName("age")
    @Expose
    public Integer age;
    @SerializedName("greeting")
    @Expose
    public String greeting;
    @SerializedName("longitude")
    @Expose
    public Float longitude;
    @SerializedName("_id")
    @Expose
    public String id;
}
