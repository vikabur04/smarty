package com.example.medic.HelloPage;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.medic.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link OnboardTwo#newInstance} factory method to
 * create an instance of this fragment.
 */
public class OnboardTwo extends Fragment {

    private ImageView mImageView;
    private int mImageId;

    public OnboardTwo() {
    }

    // TODO: Rename and change types and number of parameters
    public static OnboardTwo newInstance(int imageId) {
        OnboardTwo fragment = new OnboardTwo();
        Bundle args = new Bundle();
        args.putInt("image_id", imageId);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mImageId = getArguments().getInt("image_id");
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.two, container, false);
        mImageView = view.findViewById(R.id.imageFrag2);
        mImageView.setImageResource(mImageId);
        return view;
    }
}