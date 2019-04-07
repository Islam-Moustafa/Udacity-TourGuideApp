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


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of shops.
 */
public class ShopsFragment extends Fragment {

    public ShopsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Downtown",
                "Area A-City Center, 5th District, Road 90، Cairo Governorate",
                " 02 23146182",
                R.drawable.shops_downtown));
        places.add(new Place("Mall of Arabia",
                "6th of October City",
                R.drawable.shops_mall_of_arabia));
        places.add(new Place("Cairo Festival City Mall",
                "New Cairo",
                " 02 26186000",
                R.drawable.shops_cairo_festivals));
        places.add(new Place("City Stars",
                "Omar Ibn El-Khattab, Masaken Al Mohandesin, Nasr City, Cairo Governorate1",
                R.drawable.shops_city_stars));
        places.add(new Place("Mall of Egypt",
                "Giza- Al Wahat Al Baharia, Giza Governorate",
                R.drawable.shops_mall_of_egypt));
        places.add(new Place("Sun City Mall",
                " El-Nasr Rd, Sheraton Al Matar, Qism El-Nozha, Cairo ",
                "02 22660808",
                R.drawable.shops_sun_city_mall));
        places.add(new Place("Tiba Outlet Mall",
                " Al Manteqah Al Oula, Nasr City, Cairo Governorate",
                R.drawable.shops_tiba_mall));
        places.add(new Place("Arkadia Mall",
                "Maspero Television Building, 4، Ramela Boolak, Cairo ",
                " 0100 855 2872",
                R.drawable.shops_arkadia_mall));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_shops);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // place_list.xmll layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }


}
