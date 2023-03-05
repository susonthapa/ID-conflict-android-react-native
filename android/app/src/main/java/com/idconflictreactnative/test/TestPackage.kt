package com.idconflictreactnative.test

import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ViewManager

class TestPackage(): ReactPackage {
    override fun createNativeModules(p0: ReactApplicationContext): MutableList<NativeModule> {
        return mutableListOf()
    }

    override fun createViewManagers(context: ReactApplicationContext): MutableList<ViewManager<*, *>> {
        return mutableListOf(TestViewManager())
    }
}