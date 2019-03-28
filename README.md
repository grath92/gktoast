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
	     implementation 'com.github.grath92:gktoast:0.11'
  }
```


### Use it on your app:

```sh
   GkToast.Error(getApplicationContext(), "Error Message", GkToast.LENGTH_LONG);
```

```sh
   GkToast.Success(getApplicationContext(), "Success Message", GkToast.LENGTH_LONG);
```

```sh
   GkToast.Warning(getApplicationContext(), "Warning Message", GkToast.LENGTH_LONG);
```

```sh
   GkToast.Info(getApplicationContext(), "Info Message", GkToast.LENGTH_SHORT);
```

```sh
   GkToast.Default(getApplicationContext(), "Default Message", GkToast.LENGTH_SHORT);
```
