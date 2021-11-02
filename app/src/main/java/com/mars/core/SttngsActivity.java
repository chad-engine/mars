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
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;
import android.app.Activity;
import android.content.SharedPreferences;
import java.util.Timer;
import java.util.TimerTask;
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


public class SttngsActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private String date = "";
	
	private LinearLayout linear16;
	private LinearLayout card1;
	private ImageView imageview1;
	private TextView textview5;
	private TextView textview10;
	private LinearLayout linear20;
	private LinearLayout card;
	private LinearLayout linear21;
	private LinearLayout linear19;
	private LinearLayout duck;
	private LinearLayout searx;
	private LinearLayout startpage;
	private LinearLayout yandex;
	private LinearLayout tr;
	private LinearLayout bing;
	private TextView textview6;
	private TextView textview15;
	private TextView textview16;
	private TextView textview9;
	private TextView textview8;
	private TextView textview7;
	
	private Intent ii = new Intent();
	private SharedPreferences aaash;
	private SharedPreferences pt;
	private TimerTask iii;
	private AlertDialog.Builder about;
	private Calendar time = Calendar.getInstance();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.sttngs);
		initialize(_savedInstanceState);
		
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear16 = findViewById(R.id.linear16);
		card1 = findViewById(R.id.card1);
		imageview1 = findViewById(R.id.imageview1);
		textview5 = findViewById(R.id.textview5);
		textview10 = findViewById(R.id.textview10);
		linear20 = findViewById(R.id.linear20);
		card = findViewById(R.id.card);
		linear21 = findViewById(R.id.linear21);
		linear19 = findViewById(R.id.linear19);
		duck = findViewById(R.id.duck);
		searx = findViewById(R.id.searx);
		startpage = findViewById(R.id.startpage);
		yandex = findViewById(R.id.yandex);
		tr = findViewById(R.id.tr);
		bing = findViewById(R.id.bing);
		textview6 = findViewById(R.id.textview6);
		textview15 = findViewById(R.id.textview15);
		textview16 = findViewById(R.id.textview16);
		textview9 = findViewById(R.id.textview9);
		textview8 = findViewById(R.id.textview8);
		textview7 = findViewById(R.id.textview7);
		aaash = getSharedPreferences("ash", Activity.MODE_PRIVATE);
		pt = getSharedPreferences("db", Activity.MODE_PRIVATE);
		about = new AlertDialog.Builder(this);
		
		textview5.setOnLongClickListener(new View.OnLongClickListener() {
			 @Override
				public boolean onLongClick(View _view) {
				
				return true;
				}
			 });
		
		textview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		duck.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "DDG seçildi");
				pt.edit().putString("muz", "https://duckduckgo.com/?q=").commit();
				pt.edit().putString("muuuuz", "https://start.duckduckgo.com").commit();
				pt.edit().putString("search", "true").commit();
				duck.setAlpha((float)(0.5d));
				iii = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								duck.setAlpha((float)(1.0d));
							}
						});
					}
				};
				_timer.schedule(iii, (int)(500));
			}
		});
		
		searx.setOnLongClickListener(new View.OnLongClickListener() {
			 @Override
				public boolean onLongClick(View _view) {
				
				return true;
				}
			 });
		
		searx.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Searx seçildi");
				pt.edit().putString("muz", "https://searx.bar/search?q=").commit();
				pt.edit().putString("muuuuz", "https://searx.bar/").commit();
				pt.edit().putString("search", "true").commit();
				searx.setAlpha((float)(0.5d));
				iii = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								searx.setAlpha((float)(1.0d));
							}
						});
					}
				};
				_timer.schedule(iii, (int)(500));
			}
		});
		
		startpage.setOnLongClickListener(new View.OnLongClickListener() {
			 @Override
				public boolean onLongClick(View _view) {
				
				return true;
				}
			 });
		
		startpage.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Startpage seçildi");
				pt.edit().putString("muz", "https://startpage.com/sp/search?query=").commit();
				pt.edit().putString("muuuuz", "https://startpage.com/?t=nite").commit();
				pt.edit().putString("search", "true").commit();
				startpage.setAlpha((float)(0.5d));
				iii = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								startpage.setAlpha((float)(1.0d));
							}
						});
					}
				};
				_timer.schedule(iii, (int)(500));
			}
		});
		
		yandex.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Yandex seçildi");
				pt.edit().putString("muz", "https://yandex.com.tr/search/touch/?text=").commit();
				pt.edit().putString("muuuuz", "https://yandex.com.tr/ ").commit();
				pt.edit().putString("search", "true").commit();
				yandex.setAlpha((float)(0.5d));
				iii = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								yandex.setAlpha((float)(1.0d));
							}
						});
					}
				};
				_timer.schedule(iii, (int)(500));
			}
		});
		
		tr.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Yahoo seçildi");
				pt.edit().putString("muz", "https://search.yahoo.com/search?p=").commit();
				pt.edit().putString("muuuuz", "https://search.yahoo.com/ ").commit();
				pt.edit().putString("search", "true").commit();
				tr.setAlpha((float)(0.5d));
				iii = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								tr.setAlpha((float)(1.0d));
							}
						});
					}
				};
				_timer.schedule(iii, (int)(500));
			}
		});
		
		bing.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Bing seçildi");
				pt.edit().putString("muz", "https://www.bing.com/search?q=").commit();
				pt.edit().putString("search", "true").commit();
				pt.edit().putString("muuuuz", "https://bing.com").commit();
				bing.setAlpha((float)(0.5d));
				iii = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								bing.setAlpha((float)(1.0d));
							}
						});
					}
				};
				_timer.schedule(iii, (int)(500));
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
		gd2.setCornerRadius(10);
		card.setBackground(gd2);
		card.setElevation(5f);
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
		ii.setClass(getApplicationContext(), SelectActivity.class);
		startActivity(ii);
		finish();
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