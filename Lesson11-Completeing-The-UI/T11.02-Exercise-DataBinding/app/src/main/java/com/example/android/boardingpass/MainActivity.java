package com.example.android.boardingpass;

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

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.format.DateUtils;

import com.example.android.boardingpass.databinding.ActivityMainBinding;
import com.example.android.boardingpass.utilities.FakeDataUtils;

public class MainActivity extends AppCompatActivity {

    //DO (3) Create a data binding instance called mBinding of type ActivityMainBinding
    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        BoardingPassInfo boardingPassInfo = FakeDataUtils.generateFakeBoardingPassInfo();
        displayBoardingPassInfo(boardingPassInfo);
        // DO (4) Set the Content View using DataBindingUtil to the activity_main layout

        // DO (5) Load a BoardingPassInfo object with fake data using FakeDataUtils

        // DO (9) Call displayBoardingPassInfo and pass the fake BoardingInfo instance

    }

    private void displayBoardingPassInfo(BoardingPassInfo info) {

        //DO (6) Use mBinding to set the Text in all the textViews using the data in info
        mBinding.textViewArrivalTime.setText(
                DateUtils.formatDateTime(this, info.arrivalTime.getTime(), DateUtils.FORMAT_SHOW_TIME));
        mBinding.textViewBoardingInCountdown.setText(DateUtils.formatElapsedTime(info.getMinutesUntilBoarding() * 60));
        mBinding.textViewBoardingTime.setText(
                DateUtils.formatDateTime(this, info.boardingTime.getTime(), DateUtils.FORMAT_SHOW_TIME));
        mBinding.textViewDepartureTime.setText(
                DateUtils.formatDateTime(this, info.departureTime.getTime(), DateUtils.FORMAT_SHOW_TIME));
        mBinding.textViewDestinationAirport.setText(info.destCode);
        mBinding.textViewFlightCode.setText(info.flightCode);
        mBinding.textViewGate.setText(info.departureGate);
        mBinding.textViewOriginAirport.setText(info.originCode);
        mBinding.textViewPassengerName.setText(info.passengerName);
        mBinding.textViewSeat.setText(info.seatNumber);
        mBinding.textViewTerminal.setText(info.departureTerminal);


        // DO (7) Use a SimpleDateFormat formatter to set the formatted value in time text views

        // DO (8) Use TimeUnit methods to format the total minutes until boarding

    }
}

