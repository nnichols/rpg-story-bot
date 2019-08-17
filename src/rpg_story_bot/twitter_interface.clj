(ns rpg-story-bot.twitter-interface
  (:require [twitter.oauth :as oauth]
            [twitter.api.restful :as rest]
            [clojure.data.json :as json]
            [http.async.client :as ac])
  (:gen-class))

(def consumer-key
  (System/getenv "TWITTER_CONSUMER_KEY"))

(def consumer-key-secret
  (System/getenv "TWITTER_CONSUMER_SECRET"))

(def access-token
  (System/getenv "TWITTER_ACCESS_TOKEN"))

(def access-token-secret
  (System/getenv "TWITTER_ACCESS_TOKEN_SECRET"))

(def max-username-length
  "Maximum twitter username length + 1 to account for @"
  16)

(def rpg-story-bot-hashtag
  "#rpgstorybot")

(def credentials
  "Build sign on credentials for Twitter"
  (oauth/make-oauth-creds consumer-key consumer-key-secret access-token access-token-secret))

(defn tweet
  "Attempt to post message on Twitter"
  [message]
  (try
    (rest/statuses-update :oauth-creds credentials
                          :params {:status (str message
                                                " "
                                                rpg-story-bot-hashtag)})
    (catch Throwable t
      (println (.getMessage t)))))

(defn check-length
  "Ensure tweet-to-check will fit the standard allowed width"
  [tweet-to-check]
  (>= 280 (+ (count tweet-to-check) (count rpg-story-bot-hashtag))))

(defn close
  "Clean-up all resources"
  []
  (ac/close (twitter.core/default-client)))
