import 'dart:convert';

import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:http/http.dart' as http;
import 'package:video_api/player.dart';
import 'package:webview_flutter/webview_flutter.dart';
import 'package:flutter_webview_plugin/flutter_webview_plugin.dart';
import 'package:flutter_inappwebview/flutter_inappwebview.dart';

class VideoPage extends StatefulWidget {
  @override
  _VideoPageState createState() => _VideoPageState();
}

class _VideoPageState extends State<VideoPage> {
  var videoLink =
          "https://flutter.github.io/assets-for-api-docs/assets/videos/butterfly.mp4",
          
      videoLinks = [],
      videos;
       InAppWebViewController webView;
  @override
  initState() {
    super.initState();

    // loadJson();
  }

  // loadJson() async {
  //   String path = "lib/video.json";

  //   final videoJson = await rootBundle.loadString(path);
  //   setState(() {
  //     videos = jsonDecode(videoJson)["videos"];
  //     print("appConfig------------------------");
  //     print(videos);
  //     videos.forEach((item) {
  //       getVideos(item["id"]);
  //     });
  //   });
  // }

  // void getVideos(id) async {
  //   var clientId = 'f8b9cbc82293762189ab8f550878c462264e5c52';
  //   var secret =
  //       'g2kiWDbJvxNuJ6cld66SRJfK4xwGHmIm/lIi31D62lielM+fTeunWW1whDQkW2uYLH6mRFIvNpvjSaK5O5VSagFrtvWcFJw0jWSMun6XROXf0jDTTvq+/k1lyfEhyqSb';
  //   String basicAuth =
  //       'Basic ' + base64Encode(utf8.encode('$clientId:$secret'));
  //   print(basicAuth);
  //   var url =
  //       "https://api.vimeo.com/videos/$id?password=12345&access_token=26cd9e5ffe57007ed635e372db2273e8";
  //   print(url);
  //   var res = await http
  //       .get(url, headers: <String, String>{'authorization': basicAuth});

  //   print(res.body);
  //   setState(() {
  //     videoLink = json.decode(res.body)["link"];
  //     videoLinks.add(videoLink);
  //   });
  //   print(videoLink);
  //   print(videoLinks);
  // }

  @override
  Widget build(BuildContext context) {
    return SafeArea(
        child:
InAppWebView(
  initialUrl: "https://taxingIndia.com/119-2",
  initialHeaders: {},
  initialOptions: InAppWebViewGroupOptions(
      crossPlatform: InAppWebViewOptions(
                        debuggingEnabled: true,
                    )
  ),
  onWebViewCreated: (InAppWebViewController controller) {
    webView = controller;
  },
  onLoadStart: (InAppWebViewController controller, String url) {

  },
  onLoadStop: (InAppWebViewController controller, String url) {

  },
),

 
      //   WebviewScaffold(
      // url: 'https://taxingIndia.com/',
      //   withZoom: true,
      // withLocalStorage: true,
      // hidden: true,
      //   )
    //      Scaffold(
    //         body: WebView(
    //   initialUrl: 'https://taxingIndia.com/119-2',
    
    // )
    // )
    );
  }
}
