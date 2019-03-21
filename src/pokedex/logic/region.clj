(ns pokedex.logic.region)

(defn create
  [name & pokemon]
  {:name    name
   :pokemon pokemon})