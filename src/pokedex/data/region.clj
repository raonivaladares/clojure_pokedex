(ns pokedex.data.region
  (:require [clojure.core.cache :as cache]
            [pokedex.data.pokemon :as d-pokemon]
            [pokedex.logic.region :as l-region]))

(def region-data-source
  (cache/lru-cache-factory {:kantho (l-region/create "Kantho" (:bulbasaur d-pokemon/pokemon-data-source) (:ivysaur d-pokemon/pokemon-data-source))
                            :johto  (l-region/create "Johto" (:chikorita d-pokemon/pokemon-data-source) (:bayleef d-pokemon/pokemon-data-source))}))
