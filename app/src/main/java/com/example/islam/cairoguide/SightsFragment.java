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
 * {@link Fragment} that displays a list of sights.
 */
public class SightsFragment extends Fragment {

    public SightsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Egyptian pyramids",
                "Al Haram, Nazlet El-Semman, Al Haram, Giza Governorate",
                R.drawable.sights_pyramids));
        places.add(new Place("Abdeen Palace Museum",
                "El-Gomhoreya Square, Rahbet Abdin, Abdeen, Cairo Governorate",
                R.drawable.sights_abdeen_palace_museum));
        places.add(new Place("Khan Al-Khalili",
                " El-Gamaleya, Qism El-Gamaleya, Cairo Governorate",
                R.drawable.sights_khan_alkhalili));
        places.add(new Place("Al-Azhar Park",
                "Al-Azhar Park",
                "02 25103868",
                R.drawable.sights_alazhar_park));
        places.add(new Place("Al-Azhar Mosque",
                "El-Darb El-Ahmar, Cairo Governorate",
                R.drawable.sights_alazhar_mosque));
        places.add(new Place("Salah El Din Al Ayouby Citadel",
                "Al Abageyah, Qesm Al Khalifah، Cairo Governorate",
                " 02 25121735",
                R.drawable.sights_salaha_eldeen_citadel));
        places.add(new Place("Cairo Tower",
                " Zamalek, Cairo Governorate",
                R.drawable.sights_cairo_tower));
        places.add(new Place("Giza Zoo",
                "Charles De Gaulle، Road، Oula, Giza Governorate 12612",
                R.drawable.sights_giza_zoo));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_sights);

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
