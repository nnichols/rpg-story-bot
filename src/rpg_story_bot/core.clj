(ns rpg-story-bot.core
  (:require [rpg-story-bot.forms :as fm])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (fm/since-running)))
