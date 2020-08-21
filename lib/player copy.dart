import 'dart:convert';
import 'dart:async';
import 'package:flutter_webview_plugin/flutter_webview_plugin.dart';
import 'package:webview_flutter/webview_flutter.dart';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:http/http.dart' as http;

class Player extends StatefulWidget {
  final videoLink;
  Player(this.videoLink);
  @override
  _PlayerState createState() => _PlayerState();
}

class _PlayerState extends State<Player> {
  var videoLink;
static const platform = const MethodChannel('ourproject.sendstring');
  @override
  initState() {
    super.initState();

    videoLink = widget.videoLink;
  }

  Future<void> runVideo() async {
    try {
   
          await platform.invokeMethod('runVideo', {"arg": videoLink});
 
    } on PlatformException catch (e) {
      print("failed");
    }
  }

  @override
  void dispose() {
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    return Container(
      padding: EdgeInsets.all(16),
      height: 200,
      child: WebView(
        initialUrl: Uri.dataFromString('<html><body><iframe src="https://player.vimeo.com/video/447785939" width="640" height="360" frameborder="0" allow="autoplay; fullscreen" allowfullscreen></iframe></body></html>',
                mimeType: 'text/html')
            .toString(),
        javascriptMode: JavascriptMode.unrestricted,
      ),
    );
  }
}

// class VideoPlayer extends State
