(ns pokedex.logic.pokemon-test
  (:require [clojure.test :refer :all])
  (:require [pokedex.logic.pokemon :refer [create]]))

(deftest create-test
  (testing "Create pokemon should return a map with name and description"
    (let [name "Pikachu"
          description "Thunder"]
      (is (= {:name name :description description} (create name description))))))
