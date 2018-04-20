(ns rpg-story-bot.forms
  (:require [story-elements.beings :as sb]
            [story-elements.titles :as st])
  (:gen-class))

(defn since-running
  "Generate a quest of the following form:
   Since __ we have been running from __"
  []
  (str "Ever since the "
       (rand-nth sb/humanoids)
       " attacked, we have been running from "
       (st/title-individual (rand-nth sb/humanoid-individuals))))
