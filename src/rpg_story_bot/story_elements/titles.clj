(ns rpg-story-bot.story-elements.titles
  "Titles of nobility that mat apply to characters")

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

(defn apply-prefix-title
  "Given person, return that same person with a prefix title"
  [person]
  (str (rand-nth prefix-titles) " " person))

(defn apply-suffix-title
  "Given person, return that same person with a suffix title"
  [person]
  (str person " " (rand-nth suffix-titles)))

(defn apply-both-titles
  "Given person, return that same person with both a prefix
   and a suffix title"
  [person]
  (apply-prefix-title (apply-suffix-title person)))

(defn title-individual
  "Given person, return that same person with either a prefix title,
      a suffix titles or both title forms added"
  [person]
  (condp = (rand-int 3)
    1 (apply-prefix-title person)
    2 (apply-suffix-title person)
    (apply-both-titles person)))
