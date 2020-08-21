
// package com.example.video_api;


// import android.os.Bundle;
// import io.flutter.embedding.android.FlutterActivity;
// import io.flutter.plugins.GeneratedPluginRegistrant;
// import android.widget.Toast;
// import io.flutter.plugin.common.MethodCall;
// import io.flutter.plugin.common.MethodChannel;
// import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
// import io.flutter.plugin.common.MethodChannel.Result;

// public class MainActivity extends FlutterActivity {
// 	private static final String CHANNEL = "ourproject.sendstring";

//   	@Override
//   	protected void onCreate(Bundle savedInstanceState) {
//     	super.onCreate(savedInstanceState);
//     	GeneratedPluginRegistrant.registerWith(this);

//     	new MethodChannel(getFlutterView(), CHANNEL).setMethodCallHandler(
//                 new MethodCallHandler() {
//                     @Override
//                     public void onMethodCall(MethodCall call, Result result) {
//                     	if (call.method.equals("callSendStringFun")) {
//         					      showHelloFromFlutter(call.argument("arg"));
//         					      String temp = sendString();
//             				    result.success(temp);
//     					        } else {
//         					      result.notImplemented();
//     					        }
//                     }
//      			});
//   	}

//   	private String sendString(){
//     	String stringToSend = "Hello from Kotlin";
//     	return stringToSend;
//   	}

//   	private void showHelloFromFlutter(String argFromFlutter){
//   		Toast.makeText(this, argFromFlutter, Toast.LENGTH_SHORT).show();
// 	  }

// }

// // import android.os.Bundle;
// // import io.flutter.app.FlutterActivity;
// // import io.flutter.plugins.GeneratedPluginRegistrant;
// // import android.widget.Toast;
// // import io.flutter.plugin.common.MethodCall;
// // import io.flutter.plugin.common.MethodChannel;
// // import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
// // import io.flutter.plugin.common.MethodChannel.Result;
// // import android.support.annotation.IdRes;
// // import android.support.v7.app.AppCompatActivity;
// // import android.view.View;
// // import android.widget.Button;
// // import android.widget.EditText;
// // import android.widget.RadioButton;
// // import android.widget.RadioGroup;
// // import android.widget.Toast;

// // import com.vimeo.android.deeplink.VimeoDeeplink;

// // public class MainActivity extends AppCompatActivity {

// //     private static final String DEFAULT_CATEGORY_URI_PATH = "art";
// //     private static final String DEFAULT_CHANNEL_URI_PATH = "staffpicks";
// //     private static final String DEFAULT_USER_URI_PATH = "staff";
// //     private static final String DEFAULT_VIDEO_URI_PATH = "149058362";
// //     private static final String DEFAULT_VIDEO_URL = "https://www.vimeo.com/447785819";
// //     private static final String DEFAULT_ALBUM_URI_PATH = "/me/albums";
// //     private static final String DEFAULT_VOD_URI_PATH = "lonelyandhorny";

// //     public enum DeepLinkType {
// //         NONE,
// //         CATEGORY,
// //         CHANNEL,
// //         URL,
// //         USER,
// //         VIDEO,
// //         VOD,
// //         ALBUM
// //     }

// //     private Button mGoButton;
// //     private EditText mUriEditText;
// //     private EditText mUserIdForAlbumEditText;
// //     private EditText mIdForAlbumEditText;
// //     private DeepLinkType mDeepLinkType = DeepLinkType.NONE;

// //     private final RadioGroup.OnCheckedChangeListener mCheckedChangeListener =
// //             new RadioGroup.OnCheckedChangeListener() {
// //                 @Override
// //                 public void onCheckedChanged(RadioGroup group, int checkedId) {
// //                     mGoButton.setEnabled(true);
// //                     switch (checkedId) {
// //                         case R.id.activity_main_category_radiobutton:
// //                             mDeepLinkType = DeepLinkType.CATEGORY;
// //                             break;
// //                         case R.id.activity_main_channel_radiobutton:
// //                             mDeepLinkType = DeepLinkType.CHANNEL;
// //                             break;
// //                         case R.id.activity_main_url_radiobutton:
// //                             mDeepLinkType = DeepLinkType.URL;
// //                             break;
// //                         case R.id.activity_main_user_radiobutton:
// //                             mDeepLinkType = DeepLinkType.USER;
// //                             break;
// //                         case R.id.activity_main_video_radiobutton:
// //                             mDeepLinkType = DeepLinkType.VIDEO;
// //                             break;
// //                         case R.id.activity_main_vod_radiobutton:
// //                             mDeepLinkType = DeepLinkType.VOD;
// //                             break;
// //                         default:
// //                             mDeepLinkType = DeepLinkType.NONE;
// //                             break;
// //                     }
// //                 }
// //             };

