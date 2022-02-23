import React from 'react'
import { StatusBar } from 'expo-status-bar';
import { StyleSheet, View } from 'react-native';
import Nav from '../../Components/Nav/Nav';

const Home = () => {
  return (
    <View style={styles.container}>
      <Nav/>
      <StatusBar style="auto" />
    </View>
  )
}

const styles = StyleSheet.create({
    container: {
      flex: 1,
      backgroundColor: '#ffbf69',
      alignItems: 'center',
      justifyContent: 'center',
    },
  });

  export default Home;