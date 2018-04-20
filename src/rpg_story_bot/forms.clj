(ns rpg-story-bot.forms
  (:gen-class))

(defn since-running
  "Generate a quest of the following form:
   Since __ we have been running from __"
   []
  (str "Since the Fire Nation attacked we have been running from Lord Zuko"))
