package com.moneymanagersaver;

import android.app.Application;

import com.reactnativenavigation.NavigationApplication;
import org.devio.rn.splashscreen.SplashScreenReactPackage;
import com.oblador.vectoricons.VectorIconsPackage;
import com.oblador.vectoricons.VectorIconsPackage;
import com.facebook.react.ReactNativeHost;
import com.reactnativenavigation.react.NavigationReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

import com.reactnativenavigation.NavigationApplication;
import com.reactnativenavigation.react.NavigationReactNativeHost;
import com.reactnativenavigation.react.ReactGateway;
import com.BV.LinearGradient.LinearGradientPackage;
import org.pgsqlite.SQLitePluginPackage;
import com.horcrux.svg.SvgPackage;

import java.util.Arrays;
import java.util.List;

// public class MainApplication extends NavigationApplication {

//   @Override
//   protected ReactGateway createReactGateway() {
//     ReactNativeHost host = new NavigationReactNativeHost(this, isDebug(), createAdditionalReactPackages()) {
//       @Override
//       protected String getJSMainModuleName() {
//         return "index";
//       }
//     };
//     return new ReactGateway(this, isDebug(), host);
//   }

//   @Override
//   public boolean isDebug() {
//     return BuildConfig.DEBUG;
//   }

//   protected List<ReactPackage> getPackages() {
//     return Arrays.<ReactPackage>asList(
//         new SQLitePluginPackage(),
//         new VectorIconsPackage(),
//         new LinearGradientPackage(),
//         new SplashScreenReactPackage(),
//         new SvgPackage());
//   }

//   @Override
//   public List<ReactPackage> createAdditionalReactPackages() {
//     return getPackages();
//   }
// }

public class MainApplication extends NavigationApplication {

  private final ReactNativeHost mReactNativeHost = new NavigationReactNativeHost(this) {

    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
          new VectorIconsPackage(),
          new SQLitePluginPackage(),
          new LinearGradientPackage(),
          new SplashScreenReactPackage(),
          new SvgPackage());
    }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    // initializeFlipper(this, getReactNativeHost().getReactInstanceManager());
  }
}
