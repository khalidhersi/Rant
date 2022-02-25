import { StyleSheet, View } from 'react-native';
import Home from "./Screens/Home/Home";
import BroadcastScreen from './Screens/BroadcastScreen/BroadcastScreen';

export default function App() {
  return (
    <View style={styles.container}>
      <BroadcastScreen/>
      <Home/>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {

  },
});