// //     private final View.OnClickListener mGoClickListener = new View.OnClickListener() {
// //         @Override
// //         public void onClick(View v) {
// //             if (mDeepLinkType == DeepLinkType.NONE) {
// //                 Toast.makeText(getApplicationContext(), R.string.activity_main_select_error,
// //                                Toast.LENGTH_SHORT).show();
// //                 return;
// //             }
// //             String uriPath = mUriEditText.getText().toString().trim();
// //             if (uriPath.isEmpty()) {
// //                 uriPath = generatedUriPath();
// //             }

// //             performDeepLink(uriPath);
// //         }
// //     };

// // private static final String CHANNEL = "ourproject.sendstring";

// //   	@Override
// //   	protected void onCreate(Bundle savedInstanceState) {
// //     	super.onCreate(savedInstanceState);
// //     	GeneratedPluginRegistrant.registerWith(this);



// //                         new MethodChannel(getFlutterView(), CHANNEL).setMethodCallHandler(
// //                 new MethodCallHandler() {
// //                     @Override
// //                     public void onMethodCall(MethodCall call, Result result) {
// //                     	if (call.method.equals("callSendStringFun")) {


// //         super.onCreate(savedInstanceState);
// //         setContentView(R.layout.activity_main);
// //         mUriEditText = (EditText) findViewById(R.id.activity_main_edittext);

// //         RadioButton videoRadioButton = (RadioButton) findViewById(R.id.activity_main_video_radiobutton);
// //         videoRadioButton.setEnabled(VimeoDeeplink.canHandleVideoDeeplink(this));
// //         RadioButton userRadioButton = (RadioButton) findViewById(R.id.activity_main_user_radiobutton);
// //         userRadioButton.setEnabled(VimeoDeeplink.canHandleUserDeeplink(this));
// //         RadioButton categoryRadioButton = (RadioButton) findViewById(R.id.activity_main_category_radiobutton);
// //         categoryRadioButton.setEnabled(VimeoDeeplink.canHandleCategoryDeeplink(this));
// //         RadioButton channelRadioButton = (RadioButton) findViewById(R.id.activity_main_channel_radiobutton);
// //         channelRadioButton.setEnabled(VimeoDeeplink.canHandleChannelDeeplink(this));
// //         RadioButton urlRadioButton = (RadioButton) findViewById(R.id.activity_main_url_radiobutton);
// //         urlRadioButton.setEnabled(VimeoDeeplink.canHandleUrl(this, DEFAULT_VIDEO_URL));
// //         RadioButton vodRadioButton = (RadioButton) findViewById(R.id.activity_main_vod_radiobutton);
// //         vodRadioButton.setEnabled(VimeoDeeplink.canHandleOnDemandDeeplink(this));

// //         RadioGroup radioGroup = (RadioGroup) findViewById(R.id.activity_main_radiogroup);
// //         radioGroup.setOnCheckedChangeListener(mCheckedChangeListener);

// //         mGoButton = configureButton(R.id.activity_main_go_button,
// //                                     VimeoDeeplink.isVimeoAppInstalled(this),
// //                                     mGoClickListener);

// //         configureButton(R.id.activity_main_launch_button,
// //                         true,
// //                         new View.OnClickListener() {
// //                             @Override
// //                             public void onClick(View v) {
// //                                 VimeoDeeplink.openVimeoApp(MainActivity.this);
// //                             }
// //                         });


// //         configureButton(R.id.activity_main_playstore_button,
// //                         true,
// //                         new View.OnClickListener() {
// //                             @Override
// //                             public void onClick(View v) {
// //                                 VimeoDeeplink.viewVimeoAppInAppStore(MainActivity.this);
// //                             }
// //                         });


// //         configureButton(R.id.activity_main_categories_button,
// //                         VimeoDeeplink.canHandleCategoiesDeeplink(MainActivity.this),
// //                         new View.OnClickListener() {
// //                             @Override
// //                             public void onClick(View v) {
// //                                 VimeoDeeplink.showCategories(MainActivity.this);
// //                             }
// //                         });


// //         configureButton(R.id.activity_main_explore_button,
// //                         VimeoDeeplink.canHandleExploreDeeplink(MainActivity.this),
// //                         new View.OnClickListener() {
// //                             @Override
// //                             public void onClick(View v) {
// //                                 VimeoDeeplink.showExplore(MainActivity.this);
// //                             }
// //                         });

