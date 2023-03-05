import { requireNativeComponent, Text, View } from "react-native"

const NativeView = requireNativeComponent("TestView")

const TestScreen = () => {
  return (
    <View style={{
      flex: 1,
      alignItems: 'center',
    }}>
      <Text>Test Screen</Text>
      <NativeView testProp="HEllo WOrld" style={{ width: 100, height: 100 }} />
    </View>
  )
}

export default TestScreen
