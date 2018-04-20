(defproject rpg-story-bot "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure        "1.9.0-alpha9"]
                 [org.clojure/test.check     "0.9.0"]
				         [org.clojure/tools.logging  "0.4.0"]
                 [twitter-api                "0.7.8"]
                 [clj-http                   "2.1.0"]
                 [com.fzakaria/slf4j-timbre  "0.3.8"]
                 [org.slf4j/log4j-over-slf4j "1.7.14"]
                 [org.slf4j/jul-to-slf4j     "1.7.14"]
                 [org.slf4j/jcl-over-slf4j   "1.7.14"]]
  :main rpg-story-bot.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
