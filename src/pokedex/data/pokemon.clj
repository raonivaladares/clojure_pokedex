(ns pokedex.data.pokemon
  (:require [clojure.core.cache :as cache]
            [pokedex.logic.pokemon :as l-pokemon]))

(def pokemon-data-source
  (cache/lru-cache-factory {:bulbasaur (l-pokemon/create "Bulbasaur" "Bulbasaur can be seen napping in bright sunlight. There is a seed on its back. By soaking up the sun's rays, the seed grows progressively larger.")
                            :ivysaur   (l-pokemon/create "Ivysaur" "There is a bud on this Pokémon's back. To support its weight, Ivysaur's legs and trunk grow thick and strong. If it starts spending more time lying in the sunlight, it's a sign that the bud will bloom into a large flower soon.")
                            :chikorita (l-pokemon/create "Chikorita" "In battle, Chikorita waves its leaf around to keep the foe at bay. However, a sweet fragrance also wafts from the leaf, becalming the battling Pokémon and creating a cozy, friendly atmosphere all around.")
                            :bayleef   (l-pokemon/create "Bayleef" "Bayleef's neck is ringed by curled-up leaves. Inside each tubular leaf is a small shoot of a tree. The fragrance of this shoot makes people peppy.")}))
