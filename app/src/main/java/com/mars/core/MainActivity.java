package com.mars.core;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import android.widget.LinearLayout;
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
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import java.util.ArrayList;
import java.util.HashMap;
import android.widget.ImageView;
import android.widget.TextView;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.widget.CheckBox;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;
import android.app.Activity;
import android.content.SharedPreferences;
import android.app.AlertDialog;
import android.content.DialogInterface;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;
import android.content.Context;
import android.os.Vibrator;
import android.content.ClipData;
import android.view.View;
import android.widget.CompoundButton;
import android.webkit.WebViewClient;
import android.content.ClipboardManager;
import com.islamdidarmd.adblockerwebview.*;
import com.monstertechno.adblocker.*;
import androidx.webkit.*;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;
import androidx.core.content.ContextCompat;
import androidx.core.app.ActivityCompat;
import android.Manifest;
import android.content.pm.PackageManager;


public class MainActivity extends AppCompatActivity {
	
	public final int REQ_CD_FP = 101;
	private Timer _timer = new Timer();
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private DrawerLayout _drawer;
	private String WBLink = "";
	private String SafeURL_HttpsForget = "";
	private boolean SafeURL_CancelLoad = false;
	private double SafeURL_IndexMin = 0;
	private String SafeURL_FixURL = "";
	private double SafeURL_IndexMax = 0;
	private boolean SafeURL_CustomReason = false;
	private String SafeURL_ErrorMessage = "";
	private boolean SafeURL_EditURL = false;
	private boolean connected = false;
	private double clock = 0;
	private String textLimit = "";
	private boolean DarkMode_IsDark = false;
	private String DarkMode_SetString = "";
	private double pcmod = 0;
	private double flash = 0;
	private double dice = 0;
	private String zaaar = "";
	private boolean zar_deneme = false;
	private double tarih = 0;
	private String date = "";
	private String fileName = "";
	private String urllll = "";
	private String search = "";
	private double en = 0;
	private String eee = "";
	private String bolgestring = "";
	private String tr = "";
	private String title = "";
	private String desc = "";
	private String loddnormallist = "";
	private String strLine2 = "";
	private String urueur = "";
	
	private ArrayList<String> list = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> SafeURL_Prevention = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> SafeURL_Illegal = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> SafeURL_Malware = new ArrayList<>();
	
	private LinearLayout card1;
	private LinearLayout linear27;
	private LinearLayout linear29;
	private LinearLayout linear1;
	private LinearLayout linear32;
	private LinearLayout linear31;
	private LinearLayout linear30;
	private LinearLayout linear26;
	private LinearLayout linear28;
	private ImageView drawsafe;
	private TextView edittext1;
	private ImageView imageview10;
	private ImageView imageview9;
	private WebView webview1;
	private ImageView pc_mod;
	private ImageView imageview4;
	private ImageView drawhome;
	private ImageView drawf5;
	private ImageView drawbrw;
	private ImageView drawnext;
	private LinearLayout _drawer_linear126;
	private LinearLayout _drawer_linear1;
	private LinearLayout _drawer_linear18;
	private LinearLayout _drawer_linear115;
	private LinearLayout _drawer_linear21;
	private LinearLayout _drawer_linear108;
	private LinearLayout _drawer_linear103;
	private ImageView _drawer_drawback;
	private LinearLayout _drawer_linear20;
	private LinearLayout _drawer_linear25;
	private LinearLayout _drawer_linear24;
	private LinearLayout _drawer_linear110;
	private ImageView _drawer_imageview1796;
	private ImageView _drawer_logo;
	private TextView _drawer_haha;
	private LinearLayout _drawer_linear101;
	private LinearLayout _drawer_linear26;
	private LinearLayout _drawer_base;
	private LinearLayout _drawer_linear17;
	private LinearLayout _drawer_linear106;
	private TextView _drawer_textview4;
	private LinearLayout _drawer_linear29;
	private ImageView _drawer_imageview1791;
	private ImageView _drawer_imageview1793;
	private ImageView _drawer_imageview1792;
	private ImageView _drawer_imageview1794;
	private ImageView _drawer_imageview2;
	private ImageView _drawer_imageview1795;
	private CheckBox _drawer_checkbox19;
	private ImageView _drawer_imageview187;
	private ImageView _drawer_imageview1797;
	private LinearLayout _drawer_linear121;
	private LinearLayout _drawer_linear127;
	private LinearLayout _drawer_linear123;
	private TextView _drawer_textview6;
	private Button _drawer_button2;
	private Button _drawer_button5;
	
