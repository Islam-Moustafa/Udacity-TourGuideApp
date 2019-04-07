/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.islam.cairoguide;


// Place represent details of each place
public class Place {

    // image for place
    private int mImageResourceId ;

    // String name for place
    private String mName;

    // String location for place
    private String mAddress;

    // String phone for place
    private String mPhone;
    // constant value represents no phone provided
    private static final String NO_PHONE_PROVIDED = null;

    // price of hotels
    private int mPrice;
    // Constant value that represents no price was provided.
    private static final int NO_PRICE_PROVIDED = 0;

    // default constructor
    public Place(String name, String address, String phone, int imageResourceId) {
        mName = name;
        mAddress = address;
        mPhone = phone;
        mImageResourceId = imageResourceId;
    }

    // default constructor with price
    public Place(String name, String address, String phone, int imageResourceId, int price) {
        mName = name;
        mAddress = address;
        mPhone = phone;
        mImageResourceId = imageResourceId;
        mPrice = price;
    }

    // default constructor without phone
    public Place(String name, String address, int imageResourceId) {
        mName = name;
        mAddress = address;
        mImageResourceId = imageResourceId;
    }

    // Get image resource ID of the place
    public int getImageResourceId() {
        return mImageResourceId;
    }

    // Get name of the place
    public String getName() {
        return mName;
    }

    // Get location of the place
    public String getmAddress() {
        return mAddress;
    }

    // Get phone of the place
    public String getmPhone(){ return mPhone; }


    // Get price
    public int getmPrice(){ return mPrice; }

    // Returns whether or not there is an price .
    public boolean hasPrice() {
        return mPrice != NO_PRICE_PROVIDED;
    }

    // returns whether or not there is a phone
    public boolean hasPhone(){ return mPhone != NO_PHONE_PROVIDED; }

}