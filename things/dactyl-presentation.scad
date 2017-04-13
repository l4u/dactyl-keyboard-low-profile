union () {
  rotate (a=12.0, v=[0, 0, -1]) {
    translate ([-110, 0, 0]) {
      union () {
        import ("../things/assets-seperated/dactyl-top-left.stl");
        import ("../things/assets-seperated/dactyl-bottom-left.stl");
        import ("../things/assets-seperated/dactyl-stands-left.stl");
        import ("../things/assets-seperated/dactyl-rest-left.stl");
        import ("../things/assets-seperated/dactyl-keycaps-left.stl");
      }
    }
  }
  rotate (a=12.0, v=[0, 0, 1]) {
    translate ([110, 0, 0]) {
      union () {
        import ("../things/assets-seperated/dactyl-top-right.stl");
        import ("../things/assets-seperated/dactyl-bottom-right.stl");
        import ("../things/assets-seperated/dactyl-stands-right.stl");
        import ("../things/assets-seperated/dactyl-rest-right.stl");
        import ("../things/assets-seperated/dactyl-keycaps-right.stl");
      }
    }
  }
}
