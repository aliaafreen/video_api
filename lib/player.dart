import 'dart:convert';
import 'dart:async';

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
  @override
  initState() {
    super.initState();

    videoLink = widget.videoLink;
  }

  @override
  void dispose() {
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    return AspectRatio(
              aspectRatio:
                  MediaQuery.of(context).size.width / MediaQuery.of(context).size.height,
           
      child: WebView(
        initialUrl: 'https://taxingIndia.com/119-2',
        javascriptMode: JavascriptMode.unrestricted,
      ),
    );
  }
}

// // class VideoPlayer extends State
// import 'package:chewie/chewie.dart';
// import 'package:video_player/video_player.dart';
// import 'package:flutter/material.dart';

// class Player extends StatefulWidget {
//   final videoLink;
//   Player(this.videoLink);
//   @override
//   _PlayerState createState() => _PlayerState();
// }

// class _PlayerState extends State<Player> {
//   ChewieController _chewieController;
//   VideoPlayerController videoPlayerController;
//   var videoLink;
//   @override
//   initState() {
//     super.initState();

//     videoLink = widget.videoLink;
//     videoPlayerController =
//         VideoPlayerController.network("https://player.vimeo.com/video/447785819?badge=0&amp;autopause=0&amp;player_id=0&amp;app_id=186327");
//     _chewieController = ChewieController(
//       videoPlayerController: videoPlayerController,
//       aspectRatio: 16 / 9,
//       // Prepare the video to be played and display the first frame
//       autoInitialize: true,
//       looping: true,
//     );
//   }

//   @override
//   void dispose() {
//     super.dispose();
//   }

//   @override
//   Widget build(BuildContext context) {
//     return Container(
//       padding: EdgeInsets.all(16),
//       height: 200,
//       child: Chewie(controller: _chewieController),
//     );
//   }
// }

// // class VideoPlayer extends State
