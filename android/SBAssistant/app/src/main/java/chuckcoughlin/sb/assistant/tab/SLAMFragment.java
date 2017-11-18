/**
 * Copyright 2017 Charles Coughlin. All rights reserved.
 *  (MIT License)
 */

package chuckcoughlin.sb.assistant.tab;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import chuckcoughlin.sb.assistant.R;

/**
 * This fragment handles robot control during its SLAM
 * mapping sequence.
 */

public class SLAMFragment extends BasicAssistantFragment {

    // Inflate the view. It holds a single image - the results of the mapping sequence
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.SLAM_fragment, container, false);
        TextView tvLabel = (TextView) view.findViewById(R.id.txtMain);
        tvLabel.setText(title);

        ImageView imageView = (ImageView) view.findViewById(R.id.imgMain);
        imageView.setImageResource(image);
        return view;
    }
}
