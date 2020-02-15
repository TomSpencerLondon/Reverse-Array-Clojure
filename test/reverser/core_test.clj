(ns reverser.core-test
  (:require [clojure.test :refer :all]
            [reverser.core :refer :all]))

(deftest reverse-test
  (testing "Reverses array"
    (is (= [3 2 1] (reverse (vector 1 2 3))))))
(deftest reverse-longer-test
  (testing "Reverses longer array"
    (is (= [10 9 8 7 6 5 4 3 2 1] (reverse (vector 1 2 3 4 5 6 7 8 9 10))))))