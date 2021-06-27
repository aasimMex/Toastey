# Toastey
# simple toast library
## Prerequisites

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

## Dependency

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	...
	implementation 'com.github.Shashank02051997:FancyToast-Android:0.1.8'
}
```
## Usage

Each method always returns a `Toast` object, so you can customize the Toast much more. **DON'T FORGET THE `show()` METHOD!**

To display an default Toast:
 java
FancyToast.makeText(this,"Hello World !",FancyToast.LENGTH_LONG,FancyToast.DEFAULT,true);

To display a success Toast:
 java
FancyToast.makeText(this,"Hello World !",FancyToast.LENGTH_LONG,FancyToast.SUCCESS,true);


To display the error Toast:
java
FancyToast.makeText(this,"Hello World !",FancyToast.LENGTH_LONG,FancyToast.ERROR,true);
