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
				news.setTitle("Yenilik Geçmişi");
				news.setMessage("MARS 10\nYEPYENİ BİR MARS!\nuyarı:bu güncelleme çok büyük lol\n\nYENİ ŞEYLER\n-Önbellek temizleyici poog!\n-Daha iyi vpn!\n-Yeni logo font!\n-Gizlilik koruması!\n-Yeni Ana sayfa!\n\nChad Yenilikleri:\nDaha iyi Css desteği!\n\nVe bundan daha fazlası!1!!1!1!1\n\n\nMARS 6.0 \n\n-Yeni ayarlar menüsü\n-Chad 6.2\n-Drawer değiklikleri\n-Eğer website gizlilik konusunda güvenli değilse artık uyarı geliyor lol\n-Hava durumu uygulamalara Koyuldu lol\n\nMARS 5.1\n\n-Mars basit site is here artık Mobil veri ile Veri Tasafurufu sağlayabilircrksnz\n-Mars Tor is heer\n-Arama çubuğuna uzun basınca artık tam url geliyor oha\n-Dünyanın en iyi yıldız ver dialgou eklendi\n-Compatible whit Forge 36.0.0\n\nMARS 5.0\n\n-Always https\n-Tam URL editi\n-Ana menüde buton sıralama değişiklikleri\n-Daha iyi vpn \n-B L U R P L E\n-hata düzeltmeleri n stuff\n\nMars browser 4:\n \n-Ungoogled Chromium ve duckduckgo!\n-Tamamen yeni Ui\n-Mars vpn!\n-Eklentiler\n-Yeni İndirme yöneticisi!\n-Yeni Açılış ekranı!\n-Google profil yöneticisi!\n(Şifre yöneticisi yani Lol)\n-Oyunlar!\n-MarsDevtools\n\nDaha fazla şey:\n-Saymaya üşeniyorum kekw\n\n4.0 PREA1\n-hata düzeltmeleri\n\n4.0b1a\n🔑Mars vpn!\n🔒Always https\n🧩Eklentiler\n📥yeni indirme yöneticisi\n👨‍💻 Mars devtools!\n\n4.0 mini beta\n-Mars Vpn Burda!\n-Yeni Hakkında menüsü\n-Yeee\n\n4.0 EARLY-BETA 2 (MARS Uİ 2)\n-Title Artık Android sürümü içeriyor\n-Artik Pc modu daha gelişmiş!\n-mars://relax eklendi\n-Hata Düzeltmeleri ve Değişikler\n\n\n4.0 EARLY-BETA 1 (MARS Uİ 2)\n-Mars Ui 2 Burda!\nArtık Daha iyi renkler ve özellikler var!\n\n-Google Profili\n-artık Google profili eklendi\n\n3.3.1\n-Hata Düzeltmeleri ve ufak değişiklikler.\nörn:min api 21,max (hedef) 29 a çekildi.\n\n3.1 (MarsUi 1.1)\n\n-Hava Durumu! \nyeee\n\n-Şifre Yöneticisi\noa\n\n-Oyun eklendi \nwow\n\n-Daha ii Dialoglar\nyes.\n\n-Artik kaynak kodu go brr\n</> tusuna basarak kod göster snrm\n\n-pc modu yenilendi!\nana ekreandan ulasabiluyoruz\n\n-zoom modu eklendi!\nparmakla yakınlaşmayi desteklemeyen siteler için \n\n-Drawer değişikliği oldu yey\ncorner yey\n\n-Daha iyi ikonlar fln\nikonlar değişti (kısmen..)\n\n-Ve daha fazla Miim\nhaha yes\n\n-Ve daha fazla değişiklik \nbaya bir şey ...\n\n3.0 (Mars Ui 1)\n-Indirme Yöneticisi!\nartık mars browserden birşeyler indirebileceksiniz!\n\n-Kısayol!\nHaha komedi\n\n-Odak modu !\nartık arama çubuğunu gösterme yerine odak modu eklndi\nAyyy sertifika\nOA SERTIFIKA EKLENMIS! \n\n---Ui yenilikleri---\n1.Yeni,sade drawer!\n-Artık drawer daha güzel bir şekilde duruyor!\n-Twitter Ve discord linkleri eklendi. \n\n2.Daha rahat anlaşılabilen ana ekran.\n-Yeni tam url,kopyalma Ve paylasma özelliği \n-Yes\n\n2.2 (no ui)\nmars browser yeniledi \n•Yeni Tasarım \n• Yeni Güvenlik sistemi \nVe daha da fazlası!\n\n2.0\nilk gplay yayınlama \n\n2.0 dan önce:\nboşluk ve hiç bir şey \n");
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