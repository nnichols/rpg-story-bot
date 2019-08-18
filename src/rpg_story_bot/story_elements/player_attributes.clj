(ns rpg-story-bot.story-elements.player-attributes
  "Required attributes of player characters"
  (:require [rpg-story-bot.story-elements.descriptors :as ds]))

(def dragonborn-list
  "Populate a list of all dragonborn types by color"
  (mapv #(str % " Dragonborn") ds/dragon-colors))

(def kobold-list
  "Populate a list of all kobold types by color"
  (mapv #(str % " Kobold") ds/dragon-colors))

(def races-map
  "A map of vectors indexed by the following-
   key: race
   value(s): racial subtypes"
  {:human ["Human"]
   :dwarf ["Hill Dwarf"
           "Mountain Dwarf"
           "Duergar"],
   :elf ["High Elf"
         "Wood Elf"
         "Drow"
         "Sea Elf"],
   :halfling ["Lightfoot Halfling"
              "Stout Halfling"],
   :dragonborn dragonborn-list,
   :gnome ["Forest Gnome"
           "Rock Gnome"
           "Svirfneblin"],
   :half-elf ["Half-Elf"],
   :half-orc ["Half-Orc"],
   :tiefling ["Tiefling"
              "Feral Tiefling"],
   :aasimar ["Protector Aasimar"
             "Scourge Aasimar"
             "Fallen Aasimar"],
   :firbolg ["Firbolg"],
   :goliath ["Goliath"],
   :bird-person ["Kenku"
                 "Aarakocra"],
   :lizardfolk ["Lizardfolk"],
   :animus ["Tabaxi"
            "Tortle"
            "Bovus"
            "Raccatoo"
            "Equus"
            "Hominus"
            "Stirixi"
            "Canus"],
   :triton ["Triton"],
   :goblin ["Goblin"
            "Bugbear"
            "Hobgoblin"],
   :genasi ["Air Genasi"
            "Earth Genasi"
            "Fire Genasi"
            "Water Genasi"],
   :kobold kobold-list,
   :orc ["Orc"],
   :yuan-ti ["Yuan-ti"]})

(def classes-map
  "A map of vectors indexed by the following-
     key: class
     value(s): class variants"
  {:barbarian ["Path of the Berserker Barbarian"
               "Path of the Totem Warrior Barbarian"
               "Path of the Zealot Barbarian"
               "Path of the Ancestral Guardian"
               "Path of the Storm Herald Barbarian"
               "Battlerager Barbarian"],
   :bard ["College of Lore Bard"
          "College of Valor Bard"
          "College of Glamour Bard"
          "College of Swords Bard"
          "College of Whispers Bard"],
   :cleric ["War Domain Cleric"
            "Life Domain Cleric"
            "Light Domain Cleric"
            "Nature Domain Cleric"
            "Tempest Domain Cleric"
            "Trickery Domain Cleric"
            "Knowledge Domain Cleric"
            "Forge Domain Cleric"
            "Grave Domain Cleric"],
   :druid ["Circle of the Land Druid"
           "Circle of the Moon Druid"
           "Circle of Dreams Druid"
           "Circle of the Shepherd Druid"],
   :fighter ["Champion"
             "Battle Master"
             "Eldritch Knight"
             "Strider"
             "Arcane Archer"
             "Cavalier"
             "Samurai"],
   :monk ["Way of the Open Hand Monk"
          "Way of Shadow Monk"
          "Way of the Four Elements Monk"
          "Way of the Kensei Monk"
          "Way of the Sun Soul Monk"
          "Way of the Drunken Master Monk"],
   :paladin ["Oath of Devotion Paladin"
             "Oath of the Ancients Paladin"
             "Oath of Vengeance Paladin"
             "Oath of Conquest Paladin"
             "Oath of Redemption Paladin"],
   :ranger ["Hunter"
            "Beast Master"
            "Gloom Stalker"
            "Monster Slayer"
            "Horizon Walker"],
   :rogue ["Thief"
           "Assassin"
           "Arcane Trickster"
           "Fey Knight"
           "Swashbuckler"
           "Rogue Mastermind"
           "Inquisitve Rogue"
           "Scout"],
   :sorcerer ["Sorcerer of a Draconic Bloodline"
              "Wild Magic Sorcerer"
              "Sorcerer of a Divine Soul"
              "Storm Sorcerer"
              "Shadow Sorcerer"],
   :warlock ["Celestial Warlock"
             "Hexblade Warlock"
             "Warlock of the Archfey"
             "Fiendish Warlock"
             "Warlock of the Great Old One"],
   :wizard ["Abjuration Wizard"
            "Conjuror"
            "Divination Wizard"
            "Enchanter"
            "Enchantress"
            "Evocation Wizard"
            "Illusionist" ;They're illusions, Michael
            "Necromancer"
            "Transmutation Wizard"
            "War Mage"]})

(def alignments
  "A vector of Strings representing alignments"
  ["Lawful Good"
   "Lawful Neutral"
   "Lawful Evil"
   "Neutral Good"
   "True Neutral"
   "Neutral Evil"
   "Chaotic Good"
   "Chaotic Neutral"
   "Chaotic Evil"
   "Unaligned"])

(def backgrounds
  "A vector of Strings representing backgrounds"
  ["Acolyte"
   "Charlatan"
   "Criminal"
   "Spy"
   "Entertainer"
   "Folk Hero"
   "Gladiator"
   "Guild Artisan"
   "Guild Merchant"
   "Hermit"
   "Knight"
   "Noble"
   "Outlander"
   "Sage"
   "Sailor"
   "Pirate"
   "Urchin"])
