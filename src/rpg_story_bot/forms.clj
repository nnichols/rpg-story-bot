(ns rpg-story-bot.forms
  (:require [story-elements.beings            :as sb]
            [story-elements.titles            :as st]
            [story-elements.player-attributes :as pa]
            [rpg-story-bot.utility            :as util])
  (:gen-class))

(defn since-running
  "Generate a quest of the following form:
   Since __ we have been running from __"
  []
  (str "Ever since the "
       (rand-nth sb/humanoids)
       " attacked, we have been running from "
       (st/title-individual (rand-nth sb/humanoid-individuals))))

(defn into-a-bar
  "Generate a plot hook of the following form:
  A __, ___, and ____ walk into a bar. Only one walks out"
  []
  (str "A "
       (util/get-random-map-vector pa/races-map)
       ", "
       (util/get-random-map-vector pa/races-map)
       ", and "
       (util/get-random-map-vector pa/races-map)
       " walk into a bar. Only one walks out."))

(defn next-character
  "Generate a random character"
  []
  (str "When my current character dies, I'm going to roll a "
       (rand-nth pa/alignments)
       " "
       (util/get-random-map-vector pa/races-map)
       " "
       (util/get-random-map-vector pa/classes-map)))       