// //         configureButton(R.id.activity_main_feed_button,
// //                         VimeoDeeplink.canHandleFeedDeeplink(MainActivity.this),
// //                         new View.OnClickListener() {
// //                             @Override
// //                             public void onClick(View v) {
// //                                 VimeoDeeplink.showFeed(MainActivity.this);
// //                             }
// //                         });


// //         configureButton(R.id.activity_main_me_button,
// //                         VimeoDeeplink.canHandleMeDeeplink(MainActivity.this),
// //                         new View.OnClickListener() {
// //                             @Override
// //                             public void onClick(View v) {
// //                                 VimeoDeeplink.showMyProfile(MainActivity.this);
// //                             }
// //                         });

// //         configureButton(R.id.activity_main_notification_button,
// //                         VimeoDeeplink.canHandleNotificationsDeeplink(MainActivity.this),
// //                         new View.OnClickListener() {
// //                             @Override
// //                             public void onClick(View v) {
// //                                 VimeoDeeplink.showNotifications(MainActivity.this);
// //                             }
// //                         });

// //         configureButton(R.id.activity_main_notification_settings_button,
// //                         VimeoDeeplink.canHandlePushNotificationSettingsDeeplink(MainActivity.this),
// //                         new View.OnClickListener() {
// //                             @Override
// //                             public void onClick(View v) {
// //                                 VimeoDeeplink.showPushNotificationSettings(MainActivity.this);
// //                             }
// //                         });

// //         configureButton(R.id.activity_main_playlists_button,
// //                         VimeoDeeplink.canHandlePlaylistDeeplink(MainActivity.this),
// //                         new View.OnClickListener() {
// //                             @Override
// //                             public void onClick(View v) {
// //                                 VimeoDeeplink.showPlaylists(MainActivity.this);
// //                             }
// //                         });

// //         configureButton(R.id.activity_main_upgrade_button,
// //                         VimeoDeeplink.canHandleUpgradeDeeplink(MainActivity.this),
// //                         new View.OnClickListener() {
// //                             @Override
// //                             public void onClick(View v) {
// //                                 VimeoDeeplink.showUpgrade(MainActivity.this);
// //                             }
// //                         });

// //         configureButton(R.id.activity_main_upload_button,
// //                         VimeoDeeplink.canHandleUploadDeeplink(MainActivity.this),
// //                         new View.OnClickListener() {
// //                             @Override
// //                             public void onClick(View v) {
// //                                 VimeoDeeplink.showUpload(MainActivity.this);
// //                             }
// //                         });

// //         configureButton(R.id.activity_main_offline_button,
// //                         VimeoDeeplink.canHandleOfflineDeeplink(MainActivity.this),
// //                         new View.OnClickListener() {
// //                             @Override
// //                             public void onClick(View v) {
// //                                 VimeoDeeplink.showOffline(MainActivity.this);
// //                             }
// //                         });

// //         configureButton(R.id.activity_main_watchlater_button,
// //                         VimeoDeeplink.canHandleWatchLaterDeeplink(MainActivity.this),
// //                         new View.OnClickListener() {
// //                             @Override
// //                             public void onClick(View v) {
// //                                 VimeoDeeplink.showWatchLater(MainActivity.this);
// //                             }
// //                         });


// //         configureButton(R.id.activity_main_purchases_button,
// //                         VimeoDeeplink.canHandlePurchaseDeeplink(MainActivity.this),
// //                         new View.OnClickListener() {
// //                             @Override
// //                             public void onClick(View v) {
// //                                 VimeoDeeplink.showPurchases(MainActivity.this);
// //                             }
// //                         });

// //         configureButton(R.id.activity_main_video_manager_button,
// //                         VimeoDeeplink.canHandleVideoManagerDeeplink(MainActivity.this),
// //                         new View.OnClickListener() {
// //                             @Override
// //                             public void onClick(View v) {
// //                                 VimeoDeeplink.showVideoManager(MainActivity.this);
// //                             }
// //                         });

// //         configureButton(R.id.activity_main_albums_manager_button,
// //                         VimeoDeeplink.canHandleAlbumsDeeplink(MainActivity.this, DEFAULT_ALBUM_URI_PATH),
// //                         new View.OnClickListener() {
// //                             @Override
// //                             public void onClick(View v) {
// //                                 VimeoDeeplink.showAlbums(MainActivity.this, DEFAULT_ALBUM_URI_PATH);
// //                             }
// //                         });
// //         mUserIdForAlbumEditText = ((EditText) findViewById(R.id.activity_user_id_albums_edit_text));

// //         configureButton(R.id.activity_main_albums_for_user_button,
// //                         VimeoDeeplink.canHandleAlbumsDeeplink(MainActivity.this, getAlbumsForUserUri()),
// //                         new View.OnClickListener() {
// //                             @Override
// //                             public void onClick(View v) {
// //                                 VimeoDeeplink.showAlbums(MainActivity.this, getAlbumsForUserUri());
// //                             }
// //                         });

