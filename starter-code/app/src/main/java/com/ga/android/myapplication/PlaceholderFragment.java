package com.ga.android.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by alanjcaceres on 7/19/16.
 */

public class PlaceholderFragment extends Fragment {
   private ImageView imageView;

   //This is a blank fragment
   //Implement your own version of Fragments for this lab

   @Nullable
   @Override
   public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      View viewRoot = inflater.inflate(R.layout.fragment_photo, container, false);
      imageView = (ImageView) viewRoot.findViewById(R.id.imageView);
      imageView.setImageResource(R.drawable.userimage);
//      imageView.setBackgroundResource(R.mipmap.user_image);
      return viewRoot;
   }
}
