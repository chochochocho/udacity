package com.example.android.sunshine;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * Created by cho on 2017-01-02.
 */

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForcastAdapterViewHolder> {

    private String[] mWeatherData;

    @Override
    public ForcastAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.forecast_list_item;
        LayoutInflater inflater =  LayoutInflater.from(context);
        boolean sholudAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem,parent,sholudAttachToParentImmediately);

        return new ForcastAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ForcastAdapterViewHolder holder, int position) {
        String weatherForThisDay = mWeatherData[position];
        holder.mWeatherTextView.setText(weatherForThisDay);
    }

    @Override
    public int getItemCount() {
        if(mWeatherData == null)
            return 0;
        return mWeatherData.length;
    }

    public void setWeatherData(String[] data)
    {
        mWeatherData = data;
        notifyDataSetChanged();
    }

    class ForcastAdapterViewHolder extends RecyclerView.ViewHolder{

        public final TextView mWeatherTextView;

        public ForcastAdapterViewHolder(View itemView) {
            super(itemView);
            mWeatherTextView = (TextView)itemView.findViewById(R.id.tv_weather_data);
        }
    }
}
