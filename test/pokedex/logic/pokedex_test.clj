(ns pokedex.logic.pokedex-test
  (:require [clojure.test :refer :all])
  (:require [pokedex.logic.pokedex :refer [new-entry create]]))

(deftest new-entry-test
  (testing "New entry should return a map with number as keyword and pokemon as value"
    (let [pokemon {:name "Larvitar" :description "Rocks"}]
      (is (= {:1 pokemon} (new-entry 1 pokemon))))))

(deftest create-test
  (testing "create should return a map with many entries"
    (let [shark {:name "Shark" :description "Dangerous animal"}
          boyDoBote {:name "Boy do bote" :description "Local human"}
          recife {:name "Recife" :pokemon [shark boyDoBote]}]
      (is (= {:1 shark :2 boyDoBote} (create recife))))))

(deftest create-multi-dex-test
  (testing "create should return a map with many entries"
    (let [shark {:name "Shark" :description "Dangerous animal"}
          boyDoBote {:name "Boy do bote" :description "Local human"}
          recife {:name "Recife" :pokemon [shark boyDoBote]}
          motoboy {:name "Motoboy" :description "É nóis"}
          zica {:name "Zica" :description "Memo"}
          sp {:name "São Paulo" :pokemon [motoboy zica]}]
      (is (= {:1 shark :2 boyDoBote :3 motoboy :4 zica} (create recife sp))))))
