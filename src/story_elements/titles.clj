(ns story-elements.titles
  (:gen-class))

(def prefix-titles
  "A vector of Strings representing before-name titles"
  ["Lord"
   "Lady"
   "King"
   "Queen"
   "Emperor"
   "Empress"
   "Knight"
   "General"
   "Lieutenant"
   "Admiral"
   "Captain"
   "Administrator"
   "Chief"
   "War Chief"
   "Earl"
   "Baron"
   "Baroness"
   "Deacon"
   "Archdeacon"
   "Overlord"
   "Eminence"
   "Master of Stone"
   "Master of Water"
   "Master of Flame"
   "Master of Wind"
   "Master of Light"
   "Master of Shadow"
   "Guardian"
   "Arcanist"
   "Archmage"
   "Bandit King"
   "Master of Thieves"])

(def suffix-titles
  "A vector of Strings representing after-name titles"
  ["of the South"
   "of the North"
   "of the East"
   "of the West"
   "of the Realm"
   "of the Dead"
   "of the Damned"
   "of the Forgotten"
   "of the Undying"
   "the Undying"
   "the Cruel"
   "the Brave"
   "the Coward"
   "the Red"
   "the Blue"
   "the Yellow"
   "the Green"
   "the White"
   "the Black"])

(defn title-individual
  "Given person, return that same person with either a prefix title,
      a suffix titles or both title forms added"
  [person]
  (condp = (rand-int 3)
    1 (str (rand-nth prefix-titles) " " person)
    2 (str person " " (rand-nth suffix-titles))
    (str (rand-nth prefix-titles)
         " "
         person
         " "
         (rand-nth suffix-titles))))
