import { Image, View, StyleSheet } from "react-native";
import React from "react";
import { FontAwesomeIcon } from "@fortawesome/react-native-fontawesome";
import {
  faTableCellsLarge,
  faMagnifyingGlass,
  faEllipsisVertical,
} from "@fortawesome/free-solid-svg-icons";
// import { Button } from 'react-native-elements';

const Nav = () => {
  return (
    <View style={styles.container}>
      <Image
        style={{
          resizeMode: "contain",
          height: 75,
          width: 145,
        }}
        source={require("../../assets/rantLogo.png")}
      />
        <FontAwesomeIcon icon={faTableCellsLarge} size="25" />
        {/* <Button
                title={'React Native Elements'}
                containerStyle={{
                  width: 100,

                  backgroundColor: "rgb(145, 71, 255)",
                }}
              /> */}
        <FontAwesomeIcon icon={faMagnifyingGlass} size="25" />
        <FontAwesomeIcon icon={faEllipsisVertical} size="25" />
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    width: "100%",
    flex: 1,
    flexDirection: "row",
    justifyContent: "space-between",
    alignItems: "center",
    paddingHorizontal: 10,
    paddingVertical: 0,
  },
});

export default Nav;
