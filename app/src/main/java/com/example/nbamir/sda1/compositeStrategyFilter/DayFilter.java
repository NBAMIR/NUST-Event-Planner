package com.example.nbamir.sda1.compositeStrategyFilter;

import com.example.nbamir.sda1.EventMaker.Event;

import java.util.ArrayList;

public class DayFilter extends FilterStrategy {

    @Override
    public ArrayList<Event> filter(ArrayList<Event> eventList) {
        if(filteredList!=null){
            filteredList.clear();

        }
        for(Event e:eventList){
//            if(e.date==Calendar.getInstance().getTime()){
//                filteredList.add(e);
//            }
        }
        return filteredList;
    }
}