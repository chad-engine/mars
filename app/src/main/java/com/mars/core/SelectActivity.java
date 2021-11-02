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
import android.content.Intent;
import android.net.Uri;
import android.app.AlertDialog;
import android.content.DialogInterface;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import android.view.View;
import com.islamdidarmd.adblockerwebview.*;
import com.monstertechno.adblocker.*;
import androidx.webkit.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class SelectActivity extends AppCompatActivity {
	
	
	private String Date = "";
	private String date = "";
	
	private LinearLayout linear16;
	private LinearLayout card1;
	private LinearLayout linear21;
	private LinearLayout linear25;
	private LinearLayout linear28;
	private TextView textview19;
	private LinearLayout linear22;
	private LinearLayout linear23;
	private TextView textview16;
	private LinearLayout arm;
	private ImageView imageview2;
	private TextView textview17;
	private LinearLayout linear27;
	private LinearLayout lng;
	private ImageView imageview3;
	private TextView textview18;
	private LinearLayout linear29;
	private LinearLayout hak;
	private ImageView imageview4;
	private TextView textview20;
	
	private Intent ii = new Intent();
	private AlertDialog.Builder about;
	private Calendar time = Calendar.getInstance();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.select);
		initialize(_savedInstanceState);
		
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear16 = findViewById(R.id.linear16);
		card1 = findViewById(R.id.card1);
		linear21 = findViewById(R.id.linear21);
		linear25 = findViewById(R.id.linear25);
		linear28 = findViewById(R.id.linear28);
		textview19 = findViewById(R.id.textview19);
		linear22 = findViewById(R.id.linear22);
		linear23 = findViewById(R.id.linear23);
		textview16 = findViewById(R.id.textview16);
		arm = findViewById(R.id.arm);
		imageview2 = findViewById(R.id.imageview2);
		textview17 = findViewById(R.id.textview17);
		linear27 = findViewById(R.id.linear27);
		lng = findViewById(R.id.lng);
		imageview3 = findViewById(R.id.imageview3);
		textview18 = findViewById(R.id.textview18);
		linear29 = findViewById(R.id.linear29);
		hak = findViewById(R.id.hak);
		imageview4 = findViewById(R.id.imageview4);
		textview20 = findViewById(R.id.textview20);
		about = new AlertDialog.Builder(this);
		
		textview19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ii.setClass(getApplicationContext(), HukukActivity.class);
				startActivity(ii);
			}
		});
		
		textview16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		arm.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ii.setClass(getApplicationContext(), SttngsActivity.class);
				startActivity(ii);
			}
		});
		
		textview17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		lng.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ii.setClass(getApplicationContext(), LangActivity.class);
				startActivity(ii);
			}
		});
		
		hak.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ii.setClass(getApplicationContext(), AboutActivity.class);
				startActivity(ii);
			}
		});
	}
	
	private void initializeLogic() {
		android.graphics.drawable.GradientDrawable gd1 = new android.graphics.drawable.GradientDrawable();
		gd1.setColor(Color.parseColor("#FF212121"));
		gd1.setCornerRadius(16);
		card1.setBackground(gd1);
		card1.setElevation(5f);
		_NavStatusBarColor("#000000", "#000000");
		
		about = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		android.graphics.drawable.GradientDrawable gd2 = new android.graphics.drawable.GradientDrawable();
		gd2.setColor(Color.parseColor("#000000"));
		gd2.setCornerRadius(16);
		arm.setBackground(gd2);
		arm.setElevation(5f);
		hak.setBackground(gd2);
		hak.setElevation(5f);
		lng.setBackground(gd2);
		lng.setElevation(5f);
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Override
	public void onBackPressed() {
		ii.setClass(getApplicationContext(), MainActivity.class);
		startActivity(ii);
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