(ns pokedex.controller.pokedex
  (:require [pokedex.data.pokedex :as d-pokedex]))

(defn search-by-number
  [number & pokedex]
  (map (keyword (str number)) (map #((keyword %) d-pokedex/pokedex-data-source) pokedex)))
