(ns story-elements.beings
  (:require [story-elements.titles :as st])
  (:gen-class))

(def humanoids
  "A vector of Strings representing humanoid races (pluralized)"
  ["Orcs"
   "Elves"
   "Dwarves"
   "Goblins"
   "Ogres"
   "Gnomes"
   "Halflings"
   "Humans"])

(def humanoid-individuals
  "A vector of Strings representing individuals belonging to humanoid races"
  ["Wickert Highmount"
   "Faraine Phitoris"
   "Nodruik Barrelgut"
   "Baska" 
   "Enakor"])

(defn titled-humanoid-individual
  "Given person, return that same person with either a prefix title,
   a suffix titles or both title forms added"
  [person]
  (condp = (rand-int 3)
    1 (str (rand-nth st/prefix-titles) " " person)
    2 (str person " " (rand-nth st/suffix-titles))
    (str (rand-nth st/prefix-titles)
         " "
         person
         " "
         (rand-nth st/suffix-titles))))
