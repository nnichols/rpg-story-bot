(ns rpg-story-bot.core
  (:require [rpg-story-bot.forms             :as fm]
            [rpg-story-bot.twitter-interface :as twit])
  (:gen-class))

(defn get-random-map-vector
  "Draw a random inner member from a map of vectors"
  [target-map]
  (rand-nth (get target-map (rand-nth (keys targer-map)))))

(defn -main
  "Create a message and tweet it out"
  [& args]
  (twit/tweet
   (str "Finally making some updates to the plot generator "
        twit/rpg-story-bot-hashtag))
  (System/exit 0))
