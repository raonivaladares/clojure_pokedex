(ns pokedex.controller.pokedex-test
  (:require [clojure.test :refer :all])
  (:require [pokedex.controller.pokedex :refer [search-by-number]]))

(deftest search-by-number-on-global-dex-test
  (testing "Number 1 pokemon in global dex should be bulbasaur"
    (is (= [{:name "Bulbasaur" :description "Bulbasaur can be seen napping in bright sunlight. There is a seed on its back. By soaking up the sun's rays, the seed grows progressively larger."}]
           (search-by-number 1 "global")))))

(deftest search-by-number-on-kantho-dex-test
  (testing "Number 1 pokemon in kantho dex should be bulbasaur"
    (is (= [{:name "Bulbasaur" :description "Bulbasaur can be seen napping in bright sunlight. There is a seed on its back. By soaking up the sun's rays, the seed grows progressively larger."}]
           (search-by-number 1 "kantho")))))

(deftest search-by-number-on-johto-dex-test
  (testing "Number 1 pokemon in johto dex should be chikorita"
    (is (= [{:name "Chikorita" :description "In battle, Chikorita waves its leaf around to keep the foe at bay. However, a sweet fragrance also wafts from the leaf, becalming the battling Pokémon and creating a cozy, friendly atmosphere all around."}]
           (search-by-number 1 "johto")))))
