(ns pokedex.logic.pokedex)

(defn new-entry
  [number pokemon]
  {(keyword (str number)) pokemon})

(defn create
  [& regions]
  (into {}
        (let [everyPokemon (flatten (map :pokemon regions))]
          (map-indexed #(new-entry (inc %) %2) everyPokemon))))

(defn search-by-number
  [number & pokedex]
  (map (keyword (str number)) pokedex))
