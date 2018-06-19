package com.example.android.android_me.ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

public class BodyPartFragment extends Fragment {
  public BodyPartFragment() {
  }

  @Nullable @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_body_part, container, false);
    ImageView imageView = (ImageView) view.findViewById(R.id.body_part_image_view);
    Drawable drawable = getResources().getDrawable(AndroidImageAssets.getBodies().get(0));
    imageView.setImageDrawable(drawable);
    return view;
  }
}
