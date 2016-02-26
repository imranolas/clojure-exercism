(defproject rna-transcription "0.1.0-SNAPSHOT"
  :description "rna-transcription exercise."
  :url "https://github.com/exercism/xclojure/tree/master/exercises/rna-transcription"
  :dependencies [
    [org.clojure/clojure "1.8.0"]
  ]

  :profiles
  {:dev {:source-paths ["dev" "src" "test"]
         :dependencies [[org.clojure/tools.namespace "0.2.11"]]}})
