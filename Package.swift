// swift-tools-version:5.3
import PackageDescription

let package = Package(
   name: "Shared",
   platforms: [
	 .iOS(.v14),
   ],
   products: [
	  .library(name: "Shared", targets: ["Shared"])
   ],
   targets: [
	  .binaryTarget(
		 name: "Shared",
		 url: "https://raw.github.com/chayanon-kyu/ComposeDemo/main/Shared.xcframework.zip",
		 checksum: "eb1b87576f155237eb413ea0a8e14a50bea02b5a5af8eb5942c12e849e76532f")
   ]
)
