# DemoLibrary 

#导入步骤
  方式1：compile
 NO.1
  allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  NO.2 
  	dependencies {
	        compile 'com.github.androidlike:DemoLibrary:1.0'
	}
  方式2：maven
  No.1
  <repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
  No.2
  <dependency>
	    <groupId>com.github.androidlike</groupId>
	    <artifactId>DemoLibrary</artifactId>
	    <version>1.0</version>
	</dependency>
