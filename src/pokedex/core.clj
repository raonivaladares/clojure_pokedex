(ns pokedex.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn pokemon
  [name description]
  {:name        name
   :description description})

(def bulbasaur
  (pokemon "Bulbasaur" "Bulbasaur can be seen napping in bright sunlight. There is a seed on its back. By soaking up the sun's rays, the seed grows progressively larger."))

(def ivysaur
  (pokemon "Ivysaur" "There is a bud on this Pokémon's back. To support its weight, Ivysaur's legs and trunk grow thick and strong. If it starts spending more time lying in the sunlight, it's a sign that the bud will bloom into a large flower soon."))

(def chikorita
  (pokemon "Chikorita" "In battle, Chikorita waves its leaf around to keep the foe at bay. However, a sweet fragrance also wafts from the leaf, becalming the battling Pokémon and creating a cozy, friendly atmosphere all around."))

(def bayleef
  (pokemon "Bayleef" "Bayleef's neck is ringed by curled-up leaves. Inside each tubular leaf is a small shoot of a tree. The fragrance of this shoot makes people peppy."))

(defn region
  [name & pokemon]
  {:name    name
   :pokemon pokemon})

;; 1. catch them all
;; 2. give a number
;; 3. for more than one
;; {:1 bulbasaur :2 ivysayur}

(def kantho
  (region "Kantho" bulbasaur ivysaur))

(def johto
  (region "Johto" chikorita bayleef))

(defn pokedex-entry
  [number pokemon]
  {(keyword (str number)) pokemon})

(defn pokedex
  [& regions]
  (into {}
        (let [everyPokemon (flatten (map :pokemon regions))]
          (map-indexed #(pokedex-entry (inc %) %2) everyPokemon))))

(def johto-pokedex
  (pokedex johto))

(def kantho-pokedex
  (pokedex kantho))

;; {:1 bulbasaur :2 ivysaur :3 chikorita :4 ivysaur}
(def global-pokedex
  (pokedex kantho johto))

(defn findByNumber
  [number & pokedex]
  (map number pokedex))