package com.csform.android.uiapptemplate.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.csform.android.uiapptemplate.R;
import com.csform.android.uiapptemplate.util.ImageUtil;

public class WizardShopFragment extends Fragment {

	private static final String ARG_POSITION = "position";

	private int position;
	private ImageView image;

	public static WizardShopFragment newInstance(int position) {
		WizardShopFragment f = new WizardShopFragment();
		Bundle b = new Bundle();
		b.putInt(ARG_POSITION, position);
		f.setArguments(b);
		return f;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		position = getArguments().getInt(ARG_POSITION);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_wizard_shop,
				container, false);
		image = (ImageView) rootView
				.findViewById(R.id.fragment_wizard_shop_image);
		
		if (position == 0) {
			ImageUtil.displayImage(image, "http://pengaja.com/uiapptemplate/newphotos/shop/0.jpg", null);
		} else if (position == 1) {
			ImageUtil.displayImage(image, "http://pengaja.com/uiapptemplate/newphotos/shop/1.jpg", null);
		} else {
			ImageUtil.displayImage(image, "http://pengaja.com/uiapptemplate/newphotos/shop/2.jpg", null);
		}

		ViewCompat.setElevation(rootView, 50);
		return rootView;
	}

}