package com.ieti.easywheels.ui.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.ieti.easywheels.R;
import com.ieti.easywheels.ui.MapsActivity;
import com.ieti.easywheels.ui.fragments.steps.CapacityStep;
import com.ieti.easywheels.ui.fragments.steps.DayStep;
import com.ieti.easywheels.ui.fragments.steps.DestinationStep;
import com.ieti.easywheels.ui.fragments.steps.HourStep;
import com.ieti.easywheels.ui.fragments.steps.TypeStep;

import ernestoyaquello.com.verticalstepperform.VerticalStepperFormView;
import ernestoyaquello.com.verticalstepperform.listener.StepperFormListener;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProgramTripFragment extends Fragment implements StepperFormListener {

    private VerticalStepperFormView stepperFormView;
    private TypeStep typeStep;
    private DestinationStep destinationStep;
    private DayStep dayStep;
    private HourStep hourStep;
    private CapacityStep capacityStep;

    public ProgramTripFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        typeStep = new TypeStep(this, getContext().getString(R.string.passanger_type_step_title));
        destinationStep = new DestinationStep(getContext().getString(R.string.destination_step_title));
        dayStep = new DayStep(getContext().getString(R.string.day_step_title));
        hourStep = new HourStep(getContext().getString(R.string.hour_step_title));
        capacityStep = new CapacityStep("prueba");
        View myFragmentView = inflater.inflate(R.layout.fragment_program_trip,container,false);

        stepperFormView = myFragmentView.findViewById(R.id.stepper_form);
        stepperFormView
                .setup(this,typeStep,destinationStep, dayStep, hourStep)
                .init();
        return myFragmentView;
    }

    @Override
    public void onCompletedForm() {
        Intent intent = new Intent(getActivity(),MapsActivity.class);
        startActivity(intent);
    }

    @Override
    public void onCancelledForm() {

    }

    public void addCapacityStep() {
        stepperFormView
                .setup(this, typeStep, destinationStep, dayStep, hourStep, capacityStep)
                .init();

    }
}
