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

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link PlaceAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Place} objects.
 */
public class PlaceAdapter extends ArrayAdapter<Place> {

    // Resource ID for the background color for this list
    private int mColorResourceId;

    /**
     * Create a new {@link PlaceAdapter} object.
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param places is the list of {@link Place}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of places
     */
    public PlaceAdapter(Context context, ArrayList<Place> places, int colorResourceId) {
        super(context, 0, places);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Place} object located at this position in the list
        Place currentPlace = getItem(position);

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Get the image of the current object and set into imageView
        imageView.setImageResource(currentPlace.getImageResourceId());

        // Find the TextView in the list_item.xml layout with the ID name.
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        // Get the name of the current object and set into TextView
        nameTextView.setText(currentPlace.getName());

        // Find the TextView in the list_item.xml layout with the ID location.
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.address);
        // Get the location of the current object and set into TextView
        locationTextView.setText(currentPlace.getmAddress());

        // Find the TextView in the list_item.xml layout with the ID location.
        TextView phoneTextView = (TextView) listItemView.findViewById(R.id.phone);
        LinearLayout parentPhone = (LinearLayout)listItemView.findViewById(R.id.parentPhone);
        // check if has phone or not
        if(currentPlace.hasPhone()){
            phoneTextView.setText(currentPlace.getmPhone());
            parentPhone.setVisibility(View.VISIBLE);
        }else {
            // hide phone icon and TextView
            parentPhone.setVisibility(View.GONE);
        }

        TextView priceTextView = (TextView) listItemView.findViewById(R.id.price);
        LinearLayout parentPrice = (LinearLayout)listItemView.findViewById(R.id.parentPrice);
        if(currentPlace.hasPrice()) {
            priceTextView.setText(String.valueOf(currentPlace.getmPrice()));
            // priceTextView.setVisibility(View.VISIBLE);
            parentPrice.setVisibility(View.VISIBLE);
        }else
            parentPrice.setVisibility(View.GONE);


        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}