	private Intent ii = new Intent();
	private SharedPreferences oto;
	private AlertDialog.Builder dia;
	private Calendar time = Calendar.getInstance();
	private TimerTask tt;
	private Vibrator webtitresim;
	private TimerTask t;
	private Intent iis = new Intent();
	private Intent b = new Intent();
	private Intent a = new Intent();
	private AlertDialog.Builder gg;
	private AlertDialog.Builder v3;
	private ProgressDialog g;
	private AlertDialog.Builder owoe;
	private AlertDialog.Builder sa;
	private AlertDialog.Builder fhfhfhhfhffh;
	private AlertDialog.Builder hey;
	private AlertDialog.Builder news;
	private AlertDialog.Builder wow;
	private AlertDialog.Builder vpn;
	private Intent be = new Intent();
	private AlertDialog.Builder add;
	private AlertDialog.Builder hesap;
	private AlertDialog.Builder zaar;
	private Intent action = new Intent();
	private Intent fp = new Intent(Intent.ACTION_GET_CONTENT);
	private Intent var = new Intent();
	private AlertDialog.Builder about;
	private SharedPreferences pt;
	private AlertDialog.Builder dev;
	private AlertDialog.Builder edit;
	private AlertDialog.Builder guh;
	private AlertDialog.Builder star;
	private AlertDialog.Builder edi387;
	private AlertDialog.Builder dialog;
	private AlertDialog.Builder sabun;
	private AlertDialog.Builder sssddsjr;
	private AlertDialog.Builder newpipe;
	private AlertDialog.Builder tor1;
	private AlertDialog.Builder tor2;
	private AlertDialog.Builder alert;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		
		if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED
		|| ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
			ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1000);
		} else {
			initializeLogic();
		}
	}
	
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		if (requestCode == 1000) {
			initializeLogic();
		}
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		_app_bar = findViewById(R.id._app_bar);
		_coordinator = findViewById(R.id._coordinator);
		_toolbar = findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		_drawer = findViewById(R.id._drawer);
		ActionBarDrawerToggle _toggle = new ActionBarDrawerToggle(MainActivity.this, _drawer, _toolbar, R.string.app_name, R.string.app_name);
		_drawer.addDrawerListener(_toggle);
		_toggle.syncState();
		
		LinearLayout _nav_view = findViewById(R.id._nav_view);
		
		card1 = findViewById(R.id.card1);
		linear27 = findViewById(R.id.linear27);
		linear29 = findViewById(R.id.linear29);
		linear1 = findViewById(R.id.linear1);
		linear32 = findViewById(R.id.linear32);
		linear31 = findViewById(R.id.linear31);
		linear30 = findViewById(R.id.linear30);
		linear26 = findViewById(R.id.linear26);
		linear28 = findViewById(R.id.linear28);
		drawsafe = findViewById(R.id.drawsafe);
		edittext1 = findViewById(R.id.edittext1);
		imageview10 = findViewById(R.id.imageview10);
		imageview9 = findViewById(R.id.imageview9);
		webview1 = findViewById(R.id.webview1);
		webview1.getSettings().setJavaScriptEnabled(true);
		webview1.getSettings().setSupportZoom(true);
		pc_mod = findViewById(R.id.pc_mod);
		imageview4 = findViewById(R.id.imageview4);
		drawhome = findViewById(R.id.drawhome);
		drawf5 = findViewById(R.id.drawf5);
		drawbrw = findViewById(R.id.drawbrw);
		drawnext = findViewById(R.id.drawnext);
		_drawer_linear126 = _nav_view.findViewById(R.id.linear126);
		_drawer_linear1 = _nav_view.findViewById(R.id.linear1);
		_drawer_linear18 = _nav_view.findViewById(R.id.linear18);
		_drawer_linear115 = _nav_view.findViewById(R.id.linear115);
		_drawer_linear21 = _nav_view.findViewById(R.id.linear21);
		_drawer_linear108 = _nav_view.findViewById(R.id.linear108);
		_drawer_linear103 = _nav_view.findViewById(R.id.linear103);
		_drawer_drawback = _nav_view.findViewById(R.id.drawback);
		_drawer_linear20 = _nav_view.findViewById(R.id.linear20);
		_drawer_linear25 = _nav_view.findViewById(R.id.linear25);
		_drawer_linear24 = _nav_view.findViewById(R.id.linear24);
		_drawer_linear110 = _nav_view.findViewById(R.id.linear110);
		_drawer_imageview1796 = _nav_view.findViewById(R.id.imageview1796);
		_drawer_logo = _nav_view.findViewById(R.id.logo);
		_drawer_haha = _nav_view.findViewById(R.id.haha);
		_drawer_linear101 = _nav_view.findViewById(R.id.linear101);
		_drawer_linear26 = _nav_view.findViewById(R.id.linear26);
		_drawer_base = _nav_view.findViewById(R.id.base);
		_drawer_linear17 = _nav_view.findViewById(R.id.linear17);
		_drawer_linear106 = _nav_view.findViewById(R.id.linear106);
		_drawer_textview4 = _nav_view.findViewById(R.id.textview4);
		_drawer_linear29 = _nav_view.findViewById(R.id.linear29);
		_drawer_imageview1791 = _nav_view.findViewById(R.id.imageview1791);
		_drawer_imageview1793 = _nav_view.findViewById(R.id.imageview1793);
		_drawer_imageview1792 = _nav_view.findViewById(R.id.imageview1792);
		_drawer_imageview1794 = _nav_view.findViewById(R.id.imageview1794);
		_drawer_imageview2 = _nav_view.findViewById(R.id.imageview2);
		_drawer_imageview1795 = _nav_view.findViewById(R.id.imageview1795);
		_drawer_checkbox19 = _nav_view.findViewById(R.id.checkbox19);
		_drawer_imageview187 = _nav_view.findViewById(R.id.imageview187);
		_drawer_imageview1797 = _nav_view.findViewById(R.id.imageview1797);
		_drawer_linear121 = _nav_view.findViewById(R.id.linear121);
		_drawer_linear127 = _nav_view.findViewById(R.id.linear127);
		_drawer_linear123 = _nav_view.findViewById(R.id.linear123);
		_drawer_textview6 = _nav_view.findViewById(R.id.textview6);
		_drawer_button2 = _nav_view.findViewById(R.id.button2);
		_drawer_button5 = _nav_view.findViewById(R.id.button5);
		oto = getSharedPreferences("ash", Activity.MODE_PRIVATE);
		dia = new AlertDialog.Builder(this);
		webtitresim = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		gg = new AlertDialog.Builder(this);
		v3 = new AlertDialog.Builder(this);
		owoe = new AlertDialog.Builder(this);
		sa = new AlertDialog.Builder(this);
		fhfhfhhfhffh = new AlertDialog.Builder(this);
		hey = new AlertDialog.Builder(this);
		news = new AlertDialog.Builder(this);
		wow = new AlertDialog.Builder(this);
		vpn = new AlertDialog.Builder(this);
		add = new AlertDialog.Builder(this);
		hesap = new AlertDialog.Builder(this);
		zaar = new AlertDialog.Builder(this);
		fp.setType("*/*");
		fp.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
		about = new AlertDialog.Builder(this);
		pt = getSharedPreferences("db", Activity.MODE_PRIVATE);
		dev = new AlertDialog.Builder(this);
		edit = new AlertDialog.Builder(this);
		guh = new AlertDialog.Builder(this);
		star = new AlertDialog.Builder(this);
		edi387 = new AlertDialog.Builder(this);
		dialog = new AlertDialog.Builder(this);
		sabun = new AlertDialog.Builder(this);
		sssddsjr = new AlertDialog.Builder(this);
		newpipe = new AlertDialog.Builder(this);
		tor1 = new AlertDialog.Builder(this);
		tor2 = new AlertDialog.Builder(this);
		alert = new AlertDialog.Builder(this);
		
		card1.setOnLongClickListener(new View.OnLongClickListener() {
			 @Override
				public boolean onLongClick(View _view) {
				
				return true;
				}
			 });
		
		linear1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		drawsafe.setOnLongClickListener(new View.OnLongClickListener() {
			 @Override
				public boolean onLongClick(View _view) {
				if (webview1.getUrl().contains("https://")) {
					SketchwareUtil.showMessage(getApplicationContext(), "Güvenli Bağlantı");
				}
				if (webview1.getUrl().contains("http://")) {
					SketchwareUtil.showMessage(getApplicationContext(), "Güvensiz Bağlantı1!!!!1");
				}
				return true;
				}
			 });
		
		drawsafe.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (webview1.getUrl().contains("https://")) {
					
					_SetIconDialog(owoe);
					owoe.setTitle(webview1.getTitle().concat("- Güvenli Dostum!! (ssl sertifikası var)"));
					owoe.setMessage("Bilgileriniz (örneğin şifreler veya kredi kartı numaraları), bu siteye gönderilirken gizli olur.\nBu simgeyi görseniz bile, gizli bilgileri paylaşırken her zaman dikkatli olun. Ziyaret etmek istediğiniz sitede olduğunuzdan emin olmak için adres çubuğuna bakın.\n\nHaha komedi");
					owoe.setPositiveButton("Yuuuuuuh", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
					owoe.setNeutralButton("Tam url", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
							_ss(fhfhfhhfhffh);
							fhfhfhhfhffh.setTitle(webview1.getTitle().concat("|Tam url "));
							fhfhfhhfhffh.setMessage(webview1.getUrl());
							fhfhfhhfhffh.setPositiveButton("Editle", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									edit.setTitle("              TAM URL EDİTLİYİCİ");
									LinearLayout layout = new LinearLayout(MainActivity.this);
									layout.setOrientation(LinearLayout.VERTICAL);
									
									LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT); 
									final EditText edittxt2 = new EditText(MainActivity.this);
									edittxt2.setHint("birşey gir lol");
									edittxt2.setText(webview1.getUrl());
									edittxt2.setLayoutParams(lp);
									edittxt2.setTextColor(0xFFFFFFFF);
									edittxt2.setBackgroundColor(Color.TRANSPARENT);
									edittxt2.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL); edittxt2.setTextDirection(View.TEXT_DIRECTION_LTR);
									layout.addView(edittxt2);
									edit.setView(layout);
									edit.setNegativeButton("İptal", new DialogInterface.OnClickListener() {
										@Override
										public void onClick(DialogInterface _dialog, int _which) {
											
										}
									});
									edit.setPositiveButton("Ara", new DialogInterface.OnClickListener() {
										@Override
										public void onClick(DialogInterface _dialog, int _which) {
											fileName = edittxt2.getText().toString();
											if (fileName.equals("")) {
												SketchwareUtil.showMessage(getApplicationContext(), "Lütfen birşey yazınız");
											}
											else {
												_GoogleSearch(fileName, webview1);
											}
										}
									});
									edit.create().show();
								}
							});
							fhfhfhhfhffh.setNeutralButton("Panoya Kopyala", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", webview1.getUrl()));
									oto.edit().putString("kpn", webview1.getUrl()).commit();
									SketchwareUtil.showMessage(getApplicationContext(), "Panoya kopyalandı");
								}
							});
							fhfhfhhfhffh.setNegativeButton("Paylaş ", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									_Share(webview1.getUrl(), false, "Mars");
								}
							});
							fhfhfhhfhffh.create().show();
						}
					});
					owoe.setNegativeButton("Hakkında ", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
							_SetIconDialog(v3);
							v3.setTitle("Sertifika");
							v3.setMessage(webview1.getCertificate().toString().concat("\n\nGüvenlik sertifikası nedir?\n\nHTTPS (bağlantı güvenliği) kullanan bir siteye gittiğinizde web sitesinin sunucusu, web sitesinin kimliğini tarayıcılara (ör. Chrome,Mars vb) kanıtlamak için bir sertifika kullanır. Herkes, istediği web sitesi olduğunu iddia ederek bir sertifika oluşturabilir.\n\nWeb'de güvende olmanıza yardımcı olmak için Mars, web sitelerinin güvenilen kuruluşlardan alınmış sertifikaları kullanmalarını zorunlu tutar.\n\n\nOHA Açıklamaya bak 😯"));
							v3.setPositiveButton("Tm", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									
								}
							});
							v3.setNeutralButton("Ayrıntı ", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									webview1.loadUrl("https://support.mozilla.org/tr/kb/bir-web-sitesine-baglantimin-guvenli-oldugunu-nasil-anlarim");
								}
							});
							v3.create().show();
						}
					});
					owoe.create().show();
				}
				if (webview1.getUrl().contains("http://")) {
					_no2(dia);
					
					dia.setTitle(webview1.getTitle().concat("- Güvenli Değil aga be..... (http bağlantısı)"));
					dia.setMessage("Bu sitede hiçbir hassas bilginizi (örneğin şifrelerinizi veya kredi kartı bilgilerinizi) girmemelisiniz. Aksi takdirde bu bilgiler saldırganlar tarafından çalınabilir. \nBazı sitelerde, aşağıdaki adımları uygulayarak sayfanın daha güvenli bir sürümünü ziyaret edebilirsiniz:\n\nAdres çubuğunu seçin.\n\nhttp:// kısmını silin ve bunun yerine https:// yazın.\n\nBu işe yaramazsa site sahibiyle iletişime geçip sitenin ve verilerinizin güvenliğini HTTPS ile sağlamasını isteyin.\n\nyada Mars Always Https™ i kullanın:\narama çubuğuna mars://alwayshttps=t yazarsanız always https açık mars://alwayshttps=f yazarsanız kapanmış demektir\n\nHAHA AÇIKLAMA GO BRR");
					dia.setPositiveButton("Baane", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							
						}
					});
					dia.setNeutralButton("Knk nasil yani?", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							webview1.loadUrl("https://support.mozilla.org/tr/kb/bir-web-sitesine-baglantimin-guvenli-oldugunu-nasil-anlarim");
						}
					});
					dia.setNeutralButton("tam url", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							_ss(fhfhfhhfhffh);
							fhfhfhhfhffh.setTitle(webview1.getTitle().concat("|Tam url "));
							fhfhfhhfhffh.setMessage(webview1.getUrl());
							fhfhfhhfhffh.setPositiveButton("Editle", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									edit.setTitle("              TAM URL EDİTLİYİCİ");
									LinearLayout layout = new LinearLayout(MainActivity.this);
									layout.setOrientation(LinearLayout.VERTICAL);
									
									LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT); 
									final EditText edittxt2 = new EditText(MainActivity.this);
									edittxt2.setHint("birşey gir lol");
									edittxt2.setText(webview1.getUrl());
									edittxt2.setLayoutParams(lp);
									edittxt2.setTextColor(0xFFFFFFFF);
									edittxt2.setBackgroundColor(Color.TRANSPARENT);
									edittxt2.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL); edittxt2.setTextDirection(View.TEXT_DIRECTION_LTR);
									layout.addView(edittxt2);
									edit.setView(layout);
									edit.setNegativeButton("İptal", new DialogInterface.OnClickListener() {
										@Override
										public void onClick(DialogInterface _dialog, int _which) {
											
										}
									});
									edit.setPositiveButton("Ara", new DialogInterface.OnClickListener() {
										@Override
										public void onClick(DialogInterface _dialog, int _which) {
											fileName = edittxt2.getText().toString();
											if (fileName.equals("")) {
												SketchwareUtil.showMessage(getApplicationContext(), "Lütfen birşey yazınız");
											}
											else {
												_GoogleSearch(fileName, webview1);
											}
										}
									});
									edit.create().show();
								}
							});
							fhfhfhhfhffh.setNeutralButton("Panoya Kopyala", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", webview1.getUrl()));
									oto.edit().putString("kpn", webview1.getUrl()).commit();
									SketchwareUtil.showMessage(getApplicationContext(), "Panoya kopyalandı");
								}
							});
							fhfhfhhfhffh.setNegativeButton("Paylaş ", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									_Share(webview1.getUrl(), false, "Mars");
								}
							});
							fhfhfhhfhffh.create().show();
						}
					});
					dia.create().show();
					edittext1.setText(webview1.getUrl());
				}
				edittext1.setText(webview1.getUrl());
			}
		});
		
		edittext1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_ss(edi387);
				edi387.setTitle(webview1.getTitle());
				LinearLayout layout = new LinearLayout(MainActivity.this);
				layout.setOrientation(LinearLayout.VERTICAL);
				
				LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT); 
				final EditText edit3 = new EditText(MainActivity.this);
				edit3.setHint("bişy ara lol");
				edit3.setText(webview1.getUrl());
				edit3.setLayoutParams(lp);
				edit3.setTextColor(0xFFFFFFFF);
				edit3.setBackgroundColor(Color.TRANSPARENT);
				edit3.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL); edit3.setTextDirection(View.TEXT_DIRECTION_LTR);
				edit3.setTypeface(edit3.getTypeface(), Typeface.BOLD);
				
				layout.addView(edit3);
				edi387.setView(layout);
				edi387.setNeutralButton("Panoya Kopyala", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", webview1.getUrl()));
						oto.edit().putString("kpn", webview1.getUrl()).commit();
						SketchwareUtil.showMessage(getApplicationContext(), "Panoya kopyalandı");
					}
				});
				edi387.setNegativeButton("Paylaş ", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						_Share(webview1.getUrl(), false, "Mars");
					}
				});
				edi387.setPositiveButton("Ara", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						fileName = edit3.getText().toString();
						if (fileName.equals("")) {
							SketchwareUtil.showMessage(getApplicationContext(), "Lütfen birşey yazınız");
						}
						else {
							_GoogleSearch(fileName, webview1);
						}
					}
				});
				edi387.create().show();
			}
		});
		
		imageview10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				/*

*/
				
				sssddsjr.setIcon(R.drawable.ic_security_white);
				sssddsjr.setTitle("Adblocker ");
				sssddsjr.setMessage("Mars Şu kadar izliyici ve reklam engelledi! (yakında sayı düzgün olcak za)\n0");
				sssddsjr.setPositiveButton("Pog", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				sssddsjr.create().show();
			}
		});
		
		imageview9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				sabun.setTitle("Önbellek temizleyici");
				sabun.setIcon(R.drawable.ic_cloud_circle_white);
				sabun.setMessage("önbellek temizlensin mi za");
				sabun.setPositiveButton("Evt", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						SketchwareUtil.showMessage(getApplicationContext(), "Önbellek temizlendi whoo hoo!");
						webview1.clearCache(true);
						webview1.clearHistory();
					}
				});
				sabun.setNegativeButton("Hyr za", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				sabun.create().show();
			}
		});
		
		webview1.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
				final String _url = _param2;
				if (pt.getString("usedarkmode ", "").equals("1")) {
					WebSettingsCompat.setForceDark(webview1.getSettings(),WebSettingsCompat.FORCE_DARK_ON);
				}
				if (pt.getString("usedarkmode ", "").equals("0")) {
					WebSettingsCompat.setForceDark(webview1.getSettings(),WebSettingsCompat.FORCE_DARK_OFF);
				}
				if (pt.getString("usedarkmode ", "").equals("")) {
					pt.edit().putString("usedarkmode ", "0").commit();
				}
				if (webview1.getUrl().contains("https://")) {
					drawsafe.setImageResource(R.drawable.ic_https_white);
				}
				if (webview1.getUrl().contains("http://")) {
					drawsafe.setImageResource(R.drawable.ic_lock_open_white);
				}
				edittext1.setText(webview1.getUrl());
				if (oto.getString("always", "").equals("true")) {
						if (webview1.getUrl().contains("http://")) {
								webview1.loadUrl(webview1.getUrl().replace("http://", "https://"));
						}
				}
				super.onPageStarted(_param1, _param2, _param3);
			}
			
			@Override
			public void onPageFinished(WebView _param1, String _param2) {
				final String _url = _param2;
				if (webview1.getUrl().contains("https://")) {
					drawsafe.setImageResource(R.drawable.ic_https_white);
				}
				if (webview1.getUrl().contains("http://")) {
					drawsafe.setImageResource(R.drawable.ic_lock_open_white);
				}
				super.onPageFinished(_param1, _param2);
			}
		});
		
		pc_mod.setOnLongClickListener(new View.OnLongClickListener() {
			 @Override
				public boolean onLongClick(View _view) {
				if (pcmod == 0) {
					SketchwareUtil.showMessage(getApplicationContext(), "Pc modu");
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "Mobil modu");
				}
				return true;
				}
			 });
		
		pc_mod.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (pcmod == 0) {
					webview1.loadUrl(webview1.getUrl());
					pcmod++;
					edittext1.setText(webview1.getUrl());
					setTitle((webview1.getTitle()));
					_setInputLimit(edittext1, 25);
					_Desktop(webview1);
					pc_mod.setImageResource(R.drawable.tel);
				}
				else {
					webview1.loadUrl(webview1.getUrl());
					_NoDesktop(webview1);
					_setInputLimit(edittext1, 25);
					setTitle((webview1.getTitle()));
					edittext1.setText(webview1.getUrl());
					pc_mod.setImageResource(R.drawable.desktop);
					pcmod--;
				}
			}
		});
		
		imageview4.setOnLongClickListener(new View.OnLongClickListener() {
			 @Override
				public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Mars Devtools");
				return true;
				}
			 });
		
		imageview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				/*

*/
				dev.setIcon(R.drawable.code_white_48);
				dev.setTitle("Mars DevTools");
				dev.setMessage("Mars Geliştirici seçeneği");
				dev.setPositiveButton("Site Kaynağını görüntüle", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						 alert.setTitle("Kynk kodu ^^");
						LinearLayout layout = new LinearLayout(MainActivity.this);
						layout.setOrientation(LinearLayout.VERTICAL);
						
						LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT); 
						final WebView wv = new WebView(MainActivity.this);
						wv.setBackgroundColor(Color.TRANSPARENT);
						
						_sourceCodeView(wv, webview1.getUrl());
						wv.setWebViewClient(new WebViewClient() { @Override public boolean shouldOverrideUrlLoading(WebView view, String url) { view.loadUrl(url); return true; } });
						
						WebSettingsCompat.setForceDark(wv.getSettings(),WebSettingsCompat.FORCE_DARK_ON);
						layout.addView(wv);
						alert.setView(layout);
						alert.setPositiveButton("Kapat", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface _dialog, int _which) {
								
							}
						});
						alert.create().show();
					}
				});
				dev.create().show();
			}
		});
		
		drawhome.setOnLongClickListener(new View.OnLongClickListener() {
			 @Override
				public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Ana Sayfa");
				return true;
				}
			 });
		
		drawhome.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (pt.getString("search", "").equals("")) {
					webview1.loadUrl("https://start.duckduckgo.com");
					setTitle((webview1.getTitle()));
				}
				else {
					webview1.loadUrl(pt.getString("muuuuz", ""));
					setTitle((webview1.getTitle()));
				}
			}
		});
		
		drawf5.setOnLongClickListener(new View.OnLongClickListener() {
			 @Override
				public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Sayfayı Yenile");
				return true;
				}
			 });
		
		drawf5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				webview1.loadUrl(webview1.getUrl());
				setTitle((webview1.getTitle()));
			}
		});
		
		drawbrw.setOnLongClickListener(new View.OnLongClickListener() {
			 @Override
				public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Başka bir uygulamada aç");
				return true;
				}
			 });
		
		drawbrw.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				urllll = webview1.getUrl();
				guh.setTitle("Bağlantılar sahte olabilir mate");
				guh.setMessage(urllll.concat(" Linki ayrı bir uygulamada açılıcak. o uygulama mars ile alakalı değildir. yinede gitmek ister misin?"));
				guh.setPositiveButton("Gitcem lna bna ne", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						ii.setAction(Intent.ACTION_VIEW);
						ii.setData(Uri.parse(webview1.getUrl()));
						startActivity(ii);
					}
				});
				guh.setNegativeButton("iptal", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				guh.create().show();
			}
		});
		
		drawnext.setOnLongClickListener(new View.OnLongClickListener() {
			 @Override
				public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "İleri git lol");
				return true;
				}
			 });
		
		drawnext.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				oto.edit().putString("kpn", webview1.getUrl()).commit();
				_setInputLimit(edittext1, 29);
				webview1.goForward();
				edittext1.setText(webview1.getUrl());
				setTitle((webview1.getTitle()));
			}
		});
		
		_drawer_imageview1791.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				webview1.loadUrl("https://www.google.com/maps/");
			}
		});
		
		_drawer_imageview1793.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				webview1.loadUrl("https://m.youtube.com");
			}
		});
		
		_drawer_imageview1792.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				webview1.loadUrl("https://music.youtube.com");
			}
		});
		
		_drawer_imageview1794.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				webview1.loadUrl("https://ceviri.yandex.com.tr/?lang=en-tr&text=".concat(webview1.getUrl()));
			}
		});
		
		_drawer_imageview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				startActivity(new android.content.Intent(android.app.DownloadManager.ACTION_VIEW_DOWNLOADS));
			}
		});
		
		_drawer_imageview1795.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				be.setClass(getApplicationContext(), HavadurumActivity.class);
				startActivity(be);
			}
		});
		
		_drawer_checkbox19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					drawbrw.setVisibility(View.GONE);
					
					drawf5.setVisibility(View.GONE);
					drawnext.setVisibility(View.GONE);
					linear26.setVisibility(View.GONE);
					linear1.setVisibility(View.GONE);
					drawsafe.setVisibility(View.GONE);
					
					
				}
				else {
					
					drawf5.setVisibility(View.VISIBLE);
					drawnext.setVisibility(View.VISIBLE);
					linear26.setVisibility(View.VISIBLE);
					drawbrw.setVisibility(View.VISIBLE);
					linear1.setVisibility(View.VISIBLE);
					drawsafe.setVisibility(View.VISIBLE);
					
					
				}
			}
		});
		
		_drawer_imageview187.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ii.setAction(Intent.ACTION_VIEW);
				ii.setData(Uri.parse("https://discord.gg/t6RtX2dr3H"));
				startActivity(ii);
			}
		});
		
		_drawer_imageview1797.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ii.setAction(Intent.ACTION_VIEW);
				ii.setData(Uri.parse("https://github.com/chad-engine"));
				startActivity(ii);
			}
		});
		
		_drawer_button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				/*

*/
				ii.setClass(getApplicationContext(), NewsActivity.class);
				startActivity(ii);
			}
		});
		
		_drawer_button5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				ii.setClass(getApplicationContext(), SelectActivity.class);
				startActivity(ii);
			}
		});
	}
	
	private void initializeLogic() {
		
		owoe = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		v3 = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		dia = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		 news = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		 fhfhfhhfhffh = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		wow =  new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		vpn = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		newpipe = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		sssddsjr = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		add = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		tor1 = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		tor2 = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		hesap = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		edi387 = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		star = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		dialog = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		sabun = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		zaar = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		about = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		dev = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		edit = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		guh = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		
		
		alert = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		_load();
		if (oto.getString("h", "").equals("")) {
			ii.setClass(getApplicationContext(), HosgeldinActivity.class);
			startActivity(ii);
		}
		else {
			
		}
		loddnormallist = "0";
		_onCreateContextMenu();
		Toolbar _toolbar = (Toolbar) findViewById(R.id._toolbar); _toolbar.setSubtitle("Mars 10");
		
		_ohDearDownloadMe();
		_heyProgress();
		_end();
		_networkConnected();
		
		t = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						setTitle((webview1.getTitle()));
						//set favicon
						
						_drawer_logo.setImageBitmap(webview1.getFavicon());
						_WebView_Finger_Zoom(webview1);
						_drawer_haha.setText(webview1.getTitle());
						edittext1.setText(webview1.getUrl());
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(t, (int)(1000), (int)(1000));
		_full();
		
		if (oto.getString("kpn", "").equals("")) {
			webview1.loadUrl("https://start.duckduckgo.com");
		}
		else {
			webview1.loadUrl(oto.getString("kpn", ""));
		}
		_NavStatusBarColor("#000000", "#000000");
		edittext1.setText(webview1.getUrl());
		_WebView_Finger_Zoom(webview1);
		/*
android.graphics.drawable.GradientDrawable ee = new android.graphics.drawable.GradientDrawable();
ee.setColor(Color.parseColor("#FF2C2F33"));
ee.setCornerRadius(110);
zoomw.setBackground(ee)

*/
		
		android.graphics.drawable.GradientDrawable ed = new android.graphics.drawable.GradientDrawable();
		ed.setColor(Color.parseColor("#FA1A1A1A"));
		ed.setCornerRadius(150);
		linear26.setBackground(ed);
		
		android.graphics.drawable.GradientDrawable ab = new android.graphics.drawable.GradientDrawable();
		ab.setColor(Color.parseColor("#FA1A1A1A"));
		ab.setCornerRadius(150);
		linear1.setBackground(ab);
		
		
		webview1.getSettings().setJavaScriptEnabled(true);
		webview1.getSettings().setSavePassword(true);
		CookieManager.getInstance().setAcceptCookie(true);
		
		
		WebSettings webSettings = webview1.getSettings(); 
		webSettings.setJavaScriptEnabled(true); 
		webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
		if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.JELLY_BEAN) {
			webSettings.setAllowFileAccessFromFileURLs(true); 
			webSettings.setAllowUniversalAccessFromFileURLs(true);
		}
		
		webview1.setWebViewClient(new WebViewClient()
		{
			    @Override
			    public boolean shouldOverrideUrlLoading(WebView view, String url)
			    {
				        HashMap<String, String> extraHeaders = new HashMap<String, String>();
				        extraHeaders.put("DNT", "1");
				        view.loadUrl(url, extraHeaders); 
				        return true;
				    } 
		});
		 
		webview1.getSettings().setAllowContentAccess(true);
		webview1.getSettings().setAllowFileAccess(true);
		webview1.getSettings().setAppCacheEnabled(true);
		webview1.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
		webview1.getSettings().setLoadWithOverviewMode(true);
		webview1.getSettings().setUseWideViewPort(true);
		if(Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) {
			        CookieManager.getInstance().setAcceptThirdPartyCookies(webview1,true);
			    }
		
		StringBuilder blocklist = new StringBuilder();
		   webview1.setWebViewClient(new WebViewClient() {
			
			
			            @Override
			            public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
				                    ByteArrayInputStream EMPTY3 = new ByteArrayInputStream("".getBytes());
				                    String kk53 = String.valueOf(blocklist);//Load blocklist
									
				
				                    if (kk53.contains(":::::" + request.getUrl().getHost())) {// If blocklist equals url = Block
					                        return new WebResourceResponse("text/plain", "utf-8", EMPTY3);//Block
					                    }
				                return super.shouldInterceptRequest(view, request);
				            }
			        });
		    
		
		
		
		
		    
		
		
		
		
		
		
		
		     
		if (pt.getString("custom", "").equals("")) {
			
		}
		else {
			
		}
		_NoDesktop(webview1);
		webview1.getSettings().setSaveFormData(true);
		/*
webview1.getSettings().setSupportZoom(false); webview1.getSettings().setAllowFileAccess(true); webview1.getSettings().setAllowFileAccess(true); 
webview1.getSettings().setAllowContentAccess(true);
*/
		android.graphics.drawable.GradientDrawable gd1 = new android.graphics.drawable.GradientDrawable();
		gd1.setColor(Color.parseColor("#000000"));
		gd1.setCornerRadius(16);
		_drawer_linear21.setBackground(gd1);
		_drawer_linear21.setElevation(5f);
		
		
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N_MR1) {
			//Create ShortcutManager
			android.content.pm.ShortcutManager shortcutManager = getSystemService(android.content.pm.ShortcutManager.class);
			// Create ShortcutInfo for chats
			android.content.pm.ShortcutInfo chatShortcut = new android.content.pm.ShortcutInfo.Builder(MainActivity.this, "id1")
			.setShortLabel("İndirilenler")
			.setRank(0)
			.setLongLabel("Haha İndirilenler Go brrr")
			.setIcon(android.graphics.drawable.Icon.createWithResource(MainActivity.this, R.drawable.downloads))
			.setIntent(new android.content.Intent(android.app.DownloadManager.ACTION_VIEW_DOWNLOADS))
			.build();
			
			// Create ShortcutInfo for camera
			android.content.pm.ShortcutInfo cameraShortcut = new android.content.pm.ShortcutInfo.Builder(MainActivity.this, "id2")
			.setShortLabel("Hava")
			.setRank(1)
			.setLongLabel("Hava Durumu Go İdk Lmaoo")
			.setIcon(android.graphics.drawable.Icon.createWithResource(MainActivity.this, R.drawable.hava))
			.setIntent(new Intent(Intent.ACTION_MAIN, Uri.EMPTY, MainActivity.this, HavadurumActivity.class))
			.build();
			
			
			//  set the ShortcutInfos to ShortcutManager
			shortcutManager.setDynamicShortcuts(Arrays.asList(chatShortcut, cameraShortcut));
		}
		
		registerForContextMenu(webview1);
		webview1.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
		webview1.getSettings().setBuiltInZoomControls(true);
		webview1.getSettings().setSupportZoom(true);
		webview1.getSettings().setDisplayZoomControls(false);
		webview1.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
		webview1.setScrollbarFadingEnabled(true);
		webview1.setLongClickable(true);
		webview1.setLayerType(View.LAYER_TYPE_HARDWARE, null);
		webview1.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
		webview1.getSettings().setDomStorageEnabled(true);
		webview1.getSettings().setAppCacheEnabled(true);
		webview1.getSettings().setSavePassword(true);
		webview1.getSettings().setSaveFormData(true);
		webview1.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
		webview1.getSettings().setAllowFileAccess(true);
		webview1.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
		webview1.getSettings().setAllowFileAccess(true);
		webview1.getSettings().setEnableSmoothTransition(true);
		
		webview1.getSettings().setJavaScriptEnabled(true);
		webview1.getSettings().setMediaPlaybackRequiresUserGesture(true);
		webview1.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
		/*

*/
		tt = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						if (pt.getString("amogus", "").equals("")) {
							star.setTitle("lan yıldız ver!!@!1!1!1!1!!2!1!1!1!1!1!");
							star.setMessage("selam arkadaşlar ben arkadaşım hoşgeldin balayı skeci otel sahnesi online video izle oyna dinle indir ücretsiz download MP3 video kesmeye çalışıyorum ama en azından bir şey yok bence n\nAlah yardımcım olsun bir özellik ve bu arada rica ederim yardım et bana ne denilir ki bu.");
							star.setPositiveButton("Ne okudum lan ben", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									
								}
							});
							star.setNeutralButton("tm veriom", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									guh.setTitle("Bağlantılar sahte olabilir mate");
									guh.setMessage("mars://gplay:73848".concat(" Linki ayrı bir uygulamada açılıcak. o uygulama mars ile alakalı değildir. yinede gitmek ister misin?"));
									guh.setPositiveButton("Gitcem lna bna ne", new DialogInterface.OnClickListener() {
										@Override
										public void onClick(DialogInterface _dialog, int _which) {
											ii.setAction(Intent.ACTION_VIEW);
											ii.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.marsbrowser.ashpotter.app"));
											startActivity(ii);
										}
									});
									guh.setNegativeButton("iptal", new DialogInterface.OnClickListener() {
										@Override
										public void onClick(DialogInterface _dialog, int _which) {
											
										}
									});
									guh.create().show();
								}
							});
							star.setNegativeButton("Birdaha gösterme lol", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									pt.edit().putString("amgous", "yes").commit();
								}
							});
							star.create().show();
						}
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(tt, (int)(60000000), (int)(60000000));
		
		t = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						if (_drawer.isDrawerOpen(GravityCompat.START)) {
							webview1.setEnabled(false);
						}
						if (!_drawer.isDrawerOpen(GravityCompat.START)) {
							webview1.setEnabled(true);
						}
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(t, (int)(1000), (int)(1000));
		
		
		
		
		drawf5.setVisibility(View.VISIBLE);
		drawnext.setVisibility(View.VISIBLE);
		linear26.setVisibility(View.VISIBLE);
		drawbrw.setVisibility(View.VISIBLE);
		linear1.setVisibility(View.VISIBLE);
		drawsafe.setVisibility(View.VISIBLE);
		android.graphics.drawable.GradientDrawable gd2 = new android.graphics.drawable.GradientDrawable();
		gd2.setColor(Color.parseColor("#000000"));
		gd2.setCornerRadius(16);
		_drawer_linear18.setBackground(gd2);
		_drawer_linear18.setElevation(5f);
		
		android.graphics.drawable.GradientDrawable gd3 = new android.graphics.drawable.GradientDrawable();
		gd3.setColor(Color.parseColor("#000000"));
		gd3.setCornerRadius(16);
		_drawer_linear103.setBackground(gd3);
		_drawer_linear103.setElevation(5f);
		
		android.graphics.drawable.GradientDrawable gd4 = new android.graphics.drawable.GradientDrawable();
		gd4.setColor(Color.parseColor("#FA1A1A1A"));
		gd4.setCornerRadius(16);
		_drawer_linear1.setBackground(gd4);
		_drawer_linear1.setElevation(5f);
		
		
		android.graphics.drawable.GradientDrawable gd55 = new android.graphics.drawable.GradientDrawable();
		gd55.setColor(Color.parseColor("#FF2C2F33"));
		gd55.setCornerRadius(16);
		linear31.setBackground(gd55);
		linear31.setElevation(5f);
		
		
		
		
		
		android.graphics.drawable.GradientDrawable gd555 = new android.graphics.drawable.GradientDrawable();
		gd555.setColor(Color.parseColor("#FF2C2F33"));
		gd555.setCornerRadius(16);
		webview1.setBackground(gd555);
		webview1.setElevation(5f);
		
		webview1.setWebChromeClient(new WebChromeClient() {
			// For 3.0+ Devices
			protected void openFileChooser(ValueCallback uploadMsg, String acceptType) { mUploadMessage = uploadMsg; Intent i = new Intent(Intent.ACTION_GET_CONTENT); i.addCategory(Intent.CATEGORY_OPENABLE);
				i.setType("image/*"); startActivityForResult(Intent.createChooser(i, "File Browser"), FILECHOOSER_RESULTCODE);
			}
			
			// For Lollipop 5.0+ Devices
			public boolean onShowFileChooser(WebView mWebView, ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
				if (uploadMessage != null) {
					uploadMessage.onReceiveValue(null);
					uploadMessage = null; } uploadMessage = filePathCallback; Intent intent = fileChooserParams.createIntent(); try {
					startActivityForResult(intent, REQUEST_SELECT_FILE);
				} catch (ActivityNotFoundException e) {
					uploadMessage = null; Toast.makeText(getApplicationContext(), "Cannot Open File Chooser", Toast.LENGTH_LONG).show(); return false; }
				return true; }
			
			//For Android 4.1 only
			protected void openFileChooser(ValueCallback<Uri> uploadMsg, String acceptType, String capture) {
				mUploadMessage = uploadMsg; Intent intent = new Intent(Intent.ACTION_GET_CONTENT); intent.addCategory(Intent.CATEGORY_OPENABLE); intent.setType("image/*"); startActivityForResult(Intent.createChooser(intent, "File Browser"), FILECHOOSER_RESULTCODE);
			}
			
			protected void openFileChooser(ValueCallback<Uri> uploadMsg) {
				mUploadMessage = uploadMsg; Intent i = new Intent(Intent.ACTION_GET_CONTENT); i.addCategory(Intent.CATEGORY_OPENABLE);
				i.setType("image/*"); startActivityForResult(Intent.createChooser(i, "File Chooser"), FILECHOOSER_RESULTCODE);
			}
			
			
		});
		
		
		if (pt.getString("usedarkmode ", "").equals("1")) {
			WebSettingsCompat.setForceDark(webview1.getSettings(),WebSettingsCompat.FORCE_DARK_ON);
		}
		if (pt.getString("usedarkmode ", "").equals("0")) {
			WebSettingsCompat.setForceDark(webview1.getSettings(),WebSettingsCompat.FORCE_DARK_OFF);
		}
		if (pt.getString("usedarkmode ", "").equals("")) {
			pt.edit().putString("usedarkmode ", "0").commit();
		}
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			case REQ_CD_FP:
			if (_resultCode == Activity.RESULT_OK) {
				ArrayList<String> _filePath = new ArrayList<>();
				if (_data != null) {
					if (_data.getClipData() != null) {
						for (int _index = 0; _index < _data.getClipData().getItemCount(); _index++) {
							ClipData.Item _item = _data.getClipData().getItemAt(_index);
							_filePath.add(FileUtil.convertUriToFilePath(getApplicationContext(), _item.getUri()));
						}
					}
					else {
						_filePath.add(FileUtil.convertUriToFilePath(getApplicationContext(), _data.getData()));
					}
				}
			}
			break;
			
			case REQUEST_SELECT_FILE:
			if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
				if (uploadMessage == null) return; uploadMessage.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(_resultCode, _data)); uploadMessage = null; }
			break;
			
			case FILECHOOSER_RESULTCODE:
			if (null == mUploadMessage){
				return; }
			Uri result = _data == null || _resultCode != RESULT_OK ? null : _data.getData(); mUploadMessage.onReceiveValue(result);
			mUploadMessage = null;
			
			if (true){
			}
			else {
				
			}
			break;
			default:
			break;
		}
	}
	
	@Override
	public void onPause() {
		super.onPause();
		setTitle((webview1.getTitle()));
		oto.edit().putString("kpn", webview1.getUrl()).commit();
		
	}
	
	@Override
	public void onBackPressed() {
		if (webview1.canGoBack()) {
			oto.edit().putString("kpn", webview1.getUrl()).commit();
			webview1.goBack();
			
			setTitle((webview1.getTitle()));
			
		}
		else {
			com.google.android.material.snackbar.Snackbar.make(webview1, "kapatılor", com.google.android.material.snackbar.Snackbar.LENGTH_SHORT).setAction("", new View.OnClickListener(){
				@Override
							public void onClick(View _view) {
									 
							}
			}).show();
			t = new TimerTask() {
				@Override
				public void run() {
					runOnUiThread(new Runnable() {
						@Override
						public void run() {
							finishAffinity();
						}
					});
				}
			};
			_timer.schedule(t, (int)(1000));
		}
	}
	
	@Override
	public void onStop() {
		super.onStop();
		oto.edit().putString("kpn", webview1.getUrl()).commit();
		
		setTitle((webview1.getTitle()));
	}
	public void _GoogleSearch(final String _search, final WebView _wbv) {
		if (pt.getString("search", "").equals("")) {
			eee = "https://duckduckgo.com/?q=";
		}
		else {
			eee = pt.getString("muz", "");
		}
		if (_search.equals("mars://privcy")) {
			
		}
		else {
			if (_search.equals("mars://usedarkmode=1")) {
				pt.edit().putString("usedarkmode", "1").commit();
			}
			else {
				if (_search.equals("mars://usedarkmode=f")) {
					pt.edit().putString("usedarkmode", "0").commit();
				}
				else {
					if (_search.equals("mars://privacy=3")) {
						
					}
					else {
						if (_search.equals("mars://privcy=1")) {
							
						}
						else {
							if (_search.equals("mars://usetor")) {
								
							}
							else {
								if (_search.equals("mars://donotusetor")) {
									
								}
								else {
									if (_search.equals("mars://alwayshttps=t")) {
										oto.edit().putString("always", "true").commit();
									}
									else {
										if (_search.equals("mars://alwayshttps=f")) {
											oto.edit().remove("always").commit();
										}
										else {
											if (_search.equals("mars://dcpt")) {
												
												startActivity(var);
											}
											else {
												if (_search.equals("mars://relax")) {
													
													startActivity(be);
												}
												else {
													if (_search.equals("mars://zar")) {
														_zar();
													}
													else {
														if (_search.equals("hahayesgobrr")) {
															_wbv.loadUrl("https://brrr.money/");
														}
														else {
															if (_search.equals("freenitro")) {
																webview1.loadUrl("https://youtu.be/dQw4w9WgXcQ");
															}
															else {
																if (oto.getString("always", "").equals("true")) {
																	if (_search.contains(".")) {
																		if (_search.contains(".com") || (_search.contains(".org") || (_search.contains(".net") || (_search.contains(".edu") || (_search.contains(".net") || (_search.contains(".info") || (_search.contains(".xyz") || (_search.contains(".chat") || (_search.contains(".app") || (_search.contains(".me") || (_search.contains(".dev") || (_search.contains(".gov") || (_search.contains(".io") || (_search.contains(".uk") || (_search.contains(".eu") || (_search.contains(".ly") || _search.contains(".tv"))))))))))))))))) {
																			if (4 < _search.length()) {
																				if (_search.contains("http")) {
																					WBLink = _search;
																				}
																				else {
																					WBLink = "https://".concat(_search);
																				}
																			}
																			else {
																				WBLink = eee.concat(_search);
																			}
																		}
																		else {
																			WBLink = eee.concat(_search);
																		}
																	}
																	else {
																		WBLink = eee.concat(_search);
																	}
																	_wbv.loadUrl(WBLink);
																	oto.edit().putString("kpn", webview1.getUrl()).commit();
																}
																else {
																	if (_search.contains(".")) {
																		if (_search.contains(".com") || (_search.contains(".org") || (_search.contains(".net") || (_search.contains(".edu") || (_search.contains(".net") || (_search.contains(".info") || _search.contains(".xyz"))))))) {
																			if (4 < _search.length()) {
																				if (_search.contains("http")) {
																					WBLink = _search;
																				}
																				else {
																					WBLink = "http://".concat(_search);
																				}
																			}
																			else {
																				WBLink = eee.concat(_search);
																			}
																		}
																		else {
																			WBLink = eee.concat(_search);
																		}
																	}
																	else {
																		WBLink = eee.concat(_search);
																	}
																	_wbv.loadUrl(WBLink);
																	oto.edit().putString("kpn", webview1.getUrl()).commit();
																}
															}
															_setInputLimit(edittext1, 15);
														}
													}
												}
												/*

*/
											}
										}
										/*

*/
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	public void _Desktop(final WebView _webview) {
		/*

*/
		_webview.getSettings().setLoadWithOverviewMode(true); _webview.getSettings().setUseWideViewPort(true); final WebSettings webSettings = _webview.getSettings(); final String newUserAgent; newUserAgent = "Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/97.1.1"; webSettings.setUserAgentString(newUserAgent); 
	}
	
	
	public void _networkConnected() {
		//Ash POTTER 
		
		
		android.net.ConnectivityManager cm = (android.net.ConnectivityManager) this.getSystemService(android.content.Context.CONNECTIVITY_SERVICE);
		
		android.net.NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
		
		if (activeNetwork != null) {
			if (activeNetwork.getType() == android.net.ConnectivityManager.TYPE_WIFI) {
				
			} else if (activeNetwork.getType() == android.net.ConnectivityManager.TYPE_MOBILE) {
				if (pt.getString("lol", "").equals("")) {
						
						dia.setCancelable(false);
						dia.setTitle("Ur using mobil veri");
						dia.setMessage("Mobil veri kullandığın için Mars Basit site™ kullanılıyor. bu sayede veri tasarrufu sağlaya bilirsiniz. Bize sonra teşekkür edebilirsin lol");
						dia.setNeutralButton("Epik", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
										
								}
						});
						dia.setPositiveButton("Bidaha gösterme zaaa", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
										pt.edit().putString("lol", "h").commit();
								}
						});
						dia.create().show();
				}
			}
		} else {
			dia.setCancelable(false);
				dia.setTitle("Internet Bağlantısı Yok\n\n");
				dia.setMessage("Internet Bağlantısı olduğuna emin oln");
				dia.setPositiveButton("ok ", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
								
								finishAffinity();
						}
				});
				dia.setNeutralButton("Yeniden Deneyin", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
								ii.setClass(getApplicationContext(), MainActivity.class);
								startActivity(ii);
						}
				});
				dia.create().show();
		}
		
		
		
		//Need permission
	}
	
	
	public void _LaunchApp(final String _Pack) {
		Intent launchi = getPackageManager().getLaunchIntentForPackage(_Pack);
		
		if (launchi != null)
		
		{
			
			startActivity(launchi);
			
		}
	}
	
	
	public void _htmlViewer(final String _html_file_path, final String _newIntent) {
		webview1.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
		webview1.loadUrl("file:///".concat(_html_file_path));
	}
	
	
	public void _setInputLimit(final TextView _edittext, final double _limit) {
		//Limit 
		if (edittext1.getText().toString().length() > _limit) {
			textLimit = edittext1.getText().toString();
			edittext1.setText(edittext1.getText().toString().substring((int)(0), (int)(_limit)));
		}
		if (edittext1.getText().toString().length() == 0) {
			_edittext.append(textLimit);
			textLimit = "";
		}
	}
	
	
	public void _end() {
  		
 		
		
 	}
	
	
	public void _set_imeGo_Click(final TextView _edit, final View _view) {
		_edit.setOnEditorActionListener(new EditText.OnEditorActionListener() { public boolean onEditorAction(TextView v, int actionId, KeyEvent event) { if (actionId == android.view.inputmethod.EditorInfo.IME_ACTION_GO) { _view.performClick(); return true; } return false; } });
	}
	
	
	public void _NoDesktop(final WebView _webview) {
		webview1.getSettings().setLoadWithOverviewMode(true); webview1.getSettings().setUseWideViewPort(true); final WebSettings webSettings = webview1.getSettings(); final String newUserAgent; newUserAgent = "Mozilla/5.0 (Linux; Android 7.1) AppleWebKit/537.36 (KHTML, like Gecko) Chad/10 MarsBrowser/10.1 Ungoogled Chromium/97.0.4684.0 Chrome/97.0.4684.0 Mobile Safari/537.36"; webSettings.setUserAgentString(newUserAgent);
	}
	
	
	public void _Asaa(final String _search, final WebView _wbv) {
		if (_search.contains(".")) {
			if (_search.contains(".co") || (_search.contains(".org") || (_search.contains(".net") || (_search.contains(".edu") || _search.contains(".info"))))) {
				if (4 < _search.length()) {
					if (_search.contains("http")) {
						WBLink = _search;
					}
					else {
						WBLink = "http://".concat(_search);
					}
				}
				else {
					WBLink = "https://www.google.com/search?q=".concat(_search);
				}
			}
			else {
				WBLink = "https://www.google.com/search?q=".concat(_search);
			}
		}
		else {
			WBLink = "https://www.google.com/search?q=".concat(_search);
		}
		_wbv.loadUrl(WBLink);
	}
	
	
	public void _Fab_Color(final String _color) {
		
	}
	
	
	public void _controlRotation() {
		t = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						if (SketchwareUtil.getDisplayWidthPixels(getApplicationContext()) > SketchwareUtil.getDisplayHeightPixels(getApplicationContext())) {
							getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
						}
						else {
							if (SketchwareUtil.getDisplayWidthPixels(getApplicationContext()) < SketchwareUtil.getDisplayHeightPixels(getApplicationContext())) {
								getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
							}
						}
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(t, (int)(0), (int)(100));
	}
	
	
	public void _NavStatusBarColor(final String _color1, final String _color2) {
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) {
			Window w = this.getWindow();	w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);	w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			w.setStatusBarColor(Color.parseColor("#" + _color1.replace("#", "")));	w.setNavigationBarColor(Color.parseColor("#" + _color2.replace("#", "")));
		}
	}
	
	
	public void _od() {
		
	}
	
	
	public void _Add(final String _ad) {
		
	}
	
	
	public void _WebView_Finger_Zoom(final WebView _web) {
		_web.getSettings().setBuiltInZoomControls(true);
		webview1.getSettings().setDisplayZoomControls(false);
	}
	
	
	public void _full() {
		
		//Copied From Universal SketchCode Premium(6.1).
	}
	
	
	public void _Share(final String _dat, final boolean _file, final String _des) {
		if (_file) {
			Intent shareIntent = new Intent(Intent.ACTION_SEND); shareIntent.setType("text/plain");
			shareIntent.putExtra(Intent.EXTRA_TEXT, (_des)); shareIntent.putExtra(Intent.EXTRA_STREAM, Uri.parse(_dat));
			startActivity(Intent.createChooser(shareIntent, "Share"));
			//By GiantMurloc\\
		}
		else {
			Intent shareIntent = new Intent(Intent.ACTION_SEND); shareIntent.setType("text/plain"); shareIntent.putExtra(Intent.EXTRA_TEXT, (_dat));
			startActivity(Intent.createChooser(shareIntent, "Share"));
		}
	}
	
	
	public void _download(final String _url, final String _path) {
		try{
			DownloadManager.Request request = new DownloadManager.Request(Uri.parse( _url)); 
			request.setMimeType(This.getContentResolver().getType(Uri.parse(_url))); 
			String cookies = CookieManager.getInstance().getCookie(_url); 
			request.addRequestHeader("cookie", cookies); 
			//request.addRequestHeader("User-Agent", tab.getSettings().getUserAgentString());
			request.setDescription("Downloading file..."); 
			request.setTitle(URLUtil.guessFileName(_url,"",""));
			request.allowScanningByMediaScanner(); 
			request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED); 
			request.setDestinationInExternalPublicDir( _path.equals("")?Environment.DIRECTORY_DOWNLOADS:_path, URLUtil.guessFileName(_url,"","")); 
			DownloadManager dm = (DownloadManager) getSystemService(DOWNLOAD_SERVICE); dm.enqueue(request);
			Toast.makeText(getApplicationContext(), "Downloading File", Toast.LENGTH_LONG).show();
		}catch(Exception e){showMessage(e.toString());}
	}final Context This = this; void nothing(){
		
		
	}
	
	
	public void _swipeToRefreshWeb(final WebView _webview, final View _view) {
		final SwipeRefreshLayout sr = new SwipeRefreshLayout(this);
		sr.setLayoutParams(new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.MATCH_PARENT, android.widget.LinearLayout.LayoutParams.MATCH_PARENT));
		((LinearLayout) _view).addView(sr);
		_webview.getSettings().setJavaScriptEnabled(true);
		((LinearLayout) _view).removeView(_webview);
		((LinearLayout) _view).post(new Runnable() { 
			@Override public void run() {
				sr.addView(_webview);
				 } });
		_webview.setWebViewClient(new WebViewClient() { 
			public void onPageFinished(WebView view, String url) {
				sr.setRefreshing(false);
			}});
		sr.setOnRefreshListener( new SwipeRefreshLayout.OnRefreshListener() { 
			@Override public void onRefresh() { 
				sr.setRefreshing(false);
				_webview.reload();
			} } );
	}
	
	
	public void _DG__webView_Download(final WebView _ID, final String _URL) {
		_ID.loadUrl(_URL);
		_ID.setDownloadListener(new DownloadListener() {
			public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
				DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
				String cookies = CookieManager.getInstance().getCookie(url);
				request.addRequestHeader("cookie", cookies);
				request.addRequestHeader("User-Agent", userAgent);
				request.setDescription("Dosya indiriliyor.");
				request.setTitle(URLUtil.guessFileName(url, contentDisposition, mimetype));
				request.allowScanningByMediaScanner();
				request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED); request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, URLUtil.guessFileName(url, contentDisposition, mimetype));
				
				DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				manager.enqueue(request);
				showMessage("Dosya indiriliyor");
				//Notif if success
				BroadcastReceiver onComplete = new BroadcastReceiver() {
					public void onReceive(Context ctxt, Intent intent) {
						showMessage("indirme tamamlandi");
						unregisterReceiver(this);
					}};
				registerReceiver(onComplete, new IntentFilter(DownloadManager.ACTION_DOWNLOAD_COMPLETE));
			}
		});
		
	}
	
	
	public void _ohDearDownloadMe() {
		
		
		webview1.setDownloadListener(new DownloadListener() {
			public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
				DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
				String cookies = CookieManager.getInstance().getCookie(url);
				request.addRequestHeader("cookie", cookies);
				request.addRequestHeader("User-Agent", userAgent);
				com.google.android.material.snackbar.Snackbar.make(webview1, "İndirme Başladı..", com.google.android.material.snackbar.Snackbar.LENGTH_SHORT).setAction("", new View.OnClickListener(){
					@Override
								public void onClick(View _view) {
										 
								}
				}).show();
				request.setTitle(URLUtil.guessFileName(url, contentDisposition, mimetype));
				request.allowScanningByMediaScanner(); request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED); request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, URLUtil.guessFileName(url, contentDisposition, mimetype));
				
				DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
				manager.enqueue(request);
				com.google.android.material.snackbar.Snackbar.make(webview1, "İndirme Başladı..", com.google.android.material.snackbar.Snackbar.LENGTH_SHORT).setAction("", new View.OnClickListener(){
					@Override
								public void onClick(View _view) {
										 
								}
				}).show();
				BroadcastReceiver onComplete = new BroadcastReceiver() {
					public void onReceive(Context ctxt, Intent intent) {
						com.google.android.material.snackbar.Snackbar.make(webview1, "İndirme Sonlandı!", com.google.android.material.snackbar.Snackbar.LENGTH_SHORT).setAction("", new View.OnClickListener(){
							@Override
										public void onClick(View _view) {
												 
										}
						}).show();
						unregisterReceiver(this);
					}};
				registerReceiver(onComplete, new IntentFilter(DownloadManager.ACTION_DOWNLOAD_COMPLETE));
			}
		});
	}
	
	
	public void _heyProgress() {
		
		final android.widget.ProgressBar prog = new android.widget.ProgressBar(this,null, android.R.attr.progressBarStyleHorizontal);
		prog.setPadding(0,0,0,0);
		prog.setIndeterminate(false);
		prog.setFitsSystemWindows(true);
		prog.setProgress(0);
		prog.setScrollBarStyle(android.widget.ProgressBar.SCROLLBARS_OUTSIDE_INSET);
		prog.setMax(100);
		ViewGroup.LayoutParams vlp = new ViewGroup.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 10);
		/*
prog.setBackgroundColor(Color.parseColor("#ffffff"));*/
		
		
		
		prog.setVisibility(View.GONE);
		prog.setBackgroundColor(Color.TRANSPARENT);
		prog.setLayoutParams(vlp);
		linear32.addView(prog);
		webview1.setWebChromeClient(new WebChromeClient() {
			@Override public void onProgressChanged(WebView view, int newProgress) {
				if (100 == newProgress) {
					prog.setVisibility(View.GONE);
				}
				else {
					prog.setVisibility(View.VISIBLE);
				}
				prog.setProgress(newProgress);
			}
		});
	}
	
	
	public void _Darkmode(final boolean _Dark, final View _ViewMain, final View _ViewDark, final TextView _ViewText, final String _CMD) {
		DarkMode_IsDark = _Dark;
		if (_Dark) {
			DarkMode_SetString = "Dark";
		}
		else {
			DarkMode_SetString = "Light";
		}
		if (_CMD.equals("background")) {
			if (_Dark) {
				_ViewMain.setBackgroundColor(0xFF333333);
			}
			else {
				_ViewMain.setBackgroundColor(Color.TRANSPARENT);
			}
		}
		if (_CMD.equals("replace")) {
			if (_Dark) {
				_ViewMain.setVisibility(View.GONE);
				_ViewDark.setVisibility(View.VISIBLE);
			}
			else {
				_ViewDark.setVisibility(View.GONE);
				_ViewMain.setVisibility(View.VISIBLE);
			}
			// It's better to use IfElse blocks. Do what I say. -> If <Darkmode_IsDark> is True, Set all Imageviews with icons inside a background to white. If not, set all Icons to black. Be sure this IfElse block comes after this Moreblock.
			// If you're just so lazy in scripting, Perfect to place 2 same icons with only different colors in each linears
		}
		if (_CMD.equals("textcolor")) {
			if (_Dark) {
				_ViewText.setTextColor(0xFFFFFFFF);
			}
			else {
				_ViewText.setTextColor(0xFF000000);
			}
		}
	}
	
	
	public void _sourceCodeView(final WebView _webview, final String _url) {
		_webview.loadUrl("view-source:".concat(_url));
	}
	
	
	public void _SetIconDialog(final AlertDialog.Builder _dialog) {
		_dialog.setIcon(R.drawable.ic_https_white);
	}
	
	
	public void _no2(final AlertDialog.Builder _dialog) {
		_dialog.setIcon(R.drawable.ic_warning_white);
	}
	
	
	public void _ss(final AlertDialog.Builder _dialog) {
		Drawable drawable = new BitmapDrawable(getResources(), webview1.getFavicon());
		
		
		_dialog.setIcon(drawable);
	}
	
	
	public void _vol999(final AlertDialog.Builder _dialog) {
		_dialog.setIcon(R.drawable.ic_new_releases_white);
	}
	
	
	public void _onCreateContextMenu() {
	}
	// for Use addSourceDirectly
	// onCreate with value
	// "registerForContextMenu(your_webview_id);
	 @Override
	public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
	{
		
		// Change webview1 with WebView id
		
		final WebView.HitTestResult result = webview1.getHitTestResult();
		
		MenuItem.OnMenuItemClickListener handler = new MenuItem.OnMenuItemClickListener() {
			public boolean onMenuItemClick(MenuItem item) {
				
				// This section is to Execute your
				// Popup Item
				
				switch (item.getItemId()){
					case 0:
					
					String DownloadImageURL = result.getExtra();
					
											if(URLUtil.isValidUrl(DownloadImageURL)){
						
													DownloadManager.Request request = new DownloadManager.Request(Uri.parse(DownloadImageURL));
													request.allowScanningByMediaScanner();
													request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
						
						DownloadManager downloadManager = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
						
						downloadManager.enqueue(request);
						
						showMessage("Image Has Been Saved");
						
					} else {
						
						showMessage("Sorry, Something Wrong...");
					}
					return true;
					
					case 1:
					webview1.loadUrl(result.getExtra());
					return true;
					
					case 2:
					setClipboard(getApplicationContext(), result.getExtra());
					
					showMessage("Link Has Been Copied");
					return true;
					
					case 3:
					
					Intent i = new Intent(Intent.ACTION_VIEW);
											i.setData(Uri.parse(result.getExtra()));
					startActivity(i);
					return true;
				}
				return true;
			}
		};
		
		if (result.getType() == WebView.HitTestResult.IMAGE_TYPE || result.getType() == WebView.HitTestResult.SRC_IMAGE_ANCHOR_TYPE) {
			
			
			// Menu options for an image.
			//set the header title to the image url
						menu.setHeaderTitle(result.getExtra());
			menu.add(0, 0, 0, "Save Image").setOnMenuItemClickListener(handler);
			menu.add(1, 1, 1, "View Image").setOnMenuItemClickListener(handler);
			menu.add(2, 2, 2, "Copy Image Link").setOnMenuItemClickListener(handler);
		} else if (result.getType() == WebView.HitTestResult.ANCHOR_TYPE || result.getType() == WebView.HitTestResult.SRC_ANCHOR_TYPE) {
			
			// Menu options for a hyperlink.
			//set the header title to the link url
						menu.setHeaderTitle(result.getExtra());
			menu.add(3, 3, 3, "Open In External").setOnMenuItemClickListener(handler);
			menu.add(2, 2, 2, "Copy Link").setOnMenuItemClickListener(handler);
		}
		
		super.onCreateContextMenu(menu, v, menuInfo);
	}
	// Extra Copied String to clipboard in bellow
	private void setClipboard(Context context, String text) {
		if(Build.VERSION.SDK_INT < Build.VERSION_CODES.HONEYCOMB) {
			
			android.text.ClipboardManager clipboard = (android.text.ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
			clipboard.setText(text);
		} else {
			
			android.content.ClipboardManager clipboard = (android.content.ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
			
			android.content.ClipData clip = ClipData.newPlainText("Copied Text", text);
						clipboard.setPrimaryClip(clip);
				}
	}
	
	
	public void _zar() {
		dice = SketchwareUtil.getRandom((int)(1), (int)(6));
		zaaar = String.valueOf((long)(dice));
		zaar.setTitle("Zar Salladın!");
		zaar.setMessage("Zardan,".concat(zaaar.concat("geldi!")));
		zaar.setPositiveButton("Yay!", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				zar_deneme = true;
			}
		});
		zaar.create().show();
		if (!zar_deneme) {
			zar_deneme = false;
		}
		else {
			zar_deneme = true;
		}
	}
	
	
	public void _extra() {
	}
	
	private ValueCallback<Uri> mUploadMessage;
	public ValueCallback<Uri[]> uploadMessage;
	public static final int REQUEST_SELECT_FILE = 100;
	
	private final static int FILECHOOSER_RESULTCODE = 1;
	{
		
	}
	
	
	public void _tor() {
		
		webview1.getSettings().setLoadWithOverviewMode(true); webview1.getSettings().setUseWideViewPort(true); final WebSettings webSettings = webview1.getSettings(); final String newUserAgent; newUserAgent = "Mozilla/5.0 (Android 7.1; Mobile; rv:68.0) Gecko/20100101 Firefox/78.0"; webSettings.setUserAgentString(newUserAgent);
		
	}
	
	
	public void _aa(final double _nid, final String _title, final String _context, final String _noticon) {
		final Context context = getApplicationContext();
		
		int notid = (int) _nid;
		NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
		Intent intent = new Intent(this, MainActivity.class); 
		intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP); 
		PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0); 
		androidx.core.app.NotificationCompat.Builder builder; 
		int notificationId = notid;
		    String channelId = "channel-01";
		    String channelName = "Vpn";
		    int importance = NotificationManager.IMPORTANCE_HIGH;
		if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
			        NotificationChannel mChannel = new NotificationChannel(
			                channelId, channelName, importance);
			notificationManager.createNotificationChannel(mChannel);
			    }
		String variableValue = _noticon;
		
		androidx.core.app.NotificationCompat.Builder mBuilder = new androidx.core.app.NotificationCompat.Builder(context, channelId)
		            .setSmallIcon(getResources().getIdentifier(variableValue, "drawable", getPackageName()))
		            .setContentTitle(_title)
		            .setContentText(_context)
		            .setAutoCancel(true)
		            .setOngoing(false)
		            .setContentIntent(pendingIntent);
		    TaskStackBuilder stackBuilder = TaskStackBuilder.create(context);
		    stackBuilder.addNextIntent(intent);
		    PendingIntent resultPendingIntent = stackBuilder.getPendingIntent(
		            0,
		            PendingIntent.FLAG_UPDATE_CURRENT
		    );
		mBuilder.setContentIntent(resultPendingIntent);
		notificationManager.notify(notificationId, mBuilder.build());
	}
	
	
	public void _load() {
		StringBuilder blocklist = new StringBuilder();
		       
		        InputStream fis2 = this.getResources().openRawResource(R.raw.adblockserverlist);//Storage location
		        BufferedReader br2 = new BufferedReader(new InputStreamReader(fis2));
		        if(fis2 != null) {
			            try {
				                while ((strLine2 = br2.readLine()) != null) {
					                    if(loddnormallist.equals("0")){
						                    blocklist.append(strLine2);//if ":::::" exists in blocklist | Line for Line
						                    blocklist.append("\n");
						                    }
					                    if(loddnormallist.equals("1")){
						                        blocklist.append(":::::"+strLine2);//if ":::::" not exists in blocklist | Line for Line
						                        blocklist.append("\n");
						                    }
					
					                }
				            } catch (IOException e) {
				                e.printStackTrace();
				            }
			        }
		    
		
	}
	
	
	public void _loading() {
		
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
