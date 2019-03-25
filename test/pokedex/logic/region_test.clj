(ns pokedex.logic.region-test
  (:require [clojure.test :refer :all])
  (:require [pokedex.logic.region :refer [create]]))

(deftest create-test
  (testing "Create region should return a map with name and pokemon"
    (let [name "Recife"
          shark {:name "Shark" :description "Dangerous animal"}
          boyDoBote {:name "Boy do bote" :description "Local human"}]
      (is (= {:name name :pokemon [shark boyDoBote]} (create name shark boyDoBote))))))
