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
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import com.islamdidarmd.adblockerwebview.*;
import com.monstertechno.adblocker.*;
import androidx.webkit.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class NewsActivity extends AppCompatActivity {
	
	
	private LinearLayout linear26;
	private LinearLayout card1;
	private LinearLayout linear27;
	private LinearLayout linear29;
	private HorizontalScrollView hscroll1;
	private LinearLayout linear28;
	private TextView textview1;
	private TextView textview2;
	private TextView textview3;
	private TextView txt_card1_desc;
	private Button button1;
	
	private Intent ii = new Intent();
	private AlertDialog.Builder news;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.news);
		initialize(_savedInstanceState);
		
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear26 = findViewById(R.id.linear26);
		card1 = findViewById(R.id.card1);
		linear27 = findViewById(R.id.linear27);
		linear29 = findViewById(R.id.linear29);
		hscroll1 = findViewById(R.id.hscroll1);
		linear28 = findViewById(R.id.linear28);
		textview1 = findViewById(R.id.textview1);
		textview2 = findViewById(R.id.textview2);
		textview3 = findViewById(R.id.textview3);
		txt_card1_desc = findViewById(R.id.txt_card1_desc);
		button1 = findViewById(R.id.button1);
		news = new AlertDialog.Builder(this);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				/*

*/
				news.setIcon(R.drawable.ic_new_releases_white);
				news.setTitle("Yenilik Ge??mi??i");
				news.setMessage("MARS 10\nYEPYEN?? B??R MARS!\nuyar??:bu g??ncelleme ??ok b??y??k lol\n\nYEN?? ??EYLER\n-??nbellek temizleyici poog!\n-Daha iyi vpn!\n-Yeni logo font!\n-Gizlilik korumas??!\n-Yeni Ana sayfa!\n\nChad Yenilikleri:\nDaha iyi Css deste??i!\n\nVe bundan daha fazlas??!1!!1!1!1\n\n\nMARS 6.0 \n\n-Yeni ayarlar men??s??\n-Chad 6.2\n-Drawer de??iklikleri\n-E??er website gizlilik konusunda g??venli de??ilse art??k uyar?? geliyor lol\n-Hava durumu uygulamalara Koyuldu lol\n\nMARS 5.1\n\n-Mars basit site is here art??k Mobil veri ile Veri Tasafurufu sa??layabilircrksnz\n-Mars Tor is heer\n-Arama ??ubu??una uzun bas??nca art??k tam url geliyor oha\n-D??nyan??n en iyi y??ld??z ver dialgou eklendi\n-Compatible whit Forge 36.0.0\n\nMARS 5.0\n\n-Always https\n-Tam URL editi\n-Ana men??de buton s??ralama de??i??iklikleri\n-Daha iyi vpn \n-B L U R P L E\n-hata d??zeltmeleri n stuff\n\nMars browser 4:\n \n-Ungoogled Chromium ve duckduckgo!\n-Tamamen yeni Ui\n-Mars vpn!\n-Eklentiler\n-Yeni ??ndirme y??neticisi!\n-Yeni A????l???? ekran??!\n-Google profil y??neticisi!\n(??ifre y??neticisi yani Lol)\n-Oyunlar!\n-MarsDevtools\n\nDaha fazla ??ey:\n-Saymaya ????eniyorum kekw\n\n4.0 PREA1\n-hata d??zeltmeleri\n\n4.0b1a\n????Mars vpn!\n????Always https\n????Eklentiler\n????yeni indirme y??neticisi\n??????????? Mars devtools!\n\n4.0 mini beta\n-Mars Vpn Burda!\n-Yeni Hakk??nda men??s??\n-Yeee\n\n4.0 EARLY-BETA 2 (MARS U?? 2)\n-Title Art??k Android s??r??m?? i??eriyor\n-Artik Pc modu daha geli??mi??!\n-mars://relax eklendi\n-Hata D??zeltmeleri ve De??i??ikler\n\n\n4.0 EARLY-BETA 1 (MARS U?? 2)\n-Mars Ui 2 Burda!\nArt??k Daha iyi renkler ve ??zellikler var!\n\n-Google Profili\n-art??k Google profili eklendi\n\n3.3.1\n-Hata D??zeltmeleri ve ufak de??i??iklikler.\n??rn:min api 21,max (hedef) 29 a ??ekildi.\n\n3.1 (MarsUi 1.1)\n\n-Hava Durumu! \nyeee\n\n-??ifre Y??neticisi\noa\n\n-Oyun eklendi \nwow\n\n-Daha ii Dialoglar\nyes.\n\n-Artik kaynak kodu go brr\n</> tusuna basarak kod g??ster snrm\n\n-pc modu yenilendi!\nana ekreandan ulasabiluyoruz\n\n-zoom modu eklendi!\nparmakla yak??nla??mayi desteklemeyen siteler i??in \n\n-Drawer de??i??ikli??i oldu yey\ncorner yey\n\n-Daha iyi ikonlar fln\nikonlar de??i??ti (k??smen..)\n\n-Ve daha fazla Miim\nhaha yes\n\n-Ve daha fazla de??i??iklik \nbaya bir ??ey ...\n\n3.0 (Mars Ui 1)\n-Indirme Y??neticisi!\nart??k mars browserden bir??eyler indirebileceksiniz!\n\n-K??sayol!\nHaha komedi\n\n-Odak modu !\nart??k arama ??ubu??unu g??sterme yerine odak modu eklndi\nAyyy sertifika\nOA SERTIFIKA EKLENMIS! \n\n---Ui yenilikleri---\n1.Yeni,sade drawer!\n-Art??k drawer daha g??zel bir ??ekilde duruyor!\n-Twitter Ve discord linkleri eklendi. \n\n2.Daha rahat anla????labilen ana ekran.\n-Yeni tam url,kopyalma Ve paylasma ??zelli??i \n-Yes\n\n2.2 (no ui)\nmars browser yeniledi \n???Yeni Tasar??m \n??? Yeni G??venlik sistemi \nVe daha da fazlas??!\n\n2.0\nilk gplay yay??nlama \n\n2.0 dan ??nce:\nbo??luk ve hi?? bir ??ey \n");
				news.setPositiveButton("Yey", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				news.create().show();
			}
		});
	}
	
	private void initializeLogic() {
		/*

*/
		news = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
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
	
	@Override
	public void onBackPressed() {
		ii.setClass(getApplicationContext(), MainActivity.class);
		startActivity(ii);
	}
	public void _vol999(final AlertDialog.Builder _dialog) {
		_dialog.setIcon(R.drawable.ic_new_releases_white);
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