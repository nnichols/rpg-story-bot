(ns rpg-story-bot.titles-test
  (:require [clojure.test          :refer :all]
            [story-elements.titles :as ts]))

(deftest title-tests
  (testing "Ensure titling a person doesn't remove the person passed"
    (is
     (= true
        (every? true?
                (take 30 (repeatedly
                          #(.contains (ts/title-individual "Nick") "Nick")))))))
  (testing "Ensure titling a person doesn't remove the person passed"
    (is (.contains (ts/apply-suffix-title "Nick") "Nick")))
  (testing "Ensure titling a person doesn't remove the person passed"
    (is (.contains (ts/apply-prefix-title "Nick") "Nick")))
  (testing "Ensure titling a person doesn't remove the person passed"
    (is (.contains (ts/apply-both-titles "Nick") "Nick"))))
