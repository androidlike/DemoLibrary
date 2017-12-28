# DemoLibrary 

### 导入步骤
#####  方式1：compile
#######  NO.1
 <pre><code> allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
	</code></pre>
#######  NO.2 
<pre><code>
	<code>dependencies {
	        compile 'com.github.androidlike:DemoLibrary:1.1'
	}
	</code>
</pre>	
	
######  方式2：maven
  
###### No.1
  <pre><code><repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
</code></pre>	
###### No.2
 <pre><code> <dependency>
	    <groupId>com.github.androidlike</groupId>
	    <artifactId>DemoLibrary</artifactId>
	    <version>1.0</version>
	</dependency>
</code></pre>
