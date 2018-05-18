(ns rpg-story-bot.core
  (:require [rpg-story-bot.forms             :as fm]
            [rpg-story-bot.twitter-interface :as twit])
  (:gen-class))

(defn -main
  "Create a message and tweet it out"
  [& args]
  (twit/tweet
    (str "Finally making some updates to the plot generator "
         twit/rpg-story-bot-hashtag))
  (System/exit 0))
