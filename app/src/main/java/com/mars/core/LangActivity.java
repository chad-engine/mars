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
import com.islamdidarmd.adblockerwebview.*;
import com.monstertechno.adblocker.*;
import androidx.webkit.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class LangActivity extends AppCompatActivity {
	
	
	private LinearLayout linear26;
	private LinearLayout card1;
	private LinearLayout linear29;
	private LinearLayout linear33;
	private LinearLayout linear30;
	private TextView textview9;
	private TextView textview2;
	private TextView textview6;
	private LinearLayout linear34;
	private TextView textview7;
	private TextView textview8;
	private LinearLayout linear32;
	private TextView textview4;
	private TextView textview5;
	private LinearLayout linear37;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.lang);
		initialize(_savedInstanceState);
		
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear26 = findViewById(R.id.linear26);
		card1 = findViewById(R.id.card1);
		linear29 = findViewById(R.id.linear29);
		linear33 = findViewById(R.id.linear33);
		linear30 = findViewById(R.id.linear30);
		textview9 = findViewById(R.id.textview9);
		textview2 = findViewById(R.id.textview2);
		textview6 = findViewById(R.id.textview6);
		linear34 = findViewById(R.id.linear34);
		textview7 = findViewById(R.id.textview7);
		textview8 = findViewById(R.id.textview8);
		linear32 = findViewById(R.id.linear32);
		textview4 = findViewById(R.id.textview4);
		textview5 = findViewById(R.id.textview5);
		linear37 = findViewById(R.id.linear37);
	}
	
	private void initializeLogic() {
		android.graphics.drawable.GradientDrawable gd1 = new android.graphics.drawable.GradientDrawable();
		gd1.setColor(Color.parseColor("#FF212121"));
		gd1.setCornerRadius(16);
		card1.setBackground(gd1);
		card1.setElevation(5f);
		_NavStatusBarColor("#000000", "#000000");
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _NavStatusBarColor(final String _color1, final String _color2) {
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) {
			Window w = this.getWindow();	w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);	w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			w.setStatusBarColor(Color.parseColor("#" + _color1.replace("#", "")));	w.setNavigationBarColor(Color.parseColor("#" + _color2.replace("#", "")));
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