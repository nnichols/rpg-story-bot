(ns rpg-story-bot.core
  (:require [rpg-story-bot.forms :as fm]
            [twitter.oauth       :as oauth]
            [twitter.api.restful :as rest])
  (:gen-class))

(defonce consumer-key         (System/getenv "TWITTER_CONSUMER_KEY"))
(defonce consumer-secret      (System/getenv "TWITTER_CONSUMER_SECRET"))
(defonce access-token         (System/getenv "TWITTER_ACCESS_TOKEN"))
(defonce access-token-secret  (System/getenv "TWITTER_ACCESS_TOKEN_SECRET"))

(def credentials
  "Sign on credentials for Twitter"
  (oauth/make-oauth-creds
    consumer-key
    consumer-secret
    access-token
    access-token-secret))

(defn tweet
  "Attempt to post message on Twitter"
  [message]
  (try
    (rest/statuses-update :oauth-creds credentials :params {:status message})
  (catch Throwable t
    (println (.getMessage t)))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (tweet (fm/since-running))
  (System/exit 0))
