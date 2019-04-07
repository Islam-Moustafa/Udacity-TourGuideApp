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
 * {@link Fragment} that displays a list of hotels.
 */
public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Four Seasons Hotel Cairo at Nile Plaza",
                "1089 CORNICHE EL NIL, Qasr an Nile, Cairo Governorate 11519",
                "02 27917000",
                R.drawable.hotels_fourseason,
                4687));
        places.add(new Place("Ramses Hilton",
                "1115 Nile Corniche, Sharkas, Boulaq, Cairo Governorate",
                "02 25777444",
                R.drawable.hotels_ramses_hilton,
                1952));
        places.add(new Place("InterContinental Cairo Citystars",
                "Omar Ibn El-Khattab, Masaken Al Mohandesin, Nasr City, Cairo Governorate",
                "02 24800100",
                R.drawable.hotels_intercontinental_citystars,
                3389));
        places.add(new Place("JW Marriott Hotel Cairo",
                "Ring Road- Mirage City, Cairo Governorate 11757",
                "02 24115588",
                R.drawable.hotels_jw,
                3322));
        places.add(new Place("Holiday Inn Cairo - Citystars",
                "Ali, Rashid St., Heliopolis, Cairo Governorate 11757",
                "02 24803000",
                R.drawable.hotels_holidy_inn_citystar,
                2531));
        places.add(new Place("The Nile Ritz-Carlton, Cairo",
                "1113 Corniche El Nil, Ismailia, Qasr an Nile, Cairo Governorate ",
                "02 25778899",
                R.drawable.hotels_ritez,
                3978));
        places.add(new Place("InterContinental Cairo Semiramis",
                "Corniche El Nil, Qasr Ad Dobarah, Qasr an Nile, Cairo ",
                "02 27988000",
                R.drawable.hotels_semiramis,
                2318));
        places.add(new Place("Hilton Cairo Zamalek Residences",
                "21 Mohammed Mazhar, Zamalek, Giza Governorate 11211",
                "02 27370055",
                R.drawable.hotels_hilton_zamalek,
                2634));


        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_hotels);

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
