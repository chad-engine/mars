package com.mars.core;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ImageView;
import com.google.android.material.button.*;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.islamdidarmd.adblockerwebview.*;
import com.monstertechno.adblocker.*;
import androidx.webkit.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class AboutActivity extends AppCompatActivity {
	
	
	private LinearLayout linear1;
	private LinearLayout linear25;
	private LinearLayout card1;
	private LinearLayout linear24;
	private LinearLayout linear30;
	private TextView textview6;
	private LinearLayout linear29;
	private ImageView imageview;
	private TextView textview5;
	private TextView textview8;
	private MaterialButton materialbutton1;
	private MaterialButton materialbutton2;
	private MaterialButton materialbutton3;
	
	private Intent ii = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.about);
		initialize(_savedInstanceState);
		
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = findViewById(R.id.linear1);
		linear25 = findViewById(R.id.linear25);
		card1 = findViewById(R.id.card1);
		linear24 = findViewById(R.id.linear24);
		linear30 = findViewById(R.id.linear30);
		textview6 = findViewById(R.id.textview6);
		linear29 = findViewById(R.id.linear29);
		imageview = findViewById(R.id.imageview);
		textview5 = findViewById(R.id.textview5);
		textview8 = findViewById(R.id.textview8);
		materialbutton1 = findViewById(R.id.materialbutton1);
		materialbutton2 = findViewById(R.id.materialbutton2);
		materialbutton3 = findViewById(R.id.materialbutton3);
		
		materialbutton1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ii.setClass(getApplicationContext(), LsncActivity.class);
				startActivity(ii);
			}
		});
		
		materialbutton2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ii.setAction(Intent.ACTION_VIEW);
				ii.setData(Uri.parse("https://github.com/chad-engine"));
				startActivity(ii);
			}
		});
		
		materialbutton3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ii.setClass(getApplicationContext(), HukukActivity.class);
				startActivity(ii);
			}
		});
	}
	
	private void initializeLogic() {
		android.graphics.drawable.GradientDrawable gd1 = new android.graphics.drawable.GradientDrawable();
		gd1.setColor(Color.parseColor("#AB47BC"));
		gd1.setCornerRadius(16);
		card1.setBackground(gd1);
		card1.setElevation(5f);
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}