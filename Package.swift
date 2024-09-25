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
		 url: "https://github.com/chayanon-kyu/ComposeDemo/releases/download/0.1.0/Shared.xcframework.zip",
		 checksum: "093d7c08ad671ff9c6feca64ac950798463e82a99760a0e8e9f6bca4177e0aa3")
   ]
)
