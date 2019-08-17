(ns rpg-story-bot.twitter-interface-test
  (:require [clojure.test :refer :all]
            [rpg-story-bot.twitter-interface :as twit]))

(deftest key-tests
  (testing "Ensure all twitter keys are accessible and strings"
    (is (string? twit/consumer-key))
    (is (string? twit/consumer-key-secret))
    (is (string? twit/access-token))
    (is (string? twit/access-token-secret))))