// //         mIdForAlbumEditText = ((EditText) findViewById(R.id.activity_user_id_album_edit_text));

// //         configureButton(R.id.activity_main_album_by_id,
// //                         VimeoDeeplink.canHandleAlbumsDeeplink(MainActivity.this, getAlbumForId()),
// //                         new View.OnClickListener() {
// //                             @Override
// //                             public void onClick(View v) {
// //                                 VimeoDeeplink.showAlbums(MainActivity.this, getAlbumForId());
// //                             }
// //                         });

// //         					      runVideo(call.argument("arg"));
// //         					      String temp = sendString();
// //             				    result.success(temp);
// //     					        } else {
// //         					      result.notImplemented();
// //     					        }
// //                     }
// //      			});
// //     }

// //     private String getAlbumsForUserUri() {
// //         return VimeoDeeplink.VIMEO_USER_URI_PREFIX +
// //                mUserIdForAlbumEditText.getText().toString() +
// //                VimeoDeeplink.VIMEO_ALBUMS_URI_POSTFIX;
// //     }

// //     private String getAlbumForId() {
// //         return VimeoDeeplink.VIMEO_ALBUM_URI_PREFIX + "/" +
// //                mIdForAlbumEditText.getText().toString();
// //     }


// //     private Button configureButton(@IdRes int buttonId, boolean enabled, View.OnClickListener listener) {
// //         Button button = (Button) findViewById(buttonId);
// //         button.setEnabled(enabled);
// //         if (enabled) {
// //             button.setOnClickListener(listener);
// //         }
// //         return button;
// //     }

// //     private String generatedUriPath() {
// //         switch (mDeepLinkType) {
// //             case CATEGORY:
// //                 return DEFAULT_CATEGORY_URI_PATH;
// //             case CHANNEL:
// //                 return DEFAULT_CHANNEL_URI_PATH;
// //             case URL:
// //                 return DEFAULT_VIDEO_URL;
// //             case USER:
// //                 return DEFAULT_USER_URI_PATH;
// //             case VIDEO:
// //                 return DEFAULT_VIDEO_URI_PATH;
// //             case VOD:
// //                 return DEFAULT_VOD_URI_PATH;
// //             case ALBUM:
// //                 return DEFAULT_ALBUM_URI_PATH;
// //             case NONE:
// //                 break;
// //         }
// //         return null;

// //     }
// //     private void runVideo(String uriPath){
      
// //         String uri;
// //         boolean handled = false;
// //  uri = VimeoDeeplink.VIMEO_USER_URI_PREFIX + uriPath;
// //                 handled = VimeoDeeplink.showUserWithUri(this, uri);
              
// //     }

// //     private void performDeepLink(String uriPath) {
// //         String uri;
// //         boolean handled = false;
// //         switch (mDeepLinkType) {
// //             case CATEGORY:
// //                 uri = VimeoDeeplink.VIMEO_CATEGORY_URI_PREFIX + uriPath;
// //                 handled = VimeoDeeplink.showCategoryWithUri(this, uri);
// //                 break;
// //             case CHANNEL:
// //                 uri = VimeoDeeplink.VIMEO_CHANNEL_URI_PREFIX + uriPath;
// //                 handled = VimeoDeeplink.showChannelWithUri(this, uri);
// //                 break;
// //             case URL:
// //                 handled = VimeoDeeplink.openUrl(this, uriPath);
// //                 break;
// //             case USER:
// //                 uri = VimeoDeeplink.VIMEO_USER_URI_PREFIX + uriPath;
// //                 handled = VimeoDeeplink.showUserWithUri(this, uri);
// //                 break;
// //             case VIDEO:
// //                 uri = VimeoDeeplink.VIMEO_VIDEO_URI_PREFIX + uriPath;
// //                 handled = VimeoDeeplink.showVideoWithUri(this, uri);
// //                 break;
// //             case VOD:
// //                 uri = VimeoDeeplink.VIMEO_ONDEMAND_URI_PREFIX + uriPath;
// //                 handled = VimeoDeeplink.showOnDemandTitleWithUri(this, uri);
// //                 break;
// //             case ALBUM:
// //                 handled = VimeoDeeplink.showAlbums(this, uriPath);
// //                 break;
// //             case NONE:
// //                 break;
// //         }
// //         if (!handled) {
// //             Toast.makeText(this, R.string.activity_main_deeplink_failure, Toast.LENGTH_SHORT).show();
// //         }
// //     }
// // }