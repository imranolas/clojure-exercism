(defproject word-count "0.1.0-SNAPSHOT"
  :description "word-count exercise."
  :url "https://github.com/exercism/xclojure/tree/master/exercises/word-count"
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :profiles
    {:dev {:source-paths ["dev" "src" "test"]
           :dependencies [[org.clojure/tools.namespace "0.2.11"]]}})
