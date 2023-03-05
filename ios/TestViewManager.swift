//
//  TestViewManager.swift
//  IDConflictReactNative
//
//  Created by Susan Thapa on 02/03/2023.
//

import Foundation

@objc(TestViewManager)
class TestViewManager: RCTViewManager {
  @objc override class func requiresMainQueueSetup() -> Bool {
    true
  }
  
  override func view() -> UIView! {
    return TestView()
  }
  
}
