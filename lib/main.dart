import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import './video_page.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: VideoPage(),
    );
  }
}

// class MyHomePage extends StatefulWidget {
//   @override
//   _MyHomePageState createState() => _MyHomePageState();
// }

// class _MyHomePageState extends State<MyHomePage> {
//   static const platform = const MethodChannel('ourproject.sendstring');
//   String receivedString = "";

//   Future<void> callNativeFunction() async {
//     String msg = "Hello from Flutter", data = "";
//     try {
//       final String temp =
//           await platform.invokeMethod('callSendStringFun', {"arg": msg});
//       data = temp;
//     } on PlatformException catch (e) {
//       data = "Failed";
//     }
//     setState(() {
//       receivedString = data;
//     });
//   }

//   @override
//   Widget build(BuildContext context) {
//     return Scaffold(
//       appBar: AppBar(
//         title: Text("CallNative"),
//       ),
//       body: Center(
//         child: Column(
//           mainAxisAlignment: MainAxisAlignment.center,
//           children: <Widget>[
//             RaisedButton(
//               onPressed:
//                   callNativeFunction, //callNativeFunction is called on button pressed
//               child: Text("Call Native"),
//             ),
//             Text('$receivedString'),
//           ],
//         ),
//       ),
//     );
//   }
// }
