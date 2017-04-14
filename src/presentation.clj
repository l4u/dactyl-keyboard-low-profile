(ns presentation
  (:refer-clojure :exclude [use import])
  (:require [scad-clj.scad :refer :all]
            [scad-clj.model :refer :all]
            [unicode-math.core :refer :all]
            [clojure.core.matrix.operators :refer [+ - / *]]))

(def ^:const COMBINED true)
(def x-offset 220)
(def angle 15)

(def left
  (if COMBINED
    (union
      (import "../things/assets-combined/dactyl-top-left.stl")
      (import "../things/assets-combined/dactyl-bottom-left.stl")
      (import "../things/assets-combined/dactyl-keycaps-left.stl"))

    (union
      (import "../things/assets-seperated/dactyl-top-left.stl")
      (import "../things/assets-seperated/dactyl-bottom-left.stl")
      (import "../things/assets-seperated/dactyl-stands-left.stl")
      (import "../things/assets-seperated/dactyl-rest-left.stl")
      (import "../things/assets-seperated/dactyl-keycaps-left.stl"))))

(def right
  (if COMBINED
    (union
      (import "../things/assets-combined/dactyl-top-right.stl")
      (import "../things/assets-combined/dactyl-bottom-right.stl")
      (import "../things/assets-combined/dactyl-keycaps-right.stl"))

    (union
      (import "../things/assets-seperated/dactyl-top-right.stl")
      (import "../things/assets-seperated/dactyl-bottom-right.stl")
      (import "../things/assets-seperated/dactyl-stands-right.stl")
      (import "../things/assets-seperated/dactyl-rest-right.stl")
      (import "../things/assets-seperated/dactyl-keycaps-right.stl"))))

(def presentation
  (union
    (->> left
         (translate [(- (/ x-offset 2)) 0 0])
         (rotate (/ π angle) [0 0 (- 1)]))
    (->> right
         (translate [(/ x-offset 2) 0 0])
         (rotate (/ π angle) [0 0 1]))))

(spit "things/dactyl-presentation.scad"
  (write-scad presentation))
