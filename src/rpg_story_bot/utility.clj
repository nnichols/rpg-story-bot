(ns rpg-story-bot.utility
  (:gen-class))

(defn get-random-map-vector
  "Draw a random inner member from a map of vectors"
  [target-map]
  (rand-nth (get target-map (rand-nth (keys target-map)))))
