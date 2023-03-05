package com.idconflictreactnative.test

import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager

class TestViewManager : ViewGroupManager<TestView>() {
    override fun getName(): String {
        return "TestView"
    }

    override fun createViewInstance(context: ThemedReactContext): TestView {
        return TestView(context)
    }
}