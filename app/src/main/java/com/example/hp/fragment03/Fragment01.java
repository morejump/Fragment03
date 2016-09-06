package com.example.hp.fragment03;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment01 extends Fragment implements View.OnClickListener{


    public Fragment01() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_fragment01, container, false);
        // Inflate the layout for this fragment
        init(view);
        return view;
    }
    private void init(View view){
        ImageView imageView = (ImageView) view.findViewById(R.id.imag_avatar);
        imageView.setOnClickListener(this);

    }
    public void openFragment(Fragment fragment){
        FragmentTransaction transaction= getFragmentManager().beginTransaction();
        transaction.replace(R.id.container,fragment);
        transaction.commit();
    }

    @Override
    public void onClick(View view) {
        openFragment(new Fragment02());

    }
}
