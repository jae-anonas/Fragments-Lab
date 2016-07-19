package com.ga.android.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by roosevelt on 7/19/16.
 */
public class GitHubFragment extends Fragment {

    private TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(android.R.layout.simple_list_item_1, container, false);
        textView = (TextView) rootView.findViewById(android.R.id.text1);
        textView.setText("https://github.com/jae-anonas");
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        return rootView;
    }
}
