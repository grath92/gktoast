# gktoast
Android Toast Library For Showing Toast Message

[![](https://jitpack.io/v/grath92/gktoast.svg)](https://jitpack.io/#grath92/gktoast)

### Add it in your root build.gradle at the end of repositories:

```sh
allprojects {
   repositories {
		  ...
		  maven { url 'https://jitpack.io' }
	 }
}
```

### Add the dependency:

```sh
  dependencies {
	     implementation 'com.github.grath92:gktoast:0.10'
  }
```


### Use it on your app:

```sh
   GkToast.error(getApplicationContext(), "Error Message");
```

```sh
   GkToast.success(getApplicationContext(), "Success Message");
```
