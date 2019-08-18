(ns rpg-story-bot.core
  (:require [rpg-story-bot.forms :as fm]
            [rpg-story-bot.twitter-interface :as twit])
  (:gen-class))

(defn build-messages
  "Create n random messages"
  [n]
  (take n (repeatedly #(fm/random-message))))

(defn tweetable-message
  "Takes a collection of messages and returns the first one that is tweetable,
    if no tweets match, return nil"
  [tweet-list]
  (loop [running-list tweet-list]
    (if (twit/check-length (first running-list))
      (first running-list)
      (recur (rest running-list)))))

(defn -main
  "Create a message and tweet it out"
  [& args]
  (twit/tweet (tweetable-message (build-messages 10)))
  (twit/close)
  (System/exit 0))
