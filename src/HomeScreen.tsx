import { useNavigation } from "@react-navigation/native"
import { Button, View } from "react-native"

const HomeScreen = () => {
  const nav = useNavigation()
  return (
    <View style={{
      flex: 1,
      alignItems: 'center',
    }}>
      <Button title="Navigate" onPress={() => nav.navigate('TestScreen')} />
    </View>
  )
}

export default HomeScreen