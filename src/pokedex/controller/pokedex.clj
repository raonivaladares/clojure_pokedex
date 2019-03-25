(ns pokedex.controller.pokedex
  (:require [pokedex.data.pokedex :as d-pokedex]
            [pokedex.logic.pokedex :as l-pokedex]))

(defn find-pokedex-with-name
  [name]
  ((keyword name) d-pokedex/pokedex-data-source))

(defn search-by-number
  [number pokedex]
  (l-pokedex/search-by-number number (find-pokedex-with-name pokedex)))
