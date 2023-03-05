//
//  TestView.swift
//  IDConflictReactNative
//
//  Created by Susan Thapa on 02/03/2023.
//

import Foundation
import UIKit

class TestView: UIView {
  
  override init(frame: CGRect) {
    super.init(frame: frame)
    backgroundColor = .red
  }
  
  required init?(coder: NSCoder) {
    fatalError("init(coder:) has not been implemented")
  }
  
}
