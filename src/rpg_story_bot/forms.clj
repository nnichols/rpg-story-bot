(ns rpg-story-bot.forms
  (:require [story-elements.beings :as seb])
  (:gen-class))

(defn since-running
  "Generate a quest of the following form:
   Since __ we have been running from __"
  []
  (str "Ever since the "
       (rand-nth seb/humanoids)
       " attacked, we have been running from "
       (seb/titled-humanoid-individual (rand-nth seb/humanoid-individuals))))
