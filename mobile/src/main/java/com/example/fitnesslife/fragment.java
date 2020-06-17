package com.example.fitnesslife;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.one.ui.fragment.FragmentViewModel;

public class fragment extends Fragment {



















    private FragmentViewModel mViewModel;

    public static fragment newInstance () {
        return new fragment ( );
    }

    @Nullable
    @Override
    public View onCreateView ( @NonNull LayoutInflater inflater , @Nullable ViewGroup container ,
                               @Nullable Bundle savedInstanceState ) {
        return inflater.inflate ( R.layout.fragment_fragment , container , false );
    }

    @Override
    public void onActivityCreated ( @Nullable Bundle savedInstanceState ) {
        super.onActivityCreated ( savedInstanceState );
        mViewModel = ViewModelProviders.of ( this ).get ( FragmentViewModel.class );
        // TODO: Use the ViewModel
    }







}
