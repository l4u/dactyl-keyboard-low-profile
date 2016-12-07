union () {
  rotate (a=12.0, v=[0, 0, -1]) {
    translate ([-110, 0, 0]) {
      union () {
        import ("../things/assets-combined/dactyl-top-left.stl");
        import ("../things/assets-combined/dactyl-bottom-left.stl");
        import ("../things/assets-combined/dactyl-keycaps-left.stl");
      }
    }
  }
  rotate (a=12.0, v=[0, 0, 1]) {
    translate ([110, 0, 0]) {
      union () {
        import ("../things/assets-combined/dactyl-top-right.stl");
        import ("../things/assets-combined/dactyl-bottom-right.stl");
        import ("../things/assets-combined/dactyl-keycaps-right.stl");
      }
    }
  }
}
