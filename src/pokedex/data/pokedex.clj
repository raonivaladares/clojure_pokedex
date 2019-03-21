(ns pokedex.data.pokedex
  (:require [clojure.core.cache :as cache]
            [pokedex.data.region :as d-region]
            [pokedex.logic.pokedex :as l-pokedex]))

(def pokedex-data-source
  (cache/lru-cache-factory {:global (l-pokedex/create (:kantho d-region/region-data-source) (:johto d-region/region-data-source))
                            :kantho (l-pokedex/create (:kantho d-region/region-data-source))
                            :johto  (l-pokedex/create (:johto d-region/region-data-source))}))
